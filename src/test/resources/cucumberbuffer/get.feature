Feature: GetPrueba
  Probaremos el metodo get de la clase buffer

  Scenario Outline: 
    Given Tengo buffer
    When Inserto a=<a>
    Then Saco b=<b>
    
    
 Examples:
    | a | b |
    | 2 | 2 |
    | 20 | 20 |
    | 1 | 1 |
    | 15 | 15 |
