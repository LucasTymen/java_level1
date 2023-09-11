/*
Java: Introduction to Classes
Classes: Constructors

In order to create an object (an instance of a class), we need a constructor method.
==> https://www.codecademy.com/resources/docs/java/constructors?page_ref=catalog
The constructor is defined within the class.

Let’s take a look at the Car class with a constructor. The constructor, Car(), shares the same name as the class:
*/

public class Car {
  // Constructor method
  public Car() {
    // instructions for creating a Car instance
  }

  public static void main(String[] args) {
    // body of main method
  }
}


/*
To create an instance, we need to call or invoke the constructor within main().
The following example assigns a Car instance to the variable ferrari:
*/


public class Car {

  public Car() {
    // instructions for creating a Car instance
  }

  public static void main(String[] args) {
    // Invoke the constructor
    Car ferrari = new Car();
  }
}

/*
In this example, instead of being declared with a primitive data type like int or boolean, our variable ferrari is declared as a reference data type.
This means that the value of our variable is a reference to an instance’s memory address.
During its declaration, the class name is used as the variable’s type. In this case, the type is Car.

After the assignment operator, (=), we invoke the constructor method:
Car(), and use the keyword new to indicate that we’re creating an instance.
Omitting new causes an error.

If we were to output the value of ferrari we would see its memory address:
Car@76ed5528
==> https://www.codecademy.com/resources/docs/java/output

Keep Reading: AP Computer Science A Students

We can initialize a reference-type variable without assigning it a reference if we utilize the special value null.
Something that is null has no value; if we were to assign null to an object, it would have a void reference.

For example, in the following code snippet, we’ll create an instance of Car, assign it a reference, and then change its value to null:
*/

Car thunderBird = new Car();
System.out.println(thunderBird); // Prints: Car@76ed5528

thunderBird = null; // change value to null
System.out.println(thunderBird); // Prints: null

/*
It’s important to note that if we use a null reference to call a method or access an instance variable, we will receive a NullPointerException error.
Instructions
1.

Let’s explore how code execution moves around the file with two methods.

Add a print statement inside our Store constructor with the message: I am inside the constructor method.

We’ll see this message whenever we create an instance of Store by calling the constructor.

We print messages using System.out.println(). Here’s an example printing the message Making a shoe!
*/

System.out.println("Making a shoe!");

/*
Make sure you’re placing the print statement inside the curly braces of the Store() constructor method!
2.

We did not see our constructor message printed because we haven’t run the code inside the constructor.

Inside main(), create an instance of Store called lemonadeStand. Don’t forget the new keyword!

We should see the constructor message.

We create instances of a class by using the new keyword and invoking the constructor.

For example, say we had a Dog class.
*/

public Dog {
  public Dog() {
    // body of Dog constructor method
  }
  public static void main(String[] args) {
    // declare variable type and name
    Dog fido;
    // assign a new instance of Dog to fido
    fido = new Dog();
  }
}

/*
We’ll often consolidate declaration and assignment into a single line:
*/

Dog fido = new Dog();

/*
3.

Inside main(), print lemonadeStand to see how Java represents this instance.

Review the order of the printed messages:

    Running the program invokes main()
    We create an instance so we move from main() to Store()
    The code inside Store() runs
    When Store() finishes execution, we return to main()

When printing a variable, do not use double quotes.

Here’s how to print the variable fido:
*/

System.out.println(fido);

/*
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==>
*/
