package network.url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class TestWeb {
    public static void main(String args[]) {
        try {
            //构建URL对象
            URL url = new URL("https://how2j.cn/k/socket/socket-ip-port/399.html");
            //使用openStream得到一个输入流并由此构造一个BufferedReader对象
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            //输入流不断的读数据，直到读完为止
            while ((inputLine = bufferedReader.readLine()) != null) {
                System.out.println(inputLine);//把读入的数据输出到控制台
            }
            bufferedReader.close();//关闭输入流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
