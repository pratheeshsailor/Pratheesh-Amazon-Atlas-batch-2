import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testcase1 {
    @Test
    public void add() {
        int num1 = 10;
        int num2 = 20;
        int res = num1 + num2;
        assertEquals(30, res); // Correct value is 30
    }
}
