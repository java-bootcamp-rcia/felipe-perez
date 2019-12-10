package topic0.builder.connectionItems;

public class User implements ConnectionItem{
    String type;
    String content;
    public User (String content){
        this.type="user";
        this.content=content;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getContent() {
        return content;
    }
}
