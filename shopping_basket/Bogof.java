package shopping_basket;

public class Bogof {

  private Basket basket;
  private Item item;
  private int amountToDiscount;

  public Bogof(Basket basket, Item item){
  this.basket = basket;
  this.item = item;
  }

  public void applyBogof(){
    double total = basket.getBasketSubTotal();

    double price = item.getPrice();

    int numberOfItems = basket.countItem(this.item);
    int amountToDiscount = numberOfItems / 2;
       total -= (amountToDiscount * price);
       basket.updateTotal(total);
      }

    }
