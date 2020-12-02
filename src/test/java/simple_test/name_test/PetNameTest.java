package simple_test.name_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetNameTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        System.out.println("run method: getName();");
        PetName name = new PetName("Buddy");
        assertEquals("Buddy", name.getName());
    }

}