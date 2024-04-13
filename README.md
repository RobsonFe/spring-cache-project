# Projeto de Gerenciamento de Cache em Servidor com Spring Boot

Este projeto é uma aplicação Spring Boot que demonstra uma forma eficiente de lidar com grande volume de caches no servidor, utilizando tecnologias como JPA, Spring Cache, PostgreSQL e Redis.

## Pré-requisitos

Antes de começar, certifique-se de ter instalado em sua máquina:

- Java JDK 21
- Maven
- PostgreSQL
- Redis

## Configuração do Banco de Dados

Este projeto utiliza o PostgreSQL como banco de dados principal para armazenar os dados persistentes. Certifique-se de criar um banco de dados no PostgreSQL e configurar as credenciais corretamente no arquivo `application.properties`.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

## Configuração do Redis

O Redis é utilizado como o sistema de cache distribuído. Verifique se o Redis está instalado e em execução em sua máquina. As configurações padrão são suficientes para conectar-se ao Redis, mas você pode ajustá-las conforme necessário no arquivo `application.properties`.

```properties
spring.redis.host=localhost
spring.redis.port=6379
```

## Build e Execução

Para construir o projeto, execute o seguinte comando Maven na raiz do projeto:

```
mvn clean install
```

Para executar o projeto, utilize o seguinte comando:

```
java -jar target/nome-do-seu-arquivo.jar
```

## Endpoints da API

A API possui os seguintes endpoints para gerenciamento de caches:

- `GET /cache/empresa`: Retorna o valor associado à chave especificada no cache.
- `GET /cache/empresas`: Retorna o valor associado à chave especificada que controla o cache.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT) - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
