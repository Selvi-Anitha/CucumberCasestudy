@tag
Feature:Signin

@tag1
Scenario Outline:success

Given User is in home page
And User click Login  button
And User give userName "<userName>"
And User give password "<password>"
Then Click Login

Examples:

	| userName         | password   |
	| ArubKumar        | Arub123    |
	