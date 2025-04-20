package spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    @Autowired
    private Client client;

    public void sendMessage(String message) {
        // Do some API call
        client.post("example.com", "Message '" + message + "' sent!");
    }
}
