import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    SumCalculator sum;
    @BeforeEach
    public void beforeEach() {
        sum = new SumCalculator();
    }
    @Test
    public void testThatSumWorkWithOne(){
        Assertions.assertEquals(1, sum.sum(1));
    }
    @Test
    public void testThatSumWorkWithThree(){
        Assertions.assertEquals(6, sum.sum(3));
    }
    @Test
    public void testThatSumExceptionWork(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> sum.sum(0));
    }
}
