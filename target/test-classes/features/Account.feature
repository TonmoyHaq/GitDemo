Feature: Application Login




@SmokeTest
Scenario Outline: Home page default login
Given User is on landing page
When User login in to application with  <Username> and <password>
Then Home page is populated
And Cards are not displayed are "false"

Examples:
|Username |password|
|user1         |pass1		   |
|user2         |pass2	   |
|user3         |pass3	   |


