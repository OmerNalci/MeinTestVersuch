Feature: Ein Versuch für mich

  Scenario: Einloggen auf einer Seite
    Given Benutzer geht auf "https://opencart.abstracta.us/"
    When  Benutzer loggt sich ein
    Then  Benutzer ist auf der Startseite
    Then  Warten zum Ansehen