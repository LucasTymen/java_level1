/*
Inheritance and Polymorphism
Child Classes in Arrays and ArrayLists

Usually, when we create an array or an ArrayList, the list items all need to be the same type.
But polymorphism puts a new spin on what is considered the same type…
==> https://www.codecademy.com/resources/docs/java/array-list (The ArrayList class uses dynamic arrays for storing elements.
Conceptually, it is like an array but with no size limit.)

In fact, we can put instances of different classes that share a parent class together in an array or ArrayList!
For example, let’s say we have a Monster parent class with a few child classes: Vampire, Werewolf, and Zombie.
We can set up an array with instances of each:
==> https://www.codecademy.com/resources/docs/java/classes : The ArrayList class uses dynamic arrays for storing elements.
Conceptually, it is like an array but with no size limit.
*/

Monster dracula, wolfman, zombie1;

dracula = new Vampire();
wolfman = new Werewolf();
zombie1 = new Zombie();

Monster[] monsters = {dracula, wolfman, zombie1};

/*

We can even iterate through the list of items — regardless of subclass — and perform the same action with each item:
*/

for (Monster monster : monsters) {

  monster.attack();

}

/*
In the code above, we were able to call attack() on each monster in monsters despite the fact that, in the for-each loop, monster is declared as the parent class type Monster.
Instructions
Checkpoint 1 Enabled

1.

Declare and initialize an array of type Noodle called allTheNoodles with the following items:

    spaghetti
    ramen
    pho

For example, to declare and initialize an array of type Monster:
*/

Monster[] monsters = {dracula, wolfman, zombie1};

/*
Checkpoint 2 Step instruction is unavailable until previous steps are completed

2.

Loop through each noodle in allTheNoodles.

Call getCookPrep() on each noodle and print the result.
Concept Review
Want to quickly review some of the concepts you’ve been learning? Take a look at this material's cheatsheet!
==> https://www.codecademy.com/learn/learn-java/modules/learn-java-inheritance-and-polymorphism/cheatsheet
*/
