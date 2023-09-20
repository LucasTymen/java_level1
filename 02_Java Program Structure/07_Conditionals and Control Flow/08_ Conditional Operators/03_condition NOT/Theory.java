/*
Conditional Operators
Logical NOT: !

The unary operator NOT, !, works on a single value. This operator evaluates to the opposite boolean to which it’s applied:
*/

!false
// true
!true
// false

/*
NOT is useful for expressing our intent clearly in programs.
For example, sometimes we need the opposite behavior of an if-then: run a code block only if the condition is false.
*/

boolean hasPrerequisite = false;

if (hasPrerequisite) {
  // do nothing
} else {
  System.out.println("Must complete prerequisite course!");
}

/*
This code does what we want but it’s strange to have a code block that does nothing!

The logical NOT operator cleans up our example:
*/

boolean hasPrerequisite = false;

if (!hasPrerequisite) {
  System.out.println("Must complete prerequisite course!");
}

/*
We can write a succinct conditional statement without an empty code block.
Instructions
1.
Let’s make informUser() more informative. If their reservation is not confirmed, they should know!

Write an if-then-else statement and use ! with isConfirmed as the condition.

If their reservation is not confirmed, write Unable to confirm reservation, please contact restaurant.

Else write: Please enjoy your meal!

The NOT operator flips the boolean value to which it is applied. This helps make code more meaningful:
*/

boolean doorIsLocked = false;

if (!doorIsLocked) {
  System.out.println("Come on in!");
}

/*
This code snippet will print Come on in! because the false value is flipped to true by !.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-conditionals-control-flow-u/cheatsheet
*/
