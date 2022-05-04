package GUI.Event;

import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent {
    public static void main(String[] args) {

        final JFrame f = new JFrame("IDEA");
        f.setSize(1000, 600);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        final JLabel l = new JLabel();
        ImageIcon i = new ImageIcon("static\\gui.png");
        l.setIcon(i);
        l.setBounds(200, 275, i.getIconWidth(), i.getIconHeight());

        f.add(l);

        l.addMouseListener(new MouseListener() {

            // 释放鼠标
            public void mouseReleased(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            // 按下鼠标
            public void mousePressed(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            // 鼠标退出
            public void mouseExited(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            // 鼠标进入
            public void mouseEntered(java.awt.event.MouseEvent e) {



            }

            // 按下释放组合动作为点击鼠标
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
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