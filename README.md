# Sistema de Gerenciamento de Mercado

Sistema desktop desenvolvido em **Java** como Projeto Integrador do curso Técnico em Informática, com o objetivo de simular e facilitar o gerenciamento das principais operações de um mercado.

A aplicação possui integração com **MySQL** e permite controlar funcionários, clientes, produtos, estoque e vendas, além de oferecer diferentes níveis de acesso de acordo com o perfil do funcionário.

## Sobre o projeto

O sistema foi desenvolvido como uma aplicação prática para aplicar conhecimentos adquiridos durante o curso Técnico em Informática, envolvendo **Programação Orientada a Objetos, desenvolvimento de interfaces gráficas, banco de dados, SQL, JDBC e arquitetura de software**.

A aplicação busca representar o funcionamento de um estabelecimento comercial, permitindo desde o cadastro e gerenciamento de produtos até a realização de vendas e consulta ao histórico de operações.

## Funcionalidades

### 🔐 Autenticação e controle de acesso

* Sistema de login de funcionários;
* Validação de usuário e senha;
* Identificação do perfil do funcionário;
* Acesso às funcionalidades de acordo com o tipo de usuário.

### 👨‍💼 Gerenciamento de funcionários

* Cadastro de funcionários;
* Alteração de dados;
* Exclusão de funcionários;
* Consulta e pesquisa de funcionários;
* Armazenamento de informações como nome, login, senha, função e salário.

### 👥 Gerenciamento de clientes

* Cadastro de clientes;
* Alteração de informações;
* Exclusão de clientes;
* Pesquisa de clientes;
* Busca por CPF;
* Controle de crédito disponível para clientes.

### 📦 Gerenciamento de produtos

* Cadastro de produtos;
* Edição de produtos;
* Exclusão de produtos;
* Pesquisa e consulta;
* Controle de quantidade em estoque;
* Gerenciamento de preços e demais informações dos produtos.

### 🏪 Controle de estoque

* Consulta dos produtos cadastrados;
* Visualização da quantidade disponível;
* Atualização do estoque;
* Integração entre estoque e operações de venda.

### 🛒 Sistema de vendas

* Criação de novas vendas;
* Adição de produtos ao carrinho;
* Controle dos itens da venda;
* Cálculo do valor total;
* Associação da venda ao funcionário responsável;
* Associação da venda ao cliente;
* Atualização do estoque após a venda.

### 💳 Formas de pagamento

O sistema possui suporte para diferentes formas de pagamento, incluindo:

* Dinheiro;
* Cartão;
* Pix;
* Crédito do cliente.

Também existe integração com o sistema de crédito dos clientes, permitindo utilizar o saldo disponível durante uma venda.

### 📊 Histórico e relatórios

* Registro das vendas realizadas;
* Consulta de informações das vendas;
* Visualização dos produtos vendidos;
* Associação entre vendas, produtos, funcionários e clientes;
* Consulta de valores e movimentações realizadas no sistema.

## Tecnologias utilizadas

* **Java**
* **Java Swing**
* **JDBC**
* **MySQL**
* **SQL**
* **Programação Orientada a Objetos**

## Arquitetura e organização

O projeto foi organizado separando as principais responsabilidades da aplicação em diferentes pacotes:

```text
src/
├── Controle/
│   ├── App
│   ├── ControleDeLogin
│   └── ControllerGerente
│
├── Modelo/
│   ├── Carrinho
│   ├── ClienteDAO
│   ├── Clientes
│   ├── ConexaoBanco
│   ├── Erro
│   ├── Funcionario
│   ├── FuncionarioDAO
│   ├── Perfil
│   ├── ProcessoDeLogin
│   ├── Produto
│   ├── ProdutoDAO
│   └── VendaDAO
│
└── visao/
    ├── Login
    ├── TelaInicial
    ├── TelaDoCaixa
    ├── TelaEstoque
    ├── TelaResumo
    ├── RelatorioVenda
    └── outras telas
```

A estrutura utiliza uma organização **inspirada no padrão MVC**, separando as classes responsáveis pela lógica de controle, pelos modelos e pelo desenvolvimento das interfaces gráficas.

Os **DAOs (Data Access Objects)** são utilizados para concentrar operações de acesso ao banco de dados, como inserção, consulta, alteração e exclusão de registros.

## Banco de dados

O sistema utiliza **MySQL** como banco de dados para armazenar as informações da aplicação.

Entre os principais dados manipulados estão:

* Funcionários;
* Clientes;
* Produtos;
* Estoque;
* Vendas;
* Itens do carrinho;
* Informações relacionadas aos pagamentos e crédito dos clientes.

A comunicação entre a aplicação Java e o banco de dados é realizada através do **JDBC**, utilizando comandos SQL para executar as operações de persistência.

## Programação Orientada a Objetos

Durante o desenvolvimento foram utilizados diversos conceitos de orientação a objetos, como:

* Classes e objetos;
* Encapsulamento;
* Construtores;
* Métodos e atributos;
* Enumerações;
* Associação entre diferentes entidades do sistema;
* Separação de responsabilidades entre classes.

Classes como `Funcionario`, `Clientes`, `Produto` e `Carrinho` representam entidades do domínio da aplicação, enquanto classes DAO são responsáveis pelas operações relacionadas ao banco de dados.

## Interface gráfica

A interface foi desenvolvida utilizando **Java Swing**, permitindo que o sistema seja executado como uma aplicação desktop.

Entre as telas desenvolvidas estão:

* Tela de login;
* Tela inicial;
* Cadastro de funcionários;
* Cadastro de clientes;
* Cadastro de produtos;
* Controle de estoque;
* Tela de vendas;
* Carrinho de compras;
* Resumo de vendas;
* Relatórios.

## Objetivo acadêmico

O projeto teve como principal objetivo colocar em prática os conhecimentos adquiridos ao longo do curso Técnico em Informática, especialmente nas áreas de:

* Desenvolvimento de sistemas;
* Banco de dados;
* Programação Java;
* SQL;
* Interfaces gráficas;
* Programação Orientada a Objetos;
* Análise e organização de sistemas.

Além da aplicação dos conceitos técnicos, o projeto também buscou reproduzir situações próximas às encontradas em um sistema comercial real, envolvendo diferentes usuários, operações de cadastro, estoque, vendas e armazenamento de informações.

## Diferenciais do projeto

O sistema reúne diferentes módulos em uma única aplicação, permitindo trabalhar com o fluxo completo de uma operação comercial:

```text
Funcionário
     ↓
Login e autenticação
     ↓
Acesso ao sistema
     ↓
Clientes ─── Produtos ─── Estoque
     │           │
     └─────── Venda
                 ↓
             Carrinho
                 ↓
             Pagamento
                 ↓
          Registro da venda
                 ↓
           Histórico/Relatório
```

Dessa forma, o projeto demonstra a integração entre **interface gráfica, lógica de negócio e banco de dados**, formando uma aplicação desktop funcional para gerenciamento de um mercado.

## Contexto

Este projeto foi desenvolvido como **Projeto Integrador do curso Técnico em Informática do IFSC – Campus Gaspar**, representando uma das aplicações práticas dos conhecimentos adquiridos durante a formação.

O desenvolvimento permitiu trabalhar desde a modelagem das entidades e criação do banco de dados até a implementação das interfaces, regras de negócio e operações de persistência.

## Status

**Projeto acadêmico concluído.**

O código permanece como registro do desenvolvimento realizado durante o curso e como demonstração prática dos conhecimentos adquiridos em Java, banco de dados e desenvolvimento de sistemas.


Projeto desenvolvido durante o curso **Técnico em Informática – IFSC Campus Gaspar**.

