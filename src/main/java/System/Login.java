package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup;
    JTextField cardTextField, pinTextField;

    JLabel label, text, cardNum, pin;

    Login(){
        setTitle("Login window");

        setLayout(null);

        ImageIcon imgIc = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image imgIc2 = imgIc.getImage().getScaledInstance(100, 100 , Image.SCALE_DEFAULT);
        ImageIcon imgIc3 = new ImageIcon(imgIc2);

        label = new JLabel(imgIc3);
        label.setBounds(70,10, 100, 120);
        add(label);

        text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Calibri",Font.BOLD, 40));
        text.setBounds(260, 60, 400, 40);
        add(text);

        cardNum = new JLabel("Card Num :");
        cardNum.setFont(new Font("Calibri",Font.BOLD, 30));
        cardNum.setBounds(100, 180, 400, 40);
        add(cardNum);

        cardTextField = new JTextField();
        cardTextField.setBounds(280, 180, 250, 30);
        add(cardTextField);

        pin = new JLabel("PIN :");
        pin.setFont(new Font("Calibri",Font.BOLD, 30));
        pin.setBounds(100, 250, 400, 40);
        add(pin);

        pinTextField = new JTextField();
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


        getContentPane().setBackground(Color.white);

        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
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
            String query = "select from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
            try {
                ResultSet rs = connector.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    //banking operations
                    System.out.println("jests w bankomacie");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect cadnumber or pin values");
                }
            }
            catch (Exception e){
                System.out.println(e);
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

