package shopping_basket;
import java.util.Random;

public class Loyalty implements Discountable{

  private Boolean loyalty;

  //Loyalty constructor which decides a random boolean value for whether a
  //loyalty card is present or not
  public Loyalty(){
    Random random = new Random();
    loyalty = random.nextBoolean();
    this.loyalty = loyalty;
  }

  //getter for loyalty value
  public Boolean getLoyalty(){
    return this.loyalty;
  }

  //Applies loyalty discount to basket if loyalty card is present
  public double changePrice(double subTotal){
    double total = subTotal;
    if (loyalty == true) {
      total *= 0.98;
    }
    return total;
  }

}
