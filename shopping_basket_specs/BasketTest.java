import shopping_basket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class BasketTest {
  Basket basket;
  Item item;

  @Before
  public void before(){
    basket = new Basket();
    item = new Item("grapes", 1.50, Category.FOOD);
  }

  @Test
  public void testItemCount(){
    assertEquals(0, basket.getItemCount());
  }

  @Test
  public void testAddingItem(){
    basket.addItem(item);
    assertEquals(1, basket.getItemCount());
  }

}
