Feature: PutPrueba
  Probaremos el metodo put de la clase buffer

  Scenario Outline: 
    Given Tengo buffer
    When Inserto a=<a>
    Then size es uno
    
    
 Examples:
    | a |
    | 2 |
    | 20 |
    | 1 | 
    | 15 |
    
Scenario Outline: 
    Given Tengo buffer
    When Inserto a=<a> y b=<b>
    Then size es dos
    
    
 Examples:
    | a | b |
    | 2 | 2 |
    | 20 | 20 |
    | 1 | 1 |
    | 15 | 15 |

