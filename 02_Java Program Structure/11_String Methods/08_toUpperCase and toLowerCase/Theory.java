/*String Methods
toUpperCase() / toLowerCase()

There will be times when we have a word in a case other than what we need it in.
==> https://www.codecademy.com/resources/docs/java/methods

Luckily, Java has a couple String methods to help us out:

    toUpperCase(): returns the string value converted to uppercase ==> https://www.codecademy.com/resources/docs/java/strings/toUpperCase?page_ref=catalog
    toLowerCase(): returns the string value converted to lowercase ==> https://www.codecademy.com/resources/docs/java/strings/toLowerCase?page_ref=catalog

For example:

String input = "Cricket!";

String upper = input.toUpperCase();
// stores "CRICKET!"

String lower = input.toLowerCase();
// stores "cricket!"

A good use of this functionality is to ensure consistency of the data you store in a database.
Making sure all of the data you get from a user is lowercase before you store it in your database will make your database easier to search through later.
Instructions
1.

In Hashtag.java, use toLowerCase() to print out the lower case version of hashtag.

Use System.out.println() to output values:

System.out.println(hashtag.toLowerCase());

The result should be:

#100daysofcode

Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-string-methods/cheatsheet
*/
