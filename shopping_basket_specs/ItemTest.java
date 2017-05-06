import shopping_basket.*;
import static org.junit.Assert.*;
import org.junit.*;


public class ItemTest {

  Item item;


  @Before
  public void before(){

  item = new Item("bread", 1.00, Category.FOOD);
  }

  @Test
  public void testItemHasName(){
    assertEquals("bread", item.getName());
  }

  @Test
  public void testItemHasPrice(){
    assertEquals(1.00, item.getPrice(), 0.01);
  }

  @Test
  public void itemHasCategory(){
    assertEquals(Category.FOOD, item.getCategory());
  }

}
