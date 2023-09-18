public class Droid{
  //CLASS DECLARATIONS
  String name;
  int batteryLevel;

  // CONSTRUCTOR
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  // toString METHOD
  public String toString(){
    return "Hello, I’m the droid : "+name;
  }

  public static void main(String[] args){
    //OBJECTS CREATION
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);

  }
}
