package GUI.Panel;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class TestSplitPane {
    public static void main(String[] args) {

        JFrame f = new JFrame("IDEA");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(null);

        JPanel pLeft = new JPanel();
        pLeft.setBounds(50, 50, 300, 60);

        pLeft.setBackground(Color.RED);

        pLeft.setLayout(new FlowLayout());

        JButton b1 = new JButton("按钮1");
        JButton b2 = new JButton("按钮2");
        JButton b3 = new JButton("按钮3");

        pLeft.add(b1);
        pLeft.add(b2);
        pLeft.add(b3);

        JPanel pRight = new JPanel();
        JButton b4 = new JButton("按钮4");
        JButton b5 = new JButton("按钮5");
        JButton b6 = new JButton("按钮6");

        pRight.add(b4);
        pRight.add(b5);
        pRight.add(b6);

        pRight.setBackground(Color.BLUE);
        pRight.setBounds(10, 150, 300, 60);

        // 创建一个水平JSplitPane，左边是p1,右边是p2
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pLeft, pRight);
        // 设置分割条的位置
        sp.setDividerLocation(100);

        // 把sp当作ContentPane
        f.setContentPane(sp);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
