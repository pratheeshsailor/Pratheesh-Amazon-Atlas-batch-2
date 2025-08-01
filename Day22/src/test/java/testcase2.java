
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class testcase2 {

    protected int val1, val2;

    // Regular method, NOT called automatically
    protected void setUp() {
        val1 = 100;
        val2 = 200;
    }

    @Test
    public void testSum() {
        setUp(); //here we are calling up manually
        int sum = val1 + val2;
        assertTrue(sum == 300);
    }
}