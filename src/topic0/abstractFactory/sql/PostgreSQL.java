/**
 * PostgreSQL class meant to represent a connection to an external PostgreSQL database dependency.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.sql;
import java.util.logging.Logger;
public class PostgreSQL implements SQLConecction {

    private String userName;
    private String password;
    private String url;
    private String protocol="postgre";

    private Logger log = Logger.getLogger(PostgreSQL.class.getName());
    /**
     * @return true
     * @since 1.0
     */
    @Override
    public boolean connect() {
        log.info("Connecting to PostgreSQL Database...");
        log.info("Connection to PostgreSQL Database established succesfully.");
        return true;
    }
}
