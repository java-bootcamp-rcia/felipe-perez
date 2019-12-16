/**
 * ProxyAccessor class uses {@link topic0.proxyExample.accesor.DatabaseAccessor} interface.
 * It serves as a surrogate of a real Accessor.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.proxyExample.accesor;

import java.sql.SQLDataException;
import java.sql.SQLException;

public class ProxyAccessor implements DatabaseAccessor {
    private DatabaseAccessor realAccessor;

    /**
     * @param sqlType A String object containing the database protocol.
     */
    public ProxyAccessor(String sqlType){
        if (("mysql").equalsIgnoreCase(sqlType)) {
            this.realAccessor = new MySQLAccessor();
        } else if (("postgresql").equalsIgnoreCase(sqlType)) {
            this.realAccessor= new PostgreSQLAccessor();
        } else if (("oracle sql").equalsIgnoreCase(sqlType)) {
            this.realAccessor= new OracleSQLAccessor();
        } else if (("ms-sql").equalsIgnoreCase(sqlType)){
            this.realAccessor= new MSSQLAccessor();
        }
    }

    /**
     * Calls the real accessor connect method.
     * @param username A String object containing the user's name.
     * @param password A String object containing the user's password.
     * @param url      A String object containing the url that the user's attempting to connect.
     * @return true.
     * @throws SQLException
     */
    @Override
    public boolean connect(String username, String password, String url) throws SQLException {
        try{
            realAccessor.connect(username,password,url);
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

    /**
     * Calls the reacl accessor executeDataSet method.
     * @param query A String object containing the query that should be executed.
     * @return true.
     * @throws SQLException
     */
    @Override
    public boolean executeDataSet(String query) throws SQLException {
        if (validation(query)){
            realAccessor.executeDataSet(query);
        }else{
            throw new SQLDataException();
        }
        return false;
    }

    public boolean validation(String query){
        /*
        *   Validation of query.
        *
         */
        return true;
    }
}
