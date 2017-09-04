package preshow;

import javax.swing.*;
import java.awt.*;

/**
 * Created by HACKER on 07/08/2017.
 * Operators|| == && != +
 */
public class JListDemo extends JFrame {

    private static JList<String> stringJList;
    private static JScrollPane scrollPane;

    public JListDemo(){
        setSize(700,700);
        setResizable(false);
        setTitle("Hello Swing");
        setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        scrollPane = new JScrollPane();
        String[] countries = {"South Africa","Madagasca","Libya","Nigeria","Kenya","South Africa","Madagasca","Libya","Nigeria","Kenya"};
        stringJList = new JList<>(countries);

        scrollPane.getViewport().add(stringJList);
        scrollPane.setBounds(20,20,400,100);

        add(scrollPane);

        repaint();
        setVisible(true);
    }

    public static void main(String[]args){ new JListDemo();}
}
