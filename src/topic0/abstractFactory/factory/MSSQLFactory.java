/**
 * MSSQLFactory is a class which instantiation produces a new MS-SQL type connection.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.factory;

import topic0.abstractFactory.sql.MSSQL;
import topic0.abstractFactory.sql.SQLConecction;

public class MSSQLFactory extends AbstractSQLFactory {
    /**
     * @return a {@link topic0.abstractFactory.sql.MSSQL} instance object
     * @since 1.0
     */
    @Override
    public SQLConecction getConnection() {
        return new MSSQL();
    }
}
