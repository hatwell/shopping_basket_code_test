import shopping_basket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class BasketTest {
  Basket basket;
  Item item;
  Item item2;

  @Before
  public void before(){
    basket = new Basket();
    item = new Item("grapes", 1.50, Category.FOOD);
    item2 = new Item("bleach", 2.00, Category.HOUSEHOLD);
  }

  @Test
  public void testInitialItemCount(){
    assertEquals(0, basket.getItemCount());
  }

  @Test
  public void testAddingItem(){
    basket.addToBasket(item);
    assertEquals(1, basket.getItemCount());

  }

  @Test
  public void testEmptyBasket(){
    basket.addToBasket(item);
    basket.emptyBasket();
    assertEquals(0, basket.getItemCount());
  }

  @Test
  public void testBasketTotal(){
    basket.addToBasket(item);
    basket.addToBasket(item2);
    assertEquals(3.50, basket.getBasketTotal(), 0.01);
  }

  @Test
  public void testItemCanBeDeletedByName(){
    basket.addToBasket(item);
    basket.deleteItem(item);
    assertEquals(0, basket.getItemCount());
  }

  @Test
  public void testCountNumberOfItems(){
    basket.addToBasket(item);
    assertEquals(1, basket.countNumberOfItems("grapes"));

  }




}
