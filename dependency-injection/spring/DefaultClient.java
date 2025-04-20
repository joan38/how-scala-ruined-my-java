package spring.boot;

import org.springframework.stereotype.Component;

@Component
public class DefaultClient implements Client {
    public void post(String url, String body) {
        // Do the API call
        System.out.println("POST " + url + " body: " + body);
    }
}
