import org.junit.*;
import shopping_basket.*;
import static org.junit.Assert.*;

public class MoneyOffTest {

  MoneyOff moneyOff;
  Item item;

  @Before
  public void before(){
    moneyOff = new MoneyOff();
    item = new Item("chocolate", 1.00, Category.FOOD);
  }

  @Test
  public void testPercentageDiscountApplied(){
    double newPrice = 0.80;
    moneyOff.percentageDiscount(20, item);
    assertEquals(newPrice, item.getPrice(), 0.01);
  }
}
