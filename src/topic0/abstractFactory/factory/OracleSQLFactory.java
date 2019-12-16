/**
 * OracleSQLFactory is a class which instantiation produces a new Oracle database type connection.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.factory;

import topic0.abstractFactory.sql.OracleSQL;
import topic0.abstractFactory.sql.SQLConecction;

public class OracleSQLFactory extends AbstractSQLFactory {
    /**
     * @return a {@link topic0.abstractFactory.sql.OracleSQL} instance object
     * @since 1.0
     */
    @Override
    public SQLConecction getConnection(){
        return new OracleSQL();
    }
}
