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
  //totals price of items in basket
  public double getBasketTotal(){
    double total = 0;
    for (Item item : items){
      total += item.getPrice();
    }
    return total;
  }

  //deletes item from basket
  //I know this won't work if more than one item shares a name, but in
  // this world i'm shopping at a supermarket with only one type of
  //bread, beans, whatever.
  public void deleteItemByName(String itemName){
    for (Item item : items){
      if (item.getName() == itemName) {
        items.remove(item);
      }
    }
  }

}
