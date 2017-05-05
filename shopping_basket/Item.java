package shopping_basket;

public class Item {
  private String name;
  private double price;
  private Category category;

  public Item(String name, double price, Category category){
    this.name = name;
    this.price = price;
    this.category = category;
  }

  public String getName(){
    return this.name;
  }

  public double getPrice(){
    return this.price;
  }

  public Category getCategory(){
    return this.category;
  }

  public static void main(String[] args){
    Item bread = new Item("bread rolls", 2.00, Category.TOILETRIES);
  }

}
