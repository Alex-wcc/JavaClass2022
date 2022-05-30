package network.InteAddress;
import java.net.*;
public class LocalAddress {
    public static void main(String[] args) throws Exception{
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);
    }
}
