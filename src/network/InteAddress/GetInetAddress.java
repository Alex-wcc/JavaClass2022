package network.InteAddress;
import java.net.*;
public class GetInetAddress {
    public static void main(String args[]) throws Exception {
        InetAddress inetAddress = InetAddress.getByName("www.google.com");
        System.out.println("主机名/IP: \t"+inetAddress);
        System.out.println("主机名: \t" +inetAddress.getHostName());
        System.out.println("IP: \t"+inetAddress.getHostAddress());
    }
}
