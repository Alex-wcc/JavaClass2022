package GUI.Menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.*;
import java.awt.*;

public class TestMenuItem {
    public static void main(String[] args) {

        JFrame f = new JFrame("IDEA");
        f.setSize(400, 400);
        f.setLocation(200, 200);

        JMenuBar mb = new JMenuBar();

        // 菜单
        JMenu nmFile = new JMenu("File");
        JMenu nEdit = new JMenu("Edit");
        JMenu nView = new JMenu("View");
        JMenu mNavigate = new JMenu("Navigate");
        JMenu nCode = new JMenu("Code");


        // 菜单项
        nmFile.add(new JMenuItem("New"));
        nmFile.add(new JMenuItem("Open"));
        nmFile.add(new JMenuItem("Open Recent"));
        nmFile.add(new JCheckBoxMenuItem("chxMenuItem",true));

        // 分隔符
        nmFile.addSeparator();
        nmFile.add(new JMenuItem("Settings"));

        // 把菜单加入到菜单栏
        mb.add(nmFile);
        mb.add(nEdit);
        mb.add(nView);
        mb.add(mNavigate);
        mb.add(nCode);


        f.setJMenuBar(mb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}