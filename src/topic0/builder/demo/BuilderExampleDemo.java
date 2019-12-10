package topic0.builder.demo;

import topic0.builder.ConnectionBuilder;

import java.sql.SQLException;

public class BuilderExampleDemo {
    public static void main(String[] args) throws SQLException {
        ConnectionBuilder connectionBuilder=new ConnectionBuilder();
        connectionBuilder.buildConnection();
    }
}
