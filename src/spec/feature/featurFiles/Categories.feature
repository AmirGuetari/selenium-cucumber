@categories
Feature: Je souhaite ajouter une nouvelle categorie
 ETQ Je souhaite ajouter une nouvelle categorie
 
 Background: 
   Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In
    And Je clique sur le menu Catalog

  @addnewcategory
  Scenario: Je souhaite ajouter une categorie
    Given Je suis dans le menu Catalog
    When Je clique sur la commande Categories
    And Je clique sur le bouton Add new
    And Je remplis le champ Name "IBM"
    And Je remplis le champ Description "test"
    And Je selectionne la commande "computers" dans la liste deroulante Parent Category
    And Je choisis un fichier pour Upload
    And Je clique sur le bouton Save
    Then Je verifie que la nouvelle categorie a ete ajoute "The new category has been added successfully."
    
