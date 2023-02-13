@test2
Feature: Buscando en el navegador 
Scenario: Buscar el texto Luis en Chorme 
    Given Inicio el navegador Chrome
    When Buscar la palabra Luis en el navegador de Chorme
    When Presiono el boton buscar
    Then Cierro el navegador

