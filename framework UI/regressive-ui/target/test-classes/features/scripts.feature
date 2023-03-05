
@login
Feature: Tela de login	
  Como usuario 
  Quero fazer o login
  Para acessar o site da loja
  
  Background: Tela de login
  Given que esteja na tela de login 

  @loginPositivo
  Scenario: Login valido
    And preencho o campo usuario valido 
    And preencho o campo senha valido
    When fazer o login
    Then acessar o site da loja 
   
  @loginNegativo
  Scenario: Usuario bloqueado
    But preencho o campo usuario Bloqueado
    And preencher a senha
    When fazer o login
    Then visualizo mensagem de usuario bloqueado
    
  Scenario: Usuario invalido
    And preencho o campo usuario invalido
    And preencho o campo senha invalido
    When fazer o login
    Then visualizo mensagem de usuario invalido
    
    Scenario: Campos em branco
    And não preencho o campo usuario
    And não preencho o campo senha
    When fazer o login
    Then visualizo mensagem de dados em branco
