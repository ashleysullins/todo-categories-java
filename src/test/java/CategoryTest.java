import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class CategoryTest {

  @Test
  public void getName_returnsName_true() {
    Category testCategory = new Category("Home");
    assertEquals("Home", testCategory.getName());
  }

  @Test
  public void getID_returnsCategoryID(){
    Category testCategory = new Category("Home");
    assertTrue(Category.all().size() == testCategory.getId());
  }

  @Test
  public void getTasks_initiallyreturnsEmptyArrayList(){
    Category testCategory = new Category("Home");
    assertTrue(testCategory.getTasks() instanceof ArrayList);
  }

  @Test
  public void all_returnsTwoCategories() {
    Category firstCategory = new Category ("Home");
    Category secondCategory = new Category ("Garden");
    assertTrue(Category.all().contains(firstCategory));
    assertTrue(Category.all().contains(secondCategory));
  }
  @Test
  public void clear_removesAllCategoryInstancesFromMemory() {
    Category testCategory = new Category("Home");
    Category.clear();
    assertEquals(Category.all().size(), 0);
  }
  
  @Test
  public void find_returnsCategoryWithSameId() {
    Category testCategory = new Category("Home");
    assertEquals(Category.find(testCategory.getId()), testCategory);
  }

}

