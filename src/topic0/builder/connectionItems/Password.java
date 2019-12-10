package topic0.builder.connectionItems;

public class Password implements ConnectionItem{
    String type;
    String content;
    public Password (String content){
        this.type="password";
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
