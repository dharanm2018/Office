Feature: Search Hotel

Scenario:  successful login
Given user enter launch the browser
And user enter the url
When user Enter the user name and password
And user click on login button
Then user on home page

Scenario:  successful login with cucumber credential
Given user enter launch the browser
And user enter the url
When user Enter the username "dharanm2018" and password "Ganga@2024"
And user click on login button
Then user on home page

Scenario:  invalid login validation
Given user enter launch the browser
And user enter the url
When user Enter the invalid username and invalid password
And user click on login button
Then user on Reservation Page


Scenario Outline: Login with multiple credential
Given user enter launch the browser
And user enter the url
When user Enter the "<username>" and  "<password>"
And user click on login button
Then user on Reservation Page

Examples: 
|username|password|
|dharanm2018|Ganga@2024|
|dharanm2018|Ganga@2025|
|dharanm2018|Ganga@2026|




