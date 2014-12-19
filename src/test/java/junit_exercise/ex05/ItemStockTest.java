package junit_exercise.ex05;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ItemStockTest {

  public static class 初期状態の場合 {
    ItemStock sut;
    Item testItem = new Item("test", 1000);

    @Before
    public void setUp() {
      sut = new ItemStock();
    }

    @Test
    public void getNumで0が取得できる() throws Exception {
      // Exercise
      // Verify
      assertThat(sut.getNum(testItem), is(0));
    }

    @Test
    public void addでItemを追加するとgetNumで1が取得できる() throws Exception {
      // SetUp
      sut.add(testItem);
      // Exercise
      // Verify
      assertThat(sut.getNum(testItem), is(1));
    }

  }
  
  public static class Itemが1つ追加されている状態 {

    ItemStock sut;
    Item testItem = new Item("test", 1000);
    Item testItem2 = new Item("test2", 2000);
    
    @Before
    public void setUp() {
      sut = new ItemStock();
      sut.add(testItem);
    }
    
    @Test
    public void getNumで1が取得できる() throws Exception {
      // Exercise
      // Verify
      assertThat(sut.getNum(testItem), is(1));
    }
    
    @Test
    public void addで同じItemオブジェクトを追加するとgetNumで2が取得できる() throws Exception {
      // SetUp
      sut.add(testItem);
      // Exercise
      // Verify
      assertThat(sut.getNum(testItem), is(2));
    }
    
    @Test
    public void addで異なるItemオブジェクトを追加するとgetNumで1が取得できる() throws Exception {
      // SetUp
      sut.add(testItem2);
      // Exercise
      // Verify
      assertThat(sut.getNum(testItem2), is(1));
    }

  }

}
