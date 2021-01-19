Feature: End to end tests for toolsQA's bookstore API
Description: The purpose of this tests are to cove end to end happy flows for costumer

Book Store Swagger URL: http://bookstore.toolsqa.com/swagger/index.html

	Background: User generates token for Authorisation
		Given I am an authorized user
		
	Scenario: Authorized user is able to Add and Remove a book
		Given: A list of books are available
		When: I add a book to my reading list
		Then: The book is added
		When: I remove a book from my reading list
		Then: The book is removed
	