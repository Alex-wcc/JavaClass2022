package network.socket;

import java.io.*;
import java.util.*;
import java.net.*;

public class BasicServerSocket {
    public static void main(String args[]) {
        ServerSocket serverSocket = null;
        Socket socket;
        OutputStream outputStream;
        DataOutputStream dataOutputStream;
        try {
            serverSocket = new ServerSocket(5432); //打开服务器，注册5432端口
        } catch (IOException e) {
        }
        while (true)  //一直进行数据的接受
        {
            try {
                socket = serverSocket.accept(); //等待接听连接
                outputStream = socket.getOutputStream(); //获取输出流
                dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeUTF(new Date().toString()); //输出一个时间
                outputStream.close();
                socket.close();
            } catch (IOException e) {
            }
        }
    }
}
