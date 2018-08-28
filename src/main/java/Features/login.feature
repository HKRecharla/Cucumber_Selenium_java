Feature: Login Feature
@Regression
Scenario Outline: RIL BB login scenario

Given Users is already on Home page
When title of login page is B2B
Then enter username "<username>" and password "<password>"
And user clicks on login button
And user is on home page

Examples:
	| username | password |
	| 9035777119 | 12345678 |
#	| harikrishnarecharla@gmail.com | 12345678 |
	
