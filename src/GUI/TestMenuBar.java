package GUI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class TestMenuBar {
    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        // 菜单栏
        JMenuBar mb = new JMenuBar();

        // 菜单
        JMenu nmFile = new JMenu("File");
        JMenu nEdit = new JMenu("Edit");
        JMenu nView = new JMenu("View");
        JMenu mNavigate = new JMenu("Navigate");
        JMenu nCode = new JMenu("Code");

        // 把菜单加入到菜单栏
        mb.add(nmFile);
        mb.add(nEdit);
        mb.add(nView);
        mb.add(mNavigate);
        mb.add(nCode);

        // 把菜单栏加入到frame，这里用的是set而非add
        f.setJMenuBar(mb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
