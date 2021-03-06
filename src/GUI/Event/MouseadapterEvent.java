package GUI.Event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseadapterEvent {
    public static void main(String[] args) {

        final JFrame f = new JFrame("LoL");
        f.setSize(1000, 600);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        final JLabel l = new JLabel("");

        ImageIcon i = new ImageIcon("static\\gui.png");
        l.setIcon(i);
        l.setBounds(200, 275, i.getIconWidth(), i.getIconHeight());

        f.add(l);

        // MouseAdapter 适配器，只需要重写用到的方法，没有用到的就不用写了
        l.addMouseListener(new MouseAdapter() {

            // 只有mouseEntered用到了
            public void mouseEntered(MouseEvent e) {

                Random r = new Random();

                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());

                l.setLocation(x, y);

            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}