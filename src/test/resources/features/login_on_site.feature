#Autor: Andres Felipe Vargas Rey
#language:en

Feature: Login module test

  Scenario Outline: Successful login on the website
    Given El usuario accede al WebSite
    When Ingresar credenciales de inicio de sesion
      | user   | password   |
      | <user> | <password> |
    Then Accede al <title> pantalla inicial
    Examples:
      | user  | password     | title     |
      | admin | serenity | Dashboard |
