Feature: User
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario : GET - As admin I have be able to get all post data
    Given I set GET api endpoint
    When I send GET HTTP request from User
    Then I receive valid HTTP response code GET 200
    And I receive valid all post data

  Scenario: POST - As admin I have be able to create a new data post
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new post

  Scenario: Get - As admin I have be able to Get post data based on ID
    Given I set GET endpoint
    When I send GET HTTP request Based On ID
    Then I receive valid HTTP response code 200 OK
    And I receive valid post data based on ID


  Scenario: PUT - As admin I have be able to update post data based on ID
    Given I set PUT endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code PUT 200
    And I receive valid data that has been updated

  Scenario: DELETE - As admin I have be able to Delete post data by ID
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code DELETE 200
