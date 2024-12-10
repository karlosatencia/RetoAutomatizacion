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
    Then the system validates the candidate <data>

    Examples:
      | username | password | firstname | middlename | lastname |email      | contactnumber | keywords       | notes                  | data|
      | Admin     | admin123| Carlos    | Andres     | Atencia  | carlos@email.com | 300300300 | Automatización | Reto automatización | Status: Hired |

