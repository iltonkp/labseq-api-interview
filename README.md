# Labseq Interview Challenge

## Technology

- <a hrf="https://www.java.com/en/download/help/whatis_java.html">Java 17</a>
- <a hrf="https://spring.io/projects/spring-boot">Spring-boot 3.0.1</a>
- <a hrf="https://maven.apache.org/">Maven</a>
- <a hrf="https://www.baeldung.com/java-caching-caffeine">Caffeine</a>
- <a hrf="https://docs.docker.com/get-started/overview/">Docker</a>

## Pre-requirements

- <a hrf="https://www.java.com/en/download/help/whatis_java.html">Java 17</a>
- <a hrf="https://maven.apache.org/">Maven</a>
- <a hrf="https://docs.docker.com/get-started/overview/">Docker</a>

## How to use

- Clone this repository
```sh
git https://github.com/iltonkp/labseq-api-interview.git
```

- Install dependencies using maven 
```sh
./mvnw install
```

- Generate Package using maven
```sh
./mvnw package
```

- Run the application on Docker
```sh
docker-compose up labseq-api
```

## Access the api

To access the api you can use a browser or any tools to make request HTTP like Postman, Insomnia or similar. Use this
<a hrf="http://localhost:8080/labseq/{n}">url</a> in your request. Bellow stay shared the example to request using curl:

```sh
curl -X 'GET' 'http://localhost:8080/labseq/10000' -H 'accept:application/json'
```

If you prefer use postman, you can use the collection shared on */docs/labseq-postman-collection.json*

## Docs

Please read the Open api documentation available on */docs/labseq-openapi-docs.yml* to understand better about 
parameters for this request. 

## Note 

This endpoint provider success response if you use values for the {n} parameter between *0* and *89999*. If you try to use 
values above *89999* you can get the error with status code 500 - Internal server error, provided by the runtime exception
*java.lang.StackOverflowError: null*
