/*
Conditionals and Control Flow
If-Then Statement

The if-then statement is the most simple control flow we can write.
It tests an expression for truth and executes some code based on it.
*/

if (flip == 1) {

  System.out.println("Heads!");

}

/*
    The if keyword marks the beginning of the conditional statement, followed by parentheses ().
    The parentheses hold a boolean datatype.

For the condition in parentheses we can also use variables that reference a boolean, or comparisons that evaluate to a boolean.
==> https://www.codecademy.com/resources/docs/java/variables

The boolean condition is followed by opening and closing curly braces that mark a block of code.
This block runs if, and only if, the boolean is true.
*/

boolean isValidPassword = true;

if (isValidPassword) {

  System.out.println("Password accepted!");

}

// Prints "Password accepted!"

int numberOfItemsInCart = 9;

if (numberOfItemsInCart > 12) {

  System.out.println("Express checkout not available");

}

// Nothing is printed.

/*
If a conditional is brief we can omit the curly braces entirely:
*/

if (true) System.out.println("Brevity is the soul of wit");

/*
Note: Conditional statements do not end in a semicolon.
Instructions
1.
The code editor contains an Order class to track retail shipments.

Write an if-then statement that prints High value item! when itemCost is greater than 24.00.

Here’s the general structure:
*/

if (condition) {

  // Do something

}
/*

Concept Review
Want to quickly review some of the concepts you’ve been learning?
Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-conditionals-control-flow-u/cheatsheet
*/
