/*
Inheritance and Polymorphism
Inheritance in Practice

So how do we define a child class so that it inherits from a parent class?
We use the keyword extends like this:
*/

class Shape {

  // Shape class members

}

class Triangle extends Shape {

  // additional Triangle class members

}

/*
Now Triangle has inherited traits from Shape, meaning it copied over class members from Shape.
When we use inheritance to extend a subclass from a superclass, we create an “is-a” relationship from the subclass to the superclass.
For example, an object of Triangle is a member of the Shape class;
however, an object of Shape is not necessarily an object of Triangle.
==> https://www.codecademy.com/resources/docs/java/inheritance

Until now, we’ve only been working with one class and one file.
However, most Java programs utilize multiple classes, each of which requires its own file.
Only one file needs a main() method — this is the file we will run.
==> https://www.codecademy.com/resources/docs/java/classes

Note: the various classes in our Java package — even though they are in different files — will have access to each other, so we can instantiate one class inside of another.
==> https://www.codecademy.com/resources/docs/java/files

Instructions
Checkpoint 1 Enabled

1.

You have two files:

    Noodle.java: This will house your parent class.
    Spaghetti.java: This is where you will build your child class.

The Noodle class has already been defined for you, including:

    The lengthInCentimeters field.
    The shape field.
    The texture field.
    A cook() method.

In Spaghetti.java, create a class called Spaghetti.

Then tab back over to Noodle.java to run your code. (We always need to run our program using the file that contains the main() method.)

For example, to create a class called Hamster:
*/

class Hamster {

}

/*
Checkpoint 2 Step instruction is unavailable until previous steps are completed

2.

Tab back over to Spaghetti.java and make Spaghetti a child class of Noodle (if you haven’t already).
Checkpoint 3 Step instruction is unavailable until previous steps are completed

3.

Tab back over to Noodle.java.

In main(), instantiate a new Spaghetti object called spaghettiPomodoro.

Print out its texture field to the terminal.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-inheritance-and-polymorphism/cheatsheet
*/
