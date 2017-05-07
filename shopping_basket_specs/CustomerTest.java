import shopping_basket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class CustomerTest {
  Customer customer;

  @Before
  public void before(){
    customer = new Customer(true);

  }

  @Test
  public void testCustomerHasLoyaltyCard(){
    assertTrue(customer.getLoyalty());
  }
}
