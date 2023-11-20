
@giftCard
Feature: Je souhaite activer une carte cadeau
  ETQ Je souhaite activer une carte cadeau
   Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In

  @activategiftcard
  Scenario: Je souhaite activer une carte cadeau
    When Je clique sur le menu Sales
    And Je clique sur le menu Gift cards
    And Je saisie le nom du client "Brenda Lindgren"
    And Je clique sur le bouton Search3
    And Je clique sur le bouton Edit3
    And Je coche la case pour activer la carte
    And Je clique sur bouton Generate code
    And Je clique sur bouton Save
    Then Je verifie que la carte a ete activer

