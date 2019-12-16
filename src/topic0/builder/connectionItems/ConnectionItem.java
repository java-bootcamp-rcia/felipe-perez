/**
 * ConnectionItem interface refers to a component required in a
 * {@link java.sql.Connection} type object creation.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.builder.connectionItems;

public interface ConnectionItem {
    /**
     * @return a String type object referring to the type of the object, it will be either a username, a password or an url.
     * @since 1.0
     */
    public String getType();
    /**
     * @return a String type object referring to the item content.
     * @since 1.0
     */
    public String getContent();
}
