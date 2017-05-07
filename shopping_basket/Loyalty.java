package shopping_basket;
import java.util.Random;

public class Loyalty{

  private Boolean loyalty;

  public Loyalty(){
    Random random = new Random();
    loyalty = random.nextBoolean();
    this.loyalty = loyalty;
  }

  public Boolean getLoyalty(){
    return this.loyalty;
  }
}
