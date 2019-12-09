package topic0.abstractFactory.factory;

import topic0.abstractFactory.sql.PostgreSQL;
import topic0.abstractFactory.sql.SQLConecction;

public class PostgreSQLFactory extends AbstractSQLFactory {
    @Override
    public SQLConecction getConnection() {
        return new PostgreSQL();
    }
}
