import java.net.InetAddress;
import java.net.UnknownHostException;

public class PingExample {
    public static void main(String[] args) {
        String hostName = "www.google.com"; // Replace with the host you want to ping

        try {
            InetAddress inetAddress = InetAddress.getByName(hostName);
            if (inetAddress.isReachable(5000)) {
                System.out.println(hostName + " is reachable");
            } else {
                System.out.println(hostName + " is not reachable");
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + hostName);
        } catch (Exception e) {
            System.err.println("Error while pinging " + hostName + ": " + e.getMessage());
        }
    }
}
