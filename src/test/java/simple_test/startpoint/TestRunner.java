package simple_test.startpoint;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import simple_test.math_test.MyMathTest;
import simple_test.name_test.PetNameTest;

public class TestRunner {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(MyMathTest.class, PetNameTest.class);

        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

    }
}
