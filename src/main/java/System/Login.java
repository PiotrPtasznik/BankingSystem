package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup;
    JTextField cardTextField, pinTextField;
    JLabel label1, label2, label3, label4;

    Login(){

        ImageIcon imgIc = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image imgIc2 = imgIc.getImage().getScaledInstance(100, 100 , Image.SCALE_DEFAULT);
        ImageIcon imgIc3 = new ImageIcon(imgIc2);

        label1 = new JLabel(imgIc3);
        label1.setBounds(70,10, 100, 120);
        add(label1);

        label2 = new JLabel("Welcome to ATM");
        label2.setFont(new Font("Calibri",Font.BOLD, 40));
        label2.setBounds(260, 60, 400, 40);
        add(label2);

        label3 = new JLabel("Card Num :");
        label3.setFont(new Font("Calibri",Font.BOLD, 30));
        label3.setBounds(100, 180, 400, 40);
        add(label3);

        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        cardTextField.setBounds(280, 180, 250, 30);
        add(cardTextField);

        label4 = new JLabel("PIN :");
        label4.setFont(new Font("Calibri",Font.BOLD, 30));
        label4.setBounds(100, 250, 400, 40);
        add(label4);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        pinTextField.setBounds(280, 250, 250, 30);
        add(pinTextField);

        login = new JButton("Log in");
        login.setBounds(280, 300, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(410, 300, 120, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("Sign up");
        signup.setBounds(280, 350, 250, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);


        setTitle("Login window");
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setSize(800,480);
        setLocation(350,200);
        setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else  if (ae.getSource() == login){
            Connector connector = new Connector();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
            try {
                ResultSet rs = connector.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect cardnumber or pin ");
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        else  if (ae.getSource() == signup){
            setVisible(false);
            new Signup1().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

