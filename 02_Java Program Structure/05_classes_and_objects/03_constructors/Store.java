public class Store {

  // new method: constructor!
  public Store() {
    System.out.println("I am inside the constructor method.");
  }

  // main method is where we create instances!
  public static void main(String[] args) {
    Store lemonadeStand;
    System.out.println("Start of the main method.");

    // create the instance below
    lemonadeStand = new Store();
    // print the instance below
    System.out.println(lemonadeStand);
  }
}
