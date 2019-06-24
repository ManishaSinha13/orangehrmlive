Feature: OrangeHRMLive
Scenario: OrangeHRMLive traversing and transactions

Given The user is on landing page
When The user provides the username and password
Then Verify if the user able to login successfully
When The user navigates to the General Information page
Then The user edits the details
Then The user provide the details for adding employee
Then The user uploads the photo
Then The user saves all the details
When The user navigates to the Dashboard page
Then The user mouse hovers on the subunit graph
Then The user closes the browser