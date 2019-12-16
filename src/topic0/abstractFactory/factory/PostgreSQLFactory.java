/**
 * PostgreSQLFactory is a class which instantiation produces a new PostgreSQL type connection.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.factory;

import topic0.abstractFactory.sql.PostgreSQL;
import topic0.abstractFactory.sql.SQLConecction;

public class PostgreSQLFactory extends AbstractSQLFactory {
    /**
     * @return a {@link topic0.abstractFactory.sql.PostgreSQL} instance object
     * @since 1.0
     */
    @Override
    public SQLConecction getConnection() {
        return new PostgreSQL();
    }
}
