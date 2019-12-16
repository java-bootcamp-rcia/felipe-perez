/**
 * DBExampleTest serves as an application class, it will be use to run and test DBExample{@link topic0.singleton.DBExample} class functionality.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.singleton;
import java.sql.*;
public class DBExampleTest {
    public static void main(String[] args) {
        Connection conn=DBExample.getDBConnection();
        try{
            String query = "Select * from users";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
            }
        }catch (Exception e){
            System.out.println("Error during connection");
        }
    }
}
