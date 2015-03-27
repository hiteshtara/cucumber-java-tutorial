Feature: Test gmail
In order to test gmail


Scenario Outline: Test gmail

Given I go to <url>
When I enter my username as <username>
And I enter my password as <password>
Then it should login

Examples:
|url    | username | password |
|~gmail~|~aaa~     |~bbb~     |
|~gmail~|~xxx~     |~yyy~     |