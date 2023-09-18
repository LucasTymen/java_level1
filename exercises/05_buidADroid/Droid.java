public class Droid{
  //CLASS DECLARATIONS
  String name;
  int batteryLevel;

  //CONSTRUCTOR
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  // PERFORM TASK
  public void performTask(String task) {
    System.out.println(name + "is performing task: " + task);
  }

  // toString METHOD
  public String toString(){
    return "Hello, I’m the droid : " + name;
  }

  public static void main(String[] args){
    //OBJECTS CREATION 1 - Codey
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
  }
}
