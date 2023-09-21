/*
Learn Java: ArrayLists
Getting an Item's Index

What if we had a really large list and wanted to know the position of a certain element in it?
For instance, what if we had an ArrayList detectives with the names of fictional detectives in chronological order, and we wanted to know what position "Fletcher" was.
==> https://www.codecademy.com/resources/docs/java/array-list
*/

// detectives holds ["Holmes", "Poirot", "Marple", "Spade", "Fletcher", "Conan", "Ramotswe"];
System.out.println(detectives.indexOf("Fletcher"));

/*
This code would print 4, since "Fletcher" is at index 4 of the detectives ArrayList.
Instructions
1.
After visiting the crime scene, the ever-impatient Dr. Watson wants to know how many to-dos are left until Sherlock solves the case.

To help Dr. Watson figure this out, use indexOf() to determine where in the to-do list "solve the case" is.

Print this information out. That’s the number of to-dos remaining before Sherlock reaches "solve the case".

Remember, the first index in a list is 0, so the 100th item in an ArrayList would be at index 99.

To get the index of "Fletcher" in an ArrayList of students, you could do the following:
*/

int fletchersIdx = students.indexOf("Fletcher")

/*
fletchersIdx would hold the position of "Fletcher" in students.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-arrays-and-arraylists/cheatsheet
*/
