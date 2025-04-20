import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrency {

    /**
     * This example demonstrates a plain Java structured concurrency in Java.
     */
    public static void main(String[] args) throws InterruptedException {
        try (var scope = new StructuredTaskScope<>()) {
            var userName = scope.fork(() -> getUserName());
            var balance = scope.fork(() -> getBalance());
            scope.join(); // Do not forget to join the scope before using the values
            System.out.println(userName.get() + "'s account balance is " + balance.get() + "$");
        }
    }

    /**
     * Some API calls that take time to complete
     */
    private static String getUserName() throws InterruptedException {
        System.out.println("Getting user data");
        Thread.sleep(2000);
        System.out.println("Got username");
        return "Toto";
    }

    /**
     * Some API calls that take time to complete
     */
    private static Integer getBalance() throws InterruptedException {
        System.out.println("Getting balance");
        Thread.sleep(1000);
        System.out.println("Got balance");
        return 100;
    }
}
