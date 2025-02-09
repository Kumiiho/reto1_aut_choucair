#Autor: Andres Felipe Vargas Rey
#language:en

Feature: Test graficos en un dialogo

  Scenario Outline: Grafica de dialogo en el website
    Given El usuario accede al WebSite
    When Ingresar credenciales de inicio de sesion
      | user   | password   |
      | <user> | <password> |
    When Accede al <title> pantalla inicial
    When Accede al apartado <opcionFinal>
    When Da clic al boton Launch Dialog
    Then Abre <titleGraphic> y su contenido

    Examples:
      | user  | password | title     | opcionFinal       | titleGraphic|
      | admin | serenity | Dashboard | Chart in a Dialog | Orders by Shipper|
