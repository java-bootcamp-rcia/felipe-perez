package topic0.proxyExample.accesor;

import java.sql.SQLDataException;
import java.sql.SQLException;

public class ProxyAccessor implements DatabaseAccessor {
    private DatabaseAccessor realAccessor;
    public ProxyAccessor(String sqlType){
        if (sqlType.equalsIgnoreCase("mysql")) {
            this.realAccessor = new MySQLAccessor();
        } else if (sqlType.equalsIgnoreCase("postgresql")) {
            this.realAccessor= new PostgreSQLAccessor();
        } else if (sqlType.equalsIgnoreCase("OracleSQL")) {
            this.realAccessor= new OracleSQLAccessor();
        } else if (sqlType.equalsIgnoreCase("MS-SQL")){
            this.realAccessor= new MSSQLAccessor();
        }
    }

    @Override
    public boolean connect(String username, String password, String url) throws SQLException {
        try{
            realAccessor.connect(username,password,url);
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

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
