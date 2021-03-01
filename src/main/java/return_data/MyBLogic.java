package return_data;

import java.sql.SQLException;

public class MyBLogic {

    public int editItem(int id, String newName, DBInt db) // change: DBase <=> DBInt
            throws SQLException {

        System.out.println("edit item " + id);

        String itemName = db.find(id);

        if(itemName != null) {
            itemName = newName;
            int result = db.save(id, itemName);

            if(result == 2) {
                System.out.println("result = 2");
            } else throw new IllegalArgumentException(
                    "record with id = " + id + " not ");
        }
                return 1;

    }

}
