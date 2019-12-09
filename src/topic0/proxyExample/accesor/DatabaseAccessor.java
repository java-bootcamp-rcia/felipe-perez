package topic0.proxyExample.accesor;

import java.sql.SQLException;

public interface DatabaseAccessor {
    public boolean connect(String username, String password, String url) throws SQLException;
    public boolean executeDataSet(String query) throws SQLException;
}
