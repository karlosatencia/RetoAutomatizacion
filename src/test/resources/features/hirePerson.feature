@Register
Feature: Hire a person

  @NewRegister
  Scenario Outline: Hire a person successfully
    Given which user enters the orange HRM website
    And enter your credentials
      | username | password |
      | <username> | <password> |
    When enter the information of the person to be hired
      | firstname   | middlename   | lastname   | email   | contactnumber   | keywords   | notes   |
      | <firstname> | <middlename> | <lastname> | <email> | <contactnumber> | <keywords> | <notes> |
    Then el sistema valida los datos del candidato
      | validation   |
      |<validation>  |

    Examples:
      | username | password | firstname | middlename | lastname |email      | contactnumber | keywords       | notes                  | validation|
      | Admin     | admin123| Carlos    | Andres     | Atencia  | carlos@email.com | 300300300 | Automatización | Reto automatización | nombre    |

