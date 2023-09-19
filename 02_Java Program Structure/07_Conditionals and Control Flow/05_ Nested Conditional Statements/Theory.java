/*
Conditionals and Control Flow
Nested Conditional Statements

We can create more complex conditional structures by creating nested conditional statements.
This is created by placing conditional statements inside other conditional statements:
*/

if (outer condition) {
  if (nested condition) {
    Instruction to execute if both conditions are true
  }
}

/*
When we implement nested conditional statements, the outer statement is evaluated first.
If the outer condition is true, then the inner, nested statement is evaluated.

Let’s create a program that helps us decide what to wear based on the weather:
*/


int temp = 45;
boolean raining = true;

if (temp < 60) {
  System.out.println("Wear a jacket!");
  if (raining == true) {
    System.out.println("Bring your umbrella.");
  } else {
    System.out.println("Leave your umbrella home.");
  }
}

/*
In the code snippet above, our compiler will check the condition in the first if-then statement: temp < 60.
Since temp has a value of 45, this condition is true; therefore, our program will print Wear a jacket!.

Then, we’ll evaluate the condition of the nested if-then statement: raining == true.
This condition is also true, so Bring your umbrella is also printed to the screen.

Note that, if the first condition was false, the nested condition would not be evaluated.

Instructions
1.
The company offers a temporary deal that, if the consumer uses the coupon "ship50", the company will reduce the express shipping price.

Let’s rewrite the body of else-if statement from the last exercise.
Inside the else-if statement, create a nested if-then statement that checks if couponCode equals "ship50".

If the nested condition is true, return the value .85.

If the condition is false, use a nested else statement to return the value 1.75.

The solution should look similar to the example below:
*/

public double calculateShipping() {
  if (shipping.equals("Regular")) {
    return 0;
  } else if (shipping.equals("Express")) {
    // Add your code here
    if (couponCode.equals("couponCodeValue")) {
      // return discounted shipping value
    } else {
      // return full shipping value
    }
  } else {
    return .50;
  }
}

/*
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet! */
