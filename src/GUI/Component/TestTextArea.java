package GUI.Component;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TestTextArea {
    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(600, 300);
        f.setLocation(200, 200);

        f.setLayout(new FlowLayout());

        JLabel l = new JLabel("文本域：");

        JTextArea ta = new JTextArea();
        ta.setPreferredSize(new Dimension(400, 150));
        //\n换行符
        ta.setText("public class HelloWorld {\n");
        //追加数据
        ta.append("public static void main(String args[]) { \n");
        ta.append("System.out.println(\"Hello world!\" ) \n");
        ta.append("} \n");
        ta.append("} \n");
        //设置自动换行
        ta.setLineWrap(true);
        f.add(l);
        f.add(ta);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
