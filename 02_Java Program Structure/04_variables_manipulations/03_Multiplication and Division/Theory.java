/*

Learn Java: Manipulating Variables
Multiplication and Division

Let’s say that our employer is calculating our paycheck and depositing it to our bank account.
We worked 40 hours last week, at a rate of $15.50 an hour. Java can calculate this with the multiplication operator *:
*/
double paycheckAmount = 40 * 15.50;
//paycheckAmount now holds 620.0

//If we want to see how many hours our total balance represents, we use the division operator /:

double balance = 20010.5;
double hourlyRate = 15.5;
double hoursWorked = balance / hourlyRate;
//hoursWorked now holds 1291.0

//Division has different results with integers. The / operator does integer division, which means that any remainder is lost.

int evenlyDivided = 10 / 5;
//evenlyDivided holds 2, because 10 divided by 5 is 2
int unevenlyDivided = 10 / 4;
//unevenlyDivided holds 2, because 10 divided by 4 is 2.5

/*
evenlyDivided stores what you expect, but unevenlyDivided holds 2 because ints cannot store decimals!
It’s important to note that the int doesn’t round the decimal, but floors it. Java removes the 0.5 to fit the result into an int type!

It’s important to note that if we try to divide any number by 0, we will get an ArithmeticException error as a result.
Instructions
1.

In main(), there is a variable called subtotal, which represents the subtotal of an amount to pay on a bill, and a variable called tax, which represents the tax rate that will be applied to that subtotal.

Create a double variable, total, that holds subtotal plus the product of subtotal and tax.

Print the total variable!
2.

There were 4 people who bought this meal together and want to split the cost.

Create a double variable called perPerson that holds total divided by 4.

Print the perPerson variable!
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
*/
