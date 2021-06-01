@links
Feature: validate all the links

  @OurProducts
  Scenario: our products
    Given I am in Growthengg Homepage and hover on our products
    When I click on The Knowledge Arcade link
    Then validate Knowledge Arcade page and go back to home page
    Given I am in Growthengg Homepage and click on our products
    When I click on Gene Authoring Tool link
    Then validate Gene Authoring page and go back to home page
    Given I am in Growthengg Homepage and click on our products
    When I click on The Academy LMS link
    Then validate the Academy LMS page and go back to home page

  @OurApproach
  Scenario: our approach
    Given I am in Growthengg Homepage and click on our approach
    When I click on Brain Science link
    Then validate Brian Science page and go back to home page
    Given I am in Growthengg Homepage and click on our approach
    When I click on Social Learning Tool link
    Then validate Social Learning  and go back to home page
    Given I am in Growthengg Homepage and click on our approach
    When I click on Gamefication link
    Then validate the Gamefication page and go back to home page
    Given I am in Growthengg Homepage and click on our approach
    When I click on Personalisation link
    Then validate the Personalisation page and go back to home page

  @Resources
  Scenario: Resources
    Given I am in Growthengg Homepage and click on Resources
    When I click on Downloads link
    Then validate Downloads page and go back to home page
    Given I am in Growthengg Homepage and click on Resources
    When I click on Blog link
    Then validate Blog and go back to home page
    Given I am in Growthengg Homepage and click on Resources
    When I click on Webinars link
    Then validate the Webinars page and go back to home page
    Given I am in Growthengg Homepage and click on Resources
    When I click on Free eLearning Content link
    Then validate the Free eLearning Content page and go back to home page

  @AboutUs
  Scenario: AboutUs
    Given I am in Growthengg Homepage and click on AboutUs
    When I click on Our Story link
    Then validate Our Story page and go back to home page
    Given I am in Growthengg Homepage and click on AboutUs
    When I click on Our Clients link
    Then validate Our Clients and go back to home page
    Given I am in Growthengg Homepage and click on AboutUs
    When I click on Awards link
    Then validate the Awards page and go back to home page
    Given I am in Growthengg Homepage and click on AboutUs
    When I click on Partners link
    Then validate the Partners page and go back to home page
    Given I am in Growthengg Homepage and click on AboutUs
    When I click on GDPR link
    Then validate the GDPR page and go back to home page
    Given I am in Growthengg Homepage and click on AboutUs
    When I click on Get In Touch link
    Then validate the Get In Touch page and go back to home page

  @GetInTouch
  Scenario: GetInTouch
    Given I am in Growthengg Homepage and click on GetinTouch
    Then validate Our Get In Touch main page and go back to home page