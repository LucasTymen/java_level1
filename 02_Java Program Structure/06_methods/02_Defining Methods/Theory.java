/*Learn Java: Methods
Defining Methods

If we were to define a checkBalance() method for the Savings Account example we talked about earlier, it would look like the following:
*/

public void checkBalance(){
  System.out.println("Hello!");
  System.out.println("Your balance is " + balance);
}

/*
The first line, public void checkBalance(), is the method declaration.
It gives the program some information about the method:

    public means that other classes can access this method. We will learn more about that later in the course.
    ==> https://www.codecademy.com/resources/docs/java/classes
    The void keyword means that there is no specific output from the method.
    ==> https://www.codecademy.com/resources/docs/java/output
    ==> https://www.codecademy.com/resources/docs/java/methods
    We will see methods that are not void later in this lesson, but for now, all of our methods will be void.
    checkBalance() is the name of the method.

Every method has its own unique method signature which is composed of the method’s name and its parameter type.
In this example, the method signature is checkBalance().

The two print statements are inside the body of the method, which is defined by the curly braces: { and }.

Anything we can do in our main() method, we can do in other methods!
All of the Java tools you know, like the math and comparison operators, can be used to make interesting and useful methods.
==> https://www.codecademy.com/resources/docs/java/operators

Keep Reading: AP Computer Science A Students

checkBalance() is considered a non-static method because its signature does not include the keyword static like the main() method does.
We’ll learn more about non-static methods later in this course.
Instructions
1.

In between the constructor and the main() method, add a method called advertise() to the Store class.
It should be accessible by other classes, and should have no output.

You can leave the body of the method empty.
2.

Inside the advertise() method, type two print statements. They should result in the printouts:

"Come spend some money!"
"Selling productType!"

where productType is replaced with the value in the variable productType.

However, we’re not going to see these Strings printed out yet! We’ll see in the next exercise how we can make these printouts actually run.

If we wanted to print The name of this dog is dogName! with dogName replaced by the value in the dogName variable, we would write:
*/

System.out.println("The name of this dog is " + dogName + "!");

/*
Make sure to write your print statements within the curly braces of the advertise() method!
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-object-oriented-java-u/cheatsheet
*/
