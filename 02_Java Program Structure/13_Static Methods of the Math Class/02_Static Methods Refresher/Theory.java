/*Static Variables and Methods
Static Methods Refresher

In this lesson, we’re going to dive into how to create classes with your own static methods and static variables.
To begin, let’s take a quick refresher on static methods.

Static methods are methods that belong to an entire class, not a specific object of the class.
Static methods are called using the class name and the . operator.
We’ve seen a couple of static methods already!

double randomNumber = Math.random();
// Stores a random decimal between 0.0 and 1.0 in randomNumber

double number = Double.valueOf("2.5");
// Transforms the String "2.5" into a double

In the first example, random() is a static method that belongs to the Math class.
We didn’t need to create a Math object (like Math myMathObject = new Math()) in order to use that method.
We could just call it using the class name.

Similarly, valueOf() is a static method of the Double class.
Given a String as an input, this method will turn that String into a double.
Again, we don’t need to create a Double object in order to call this method — we use the class itself to call it.

Finally, notice that our main() methods have been static this whole time.
When Java runs your program, it calls that the main method of your class — YourClassName.main().
Instructions

We’ve set up some code with a handful of common static methods. We’re using:

    Math.random()
    Math.abs()
    Integer.toString()

==> https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#random--
==> https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#abs-int-
==> https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#toString(int)

==> https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html


    Take a look at the documentation for these methods and try to figure out what they do.

You can also look at the documentation for the entire Math class which has many more static methods.
Find a static method that looks interesting to you, and try to use it!

Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/java-access-encapsulation-and-static-methods/cheatsheet
*/
