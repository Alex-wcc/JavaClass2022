package GUI.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame {
    public static void main(String[] args) {

        //普通的窗体，带最大和最小化按钮
        JFrame f = new JFrame("IDEA");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);
        JButton b = new JButton("点击运行");
        b.setBounds(50, 50, 280, 30);

        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
