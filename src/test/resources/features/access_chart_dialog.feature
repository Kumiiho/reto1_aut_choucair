#Autor: Andres Felipe Vargas Rey
#language:en

Feature: test graficos en un dialogo

  Scenario Outline: Successful login on the website
    Given El usuario accede al WebSite
    When Ingresar credenciales de inicio de sesion
      | user   | password   |
      | <user> | <password> |
    And Accede al <title> pantalla inicial
    When Abre menu de opciones
    When Accede al apartado <opcionFinal>
    When Da clic al boton Launch Dialog
    Then Abre <titleGraphic> y su contenido

    Examples:
      | user  | password | title     | opcionFinal       | titleGraphic|
      | admin | serenity | Dashboard | Chart in a Dialog | Launch Dialog|
