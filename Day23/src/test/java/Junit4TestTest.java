import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Junit4TestTest {

    @Test
    public void testCompare_WhenFirstIsGreater() {
        Junit4Test obj = new Junit4Test();
        int result = obj.compare(10, 5);
        assertEquals(1, result);
    }

    @Test
    public void testCompare_WhenSecondIsGreater() {
        Junit4Test obj = new Junit4Test();
        int result = obj.compare(3, 8);
        assertEquals(-1, result);
    }

    @Test
    public void testCompare_WhenEqual() {
        Junit4Test obj = new Junit4Test();
        int result = obj.compare(7, 7);
        assertEquals(-1, result); // Because your logic returns -1 even if both are equal
    }
}
