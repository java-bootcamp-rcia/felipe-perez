/**
 * ConnectionBuilder is a building entity based on the Builder design pattern.
 * It creates a {@link topic0.builder.ConnectionBuilder} type object.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.builder;

import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionBuilder {
    private Logger log = Logger.getLogger(ConnectionBuilder.class.getName());
    DatabaseConnection databaseConnection=new DatabaseConnection();

    /**
     * @return a {@link topic0.builder.DatabaseConnection} type object.
     * @throws SQLException
     * @since 1.0
     */
    public DatabaseConnection buildConnection() throws SQLException {
        databaseConnection.establishUser("Pedro","perro1232","//localhost/xx");
        databaseConnection.connect();
        return databaseConnection;
    }
}
