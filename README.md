# Automação OMDBAPI

Verificar suas habilidades em criar teste de API.

## Desafio :muscle:

1 - No endpoint validar o response para: 
    
    • Título do Filme 
    • Ano do Filme 
    • Idioma do filme 
 
2 - No endpoint validar o response para: 
    
    • Busca filme inexistente 

### Regras: :clipboard:

- Criar um projeto de automação para API utilizando framework Rest Assured. 

## Método :warning:

Os procedimentos adotados foi o uso de algumas ferramentas como suporte para o desenvolvimento do projeto. Um computador com Sistema Operacional Windows 10 home Single Language (Desktop) foi utilizado e nele foram instalados algumas ferramentas:


1. IntelliJ IDEA Community Edition 2020.2
2. Dependências do Maven
    - Rest Assured 4.3.1
    - Json Path 4.3.1
    - Json Schema Validator 4.3.1
    - XML Path 4.3.1
    - Junit Jupiter RELEASE

## Instalação :floppy_disk:

### **1.** Para instalar IntelliJ IDEA Community Edition 2020.2
No site da [Jetbrains.com](https://confluence.jetbrains.com/pages/viewpage.action?pageId=54920165) você encontra os passos necessário para instalar o _IntelliJ IDEA Community Edition 2020.2_ em seu computador.

### **2.** Dependências Maven do Projeto
**_Rest Assured:_**
```sh
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>4.3.1</version>
    <scope>test</scope>
</dependency>
```

**_Json Path:_**
```sh
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>json-path</artifactId>
    <version>4.3.1</version>
</dependency>
```

**_Json Schema Validator:_**
```sh
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>json-schema-validator</artifactId>
    <version>4.3.1</version>
</dependency>
```

**_XML Path:_**
```sh
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>xml-path</artifactId>
    <version>4.3.1</version>
</dependency>
```

**_Junit Jupiter:_**
```sh
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>RELEASE</version>
    <scope>test</scope>
</dependency>
```
 
## Como abrir o projeto e executar! :arrow_forward:
- O projeto deve ser clonado da forma simples do Github de como [Clonar um repositório](https://docs.github.com/pt/free-pro-team@latest/github/creating-cloning-and-archiving-repositories/cloning-a-repository).

- Ou pode ser clonado e executado no [IntelliJ IDEA Community Edition 2020.2](https://www.jetbrains.com/help/idea/import-project-or-module-wizard.html#open-project) como exemplificado no tutorial.



### Observação Importante :no_entry_sign:

- Caso ocorra a falha:
```
java.lang.AssertionError: 1 expectation failed.
JSON path Error doesn't match.
Expected: a string containing "Movie not found!"
  Actual: Incorrect IMDb ID.
```
Isso significa que sua chave {KEY} expirou. Então você deve criar uma nova chave.

## Histórico de lançamentos :scroll:

* 0.1.0
    * O primeiro lançamento adequado

## Meta :shipit:
Raul Batalha 

[![Twitter](https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Ftwitter.com%2Fraulbatalha)](https://twitter.com/raulbatalha) [![GitHub stars](https://img.shields.io/github/stars/RaulBatalha?tab=stars)](https://github.com/RaulBatalha?tab=stars)