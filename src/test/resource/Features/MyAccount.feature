Feature: user view to myaccount

Scenario: user checks myaccount 
When login with the url
When user click my account
And user click my orders
And user click address book and update the address 
Then user checks the updated address
