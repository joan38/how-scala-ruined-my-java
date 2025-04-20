package spring.implementation;

public class MessageService {
    public static void sendMessage(String message, Client client) {
        // Do some API call
        client.post("example.com", "Message '" + message + "' sent!");
    }
}
