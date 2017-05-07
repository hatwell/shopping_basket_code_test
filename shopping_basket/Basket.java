package shopping_basket;
import java.util.ArrayList;

public class Basket {
  private ArrayList<Item> items;

  public Basket(){
    this.items = new ArrayList<Item>();
  }

  public ArrayList<Item> getItems(){
    return this.items;
  }

  public int getItemCount(){
    return items.size();
  }

  public void addToBasket(Item item){
    items.add(item);
  }

  public void emptyBasket(){
    items.clear();
  }
}
