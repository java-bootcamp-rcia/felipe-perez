/**
 * DatabaseAccessor interface serves as a model of the behaviour each database accessor should have.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.proxyExample.accesor;

import java.sql.SQLException;

public interface DatabaseAccessor {
    /**
     * @param username A String object containing the user's name.
     * @param password A String object containing the user's password.
     * @param url A String object containing the url that the user's attempting to connect.
     * @return a boolean variable, it will always return true, since it's only a mock.
     * @throws SQLException
     */
    public boolean connect(String username, String password, String url) throws SQLException;

    /**
     * @param query A String object containing the query that should be executed.
     * @return a boolean variable, it will always return true, since it's only a mock.
     * @throws SQLException
     */
    public boolean executeDataSet(String query) throws SQLException;
}
