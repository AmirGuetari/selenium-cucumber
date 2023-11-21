@newCompaign
Feature: Je souhaite ajouter une nouvelle compagne
  ETQ Je souhaite ajouter une nouvelle compagne

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In

  @newCompaign
  Scenario: Je souhaite ajouter une nouvelle compagne
    When Je clique sur le menu Promotions
    And Je clique sur la commande Compaigns
    And Je clique sur le bouton Add new4
    And Je saisis le nom de la compagne "Test"
    And Je saisis le sujet de la compagne "Testing"
    And Je remplis la description de la compagne "ABC"
    And Je saisis la date d envoi de la compagne " 12/12/2023"
    And Je choisis la boutique "Test store 2"
    And Je clique sur le bouton Save4
    Then Je verifie que la nouvelle compagne a ete ajoute
