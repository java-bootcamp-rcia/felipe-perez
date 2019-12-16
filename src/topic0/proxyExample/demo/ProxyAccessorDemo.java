/**
 * ProxyAccessorDemo class serves as an application class to run and test the Proxy Pattern Design.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.proxyExample.demo;

import topic0.proxyExample.accesor.ProxyAccessor;

import java.sql.SQLException;
import java.util.logging.Logger;

public class ProxyAccessorDemo {
    public static void main(String[] args) throws SQLException {
        Logger log= Logger.getLogger(ProxyAccessorDemo.class.getName());
        //Proxy of a MySQL Database accesor
        log.info("Creating a MySQL accesor...");
        ProxyAccessor accessor=new ProxyAccessor("mysql");
        accessor.connect("admin","pass123","dbc:mysql://localhost:1234/jdbc");
        accessor.executeDataSet("SELECT * from users");

        //Proxy of a PostgreSQL Database accesor
        log.info("Creating a PostgreSQL accesor...");
        accessor=new ProxyAccessor("postgresql");
        accessor.connect("admin","pass123","dbc:mysql://localhost:1234/jdbc");
        accessor.executeDataSet("SELECT * from users");

        //Proxy of an Oracle Database accesor
        log.info("Creating an Oracle Database accesor...");
        accessor=new ProxyAccessor("oraclesql");
        accessor.connect("admin","pass123","dbc:mysql://localhost:1234/jdbc");
        accessor.executeDataSet("SELECT * from users");

        //Proxy of a MS-SQL Database accesor
        log.info("Creating a MS-SQL accesor...");
        accessor=new ProxyAccessor("ms-sql");
        accessor.connect("admin","pass123","dbc:mysql://localhost:1234/jdbc");
        accessor.executeDataSet("SELECT * from users");
    }
}
