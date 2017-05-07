package shopping_basket;

public class MoneyOff implements Discountable {



  public Item percentageDiscount(double discountPercent, Item item) {
    double discountMultiplier = 1 - (discountPercent/100);
    double price = item.getPrice();
    price *= discountMultiplier;
    item.setPrice(price);
    return item;
  }



}
