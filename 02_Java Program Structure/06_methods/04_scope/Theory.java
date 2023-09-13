/*Learn Java: Methods
Scope

A method is a task that an object of a class performs.

We mark the domain of this task using curly braces: {, and }.
Everything inside the curly braces is part of the task. This domain is called the scope of a method.

We can’t access variables that are declared inside a method in code that is outside the scope of that method.
==> https://www.codecademy.com/resources/docs/java/variables

Looking at the Car class again:
*/

class Car {
  String color;
  int milesDriven;

  public Car(String carColor) {
    color = carColor;
    milesDriven = 0;
  }

  public void drive() {
     String message = "Miles driven: " + milesDriven;
     System.out.println(message);
  }

  public static void main(String[] args){
     Car myFastCar = new Car("red");
     myFastCar.drive();
  }
}

/*
The variable message, which is declared and initialized inside of drive, cannot be used inside of main()!
It only exists within the scope of the drive() method.

However, milesDriven, which is declared at the top of the class, can be used inside all methods in the class, since it is in the scope of the whole class.
==> https://www.codecademy.com/resources/docs/java/methods


Instructions
1.

Inside of the advertise() method, change the productType variable to the cookie variable, which is declared in the main() method.
This should also result in the printout:

Selling cookies!

Right?
2.

No! We got an error! The cookie variable cannot be accessed inside of the advertise method.
The scope is wrong! Change it back to productType:
*/
String message = "Selling " + productType + "!";
/*
3.

Inside of the main() method, print the String message, which is declared in the advertise() method. This should print:

Selling Cookies!

Right?
4.

Foiled again! The message variable only exists inside the scope of the advertise() method!

Delete the faulty print statement from the main() method.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-object-oriented-java-u/cheatsheet
*/
