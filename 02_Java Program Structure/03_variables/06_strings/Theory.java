/*

Learn Java: Variables
String

So far, we have learned primitive data types, which are the simplest types of data with no built-in behavior.
==> https://www.codecademy.com/resources/docs/java/data-types
Our programs will also use Strings, which are objects, instead of primitives. Objects have built-in behavior.

Strings hold sequences of characters.
We’ve already seen instances of a String, for example, when we printed out "Hello World".
There are two ways to create a String object: using a String literal or calling the String class to create a new String object.

A String literal is any sequence of characters enclosed in double-quotes ("").
Like primitive-type variables, we declare a String variable by specifying the type first:
*/
String greeting = "Hello World";

/*
We could also create a new String object by calling the String class when declaring a String like so:
*/
String salutations = new String("Hello World");
/*
There are subtle differences in behavior depending on whether you create a String using a String literal or a new String object.
We’ll dive into those later, but for now, we’ll almost always be using String literals.

Keep Reading: AP Computer Science A Students

Certain symbols, known as escape sequences, have an alternative use in Java print statements.
Escape sequences are interpreted differently by the compiler than other characters.
==> https://www.codecademy.com/resources/docs/java/compiler
Escape characters begin with the character \.

There are three escape sequences to be aware of for the AP exam.

The \" escape sequence allows us to add quotation marks " to a String value. :
*/
System.out.println("\"Hello World\"");
// Prints: "Hello World"

/*
If we didn’t use an escape sequence, then Java would think we’re using " to end the String!

Using the \\ escape sequence allows us to place backslashes in our String text:
*/

System.out.println("This is the backslash symbol: \\");
// Prints: This is the backslash symbol: \
/*
This is similar to the last example - just like ", \ usually has a special meaning.
In this case, \ is used to start an escape sequence.
Well, if we don’t want to start an escape sequence and just want a \ in our String, then we’ll use \\ — we’re using an escape sequence to say that we don’t want \ to be interpreted as the start of an escape sequence.
It’s a little mind-bending!

Finally, if we place a \n escape sequence in a String, the compiler will output a new line of text:
*/
System.out.println("Hello\nGoodbye");

/*
Prints:
Hello
Goodbye


You can think of \n as the escape sequence for “newline”.
Instructions
1.

Create a variable called openingLyrics that has a value of: "Yesterday, all my troubles seemed so far away"

Remember, you can create a string variable with the following syntax:
*/
String stringName = "I am an example string!";
/*
You do not need to escape any characters using \ for this checkpoint.
2.

Call System.out.println() to print out openingLyrics.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
*/
