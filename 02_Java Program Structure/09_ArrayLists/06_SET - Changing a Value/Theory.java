/*
Learn Java: ArrayLists
Changing a Value

When we were using arrays, we could rewrite entries by using bracket notation to reassign values:
==> https://www.codecademy.com/resources/docs/java/arrays
*/

String[] shoppingCart = {"Trench Coat", "Tweed Houndstooth Hat", "Magnifying Glass"};

shoppingCart[0] = "Tweed Cape";

// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]

ArrayList has a slightly different way of doing this, using the set() method:
==> https://www.codecademy.com/resources/docs/java/array-list

ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.set(0, "Tweed Cape");

// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]

/*
Instructions
1.

Modify sherlocksToDos so that the value at "play violin" becomes "listen to Dr. Watson for amusement".

For example, to change the first value in shoppingCart to "Tweed Cape":
*/

shoppingCart.set(0, "Tweed Cape");

/*
2.
Modify poirotsToDos so that the value at "trim mustache" becomes "listen to Captain Hastings for amusement".

For example, to change the first value in shoppingCart to "Tweed Cape":
*/

shoppingCart.set(0, "Tweed Cape");

/*
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-arrays-and-arraylists/cheatsheet
*/
