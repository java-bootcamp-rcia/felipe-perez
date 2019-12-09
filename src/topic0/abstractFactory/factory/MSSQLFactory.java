package topic0.abstractFactory.factory;

import topic0.abstractFactory.sql.MSSQL;
import topic0.abstractFactory.sql.SQLConecction;

public class MSSQLFactory extends AbstractSQLFactory {
    @Override
    public SQLConecction getConnection() {
        return new MSSQL();
    }
}
