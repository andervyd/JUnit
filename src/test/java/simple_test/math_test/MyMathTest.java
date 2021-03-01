package simple_test.math_test;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

// #2
@RunWith(Parameterized.class)
public class MyMathTest {

    int a, b, expResult;

    @Rule
    public TestRule timeout = new Timeout(300);

    // #1
    @Parameterized.Parameters
    public static Collection number() {
        return Arrays.asList(
                new Object[][] { {3, 4 ,7}, {2, 6, 8}, {5, 1, 8}, {4, 2, 6} });
    }

/*
    public MyMathTest() {
        // default
    }
*/

    // #3
    public MyMathTest(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

/*
//    @Test(timeout = 1000) // ms
    @Test
    public void add() {
        System.out.println("run method: add();");
        int a = 5;
        int b = 7;
        int expResult = 12;
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
    }
*/

    // #4
    @Test
    public void add() {
        System.out.println("run method: add();");
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
    }

/*
    @Test
    @Ignore
    public void dev() {
        System.out.println("run method: dev();");
        int a = 6;
        int b = 2;
        int expResult = 3;
        int result = MyMath.dev(a, b);
        assertEquals(expResult, result);
    }
*/

    @Test(expected = ArithmeticException.class)
    @Ignore
    public void dev() {
        System.out.println("run method: dev();");
        int a = 6;
        int b = 0; // NOT DEV FOR 0
        int expResult = 3;
        int result = MyMath.dev(a, b);
        assertEquals(expResult, result);
    }

}