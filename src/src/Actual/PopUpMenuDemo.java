package Actual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by HACKER on 07/08/2017.
 * || == && != +
 */
public class PopUpMenuDemo extends JFrame {


    private static JPopupMenu popupMenu;
    private static JMenuItem helpMenuItem;
    private static JMenuItem aboutMenuItem;
    private static JMenuItem exitMenuItem;

    public PopUpMenuDemo() {
        setSize(700, 700);
        setResizable(false);
        setTitle("Hello Swing");
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        popupMenu = new JPopupMenu();
        helpMenuItem = new JMenuItem("Help Menu Item");
        aboutMenuItem = new JMenuItem("About this App menu Item");
        exitMenuItem = new JMenuItem("Exit Now Menu Item");

        popupMenu.add(helpMenuItem);
        popupMenu.add(aboutMenuItem);
        popupMenu.add(exitMenuItem);

        this.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()){
                    popupMenu.show(e.getComponent(),getX(),getY());
                }
            }

            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()){
                    popupMenu.show(e.getComponent(),getX(),getY());
                }
            }
        });

        repaint();
        setVisible(true);
    }

    public static void main(String[] args) {
        new PopUpMenuDemo();
    }

}

