@login
Feature: Amazon login feature Test


Scenario Outline: User able to signin with valid credentials
	
	Given Initializ the browser with chrome
	When Navigate to "https://www.amazon.com/" site
	And Click on Sign in to navigate sigin Page
	And User enter <username>
	And click on continue button
	And User ente <password>
	And Click on sign in button
	Then login should be successful
	And Close to the window
	
Examples:
|username			|password |
|soyeb88@gmail.com  |Dhaka_866| 	

Scenario Outline: User are not able to signin with invalid username
	
	Given  Initializ the browser with chrome
	When Navigate to "https://www.amazon.com/" site
	And Click on Sign in to navigate sigin Page
	And User enter <username>
	And click on continue button
	Then Show username error message 
	And Close to the window
	
Examples:
|username			|
|soyeb8@gmail.com   |
	
Scenario Outline: User are not able to signin with invalid password
	
	Given Initializ the browser with chrome
	When Navigate to "https://www.amazon.com/" site
	And Click on Sign in to navigate sigin Page
	And User enter <username>
	And click on continue button
	And User ente <password>
	And Click on sign in button
	Then show password page error msessage
	And Close to the window

Examples:
|username			|password |
|soyeb88@gmail.com   |Dhaka_86| 	 