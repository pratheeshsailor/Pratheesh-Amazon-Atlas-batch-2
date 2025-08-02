import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTest1 {

    String msg = "running test01 ";
    MessageUtil msgUtilobj = new MessageUtil(msg);

    @Test
    public void msgTest() {
        System.out.println("Inside msgTest()");
        assertEquals(msg, msgUtilobj.printMessage());
    }
}
