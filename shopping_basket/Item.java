package shopping_basket;

public class Item {
  private String name;
  private double price;
  private Category category;
  private Discount discount;

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

}
