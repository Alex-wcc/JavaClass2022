package network.socket;

import java.net.*;
import java.io.*;

public class BasicClientSocket {
    public static void main(String args[]) throws IOException {
        Socket socket;
        InputStream inputStream;
        DataInputStream dataInputStream;
        String str;
        //连接socket服务端
        socket = new Socket("127.0.0.1", 5432);
        //获取输入流
        inputStream = socket.getInputStream();
        dataInputStream = new DataInputStream(inputStream);
        str = new String(dataInputStream.readUTF());
        //打印接收到的数据
        System.out.println(str);
        inputStream.close();
        socket.close();
    }
}
