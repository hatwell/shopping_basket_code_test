package shopping_basket;

public class Bogof {

  private Basket basket;
  private Item item;
  private int amountToDiscount;

  public Bogof(Basket basket, Item item){
  this.basket = basket;
  this.item = item;
  }

  public double applyBogof(){
    double total = basket.getBasketSubTotal();
    System.out.println("total is " + total);
    double price = item.getPrice();
    System.out.println("price is " + price);
    int numberOfItems = basket.countItem(this.item);
    System.out.println("numberOfItems is " + numberOfItems);
      if (numberOfItems < 2){
          return total;
      }
    else {
       int amountToDiscount = numberOfItems / 2;
       System.out.println("amountToDiscount is " + amountToDiscount);
       total -= (amountToDiscount * price);
       System.out.println("total is" + total);
       basket.updateTotal(total);
      }
     return total;
    }
  }
