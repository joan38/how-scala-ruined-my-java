package spring.implementation;

public class Main {
    public static void main(String[] args) {
        var client = new DefaultClient();
        MessageService.sendMessage("ping", client);
    }
}
