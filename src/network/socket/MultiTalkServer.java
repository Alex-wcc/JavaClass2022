package network.socket;

import java.io.*;
import java.net.*;

public class MultiTalkServer {
    static int clientnum = 0;//静态成员变量，记录当前客户端的个数

    public static void main(String args[]) {
        ServerSocket serverSocket = null;
        boolean listening = true;
        try {
            //创建一个ServerSocket在端口5432进行监听
            serverSocket = new ServerSocket(5432);
            System.out.println("Server is running...");
        } catch (IOException e){
            System.out.println("Could not listen on port 5432.");
            System.exit(-1);//退出
        }
        try {
            while (listening){//持续进行监听
                //监听到客户端的请求，根据得到的socket对象和客户技术创建服务线程，并启动
                new ServerThread(serverSocket.accept(),++clientnum).start();
                System.out.println("Client-"+(clientnum)+" is connected...");
            }
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("连接客户端失败");
        }
    }
}
