Feature: login
Background:
Given user already logged into application
|username|password|
|dharanm2018|Ganga@2024|

Scenario:  Search Hotel Section
Given user is on search page
When user gets the title of searchPage
Then page title should be "Adactin.com - Search Hotel"
And validating all the criteria
|Location|
|Hotels|
|Room Type|
|Number of Rooms|
|Check In Date|
|Check Out Date|
|Adults per Room|
|Children per Room|
And Search criteria should be 8





