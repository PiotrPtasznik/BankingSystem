package System;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

class CheckBalance extends JFrame implements ActionListener {
    JButton backBtn;
    JLabel label1, label2;
    String pin;

    CheckBalance(String pin) {
        this.pin = pin;
        setLayout(null);
        int balance = 0;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(900, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 800);
        add(image);

        label1 = new JLabel();
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Calibri", Font.BOLD, 24));
        label1.setBounds(160, 300, 400, 35);
        label1.setText("Your Current Account Balance is :");
        image.add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Calibri", Font.BOLD, 24));
        label2.setBounds(310, 350, 400, 35);
        image.add(label2);

        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Calibri", Font.BOLD, 18));
        backBtn.setBounds(120,400,180,40);
        backBtn.addActionListener(this);
        image.add(backBtn);

        try{
            Connector connector = new Connector();
            ResultSet rs = connector.s.executeQuery("select * from bank where pin = '"+pin+"'");
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        label2.setText(balance+" $");

        setSize(900, 800);
        setUndecorated(true);
        setLocation(900,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pin).setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBalance("").setVisible(true);
    }
}
