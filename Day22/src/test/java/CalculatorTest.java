import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    int x, y;

    @Before
    public void setUp() {
        x = 10;
        y = 20;
        System.out.println("SetUp: x = " + x + ", y = " + y);
    }

    @After
    public void tearDown() {
        System.out.println("TearDown after test\n");
    }

    @Test
    public void testAdd() {
        System.out.println("Running testAdd");
        assertEquals(30, x + y);
    }

    @Test
    public void testSubtract() {
        System.out.println("Running testSubtract");
        assertEquals(-10, x - y);
    }

    @Test
    public void testMultiply() {
        System.out.println("Running testMultiply");
        assertEquals(200, x * y);
    }

    @Test
    public void testDivide() {
        System.out.println("Running testDivide");
        assertEquals(0, x / y);
    }

    @Test
    public void testModulus() {
        System.out.println("Running testModulus");
        assertEquals(10, x % y);
    }
}
