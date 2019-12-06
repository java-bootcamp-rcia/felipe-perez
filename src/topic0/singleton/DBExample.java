package topic0.singleton;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBExample {
    private static DBExample instance= new DBExample();
    private static Connection conn=null;
    //Constructor is setted to private to avoid further instances
    private DBExample(){ }
    public static DBExample getInstance(){
        return instance;
    }
    public static Connection getDBConnection(){
        try{
            if (conn==null){
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost/xx","root","pass123");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

}
