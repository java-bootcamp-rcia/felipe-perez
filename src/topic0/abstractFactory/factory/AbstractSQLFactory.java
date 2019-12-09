package topic0.abstractFactory.factory;

import topic0.abstractFactory.sql.SQLConecction;

public abstract class AbstractSQLFactory {
    public abstract SQLConecction getConnection();
}
