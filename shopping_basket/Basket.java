package shopping_basket;
import java.util.ArrayList;

public class Basket {
  private ArrayList<Item> items;
  private Loyalty loyalty;
  private double total;

  public Basket(){
    this.items = new ArrayList<Item>();
    this.loyalty = new Loyalty();
    this.total = 0;
  }

  //returns array of items
  public ArrayList<Item> getItems(){
    return this.items;
  }


  //returns number of items in basket
  public int getItemCount(){
    int numberofItems = 0;
    for (Item item : items){
      numberofItems +=1;
    }
    return numberofItems;
  }

  //adds an item to the basket
  public void addToBasket(Item item){
    items.add(item);
  }

  //remove all items from the basket
  public void emptyBasket(){
    items.clear();
  }

  //updates total
    public void updateTotal(double newTotal){
      this.total = newTotal;
    }

  //gets total
  public double getTotal(){
    return this.total;
  }

  //totals price of items in basket
  public double getBasketSubTotal(){
    double total = 0;
    for (Item item : items){
      total += item.getPrice();
    }
    this.updateTotal(total);
    return total;

  }




  //counts number of a particular item in basket
  public int countItem(Item countedItem) {
    int counter = 0;
    for (Item item : items) {
      if (countedItem.getName() == item.getName()){
        counter +=1;
      }
    }
    return counter;
  }

  //deletes item from basket
  public void deleteItem(Item item){
        items.remove(item);

  }

  public int countNumberOfItems(String itemName){
    int numberOfItems = 0;
    for (Item item : items){
      if (item.getName() == itemName){
        numberOfItems +=1;
      }
    }
    return numberOfItems;
  }


  public double applyLoyaltyDiscount(double subTotal){
    double total = loyalty.changePrice(subTotal);
    return total;
  }
}
