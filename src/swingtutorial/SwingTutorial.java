/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author nguyenhung
 */
public class SwingTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Không cho vào Jpanel
        // TODO code application logic here
//        JFrame formLogin = new JFrame("hello"); // container
//        formLogin.setSize(700, 400);
//        formLogin.setLocationRelativeTo(null);
//        formLogin.setLayout(null);
//
//        JPanel loginPanel = new JPanel();
//        loginPanel.setSize(600, 600);
//        loginPanel.setBackground(Color.MAGENTA);
//        loginPanel.setBounds(0, 0, 800, 800);
//
//        JLabel lblId = new JLabel("ID Student: ");
//        lblId.setBounds(90, 20, 80, 40);
//        JLabel lblName = new JLabel("Name: ");
//        lblName.setBounds(90, 65, 80, 40);
//        JLabel lblEmail = new JLabel("Email: ");
//        lblEmail.setBounds(90, 110, 80, 40);
//        JLabel lblPhone = new JLabel("Phone: ");
//        lblPhone.setBounds(90, 155, 80, 40);
//        JLabel lblRollnumber = new JLabel("Rollnumber: ");
//        lblRollnumber.setBounds(90, 200, 80, 40);
//        JLabel lblClassname = new JLabel("Classname: ");
//        lblClassname.setBounds(90, 245, 80, 40);
//
//        JTextField txtId = new JTextField();
//        txtId.setBounds(205, 20, 300, 40);
//        JPasswordField txtName = new JPasswordField();
//        txtName.setBounds(205, 65, 300, 40);
//        JPasswordField txtPhone = new JPasswordField();
//        txtPhone.setBounds(205, 110, 300, 40);
//        JPasswordField txtEmail = new JPasswordField();
//        txtEmail.setBounds(205, 155, 300, 40);
//        JPasswordField txtRollnumber = new JPasswordField();
//        txtRollnumber.setBounds(205, 200, 300, 40);
//        JPasswordField txtClassname = new JPasswordField();
//        txtClassname.setBounds(205, 245, 300, 40);
//
//        JButton btnLogin = new JButton();
//        btnLogin.setText("Login");
//        btnLogin.setBounds(220, 300, 130, 40);
//        JButton btnQuenpass = new JButton();
//        btnQuenpass.setText("Quên pass");
//        btnQuenpass.setBounds(360, 300, 130, 40);
//
//        formLogin.add(txtId);
//        formLogin.add(txtName);
//        formLogin.add(txtEmail);
//        formLogin.add(txtPhone);
//        formLogin.add(txtRollnumber);
//        formLogin.add(txtClassname);
//
//        formLogin.add(lblId);
//        formLogin.add(lblName);
//        formLogin.add(lblEmail);
//        formLogin.add(lblPhone);
//        formLogin.add(lblRollnumber);
//        formLogin.add(lblClassname);
//        formLogin.add(btnLogin);
//        formLogin.add(btnQuenpass);
//        formLogin.add(loginPanel);
//
//        formLogin.setVisible(true);
//        formLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//      Cho vào Jpanel
        JFrame formLogin = new JFrame("muhahahaha");
        formLogin.setSize(700, 400);
        formLogin.setLocationRelativeTo(null);
        formLogin.setLayout(null);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.CYAN);
        jPanel.setBounds(0, 0, 800, 800);

        JLabel lblId = new JLabel("ID Student");
        lblId.setBounds(90, 20, 80, 40);
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(90, 65, 80, 40);
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(90, 110, 80, 40);
        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setBounds(90, 155, 80, 40);
        JLabel lblRollnumber = new JLabel("RollNumber");
        lblRollnumber.setBounds(90, 200, 80, 40);
        JLabel lblClassname = new JLabel("ClassName");
        lblClassname.setBounds(90, 245, 80, 40);

        JTextField txtId = new JTextField();
        txtId.setBounds(205, 20, 300, 40);
        JTextField txtName = new JTextField();
        txtName.setBounds(205, 65, 300, 40);
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(205, 110, 300, 40);
        JTextField txtPhone = new JTextField();
        txtPhone.setBounds(205, 155, 300, 40);
        JTextField txtRollNumber = new JTextField();
        txtRollNumber.setBounds(205, 200, 300, 40);
        JTextField txtClassName = new JTextField();
        txtClassName.setBounds(205, 245, 300, 40);

        JButton btnLogin = new JButton();
        btnLogin.setText("Login");
        btnLogin.setBounds(220, 300, 130, 40);
        btnLogin.setBackground(Color.red);
        JButton btnQuenpass = new JButton();
        btnQuenpass.setText("Quên pass");
        btnQuenpass.setBounds(360, 300, 130, 40);

        jPanel.add(lblId);
        jPanel.add(lblName);
        jPanel.add(lblEmail);
        jPanel.add(lblPhone);
        jPanel.add(lblRollnumber);
        jPanel.add(lblClassname);
        jPanel.add(txtId);
        jPanel.add(txtName);
        jPanel.add(txtEmail);
        jPanel.add(txtPhone);
        jPanel.add(txtClassName);
        jPanel.add(txtRollNumber);
        jPanel.add(btnLogin);
        jPanel.add(btnQuenpass);
        formLogin.add(jPanel);

        jPanel.setLayout(null);
        formLogin.setVisible(true);
        formLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
