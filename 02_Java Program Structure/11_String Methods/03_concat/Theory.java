/*
String Methods
concat()

The concat() method concatenates one string to the end of another string. Concatenation is the operation of joining two strings together.
==> https://www.codecademy.com/resources/docs/java/strings/concat?page_ref=catalog

Suppose we have a String called str1 and another String called str2, using str1.concat(str2) would return str1 with str2 appended to the end of it.

For example:
*/

String name = new String("Code");

name = name.concat("cademy");

System.out.println(name);

/*
Codecademy would be printed.

Strings are immutable objects which means that String methods, like concat() do not actually change a String object.
==> https://www.codecademy.com/resources/docs/java/methods

Our variable, name holds a reference to the String object, "Code".
When we use concat() on name, we changed its value so that it references a new object — "Code", combined with the String literal, "cademy".

Suppose we do something slightly different. We’ll use concat() on name without reassigning its value:
*/

String name = "Code";

name.concat("cademy");

System.out.println(name);

/*
Code would be printed instead. The value of the String can’t change!
Instead, we create a new object and need to assign that new object to some variable.

Keep Reading: AP Computer Science A Students

When we first discussed Objects we learned that if we tried printing an Object, we’d get an output of the class name and the Object’s memory address.
If we wanted to get a more useful printout, we’d have to call the Object’s toString() method.
==> https://www.codecademy.com/resources/docs/java/output

This toString() method comes into play with concat().
If we concatenate a String with another Object, we’re really adding the result of that Object’s toString() method to our original String.
We can even see this when we concatenate two Strings together (remember a String is an Object).
When we use concat() on another String, we don’t concatenate its memory address to the original String.
Instead, we combine the result of its toString() method to the original String.

You can refresh yourself on the toString() method in this exercise.
==> https://www.codecademy.com/courses/learn-java/lessons/learn-java-methods/exercises/the-tostring-method

Instructions
1.
Store your first name in firstName and your last name in lastName.

Print out your full name using concat().

One way is to do:
*/

String firstName = "Ziggy";
String lastName = "Stardust";

System.out.println(firstName.concat(lastName));

/*
This would print ZiggyStardust.

Suppose we want a space between the first name and the last name:
*/

String firstName = "Ziggy";
String lastName = "Stardust";

System.out.println(firstName.concat(" " + lastName));

/*
This would print Ziggy Stardust.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-string-methods/cheatsheet
*/
