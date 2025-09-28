package org.example;


import com.sun.net.httpserver.Authenticator;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


//DemoTest001TestJunit.class
public class DemoTest002TestJunitRunner {
    public static void main(String[] args) {
        System.out.println("running a test runner code");
        Result res = JUnitCore.runClasses(DemoTest001TestJunit.class);


        for (Failure fail: res.getFailures()) {
            System.out.println(fail.toString());
        }
        System.out.println(res.wasSuccessful());
    }
}
