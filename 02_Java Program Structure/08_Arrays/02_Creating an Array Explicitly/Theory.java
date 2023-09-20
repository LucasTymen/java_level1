/*
Learn Java: Arrays
Creating an Array Explicitly

Imagine that we’re using a program to keep track of the prices of different clothing items we want to buy.
We would want a list of the prices and a list of the items they correspond to.
To create an array, we provide a name and declare the type of data it holds:

double[] prices;

Just like with variables, we can declare and initialize in the same line.
This allows us to explicitly initialize the array to contain the data we want to store :
==> https://www.codecademy.com/resources/docs/java/variables
*/

double[] prices = {13.15, 15.87, 14.22, 16.66};

/*
We can use arrays to hold Strings and other objects as well as primitives
==> https://www.codecademy.com/resources/docs/java/arrays :
*/

String[] clothingItems = {"Tank Top", "Beanie", "Funny Socks", "Corduroys"};

/*
Instructions
1.
We have an empty Newsfeed class that does not store anything yet.

First, make a method called getTopics(), which:

    is public
    returns a String array
    does not take any parameters

For now, leave the method empty.

A method called getPrices() that takes in no parameters and returns an int array would look like:
*/

public int[] getPrices(){

}

/*
Since this method doesn’t return an int[] like it says it will, the file won’t compile yet!
We’ll fix that when we add a return statement.
2.

Inside the getTopics() method, create a String array called topics and set it equal to an array containing these elements, in order:

Opinion
Tech
Science
Health

Then, return topics from the method!

If we were making an integer array called numVisitors with these numbers in order:

1
1
2
3
5

We could use the command:
*/

int[] numVisitors = {1, 1, 2, 3, 5};

/*
3.
Uncomment the lines in the main method to see how the getTopics() method works on a Newsfeed instance.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-arrays-and-arraylists/cheatsheet
*/
