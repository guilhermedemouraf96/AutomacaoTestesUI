#Author: your.email@your.domain.com

@login
Feature: Tela de login
  Como usuario
  Quero fazer o login 
  Para acessar o site da loja 

Background: acessar tela de login
Given que esteja na tela de login "https://www.saucedemo.com/"

  @negativo
  Scenario: CT1: Login com dados invalidos
    But preencho usuario invalido
    And preencho senha invalida 
    And realizo o login com dados invalidos
    Then visualizo mensagem de usuario e senha invalido
    
   
    Scenario: CT2: Dados em branco
      But não preencho usuario
    And não preencho senha  
    And realizo o login com dados em branco
    Then visualizo mensagem de campos em branco
    