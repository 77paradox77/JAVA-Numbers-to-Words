import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

  @Test
  public void turnNumberToWords_returnsSingleNumbers_1(){
    NumbersToWords testWords = new WordsToNumbers();
    Integer testInput = 1;
    String testOutput = "one";
    assertEquals(testOutput, testWords.turnNumbersToWords(testInput));
  }
}
