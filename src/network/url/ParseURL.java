package network.url;

import java.net.*;
import java.io.*;

public class ParseURL {
    public static void main(String args[]) throws Exception {
        URL url = new URL("https://how2j.cn:8080/k/socket/socket-ip-port/399.html#reference");
        System.out.println("protocol: " + url.getProtocol());
        System.out.println("host: " + url.getHost());
        System.out.println("filename：" + url.getFile());
        System.out.println("port: " + url.getPort());
        System.out.println("ref: " + url.getRef());
    }
}
