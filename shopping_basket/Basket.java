package shopping_basket;

public class Basket {

	private Item[] items;

  public Basket() {
	 this.items = new Item[0];
  }

  public Item[] getItems() {
    return this.items;
  }

  public double getTotal(){

    double total = 0;
    for (Item item : items) {
      total += item.getPrice();
    }
    return total;
  }

  public int getItemCount(){
    int itemCount = 0;
    for (Item item : items){
      itemCount +=1;
    }
    return itemCount;
  }

  public void addToBasket(Item item){
    int itemCount = this.getItemCount();
    this.items[itemCount] = item;
  }


}
