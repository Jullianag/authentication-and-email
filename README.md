# Authentication and E-mail JAVA 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Jullianag/authentication-and-email/blob/main/LICENSE) ![GitHub language count](https://img.shields.io/github/languages/count/Jullianag/authentication-and-email) 
![GitHub commit activity](https://img.shields.io/github/commit-activity/m/Jullianag/authentication-and-email) ![GitHub last commit](https://img.shields.io/github/last-commit/Jullianag/authentication-and-email) 
![GitHub repo size](https://img.shields.io/github/repo-size/Jullianag/authentication-and-email)

# Sobre o projeto

Este é um pequeno sistema de authenticação de usuário com o envio de e-mails massa pelo usuário Admin através do SendGrid.
Quando autenticado o usuário simples consulta outros usuários (findAll e findById), o Admin faz as operações mais sensíveis de CRUD como:
inserir, deletar e atualizar. O novo usuário inserido é cadastrado no banco de dados e sua senha permanece criptografada para fins de maior
segurança.

O projeto foi jeito na arquitetura MVC, com todas as camadas: service, controller, dtos, repository, projectoins. Ainda consta também um
tratamento personalizado de exceções.

## Postman
![Demonstração 1](https://github.com/Jullianag/authentication-and-email/blob/main/assets/Captura%20de%20tela%202024-08-23%20165334.png)

![Demonstração 2](https://github.com/Jullianag/authentication-and-email/blob/main/assets/Captura%20de%20tela%202024-08-23%20165401.png)

![Demonstração 3](https://github.com/Jullianag/authentication-and-email/blob/main/assets/Captura%20de%20tela%202024-08-23%20165432.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Oauth2
- SendGrid

## Banco de dados:
- Banco de dados: teste H2

## Back end
Pré-requisitos: Java 21

# Autor

Julliana Gnecco

https://www.linkedin.com/in/julliana-gnecco/
