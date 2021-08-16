# ms-ecommerce :dart:

## Config Server

Centralizar as configurações dos microsserviços

Dependências
- Spring Boot Actuator
- Spring Web
- Config Server

#### Classe da aplicação
 - @EnableConfigServer (habilitar)


#### Configurações application.yml

- Setar onde iremos pegar as configurações
- Conseguimos puxar de repositório no GIT as configurações
- Alterar a porta
- Configurar os outros microsservicos

#### Acesso

- localhost:PORTA/nome-micro-servico/default


## Service Discovery (Eureka Server) 

Dependências
- Eureka Server
- Config Client

#### Classe da aplicação
 - @EnableEurekaServer (habilitar)

#### Observações

- Todo microsserviço que for iniciado ele vai se registrar no service discovery

- Service Discovery é responsável por gerenciar as URLS/Portal...etc

- Exemplo: Service Discovery eu sou o product-catalog e quero utiizar o shopping-cart (ele irá apontar)


## Gateway

Único ponto de entrada em um sistema. 
Também é responsável pelo roteamento de solicitação, 
composição e tradução de protocolo, além de fornecer para cada um dos clientes do aplicativo uma API personalizada. 

O API Gateway também pode mascarar falhas nos serviços de back-end, retornando dados em cache ou padrão.

Dependências
- Gateway


