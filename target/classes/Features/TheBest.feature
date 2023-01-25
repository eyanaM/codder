Feature: This is contact us feature



Scenario: Verify contact us page
Given Lunching application <"URl">
Then click contact us link
Then Verify Contact page display




Scenario: Verify Contact page display
Given Lunching application <"URL">
Then enter woman in search field
Then click search button
Then Verify search result display
Then click Printed Chiffon Dress link
Then click Add to Cart 
Then click home icon to go back to home page
Then verify  Homepage is display



#@test
Scenario: verify  Homepage is display
Given Lunching application <"URL">
Then click singin
Then enter username and password and click signin 
Then verify user can login







