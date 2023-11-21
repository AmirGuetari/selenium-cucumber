
@addanewcategory
Feature: Je veux ajouter une nouvelle categorie
  ETQ vendeur Je veux ajouter une nouvelle categorie

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In

  @addanewcategory-valid
  Scenario: Je veux ajouter une nouvelle categorie
    When Je clique sur le menu Catalog
    And Je clique sur le menu Categories
    And Je clique sur le bouton Add new5
    And Je saisis un nom "Cyclist"
    And Je saisis une description "New Description"
    And Je selectionne une parent category Books "14"
    And Je charge un fichier "C:\Users\user\Desktop\Formation Automation Selenium\cycling-icon-vector-23386813.jpg"
    And Je verifie que le fichier a bien ete charge
    And Je clique sur le bouton Save5
    Then Je verifie que la nouvelle categorie a ete ajoutee "The new category has been added successfully."