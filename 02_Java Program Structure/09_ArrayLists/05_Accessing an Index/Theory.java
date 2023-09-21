/*
Learn Java: ArrayLists
Accessing an Index

With arrays, we can use bracket notation to access a value at a particular index:
==> https://www.codecademy.com/resources/docs/java/arrays
*/

double[] ratings = {3.2, 2.5, 1.7};

System.out.println(ratings[1]);

/*
This code prints 2.5, the value at index 1 of the array.

For ArrayLists, bracket notation won’t work. Instead, we use the method get() to access an index:
==> https://www.codecademy.com/resources/docs/java/array-list
*/

ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

System.out.println(shoppingCart.get(2));

/*
This code prints "Magnifying Glass", which is the value at index 2 of the ArrayList.
Instructions
1.

Use get() to access the third to-do element of sherlocksToDos and print the result.

For example to print out the sixth element of a list called detectiveSupplies, you could do this:
*/

System.out.println(detectiveSupplies.get(5));

/*
2.
Use get() to access the second to-do element of poirotsToDos and print the result.

Remember, the second item in a list would be at index 1.

For example, to print out the sixth element of a list called detectiveSupplies, you could do this:
*/

System.out.println(detectiveSupplies.get(5));

/*
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==>https://www.codecademy.com/learn/learn-java/modules/learn-java-arrays-and-arraylists/cheatsheet
*/
