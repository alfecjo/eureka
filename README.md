# Spring Feign Client & Eureka & Autentication Integration App 🚀

Este repositório contém uma aplicação **Spring Boot** que utiliza o **Feign Client** para a comunicação entre microserviços, enquanto o **Eureka** serve como o servidor de descoberta de serviços. Com isso, a aplicação pode registrar-se automaticamente no Eureka e descobrir outros serviços de maneira dinâmica, sem a necessidade de configurar manualmente as URLs.

## O que acontece por trás do Eureka e Feign?

- **Eureka**: Realiza o registro de serviços e mantém a lista de instâncias disponíveis de cada serviço.
- **Feign Client**: Quando configurado com o Eureka, ele faz chamadas HTTP para os serviços registrados no Eureka. O Feign, por padrão, usa o Ribbon para escolher a melhor instância do serviço (balanceamento de carga). Assim, o Feign automaticamente lida com as múltiplas instâncias do serviço, balanceando entre elas.

## Tecnologias Utilizadas 🛠️

- **Spring Boot** - Framework para desenvolvimento de aplicativos Java.
- **Spring Cloud Eureka** - Para descoberta e registro de serviços.
- **Spring Cloud OpenFeign** - Para comunicação declarativa entre microserviços via Feign.
- **Spring Web** - Para criar endpoints REST.
- **Maven** - Para gerenciamento de dependências e construção do projeto.

## Funcionalidades ⚙️

- Comunicação entre microserviços usando Feign Client.
- Integração com Eureka para registro e descoberta de serviços.
- Balanceamento de carga integrado com Eureka e Feign.
- Comunicação simplificada e declarativa com Feign.
- Autenticação no Eureka e na requisição dos serviços.

## Arquitetura 🔥

A aplicação está composta de dois serviços principais:

1. **Service A**: Um serviço que fornece um endpoint simples `/helloWorld`.
2. **Service B**: Um serviço que consome o `Service A` utilizando **Feign** e o **Eureka** para descobrir dinamicamente o endereço de `Service A`.

### Diagrama da Arquitetura

```plaintext
[ Service B ]  <--->  [ Eureka Server ]  <--->  [ Service A ]
```

## Uso 📌

### Requisição para servicea direto - com autenticação:
```sh
curl -u alfecjo:acfa -X GET http://host.docker.internal:8081/helloWorld
curl -u alfecjo:acfa -X GET http://host.docker.internal:8081/api/health
```

### Requisição de serviceb para servicea - com autenticação:
```sh
curl -u alfecjo:acfa -X GET http://host.docker.internal:8082/helloServiceA
```

### Requisição de servicec para servicea - com autenticação:
```sh
curl -u alfecjo:acfa -X GET http://host.docker.internal:8083/helloServiceA
```

### Requisição de servicec para serviceb que envia para servicea - com autenticação:
```sh
curl -u alfecjo:acfa -X GET http://host.docker.internal:8083/helloServiceB
```

### Verificando informações do Actuator:
```sh
curl http://host.docker.internal:8081/actuator/info
curl http://host.docker.internal:8082/actuator/info
curl http://host.docker.internal:8083/actuator/info
```

---

- ## Return
  [![Main Page](https://img.shields.io/badge/Main-Page?style=for-the-badge&logo=github&logoColor=white)](https://github.com/alfecjo/java-spring-testes/tree/main)

