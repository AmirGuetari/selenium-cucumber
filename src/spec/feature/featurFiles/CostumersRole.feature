
@custumersRole
Feature: Je souhaite modifier le role du client
  ETQ je souhaite modifier le role du client
Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In
    And Je clique sur le menu Custumers
  @modifyRole
  Scenario: Je souhaite modifier le role du client
    When Je clique sur la commande Custumers roles
    And Je clique sur le bouton Add new1
    When Je saisis le nom du client "NewClient" dans le champ Name
    And Je clique sur le bouton Choose product
    And Je me redirige vers la fenetre Choose a product
    And Je saisis le nom de produit "Lenovo IdeaCentre 600 All-in-One PC" dans le champ Product name
    And Je clique sur le bouton Search
    And Je clique sur le bouton Select
    And Je clique sur le bouton Save2
    Then Je verifie que le role de nouveau client a ete ajoute "The new customer role has been added successfully."
