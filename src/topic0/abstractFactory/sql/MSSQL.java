/**
 * MSSQL class meant to represent a connection to an external MS-SQL database dependency.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.sql;
import java.util.logging.Logger;
public class MSSQL implements SQLConecction {

    private String userName;
    private String password;
    private String url;
    private String protocol="ms-sql";

    private Logger log = Logger.getLogger(MSSQL.class.getName());
    /**
     * @return true
     * @since 1.0
     */
    @Override
    public boolean connect() {
        log.info("Connecting to MS-SQL Database...");
        log.info("Connection to MS-SQL Database established succesfully.");
        return true;
    }
}