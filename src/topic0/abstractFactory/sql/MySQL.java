/**
 * MySQL class meant to represent a connection to an external MySQL database dependency.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.sql;
import java.util.logging.Logger;
public class MySQL implements SQLConecction {

    private String userName;
    private String password;
    private String url;
    private String protocol="mysql";

    private Logger log = Logger.getLogger(MySQL.class.getName());
    /**
     * @return true
     * @since 1.0
     */
    @Override
    public boolean connect() {
        log.info("Connecting to MySQL Database...");
        log.info("Connection to MySQL Database established succesfully.");
        return true;
    }
}
