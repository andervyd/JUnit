package return_data;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class MyBLogicTest {

    Mockery cnt = new Mockery();

    public MyBLogicTest() {
        // default
    }

    @Test
    public void testEditItem() throws SQLException {
//        System.out.println("run method: editItem()");
        int id = 5;
        String newName = "something";

//        DBInt db = null;
        DBInt db = cnt.mock(DBInt.class);

        cnt.checking(new Expectations() {{

            oneOf(db).find(id);
            oneOf(db).save(id, newName);will(returnValue(1));

        }});

        MyBLogic instance = new MyBLogic();
        int expResult = 1;
        int result = instance.editItem(id, newName, db);
        assertEquals(expResult, result);


    }
}