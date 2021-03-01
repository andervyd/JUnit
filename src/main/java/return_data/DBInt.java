package return_data;

import java.sql.SQLException;

public interface DBInt {

    String find(int id);

    int save(int id, String name) throws SQLException;

}
