@custumerschangevendor
Feature: Je souhaite modifier le vendeur
  En tant que utilisateur je souhaite changer le vendeur

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In
    

  @modifyvendor
  Scenario: Je souhaite modifier le vendeur
    When Je clique sur le menu Custumers
    And Je clique sur la commande Vendors
    And Je saisie "Vendor 1" dans le champ Vendor name
    And Je clique sur bouton Search
    And Je clique sur le bouton Edit
    And Je vide le champ Email
    And Je saisie un nouveau Email "Vendornew@gmail.com"
    And Je clique sur le bouton Save1
    Then Je verifie que le vendeur a ete modifie "The vendor has been updated successfully."
