# Projeto de Cadastro de Produtos

Este projeto é uma aplicação desenvolvida com **Spring Boot**, **JPA** e **PostgreSQL** para o cadastro e gerenciamento de produtos. A aplicação permite salvar informações como nome, preço e validade de produtos, e está conectada a um banco de dados PostgreSQL.

## Funcionalidades

- Cadastro de produtos com os campos: **Nome**, **Preço** e **Data de Validade**.
- Armazenamento e recuperação de dados de produtos usando JPA e PostgreSQL.
- Exibição e manipulação de dados via uma API REST.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Data JPA**: Facilita a integração entre o Spring Boot e o banco de dados.
- **PostgreSQL**: Banco de dados relacional utilizado para persistência de dados.
- **Hibernate**: Framework ORM utilizado para interagir com o banco de dados.
- **Maven**: Ferramenta de automação de build.

## Pré-requisitos

Antes de rodar o projeto, verifique se você tem os seguintes requisitos:

- **JDK 17+**
- **Maven 3.6+**
- **PostgreSQL** instalado e em funcionamento
- **IDE** como IntelliJ IDEA ou Eclipse (opcional, mas recomendado)

## Configuração do Banco de Dados

1. Crie um banco de dados no PostgreSQL, por exemplo `produto_db`.
2. Configure a conexão do banco de dados no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/produto_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
```

## Executando o Projeto

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu_usuario/nome-do-repositorio.git
    ```
2. Navegue até o diretório do projeto:
   ```bash
    cd nome-do-repositorio
    ```
3. Compile e execute a aplicação usando Maven:
    ```bash
    mvn spring-boot:run
    ```

4. A aplicação estará disponível em: `http://localhost:8080`


## Endpoints da API

- POST /produto: Cria um novo produto.

    **Body Exemplo:**
    ```json
    {
      "nome": "Produto Exemplo",
      "preco": 19.99,
      "dataValidade": "2025-12-31"
    }
    ```
- **GET /produto/{id}**: Retorna os detalhes de um produto pelo ID.


- **GET /produto**: Retorna todos os produtos cadastrados.

## Estrutura de Pacotes

O projeto segue a seguinte estrutura de pacotes:

```css
src
 ├── main
 │    ├── java
 │    │    ├── com
 │    │    │    └── guilherme
 │    │    │        ├── controller
 │    │    │        │    └── ProdutoController.java
 │    │    │        ├── model
 │    │    │        │    └── Produto.java
 │    │    │        ├── repository
 │    │    │        │    └── ProdutoRepository.java
 │    │    │        └── service
 │    │    │            └── ProdutoService.java
 │    └── resources
 │         └── application.properties
 └── test
      └── java
           └── com
                └── guilherme
                     └── ProdutoApplicationTests.java
```

