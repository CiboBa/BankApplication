# BankApplication
##Your application should do the following:
* Read a .csv file of name, social security number, account type and initial deposit
* Use a proper data structure to hold all these accounts
* Both savings and checking accounts share the following properties:
    * deposit()
    * withdraw()
    * transfer()
    * showInfo()
    * 11-Digit Account Number (generated with the following process: 1 or 2 
    depending on Savings or Checking, last two digits of SSN, unique 5-digit
    number, a random 3-digit number)
* Savings Account holders are given a Safe Deposit Box, identified by 
a 3-digit number and accessed with a 4-digit code
* Checking Account holders are assigned a Debit Card with 12-digit
number and 4-digit PIN
* Both accounts will use an interface that determines the base interest rate.
_Saving accounts will use .25 points less than the base rate.
Checking accounts will use 15% of the base rate._
* The ShowInfo method should reveal relevant account information as well 
as information specific to the Checking account or Savings account.