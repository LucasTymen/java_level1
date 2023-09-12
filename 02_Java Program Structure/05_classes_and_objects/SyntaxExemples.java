// Java instance

public class Person {
  int age;
  String name;

  // Constructor method
  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public static void main(String[] args) {
    Person Bob = new Person(31, "Bob");
    Person Alice = new Person(27, "Alice");
  }
}
/*
Java instances are objects that are based on classes. For example, Bob may be an instance of the class Person.

Every instance has access to its own set of variables which are known as instance fields, which are variables declared within the scope of the instance. Values for instance fields are assigned within the constructor method.
*/


// Constructor Signatures

// The signature is `Cat(String furLength, boolean hasClaws)`.
public class Cat {
  String furType;
  boolean containsClaws;

  public Cat(String furLength, boolean hasClaws) {
    furType = furLength;
    containsClaws = hasClaws;
  }
  public static void main(String[] args) {
    Cat garfield = new Cat("Long-hair", true);
  }
}
/*
A class can contain multiple constructors as long as they have different parameter values. A signature helps the compiler differentiate between the different constructors.

A signature is made up of the constructor’s name and a list of its parameters.



Java objects’ state and behavior
*/
public class Person {
  // state of an object
  int age;
  String name;

  // behavior of an object
  public void set_value() {
    age = 20;
    name = "Robin";
  }
  public void get_value() {
    System.out.println("Age is " + age);
    System.out.println("Name is " + name);
  }

  // main method
  public static void main(String [] args) {
    // creates a new Person object
    Person p = new Person();

    // changes state through behavior
    p.set_value();
  }
}
/*
In Java, instances of a class are known as objects. Every object has state and behavior in the form of instance fields and methods respectively.




Creating a new Class instance in Java
*/
public class Person {
  int age;
  // Constructor:
  public Person(int a) {
    age = a;
  }

  public static void main(String [] args) {
    // Here, we create a new instance of the Person class:
    Person p = new Person(20);
    System.out.println("Age is " + p.age); // Prints: Age is 20
  }
}
/*
In Java, we use the new keyword followed by a call to the class constructor in order to create a new instance of a class.

The constructor can be used to provide initial values to instance fields.
*/
