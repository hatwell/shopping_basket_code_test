import shopping_basket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class BogofTest {

  Bogof bogof;
  Basket basket;
  Item item;

  @Before
  public void before(){
    basket = new Basket();
    item = new Item("beans", 0.5, Category.FOOD);
    bogof = new Bogof(basket, item);
  }

  @Test public void testBogofWorks(){
    basket.addToBasket(item);
    basket.addToBasket(item);
    bogof.applyBogof();
    assertEquals(0.5, basket.getTotal(), 0.01);

  }
}
