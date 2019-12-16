/**
 * BuilderExampleDemo class serves as an application class, it'll be used to run and test the functionality
 * of the used builder pattern creating a {@link topic0.builder.ConnectionBuilder} instance.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.builder.demo;

import topic0.builder.ConnectionBuilder;

import java.sql.SQLException;

public class BuilderExampleDemo {
    public static void main(String[] args) throws SQLException {
        ConnectionBuilder connectionBuilder=new ConnectionBuilder();
        connectionBuilder.buildConnection();
    }
}
