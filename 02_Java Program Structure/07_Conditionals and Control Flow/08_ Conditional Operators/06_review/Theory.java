/*
Conditional Operators
Review

Conditional operators work on boolean values to simplify our code.
==> https://www.codecademy.com/resources/docs/java/operators
They’re often combined with conditional statements to consolidate the branching logic.

Conditional-AND, &&, evaluates to true if the booleans on both sides are true.
*/

if (true && false) {
  System.out.println("You won't see me print!");
} else if (true && true) {
  System.out.println("You will see me print!");
}

// Conditional-OR, ||, evaluates to true if one or both of the booleans on either side is true.

if (false || false) {
  System.out.println("You won't see me print!");
} else if (false || true) {
  System.out.println("You will see me print!");
}

//Logical-NOT, !, evaluates to the opposite boolean value to which it is applied.

if (!false) {
  System.out.println("You will see me print!");
}

/*
Instructions
The complete Reservation class is in the code editor.

Play around inside main() and see if you can create instances that will run every possible conditional branch.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-conditionals-control-flow-u/cheatsheet
*/
