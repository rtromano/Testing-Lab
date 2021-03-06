import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class AverageTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testNewAverage() {
    Average avg = new Average();
    
    assertEquals(0, avg.getCount());
    assertEquals(0, avg.getAverage(), 0.001);
  }
  
  public void testSingleValue() {
    Average avg = new Average();
    
    avg.addValue(5.5);
    
    assertEquals(5.5, avg.getAverage(), 0.001);
    assertEquals(1, avg.getCount());
  }
  
  public void testFiveValues() {
    Average avg = new Average();
    
    avg.addValue(2);
    avg.addValue(8);
    avg.addValue(7);
    avg.addValue(15);
    avg.addValue(6);
    
    assertEquals(7.6, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }

  public void testAverageZero() {
    Average avg = new Average();
    
    avg.addValue(-2);
    avg.addValue(2);
    avg.addValue(-5);
    avg.addValue(5);
    avg.addValue(0);
    
    assertEquals(0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }
  
  public void testSameValues() {
    Average avg = new Average();
    
    avg.addValue(4);
    avg.addValue(4);
    avg.addValue(4);
    avg.addValue(4);
    avg.addValue(4);
    
    assertEquals(4, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }
  
}
