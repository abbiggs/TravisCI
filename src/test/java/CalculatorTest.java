import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void addNumsTest(){
        Calculator calculator = new Calculator();
        int sum = calculator.addNums(2, 2);
        Assertions.assertEquals(sum, 4);
    }
}
