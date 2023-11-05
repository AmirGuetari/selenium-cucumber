@authentification
Feature: Je souhaite verifier la page de connexion
  En tant que utilisateur je souhaite verifier la page de connexion

  @authentification-valid
  Scenario: Je souhaite verifier la page de connexion
    Given Je me connecte surl application nopeCommerce
    When Je saisie l email "admin@yourstore.com"
    And Je saisie le mot de passe "admin"
    And Je clique sur le bouton LOGIN
    Then Je me redirige vers la page Home
   
