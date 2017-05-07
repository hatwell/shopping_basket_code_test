package shopping_basket;
import java.util.Random;

public class Loyalty implements Discountable{

  private Boolean loyalty;

  public Loyalty(){
    Random random = new Random();
    loyalty = random.nextBoolean();
    this.loyalty = loyalty;
  }

  public double changePrice(double subTotal){
    double total = subTotal;
    if (loyalty == true) {
      total *= 1.02;
    }
    return total;
  }

  public Boolean getLoyalty(){
    return this.loyalty;
  }


}
