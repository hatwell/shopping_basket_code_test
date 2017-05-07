package shopping_basket;

public class Customer{
  private Boolean loyalty;

  public Customer(Boolean loyalty){
    this.loyalty = loyalty;
  }

  public Boolean getLoyalty(){
    return this.loyalty;
  }
}
