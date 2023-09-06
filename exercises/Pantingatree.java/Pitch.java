/* Learn Java
Planting a Tree

Introduce yourself to users and plant a tree for them!
Tasks
6/7 Complete
Mark the tasks as complete by checking them off
Creating the Class

1.

We’re starting with a blank Java file named Tree.java.

Define a class that follows the Java naming conventions.

Java naming conventions have class names matching file names.

For example, here is how to define a class in the file MyExample.java.
*/

public class MyExample {
  // class code goes here
}

/*
2.

This code produces an error because our program needs a main() method.

Define this method inside the curly braces of the Tree class.

We use the same main method declaration for every class:
*/

public class Dog {
  public static void main(String[] args) {
    // code for main method goes here
  }
}

/*
3.

Write a comment in main() that describes the task it will perform.

We’re going to introduce ourselves and print a tree to the screen.

You can use the single-line or multi-line syntax for your comment.
*/

public class Dog {
  public static void main(String[] args) {
    // I am a single line comment


    /* It would appear that I, humble though
       I may be, have been chosen as the
       multi-line comment for this example */
  }
}

/*
4.

Below your comment, print a message introducing yourself to the user.

Try something like “Hey there, I’m Ariel and I’m learning to code in Java!”

When you run the code, you should see this message printed to the screen.

    We can print to the screen like so:

    System.out.println("I will be printed to the screen");

    Note that we use double quotes and end the statement with a semicolon!

Planting Trees

5.

After introducing yourself, use another print statement to output the project goal!

Something like “I’m going to plant a tree today!” or “Ready to get my hands dirty!”
6.

See how the second statement begins on a new line? We’ll use multiple print statements to plant our tree.

For example:

    System.out.println("  *  ");
    System.out.println(" *** ");
    System.out.println(" *** ");
    System.out.println("  *  ");
    System.out.println("  *  ");

will print a tree like this:

  *
 ***
 ***
  *
  *

Try it out!
7.

Have fun and experiment with different trees.

Here are a couple we made:

 * ** *
 ******
  ****
   **
   **
~~~~~~~~~~

 *****
 *****
 *****
   *
   *
#######

You can explore other printing methods in the Java documentation.
 */
