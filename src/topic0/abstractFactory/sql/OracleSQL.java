package topic0.abstractFactory.sql;
import java.util.logging.Logger;
public class OracleSQL implements SQLConecction {

    private String userName;
    private String password;
    private String url;
    private String protocol="oracle database";

    private Logger log = Logger.getLogger(OracleSQL.class.getName());
    @Override
    public boolean connect() {
        log.info("Connecting to Oracle SQL Database...");
        log.info("Connection to Oracle SQL Database established succesfully.");
        return true;
    }
}