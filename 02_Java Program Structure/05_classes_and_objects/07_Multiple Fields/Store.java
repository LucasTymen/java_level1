public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;

  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }

  // main method
  public static void main(String[] args) {
    Store LemonHead = new Store("Pulco", 3, 2.3);
    Store cookieShop = new Store("cookies", 12, 3.75);
  }
}
