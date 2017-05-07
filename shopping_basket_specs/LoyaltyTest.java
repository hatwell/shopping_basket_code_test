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
}
