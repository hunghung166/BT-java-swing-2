/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author nguyenhung
 */
public class LoginForm extends JFrame {

    private JLabel lblId;
    private JLabel lblName;
    private JTextField txtId;
    private JTextField txtName;
    private JButton btnLogin;
    private JButton btnReset;
    private JLabel lblPhone;
    private JLabel lblBirthday;
    private JLabel lblEmail;
    private JLabel lblRollnumber;
    private JLabel lblClassname;
    private JTextField txtEmail;
    private JTextField txtRollnumber;
    private JTextField txtClassname;
    private final JFormattedTextField txfPhone;
    private final JFormattedTextField txfBirthday;

    public LoginForm() {
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);

//        khởi tạo các component con
        this.lblId = new JLabel("ID");
        this.lblName = new JLabel("Name");
        this.lblEmail = new JLabel("Email");
        this.lblPhone = new JLabel("Phone");
        this.lblBirthday = new JLabel("Birthday");
        this.lblRollnumber = new JLabel("Rollnumber");
        this.lblClassname = new JLabel("Classname");

        this.txtId = new JTextField();
        this.txtName = new JTextField();
        this.txtEmail = new JTextField();
        this.txtRollnumber = new JTextField();
        this.txtClassname = new JTextField();

//        NumberFormat numberFormat;
//        JFormattedTextField txfPhone;
//        numberFormat = NumberFormat.getNumberInstance();
//        this.txfPhone = new JFormattedTextField(numberFormat);
//
//        DateFormat dateFormat;
//        JFormattedTextField txfBirthday;
//        dateFormat = DateFormat.getDateInstance();
//        this.txfBirthday = new JFormattedTextField(dateFormat);

        JFormattedTextField txfBirthday;
        MaskFormatter formatter1 = null;
        try {
            formatter1 = new MaskFormatter("##/##/####");
        } catch (Exception e) {
            System.err.println("Hãy nhập đúng định dạng" + e.getMessage());
            System.exit(0);
        }
        this.txfBirthday = new JFormattedTextField(formatter1);

        JFormattedTextField txfPhone;
        MaskFormatter formatter2 = null;
        try {
            formatter2 = new MaskFormatter("+84 ### ### ###");
        } catch (ParseException e) {
            System.err.println("Hãy nhập đúng định dạng" + e.getMessage());
            System.exit(0);
        }
        this.txfPhone = new JFormattedTextField(formatter2);

        this.btnLogin = new JButton("Login");
        this.btnReset = new JButton("Reset");

//        Định vị toạ độ cho các component
        this.lblId.setBounds(90, 20, 80, 40);
        this.lblName.setBounds(90, 65, 80, 40);
        this.lblEmail.setBounds(90, 110, 80, 40);
        this.lblPhone.setBounds(90, 155, 80, 40);
        this.lblBirthday.setBounds(90, 200, 80, 40);
        this.lblRollnumber.setBounds(90, 245, 80, 40);
        this.lblClassname.setBounds(90, 290, 80, 40);

        this.txtId.setBounds(205, 20, 300, 40);
        this.txtName.setBounds(205, 65, 300, 40);
        this.txtEmail.setBounds(205, 110, 300, 40);
        this.txfPhone.setBounds(205, 155, 300, 40);
        this.txfBirthday.setBounds(205, 200, 300, 40);
        this.txtRollnumber.setBounds(205, 245, 300, 40);
        this.txtClassname.setBounds(205, 290, 300, 40);

        this.btnLogin.setBounds(220, 345, 130, 40);
        this.btnReset.setBounds(360, 345, 130, 40);

//        xử lý sự kiện
        this.btnLogin.addActionListener(new LoginHandle());
        this.btnReset.addActionListener(new ResetHandle());

//        Thêm component vào container
        this.add(this.lblId);
        this.add(this.lblName);
        this.add(this.lblEmail);
        this.add(this.lblPhone);
        this.add(this.lblBirthday);
        this.add(this.lblRollnumber);
        this.add(this.lblClassname);

        this.add(this.txtId);
        this.add(this.txtName);
        this.add(this.txtEmail);
        this.add(this.txfPhone);
        this.add(this.txfBirthday);
        this.add(this.txtRollnumber);
        this.add(this.txtClassname);

        this.add(this.btnLogin);
        this.add(this.btnReset);

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class LoginHandle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Bạn có chắc chắn nhập vào thông tin : " + "\n" + txtId.getText() + "\n" + txtName.getText() + "\n" + txtEmail.getText() + "\n" + txfPhone.getText() + "\n" + txfBirthday.getText() + "\n" + txtRollnumber.getText() + "\n" + txtClassname.getText());
        }

    }

    class ResetHandle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Thành công");
            txtId.setText("");
            txtName.setText("");
            txtEmail.setText("");
            txfPhone.setText("");
            txfBirthday.setText("");
            txtRollnumber.setText("");
            txtClassname.setText("");
        }

    }

}
