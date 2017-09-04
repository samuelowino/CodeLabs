package preshow;

import javax.swing.*;
import java.awt.*;

/**
 * Created by HACKER on 07/08/2017.
 * Operators|| == && != +
 */
public class JComboBoxDemo extends JFrame{

    private static JComboBox<String> companiesComboBox;

    public JComboBoxDemo(){
        setSize(700,700);
        setResizable(false);
        setTitle("Hello Swing");
        setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        String[] companiesList = {"Forbes","OLX","Google","Ampath"};
        companiesComboBox = new JComboBox<>(companiesList);
        companiesComboBox.setBounds(20,20,400,50);

        //capture user selection
        companiesComboBox.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"You selection "+companiesComboBox.getSelectedItem().toString());
        });
        add(companiesComboBox);
        repaint();
        setVisible(true);
    }

    public static void main(String[]args){
        new JComboBoxDemo();
    }

}
