package topic0.builder;

import topic0.builder.connectionItems.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class DatabaseConnection {
    private List<ConnectionItem> data =new ArrayList<ConnectionItem>();
    private Connection connection;
    Logger log= Logger.getLogger(DatabaseConnection.class.getName());

    public void establishUser(String username, String password, String address){
        if (data.isEmpty()){
            User user=new User(username);
            Password pass=new Password(password);
            Url url =new Url(address);

            data.add(user);
            data.add(pass);
            data.add(url);

            System.out.println("The user "+username+" is now established");
        }else{
            System.out.println("An user is already established");
        }
    }

    public void connect() throws SQLException {
        log.info("Connecting...");
        try{
            this.connection=DriverManager.getConnection(data.get(2).getContent(),data.get(1).getContent(),data.get(0).getContent());
        }catch (Exception e){
            e.printStackTrace();
        }
        log.info("Connection established");

    }
}
