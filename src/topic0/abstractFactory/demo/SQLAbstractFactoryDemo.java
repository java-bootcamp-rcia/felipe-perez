/**
 * SQLAbstractFactoryDemo class serves as an application class, it'll be used to run and test the functionality
 * of each of the {@link topic0.abstractFactory.factory.AbstractSQLFactory} extended classes.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.demo;
import topic0.abstractFactory.factory.*;
import topic0.abstractFactory.sql.*;
import java.util.logging.Logger;

public class SQLAbstractFactoryDemo {
    public static void main(String[] args) {
        Logger log= Logger.getLogger(SQLAbstractFactoryDemo.class.getName());
        //** MY SQL **//

        AbstractSQLFactory mySQLFactory = FactoryProducer.getFactory("mysql");

        SQLConecction mySQLConn= mySQLFactory.getConnection();

        log.info("NEW MYSQL CONNECTION");
        mySQLConn.connect();

        //** ORACLE SQL **//

        AbstractSQLFactory oracleSQLFactory = FactoryProducer.getFactory("Oracle");

        SQLConecction oracleConn= oracleSQLFactory.getConnection();

        log.info("NEW ORACLE DATABASE CONNECTION");
        oracleConn.connect();

        //** POSTGRE SQL **//

        AbstractSQLFactory postgreSQLFactory = FactoryProducer.getFactory("postgresql");

        SQLConecction postgreSQLConn= postgreSQLFactory.getConnection();

        log.info("NEW POSTGRESQL CONNECTION");
        postgreSQLConn.connect();

        //** MS-SQL **//

        AbstractSQLFactory msSQLFactory = FactoryProducer.getFactory("ms-sql");

        SQLConecction msSQLConn= msSQLFactory.getConnection();

        log.info("NEW MS-SQL CONNECTION");
    }
}
