Feature: Size Prueba
  Probaremos el metodo size de la clase buffer

  Scenario Outline: 
    Given Tengo buffer
    When Inserto a=<a> y b=<b>
    Then size es dos
    
    
 Examples:
    | a | b |
    | 9 | 6 |
    | 2 | 3 |
    | 7 | 7 |
    | 12 | 1 |
