package topic0.abstractFactory.factory;

import topic0.abstractFactory.sql.MySQL;
import topic0.abstractFactory.sql.SQLConecction;

public class MySQLFactory extends AbstractSQLFactory {
    @Override
    public SQLConecction getConnection() {
        return new MySQL();
    }
}
