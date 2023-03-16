Feature:validation of facebook login field

Scenario Outline: validation of facebook by giving "<username>" and "<password>"
Given User launches the facebook URL
When User enters the "<username>" and "<password>"
And User clicks on the login button
Then User validates the title of the webpage

Examples:
    | username | password |
    | test@1   | pass@1   |
    | test@2   | pass@2   |
    | test@3   | pass@3   |
    | test@4   | pass@4   |