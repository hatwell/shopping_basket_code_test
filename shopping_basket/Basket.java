package shopping_basket;
import java.util.ArrayList;


public class Basket {

  ArrayList<Item> items;

  public void Basket() {
    this.items = items;
  }

  public ArrayList<Item> getItems() {
    return this.items;
  }

  public double getTotal(){

    double total = 0;
    for (Item item : items) {
      total += item.getPrice();
    }
    return total;
  }

  


}
