package simple_test.startpoint;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import simple_test.math_test.MyMathTest;
import simple_test.name_test.PetNameTest;

import static org.junit.Assert.*;


@RunWith(Suite.class)
@Suite.SuiteClasses({MyMathTest.class, PetNameTest.class})
public class TestSuite {
    // run all tests in project
}