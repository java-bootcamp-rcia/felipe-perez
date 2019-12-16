/**
 * MySQLFactory is a class which instantiation produces a new MySQL type connection.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.factory;

import topic0.abstractFactory.sql.MySQL;
import topic0.abstractFactory.sql.SQLConecction;

public class MySQLFactory extends AbstractSQLFactory {
    /**
     * @return a {@link topic0.abstractFactory.sql.MySQL} instance object
     * @since 1.0
     */
    @Override
    public SQLConecction getConnection() {
        return new MySQL();
    }
}
