package topic0.abstractFactory.sql;
import java.util.logging.Logger;
public class MSSQL implements SQLConecction {

    private String userName;
    private String password;
    private String url;
    private String protocol="ms-sql";

    private Logger log = Logger.getLogger(MSSQL.class.getName());
    @Override
    public boolean connect() {
        log.info("Connecting to MS-SQL Database...");
        log.info("Connection to MS-SQL Database established succesfully.");
        return true;
    }
}