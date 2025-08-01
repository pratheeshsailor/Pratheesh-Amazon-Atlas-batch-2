
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JavaTestRunner {
    public static void main(String[] args) {
        Result resObj = JUnitCore.runClasses(testcase1.class);

        for (Failure failure : resObj.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Test successful: " + resObj.wasSuccessful());
    }
}
