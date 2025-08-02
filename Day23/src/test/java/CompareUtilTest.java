import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompareUtilTest {

    CompareUtil obj = new CompareUtil();

    @Test
    public void testCompare_FirstGreater() {
        assertEquals(1, obj.compare(10, 5));
    }

    @Test
    public void testCompare_SecondGreater() {
        assertEquals(-1, obj.compare(4, 9));
    }

    @Test
    public void testCompare_BothEqual() {
        assertEquals(0, obj.compare(7, 7));
    }
}
