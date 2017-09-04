package Actual;

import javax.swing.*;
import java.awt.*;

/**
 * Created by HACKER on 07/08/2017.
 */
public class TooltipDemo extends JFrame {

    private static JButton button;

    public TooltipDemo(){
        setSize(700,700);
        setResizable(false);
        setTitle("Hello Swing");
        setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        button = new JButton("Hover over me to see tooltip");
        button.setToolTipText("You are seing a tooltip text");
        button.setBounds(20,20,400,50);

        add(button);

        repaint();
        setVisible(true);
    }

    public static  void main(String[]args){
        new Window();
    }

}
