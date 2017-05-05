package shopping_basket;

public class Item {
  String name;
  double price;
  Category category;

  public Item(String name, double price, Category category){
    this.name = name;
    this.price = price;
    this.category = category;
  }

}
