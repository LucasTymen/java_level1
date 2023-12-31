/*
Learn Java: Variables
Introduction

Let’s say we need a program that connects a user with new jobs.
We need the user’s name, their salary, and their employment status.
All of these pieces of information are stored in our program.

We store information in variables, named locations in memory.
==> https://www.codecademy.com/resources/docs/java/variables?page_ref=catalog

Naming a piece of information allows us to use that name later, accessing the information we stored.

Variables also give context and meaning to the data we’re storing.
The value 42 could be someone’s age, a weight in pounds, or the number of orders placed.
With a name, we know the value 42 is age, weightInPounds, or numOrdersPlaced.

In Java, we specify the type of information we’re storing.
Primitive data types are types of data built-in to the Java system.
==> https://www.codecademy.com/resources/docs/java/data-types?page_ref=catalog
The three main primitive types we’ll cover are int, double, and boolean;
this lesson will introduce these built-in types and more.

We must declare a variable to reference it within our program.
Declaring a variable requires that we specify the type and name:
*/

// datatype variableName
int age;
double salaryRequirement;
boolean isEmployed;
/*

The names of the variables above are age, salaryRequirement, and isEmployed.

These variables don’t have any associated value.
To assign a value to a variable, we use the assignment operator =:
*/

age = 85;

/*
Now, age has a value of 85. When code is used to represent a fixed value, like 85, it is referred to as a literal.

It’s also common to declare a variable and assign it a value in one line!

For example, to assign 2011 to a variable named yearCodecademyWasFounded of type int, we write:
*/

int yearCodecademyWasFounded = 2011;

/*
Instructions
1.

In Creator.java, we have defined some variables related to James Gosling, the creator of Java.

Inside main(), use System.out.println() to print out the variable name.

We do not use double quotes to print a variable because we want to print what the variable references.
*/

String cat = "Buffy";

System.out.println("cat");
// prints cat

System.out.println(cat);
// prints Buffy

/*
2.

Use the same command to print out yearCreated.

We have to write print statements after declaring and initializing the variable:
*/

System.out.println(cat);
String cat = "Buffy";
//this code will have an error, since cat is not defined yet!

String cat = "Buffy";
System.out.println(cat);
//this code will run, since cat is assigned the value of "Buff"!

/*
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-variables/cheatsheet
*/
