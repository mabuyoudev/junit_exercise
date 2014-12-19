package junit_exercise.ex03;

public class Counter {
  
  private int count = 0;
  
  public Counter() {
    this.count++;
  }
  
  public int increment() {
    int result = count++;
    return result;
  }
  
}
