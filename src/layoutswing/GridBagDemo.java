/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutswing;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author nguyenhung
 */
public class GridBagDemo {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Gridbag");
        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 20;
        mainFrame.add(btn1, gbc);
        
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
