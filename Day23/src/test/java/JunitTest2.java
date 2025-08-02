import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTest2 {

    String msg = "running test02 ";
    MessageUtil msgUtilobj = new MessageUtil(msg);

    @Test
    public void msgTest() {
        System.out.println("Inside JunitTest02 msgTest()");
        assertEquals(msg, msgUtilobj.printMessage());
    }
}
