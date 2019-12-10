package topic0.builder;

import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionBuilder {
    private Logger log = Logger.getLogger(ConnectionBuilder.class.getName());
    DatabaseConnection databaseConnection=new DatabaseConnection();

    public DatabaseConnection buildConnection() throws SQLException {
        databaseConnection.establishUser("Pedro","perro1232","//localhost/xx");
        databaseConnection.connect();
        return databaseConnection;
    }
}
