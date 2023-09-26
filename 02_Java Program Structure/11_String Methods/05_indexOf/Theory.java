/*
String Methods
indexOf()

If we want to know the index of the first occurence of a character in a string, we can use the indexOf() method on a string.
==> https://www.codecademy.com/resources/docs/java/strings/indexOf?page_ref=catalog

Remember that the indices in Java start with 0:
*/

String letters = "ABCDEFGHIJKLMN";

System.out.println(letters.indexOf("C"));

/*
This would output 2. ==> https://www.codecademy.com/resources/docs/java/output

Although C is the third letter in the English alphabet, it is located in the second index of the string.

Suppose we want to know the index of the first occurrence of an entire substring.
The indexOf() instance method can also return where the substring begins (the index of the first character in the substring):
*/

String letters = "ABCDEFGHIJKLMN";

System.out.println(letters.indexOf("EFG"));

/*
This would output 4, because EFG starts at index 4.

If the indexOf() doesn’t find what it’s looking for, it’ll return a -1.
Instructions
1.

In MorseCode.java, there’s a string named code that has some funny characters.

Find the index where the substring . .- - (which means “eat”) begins!
*/

System.out.println(code.indexOf(". .- -"));

/*
The result should produce 87.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-string-methods/cheatsheet
*/
