import java.util.ArrayList;

class ToDos {

  public static void main(String[] args) {

    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    // Add more to-dos here:
    String toDo2 = "Feed the cat";
    String toDo3 = "Do the laundry";
    String toDo4 = "Get out and breathe fresh air";

    // Add to-dos to toDoList
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    toDoList.add(toDo4);

    System.out.println(toDoList);


  }

}
