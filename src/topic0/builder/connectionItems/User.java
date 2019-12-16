/**
 * User class is a {@link topic0.builder.connectionItems.ConnectionItem} type object.
 *
 * @author Felipe Pérez
 * @version 1.0
 *
 */
package topic0.builder.connectionItems;

public class User implements ConnectionItem{
    String type;
    String content;
    public User (String content){
        this.type="user";
        this.content=content;
    }

    /**
     * @return a String type object referring to the type of the object.
     * @since 1.0
     */
    @Override
    public String getType() {
        return type;
    }
    /**
     * @return a String type object referring to the item content.
     * @since 1.0
     */
    @Override
    public String getContent() {
        return content;
    }
}
