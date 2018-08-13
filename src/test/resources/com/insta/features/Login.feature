Feature: Login

	#login link
	@Smoke
	Scenario: Verify login valid credentials
		Given the user is on the login page
		When the user enters username "ericyarek@gmail.com" and password "Fh&J1#erNa9"
		When the user clicks on the Sign in link
		Then label "Instagram" should be displayed