/**
 * SQLConnection is an interface meant to represent a connection to an external database dependency.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.abstractFactory.sql;

public interface SQLConecction {
    /**
     * @return a boolean variable, it will return always true, since it only mock of a real connection
     * @since 1.0
     */
    boolean connect();
}
