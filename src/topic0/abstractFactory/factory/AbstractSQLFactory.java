/**
 * AbstractSQLFactory abstract class serves as a model to instantiate factories
 * of databases external dependencies.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.factory;

import topic0.abstractFactory.sql.SQLConecction;

public abstract class AbstractSQLFactory {

    /**
     * @return a {@link topic0.abstractFactory.sql.SQLConecction} or extended from this class instance object.
     * @since 1.0
     */
    public abstract SQLConecction getConnection();
}
