/*
Learn Java: Arrays
Length

What if we have an array storing all the usernames for our program, and we want to quickly see how many users we have?
To get the length of an array, we can access the length field of the array object:
*/

String[] menuItems = new String[5];
System.out.println(menuItems.length);

/*
This command would print 5, since the menuItems array has 5 slots, even though they are all empty.

If we print out the length of the prices array:
*/

double[] prices = {13.1, 15.87, 14.22, 16.66};

System.out.println(prices.length);

/*
We would see 4, since there are four items in the prices array!
Instructions
1.

In the method getNumTopics(), return the length of the topics array.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-arrays-and-arraylists/cheatsheet
*/
