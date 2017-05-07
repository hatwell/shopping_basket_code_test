package shopping_basket;
import java.util.ArrayList;

public class Basket {
  private ArrayList<Item> items;

  public Basket(){
    this.items = new ArrayList<Item>();
  }

  //returns array of items
  public ArrayList<Item> getItems(){
    return this.items;
  }

  //returns number of items in basket
  public int getItemCount(){
    return items.size();
  }

  //adds an item to the basket
  public void addToBasket(Item item){
    items.add(item);
  }

  //remove all items from the basket
  public void emptyBasket(){
    items.clear();
  }


}
