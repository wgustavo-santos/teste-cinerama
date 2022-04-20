# &nbsp;__Universidade Federal do Pará__ ![UFPA](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDyOqG3iMuzdu5X_KpvPiBXGXQ1I-LtBEgEQ&usqp=CAU)
## Projeto Acadêmico - Cinerama
### Objetivo Geral
Construir uma API com um frontend consumidor que avalie filmes dentro de uma escala de 1.0 a 5.0 com base na média aritmética de cada avaliação.

O propósito é ilustrar uma nota única para cada filme com base na média aritmética das
avaliações de cada usuário organizada em estrelas não preenchidas, semi preenchidas e
totalmente preenchidas, no qual:<br>
5 (cinco) estrelas não preenchidas significa sem notas para o filme em questão até o
momento;<br>
3 (três) estrelas preenchidas e 1 (uma) estrela semi preenchida ilustra uma avaliação de
”3.1” a ”3.9”;<br>
5 (cinco) estrelas totalmente preenchidas ilustra uma nota máxima para o filme em
questão.

### Objetivos Específicos
* Salvar no banco de dados avaliações e e-mails de cada usuário e somar com
avaliações de outros usuários de qualquer dispositivo acessado;
* Caso não exista o e-mail do usuário na base de dados no momento da
avaliação do filme, salvar o e-mail na base de dados junto aos demais;
* Não agregar avaliações do mesmo usuário no mesmo filme;
* Diagrama de Classe UML para facilitar a orientação da implementação
durante o desenvolvimento;
* Prototipagem do layout do frontend no figma para estruturar a interface da
aplicação;
* Construir separadamente o backend da aplicação com a linguagem de
programação Java utilizando framework Spring para funcionar de forma
independente do frontend;
* Criar a API com o padrão camadas (controllers, services, repositories, DTO,
http requests JSON);
* Utilizar o Postman para testar endpoints da API e DTO’s entre controllers
REST e camada de serviço;
* Fazer a persistência de dados e Mapeamento Objeto-relacional / ORM com
Sring Data JPA;
* Utilizar banco H2 para testes no Banco de Dados
* Configurar perfis de projeto (dev, test e prod), configurar PostgreSQL e scripts
SQL localmente;
* Salvar avaliações, filmes e e-mails de usuários no banco de dados PostgreSQL;
* Provisionar e implantar serviços do banco de dados relacional PostgreSQL
na plataforma em nuvem Heroku;
* Fazer deploy da aplicação backend no Heroku a fazer funcionar de forma
independente do frontend;
* Construir o frontend da aplicação utilizando ReactJs com a linguagem de
programação Typescript gerenciador de pacotes Yarn;
* Instalar Bootstrap e CSS no frontend para criação dos componentes da
aplicação web;
* Configurar as rotas para cada uma das páginas usando React Router Dom;
* Configurar componentes, botões, listagens, paginação e a responsividade
(navegadores web e mobile) usando breakpoints do Bootstrap;
* Utilizar o armazenamento em nuvem Netlify para implantar a aplicação
frontend estaticamente;
* Utilizar a biblioteca Axios com ReactJS no frontend para facilitar o processo
de requisições do frontend para o backend;
* Usar React hooks; UseState, para manter os dados do componente dentro do
React, e UseEffect, para executar funções ao alterar objetos monitorados;
* Integração do backend da nuvem do Heroku com o frontend da nuvem do
Netlify para deixar a aplicação no ar e disponível;

## Modelagem de Software

### Diagrama de classe
![UML classe](https://imgur.com/RK84qEX.png)

### Modelagem conceitual
![UML conceitual](https://imgur.com/znzekJp.png)

### Modelagem lógica
![UML lógico](https://imgur.com/4If6euL.png)

### API padrão camadas
![API camadas](https://imgur.com/aM9lnWk.png)

## Testes
### Documentação no Postman
Testes de endpoints com responses e requests PUT e GET - link da documentação [Testes no Postman](https://documenter.getpostman.com/view/17433262/UVeAuUPS)
## Autores:
* Wenderson Santos - _Estudante de Sistemas de Informação_ [GitHub](https://github.com/wgustavosantos)
* Leandro Veloso - _Estudante de Sistemas de Informação_ [GitHub](https://github.com/Leandro-Veloso)
## Aplicação web:
[Cinerama](https://cinerama-ufpa.netlify.app/)
