/*
String Methods
length()

In Java, the length() string method returns the length ⁠— total number of characters ⁠— of a String.
==> https://www.codecademy.com/resources/docs/java/strings/length?page_ref=catalog

Suppose we have a String called str, str.length() would return its length.

Take a look at this code for example:
*/

String str = "Hello World!";

System.out.println(str.length());

/*
12 would be printed because str has 12 characters:

H e l l o _ W o r l d !

In theory, the length of a String is the same as the Unicode units of the String.
==> https://en.wikipedia.org/wiki/Unicode

For example, escape sequences such as \n count as only one character.
Instructions
1.

Twitter allows users to post tweets with a character limit.
They capture the message the user enters as a String, count the length of the message, and use its length to decide whether or not to let the user post the message.
The limit is 280 characters.

Let’s check if tweet follows Twitter’s policy. Print out the number of characters in tweet using the length() method.

Suppose we have a String called bio, bio.length() would return the length of it.

To print it out:
*/

System.out.println(bio.length());

/*
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-string-methods/cheatsheet
*/
