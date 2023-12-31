/*
Learn Java: ArrayLists
Adding an Item

Now we have an empty ArrayList, but how do we get it to store values?

ArrayList comes with an add() method which inserts an element into the structure.
There are two ways we can use add().
==> https://www.codecademy.com/resources/docs/java/array-list/add?page_ref=catalog

If we want to add an element to the end of the ArrayList, we’ll call add() using only one argument that represents the value we are inserting.
In this example, we’ll add objects from the Car class to an ArrayList called carShow:
*/

ArrayList<Car> carShow = new ArrayList<Car>();

carShow.add(ferrari);
// carShow now holds [ferrari]
carShow.add(thunderbird);
// carShow now holds [ferrari, thunderbird]
carShow.add(volkswagen);
// carShow now holds [ferrari, thunderbird, volkswagen]

/*
If we want to add an element at a specific index of our ArrayList, we’ll need two arguments in our method call:
the first argument will define the index of the new element while the second argument defines the value of the new element:
*/

// Insert object corvette at index 1
carShow.add(1, corvette);
// carShow now holds [ferrari, corvette, thunderbird, volkswagen]

// Insert object porsche at index 2
carShow.add(2, porsche);
// carShow now holds [ferrari, corvette, porsche, thunderbird, volkswagen]

/*
By inserting a value at a specified index, any elements that appear after this new element will have their index value shift over by 1.

Also, note that an error will occur if we try to insert a value at an index that does not exist.


Keep Reading: AP Computer Science A Students

When using ArrayList methods (like add()), the reference parameters and return type of a method must match the declared element type of the ArrayList.
==> https://www.codecademy.com/resources/docs/java/methods
For example, we cannot add an Integer type value to an ArrayList of String elements.

We’ve discussed how to specify the element type of an ArrayList;
however, it is possible to create an ArrayList that holds values of different types.

In the following snippet, assortment is an ArrayList that can store different values because we do not specify its type during initialization.
*/

ArrayList assortment = new ArrayList<>();
assortment.add("Hello"); // String
assortment.add(12); // Integer
assortment.add(ferrari); // reference to Car
// assortment holds ["Hello", 12, ferrari]

/*
In this case, the items stored in this ArrayList will be considered Objects.
As a result, they won’t have access to some of their methods without doing some fancy casting.
Although this type of ArrayList is allowed, using an ArrayList that specifies its type is preferred.
Instructions
1.

We’ve created an empty ArrayList called toDoList. Time to add some to-dos!

Below where we’ve initialized toDo1, initialize two new String variables: toDo2 and toDo3.

Set their values to any tasks you like.

Some example tasks:

    "Do laundry"
    "Wash the dishes"
    "Pet Ham and Ghoti until they purr"

2.

Use .add() to add toDo1, toDo2, and toDo3 to toDoList.

For example, to add 4 to an ArrayList called sudokuRow1:
*/

sudokuRow1.add(4);

/*
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet! */
