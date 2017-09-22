/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainThread;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import swingtutorial.LoginForm;

/**
 *
 * @author nguyenhung
 */
public class Mainthread {
    public static void main(String[] args) {
        LoginForm loginform = new LoginForm();
        loginform.setVisible(true);

//        JFrame frame = new JFrame();
//        frame.setSize(500,300);
////        frame.setLayout(null);
//        
//        JPanel panel = new JPanel();
//        panel.setSize(400,200);
//        panel.setBackground(Color.MAGENTA);
//        
//        JScrollPane scrollPane = new JScrollPane(panel);
//        scrollPane.setLocation(5, 5);
//        
//        panel.setPreferredSize(new Dimension(500,300));
//        panel.revalidate();
//        frame.add(scrollPane);
//        
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
    }
}
