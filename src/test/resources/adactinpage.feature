Feature: To validate the adactin webpage completely.

Scenario Outline: To validate with the correct username and userpassword.
	Given user should be in adactin webpage.
	When To enter the username and password.
	And To search the hotel.
	And To select the hotel.
	And user should enter "<Firstname>"and"<lastname>"and"<Billing address>"and"<creditcard number>"and"<cvv number>".
	Then user confirmation whether booked or not with ID generated.
	
	Examples:
		|Firstname|lastname|Billing address|creditcard number|cvv number|
		|ben|stoke|london|1234567891012124|456|
#		|benny|stookkes|sanandreas|1234567891012124|476|
#		|ben10|alien|us|1234567891012124|466|
#		|robin|stonke|newyork|1234567891012124|256|
#		|manju|nair|anaimalai|1234567891012124|486|
#		|sanju|samsung|pollachi|1234567891012124|126|
#		|mahendar|dhoni|coimbatore|1234567891012124|465|
#		|dhawan|sikar|salem|1234567891012124|203|
#		|kohli|virat|erode|1234567891012124|227|
#		|rohit|sharma|chennai|1234567891012124|986|

Scenario Outline: To validate with the correct username and userpassword.
	Given user should be in adactin webpage.
	When To enter the username and password.
	And To search the hotel.
	And To select the hotel.
	And user should enter "<Firstname>"and"<lastname>"and"<Billing address>"and"<creditcard number>"and"<cvv number>".
	Then user confirmation whether booked or not with ID generated.
	
	Examples:
		|Firstname|lastname|Billing address|creditcard number|cvv number|
		|ben|stoke|london|1234567891012124|456|

