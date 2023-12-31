/*
Learn Java: Loops
Using For Loops

Even though we can write while loops that accomplish the same task, for loops are useful because they help us remember to increment our counter — something that is easy to forget when we increment with a while loop.
==> https://www.codecademy.com/resources/docs/java/loops

Leaving out that line of code would cause an infinite loop — yikes!

Fortunately, equipped with our new understanding of for loops, we can help prevent infinite loops in our own code.

It’s important to be aware that, if we don’t create the correct for loop header, we can cause the iteration to loop one too many or one too few times;
this occurrence is known as an “off by one” error.

For example, imagine we wanted to find the sum of the first ten numbers and wrote the following code:
*/

int sum = 0;
for (int i = 0; i < 10; i++) {
  sum += i
}

/*
This code would produce an incorrect value of 45.
We skipped adding 10 to sum because our loop control variable started with a value of 0 and stopped the iteration after it had a value of 9.
We were off by one! We could fix this by changing the condition of our loop to be i <= 10; or i < 11;.

These errors can be tricky because, while they do not always produce an error in the terminal, they can cause some miscalculations in our code.
==> https://www.codecademy.com/resources/docs/java/errors

These are called logical errors — the code runs fine, but it didn’t do what you expected it to do.
Instructions
1.

We’ve provided a while loop that loops from 1 to 100 outputting a string on each iteration. Refactor (rewrite) this code as a for loop.

Remember, the syntax of a for loop looks like:
*/

for (int i = 0; i < 5; i++) {

  // code that will run

}

/*
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet! */
