package junit_exercise.ex05;

import java.util.ArrayList;
import java.util.List;

public class ItemStock {

  private List<Item> items = new ArrayList<Item>();
  
  public int getNum(Item item) {
    int itemNumber = 0;
    for (Item i : items) {
      if (i.name.equals(item.name)) {
        itemNumber++;
      }
    }
    return itemNumber;
  }

  public void add(Item item) {
    items.add(item);
  }

}
