package topic0.builder.connectionItems;

public class Url implements ConnectionItem {
    String type;
    String content;
    public Url (String content){
        this.type="url";
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
