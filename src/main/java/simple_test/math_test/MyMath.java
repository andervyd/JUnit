package simple_test.math_test;

public class MyMath {

    public static int add(int a, int b) {

        try {
            Thread.sleep(200); // timeout 200 ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return a + b;
    }

    public static int dev(int a, int b) {

        try {
            Thread.sleep(250); // timeout 300 ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return a / b;
    }

}
