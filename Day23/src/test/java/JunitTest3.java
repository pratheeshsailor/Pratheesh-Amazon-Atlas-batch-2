import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTest3 {

    String msg = "running test03 ";
    MessageUtil msgUtilobj = new MessageUtil(msg);

    @Test
    public void msgTest() {
        System.out.println("Inside JunitTest03 msgTest()");
        assertEquals(msg, msgUtilobj.printMessage());
    }
}
