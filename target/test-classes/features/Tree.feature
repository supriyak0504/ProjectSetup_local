Feature: Tree Data Structure

  Scenario: Tree DS Home Page
    Given User is on the SignedIn Home Page for tree
    When User Clicks on "Get Started" button on tree Data Structure
    Then The Tree page appears

Scenario: Overview of Trees
When User clicks on Overview of Trees
Then The Overview of Trees page opens
And User clicks on Try here button
Then the text editor opens and user gives python code
And User clicks on Run Button
Then The output is displayed