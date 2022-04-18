package GUI.Component;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class TestCheckBox {
    public static void main(String[] args) {

        JFrame f = new JFrame("Java工具");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);
            JCheckBox bCheckBox = new JCheckBox("IDEA");
        //设置 为 默认被选中
        bCheckBox.setSelected(true);
        bCheckBox.setBounds(50, 50, 130, 30);
        JCheckBox bCheckBox2 = new JCheckBox("Eclipse");
        bCheckBox2.setBounds(50, 100, 130, 30);
        //判断 是否 被 选中
        System.out.println(bCheckBox2.isSelected());

        f.add(bCheckBox);
        f.add(bCheckBox2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
