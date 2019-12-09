package topic0.abstractFactory.factory;

import topic0.abstractFactory.sql.OracleSQL;
import topic0.abstractFactory.sql.SQLConecction;

public class OracleSQLFactory extends AbstractSQLFactory {
    @Override
    public SQLConecction getConnection(){
        return new OracleSQL();
    }
}
