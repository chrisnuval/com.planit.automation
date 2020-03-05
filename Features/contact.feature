Feature: Send a message to Customer Service in the ‘Contact us’ section

  Scenario: User sends a message to customer service
    Given User is in the website http://automationpractice.com/index.php
    And User clicks on Contact Us button
    When User selects Customer service in the Subject Heading dropdown
    And User enters christian.c.nuval@gmail.com in the Email address field
    And User enters 1000 in the Order reference field
    And User adds a message in the Message field
    And User clicks send button
    Then User has successfully sent a message. 
     
