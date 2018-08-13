Feature: Login as Teacher Student TeachLead

	#The user  should be able to login from Teacher, Student, TeachLead accounts.
	
	Scenario Outline: Verify login as Teacher Student TeachLead
		Given the user is on the login page
		When the user enters username "<email>" and password "<password>"
		When the user clicks on the Sign in link
		Then label "Instagram" should be displayed
		
		Examples:
		    |email                   |password      |
		    |ericyarek@gmail.com  	 |Fh&J1#erNa9	|
		    