/*
Learn Java: Loops
Removing Elements During Traversal

If we want to remove elements from an ArrayList while traversing through one, we can easily run into an error if we aren’t careful.
==> https://www.codecademy.com/resources/docs/java/array-list

When an element is removed from an ArrayList, all the items that appear after the removed element will have their index value shift by negative one — it’s like all elements shifted to the left!
We’ll have to be very careful with how we use our counter variable to avoid skipping elements.
Removing An Element Using while

When using a while loop and removing elements from an ArrayList, we should not increment the while loop’s counter whenever we remove an element.
We don’t need to increase the counter because all of the other elements have now shifted to the left.

For example, if we removed the element at index 3, then the element that was at index 4 will be moved to index 3.
If we increase our counter to 4, we’ll skip that element!

Take a look at this block of code that will remove all odd numbers from an ArrayList.
Think about what the value of i is, when we’re increasing the value of i, and when i < lst.size() becomes False.
*/

int i = 0; // initialize counter

while (i < lst.size()) {
  // if value is odd, remove value
  if (lst.get(i) % 2 != 0){
    lst.remove(i);
  } else {
    // if value is even, increment counter
    i++;
  }
}

/*
Removing An Element Using for

We can use a similar strategy when removing elements using a for loop.
When using a while loop, we decided to not increase our loop control variable whenever we removed an element.
This ensured that we would not skip an element when all of the other elements shifted to the left.

When using a for loop, we, unfortunately, must increase our loop control variable :
the loop control variable will always change when we reach the end of the loop (and it will usually change by 1 because we often use something like i++.)
Since we can’t avoid increasing our loop control variable, we can take matters into our own hands and decrease the loop control variable whenever we remove an item.

For example:
*/

for (int i = 0; i < lst.size(); i++) {
  if (lst.get(i) == "value to remove"){
    // remove value from ArrayList
    lst.remove(lst.get(i));
    // Decrease loop control variable by 1
    i--;
  }
}

/*
Now whenever we remove an item, we’ll decrease i by 1. Then when we reach the end of the loop, i will increase by 1.
It will be like i never changed!

Note: Avoid manipulating the size of an ArrayList when using an enhanced for loop.
Actions like adding or removing elements from an ArrayList when using a for each loop can cause a ConcurrentModificationException error.
==> https://www.codecademy.com/resources/docs/java/errors/concurrentmodificationexception

Instructions
1.
Take a look at the code placed in the main() method of the Lunch class.

Inside the method removeAnts(), use a for loop or a while loop to iterate through lunchBox and remove any element that has the value "ant".

Outside the loop, return the value of lunchBox.

The final solution should look similar to the code below if using a for loop:
*/

for (int i = 0; i < listName.size(); i++) {
  if (listName.get(i) == "ant"){
    listName.remove(listName.get(i));
    i--;
   }
}
return listName;

//If using a while loop, the solution may look similar to the following snippet:

int i = 0;
while (i < listName.size()) {
  if (listName.get(i) == "ant"){
    listName.remove(listName.get(i));
  } else {
    i++;
  }
}

/*
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet! */
