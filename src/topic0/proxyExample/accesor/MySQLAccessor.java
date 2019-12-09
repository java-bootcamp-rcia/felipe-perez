package topic0.proxyExample.accesor;

import java.sql.*;
import java.util.logging.Logger;

public class MySQLAccessor implements DatabaseAccessor {
    Connection conn;
    Logger log= Logger.getLogger(MySQLAccessor.class.getName());
    Statement statement;
    @Override
    public boolean connect(String username, String password, String url) throws SQLException {
        log.info("Connecting to a MYSQL database");
        conn= DriverManager.getConnection(url,password,username);
        statement=conn.createStatement();
        return true;
    }

    @Override
    public boolean executeDataSet(String query)throws SQLException {
        log.info("Reading data set from a MYSQL database");
        try{
            ResultSet rs=statement.executeQuery(query);
            while (rs.next()){
                /*
                 *   Executes the data set for the given query
                 */
            }
            statement.close();
        }catch(Exception e){
            log.info("Failure: Cannot read data set");
        }

        return true;
    }
}
