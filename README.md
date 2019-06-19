# API REST para um CRUD

O projeto é um desafio que visa desenvolver uma API REST para um CRUD utilizando Spring Boot, Hibernate e JPA.

Basicamente foi desenvolvido uma API de Conta que irá expor cinco métodos HTTP (URIs RESTFul) definidos abaixo:

Listar todos as contas - @GetMapping(“/contas)
Obter uma conta específico pelo ID - @GetMapping(“/conta/{id}”)
Remover um contato pelo ID - @DeleteMapping(“/conta/{id}”)
Criar uma nova conta - @PostMapping(“/contas)
Atualizar detalhes de uma conta - @PutMapping(“/conta/{id}”)

Observações:

A camada de serviço está sendo omitida, porém é uma boa prática usar uma classe Service que evoca o repositório e contém a lógica de negócio do projeto para deixar o código da classe controller enxuto e mais limpo.
Porém como este é um projeto simples o controller irá acessar o repositório diretamente.
