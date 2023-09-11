/*Java: Introduction to Classes
Classes: Multiple Fields

Objects are not limited to a single instance field.
We can declare as many fields as are necessary for the requirements of our program.

Let’s change Car instances so they have multiple fields.

We’ll add a boolean isRunning, that indicates the car engine is on and an int velocity, that indicates the speed at which the car is traveling.
*/

public class Car {
  String color;
  // new fields!
  boolean isRunning;
  int velocity;

  // new parameters that correspond to the new fields
  public Car(String carColor, boolean carRunning, int milesPerHour) {
    color = carColor;
    // assign new parameters to the new fields
    isRunning = carRunning;
    velocity = milesPerHour;
  }

  public static void main(String[] args) {
    // new values passed into the method call
    Car ferrari = new Car("red", true, 27);
    Car renault = new Car("blue", false, 70);

    System.out.println(renault.isRunning);
    // false
    System.out.println(ferrari.velocity);
    // 27
  }
}

/*
The constructor now has multiple parameters to receive values for the new fields. We still specify the type as well as the name for each parameter.

Ordering matters! We must pass values into the constructor invocation in the same order that they’re listed in the parameters.
*/

// values match types, no error
Car honda = new Car("green", false, 0);

// values do not match types, error!
Car junker = new Car(true, 42, "brown");


/*
Instructions
1.

Add two new instance fields for Store.

inventoryCount of type int. inventoryPrice of type double.

Declare instance fields inside the class but outside of any method:
*/

public class Dog {
  // declare instance fields here
  String breed;

  public Dog(String breedType) {
    // assign values to instance fields here
    breed = breedType;
  }
}

/*
Each declaration must conclude with a semicolon.

  String breed;
  boolean isWagging;
  int age;

2.

Update the Store constructor method with the new parameters.

The parameters should be product, count, and price, in that order.

You must use that order and include the types for each parameter.

For example, product is of type String because that value is assigned to the instance field String productType.

Here’s a Dog class constructor and instance fields:
*/

public class Dog {
  String breed;
  boolean isWagging;
  int age;

  public Dog(String breedType, boolean wagging, int dogYears) {
    breed = breedType;
    isWagging = wagging;
    age = dogYears;
  }
}

/*
3.

In the body of the Store constructor, assign the parameter values to the appropriate instance fields.

Use product as an example:

// assigning product parameter to productType instance field
productType = product;

Do the same with count and price for their respective instance fields.
4.

Inside main(), create an instance of Store called cookieShop.

cookieShop has "cookies" as the product.

cookieShop has 12 cookies to sell and each cookie costs 3.75.

Creating an instance of Dog that has multiple fields:
*/

public class Dog {
  String breed;
  boolean isWagging;
  int age;

  public Dog(String breedType, boolean wagging, int dogYears) {
    breed = breedType;
    isWagging = wagging;
    age = dogYears;
  }

  public static void main(String[] args) {
    // creating instance with multiple parameters
    Dog fido = new Dog("mutt", true, 7);
  }
}

/*
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-object-oriented-java-u/cheatsheet
*/
