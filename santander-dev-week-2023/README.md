# DIO - Trilha Java Back-End Intermediário

www.dio.me

#### Aluno

- [Fernando Flores Terceros](https://github.com/jciterceros)

# Santander Dev Week 2023

Java RESTful API criada para a Santander Dev Week.

<div align="center">
<img alt="Desafio Java RESTful API Santander Bootcamp 2023" title="Desafio Java RESTful API Santander Bootcamp 2023" width="650px" src="https://github.com/jciterceros/Santander-Bootcamp-2023-Backend-Java/blob/main/imagens/SpringBoot%20Initializr%20Setup.JPG">
</div>

## Principais Tecnologias

- **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
- **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
- **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
- **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## [Link do Figma](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421%3A432&mode=design&t=6dPQuerScEQH0zAn-1)

O Figma foi utilizado para a abstração do domínio desta API, sendo útil na análise e projeto da solução.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

### Corrigindo Erro CORS CI/CD deploy Automatico

    Adicione a segunte linha para corrigir o erro de CORS no APP
    @OpenAPIDefinition(servers = {@Server(url = "/",description = "Default Server URL")})

<div align="center">
<img alt="Fix Bug CORS error" title="Fix Bug CORS error" width="750px" src="https://github.com/jciterceros/Santander-Bootcamp-2023-Backend-Java/blob/main/imagens/Fix%20Bug%20CORS%20error.jpg">
</div>

## Tabela PostgreSQL Criada no RailWay

<div align="center">
<img alt="SpringBoot PostgreSQL into RailWay" title="SpringBoot PostgreSQL into RailWay" width="750px" src="https://github.com/jciterceros/Santander-Bootcamp-2023-Backend-Java/blob/main/imagens/SpringBoot%20PostgreSQL%20into%20RailWay.JPG">
</div>

- [Veja a API com Swagger - Santander 2023 - Online](https://apisantander2023-production.up.railway.app/swagger-ui/index.html)
