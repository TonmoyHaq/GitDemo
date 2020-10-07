Feature: Application Login

@RegTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "username" and "password"
Then Home page is populated
And Cards are displayed are "false"

Scenario: Home page default login
Given User is on landing page
When User login into application with "username" and "password"
Then Home page is populated
And Cards are not displayed are "false"

Scenario: Home page default login
Given User is on landing page
When User login into application with following details
| jenny | abcd | jenny@yahoo.com | Austril | 14257 |
Then Home page is populated
And Cards are not displayed are "false"

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


