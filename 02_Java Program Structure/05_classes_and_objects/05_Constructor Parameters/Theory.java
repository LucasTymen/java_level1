/*Java: Introduction to Classes
Classes: Constructor Parameters

To create objects with dynamic, individual states, we’ll use a combination of the constructor method and instance fields.

In order to assign a value to an instance variable, we need to alter our constructor method to include parameters so that it can access the data we want to assign to an instance.

We’ve already seen a parameter in the main() method: String[] args, but this is the first time we’re using the parameter value within a method body.

The Car constructor now has a parameter: String carColor:
*/

public class Car {
  String color;
  // constructor method with a parameter
  public Car(String carColor) {
    // parameter value assigned to the field
    color = carColor;
  }
  public static void main(String[] args) {
    // program tasks
  }
}

/*
When a String value gets passed into Car(), it is assigned to the parameter carColor.
Then, inside the constructor, carColor will be assigned as the value to the instance variable color.

Our method also has a signature which defines the name and parameters of the method.
In the above example, the signature is Car(String carColor).

In the next exercise, we’ll learn how to pass values into a method!

Keep Reading: AP Computer Science A Students

There are two types of parameters: formal and actual.
A formal parameter specifies the type and name of data that can be passed into a method.
In our example above, String carColor is a formal parameter; carColor will represent whatever String value is passed into the constructor.
We’ll learn about actual parameters in the next exercise.

In Java, because of constructor overloading, a class can have multiple constructors as long as they have different parameter values.
The signature is useful in that it helps the compiler differentiate between the different methods.
==>https://www.codecademy.com/resources/docs/java/constructors
==> https://www.codecademy.com/resources/docs/java/compiler
==> https://www.codecademy.com/resources/docs/java/methods
For example:
*/

public class Car {
  String color;
  int mpg;
  boolean isElectric;

  // constructor 1
  public Car(String carColor, int milesPerGallon) {
    color = carColor;
    mpg = milesPerGallon;
  }
  // constructor 2
  public Car(boolean electricCar, int milesPerGallon) {
    isElectric = electricCar;
    mpg = milesPerGallon;
  }
}

/*
In the example above, there are two constructors.
When we initialize an object, the compiler will know which constructor to use because of the values we pass into it.
For example, Car myCar = new Car(true, 40) will be created by the second constructor because the arguments match the type and order of the second constructor’s signature.

If we do not define a constructor, the Java compiler will generate a default constructor that contains no arguments and assigns the object default values.
Default values can be created by assigning values to the instance fields during their declaration:
*/

public class Car {
  String color = "red";
  boolean isElectric = false;
  int cupHolders = 4;

  public static void main(String[] args) {
    Car myCar = new Car();
    System.out.println(myCar.color); // Prints: red
  }
}

/*
Instructions
1.

Add the String parameter product to the Store() constructor.

Parameters are located within the parentheses of the method. They list the name and type of data which is available within the method body.
*/

// method with no parameters
helloToYou() {
  System.out.println("Hello there!");
}

// adding one parameter
helloToYou(String person) {
  // data of type String available as 'person' variable
  System.out.println("Hello " + person);
}

/*
2.

Inside of the constructor method, set the instance variable productType equal to the product parameter.

Instance fields are available inside of any method.

Here’s how we can assign a value to an instance field inside of the Dog() constructor.
*/

public Dog {
  String breed;
  public Dog(String breedType) {
    // assign instance field of breed to equal breedType parameter
    breed = breedType;
  }
}

/*Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-object-oriented-java-u/cheatsheet
*/
