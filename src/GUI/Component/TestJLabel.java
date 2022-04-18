package GUI.Component;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestJLabel {
    public static void main(String[] args) {

        JFrame f = new JFrame("IDEA");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);
        JLabel l = new JLabel("IDEA标签");
        //文字颜色
        l.setForeground(Color.red);
        l.setBounds(50, 50, 280, 30);
        //l.setText("设置后的标签");

        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
