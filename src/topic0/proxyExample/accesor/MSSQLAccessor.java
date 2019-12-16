/**
 * MSSQLAccessor class uses {@link topic0.proxyExample.accesor.DatabaseAccessor} interface.
 * It represents a Data Accessor for MS-SQL external dependencies.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.proxyExample.accesor;

import java.sql.*;
import java.util.logging.Logger;

public class MSSQLAccessor implements DatabaseAccessor {
    Connection conn;
    Logger log = Logger.getLogger(MSSQLAccessor.class.getName());
    Statement statement;

    /**
     * Connects to database
     * @param username A String object containing the user's name.
     * @param password A String object containing the user's password.
     * @param url      A String object containing the url that the user's attempting to connect.
     * @return true.
     * @throws SQLException
     */
    @Override
    public boolean connect(String username, String password, String url) throws SQLException {
        log.info("Connecting to a MS-SQL database");
        conn = DriverManager.getConnection(url, password, username);
        statement=conn.createStatement();
        return true;
    }

    /**
     * Executes the data set for the given query.
     * @param query A String object containing the query that should be executed.
     * @return true.
     * @throws SQLException
     */
    @Override
    public boolean executeDataSet(String query)throws SQLException {
        log.info("Reading data set from a MS-SQL database");
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