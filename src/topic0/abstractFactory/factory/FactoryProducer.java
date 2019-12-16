/**
 * FactoryProducer class serves as an static platform to instantiate factories
 * extended from {@link topic0.abstractFactory.factory.AbstractSQLFactory}.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.factory;

public class FactoryProducer {

    public static AbstractSQLFactory getFactory(String sqlType){
        if (("mysql").equalsIgnoreCase(sqlType)){
            return new MySQLFactory();
        }else if (("ms-sql").equalsIgnoreCase(sqlType)){
            return new MSSQLFactory();
        }else if (("oracle").equalsIgnoreCase(sqlType)){
            return new OracleSQLFactory();
        }else if (("postgresql").equalsIgnoreCase(sqlType)){
            return new PostgreSQLFactory();
        }
        return null;
    }
}
