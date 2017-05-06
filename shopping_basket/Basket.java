package shopping_basket;
import java.util.ArrayList;


public class Basket {

  public Basket() {
    ArrayList<Item> items;

  }

  public Arraylist<Item> getItems(){
    return this.items;
  }

  public double getTotal(){
    double total = 0;
    for (double items : items) {
      total += item.getPrice();
    }
  }


}
