import shopping_basket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class LoyaltyTest {
  Loyalty loyalty;

  @Before
  public void before(){
    loyalty = new Loyalty();

  }

  @Test
  public void testLoyalty(){
    assertNotNull(loyalty.getLoyalty());
  }

  @Test
  public void testLoyaltyDiscountReturnsTotal(){
    assertNotNull(loyalty.changePrice(30.00));
  }
}
