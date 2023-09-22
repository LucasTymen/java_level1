/*
Skip to Content
My Home
Learn Java: Loops: For Loops
Narrative and Instructions
Learn
Learn Java: Loops
For Loops

Incrementing with loops is actually so common in programming that Java (like many other programming languages) includes syntax specifically to address this pattern: for loops.

A for loop header is made up of the following three parts, each separated by a semicolon:

    The initialization of the loop control variable.
    A boolean expression.
    An increment or decrement statement.

The opening line might look like this:
*/

for (int i = 0; i < 5; i++) {

  // code that will run

}

/*
In a for loop, an initialization statement is run once in order to initialize the loop control variable.
This variable is modified in every iteration, can be referenced in the loop body, and used to test the boolean condition.
In the example above, i is the loop control variable.

Let’s breakdown the above example:

    i = 0: i is initialized to 0
    i < 5: the loop is given a boolean condition that relies on the value of i. The loop will continue to execute until i < 5 is false.
    i++: i will increment at the end of each loop and before the condition is re-evaluated.

So the code will run through the loop a total of five times.

We’ll also hear the term “iteration” in reference to loops.
When we iterate, it just means that we are repeating the same block of code.
Instructions

Review the syntax of for loops and click Next when you’re ready to build some yourself!
Concept Review
Want to quickly review some of the concepts you’ve been learning?
Take a look at this material's cheatsheet!
Community Forums
Still have questions? View this exercise's thread in the Codecademy Forums.
Image
How for loops work: initialization of a counter, conditional logic that depends on the counter, incrementation of the counter (which runs after the loop body executes for a given counter value)
How for loops work: initialization of a counter, conditional logic that depends on the counter, incrementation of the counter (which runs after the loop body executes for a given counter value), playing
4/10

Learn Java | Codecademy
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-loops/cheatsheet
*/
