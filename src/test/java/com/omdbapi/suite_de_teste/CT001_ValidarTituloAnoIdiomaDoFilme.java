package com.omdbapi.suite_de_teste;

import com.omdbapi.utils.ConfiguracaoDeBase;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class CT001_ValidarTituloAnoIdiomaDoFilme {
    ConfiguracaoDeBase base;
    private static String tituloDoFilme;
    private static String anoDoFilme;
    private static String idiomaDoFilme;
    private static String idFilme;
    private static String ApiKey;
    private static String baseURL = "http://www.omdbapi.com/?i={idFilme}&apikey={ApiKey}";

    @Test
    @DisplayName("Validar o título, ano e idioma do filme")
    public void validarTituloAnoIdiomaDoFilme() {
        base = new ConfiguracaoDeBase();
        Response respostaDoServidor = given()
                .contentType("application/json")
                .pathParam("idFilme", base.getIdDoFilme())
                .pathParam("ApiKey", base.getApiKey())
                .body(base.getCorpoFilmeEncontrado())
                .when().post(baseURL);

        respostaDoServidor.then()
                .assertThat()
                .body("Title", containsString("The Social Network"), "Year", containsString("2010"), "Language", containsString("English, French"))
                .statusCode(200);
    }

    @Test
    @DisplayName("Buscar os Filmes Inexistentes")
    public void buscaFilmeInexistente() {
        base = new ConfiguracaoDeBase();
        Response respostaDoServidor = given()
                .contentType("application/json")
                .pathParam("idFilme", base.getIdDoFilmeNaoEncontrado())
                .pathParam("ApiKey", base.getApiKey())
                .body(base.getCorpoFilmeNaoEncontrado())
                .when().post(baseURL);

        respostaDoServidor.then().assertThat()
                .body("Response", equalTo("False"))
                .body("Error", containsString("Movie not found!"))
                .statusCode(200);
    }
}