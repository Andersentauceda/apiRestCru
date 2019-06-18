# testeRestSouthSystem

CRUD REST utilizando Spring Boot 2, Hibernate, JPA, e MySQL

O projeto contêm uma API REST para um CRUD utilizando Spring Boot, Hibernate e JPA.

A API que será desenvolvida

Será criado um Controller para uma API de Conta que irá expor cinco métodos HTTP (URIs RESTFul) definidos abaixo:

Listar todos as contas - @GetMapping(“/contas)
Obter uma conta específico pelo ID - @GetMapping(“/conta/{id}”)
Remover um contato pelo ID - @DeleteMapping(“/conta/{id}”)
Criar uma nova conta - @PostMapping(“/contas)
Atualizar detalhes de uma conta - @PutMapping(“/conta/{id}”)
