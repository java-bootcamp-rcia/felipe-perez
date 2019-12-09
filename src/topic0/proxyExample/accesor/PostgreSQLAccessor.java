package topic0.proxyExample.accesor;

import java.sql.*;
import java.util.logging.Logger;

public class PostgreSQLAccessor implements DatabaseAccessor {

    Connection conn;
    Logger log= Logger.getLogger(PostgreSQLAccessor.class.getName());
    Statement statement;
    @Override
    public boolean connect(String username, String password, String url) throws SQLException {
        log.info("Connecting to a POSTGRE SQL database");
        conn= DriverManager.getConnection(url,password,username);
        statement=conn.createStatement();
        return true;
    }

    @Override
    public boolean executeDataSet(String query)throws SQLException {
        log.info("Reading data set from a PostgreSQL database");
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
