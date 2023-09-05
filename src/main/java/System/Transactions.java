package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {

    JLabel image, label1;
    JButton deposit, withdraw, balance, statement, transfer, pinChange, exit;

    String pinnumber;

    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);


        ImageIcon imgIc = new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
        Image imgIc2 = imgIc.getImage().getScaledInstance(900, 800 , Image.SCALE_DEFAULT);
        ImageIcon imgIc3 = new ImageIcon(imgIc2);

        image = new JLabel(imgIc3);
        image.setBounds(0,0, 900, 800);
        add(image);

        label1 = new JLabel("SELECT TRANSACTION");
        label1.setBounds(140,235, 400, 60);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Calibri", Font.BOLD, 40));
        image.add(label1);

        deposit = new JButton("Deposit");
        deposit.setBounds(120,300, 180, 40);
        deposit.setForeground(Color.black);
        deposit.setFont(new Font("Calibri", Font.BOLD, 18));
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(120,350, 180, 40);
        withdraw.setForeground(Color.black);
        withdraw.setFont(new Font("Calibri", Font.BOLD, 18));
        withdraw.addActionListener(this);
        image.add(withdraw);

        balance = new JButton("Check balance");
        balance.setBounds(120,400, 180, 40);
        balance.setForeground(Color.black);
        balance.setFont(new Font("Calibri", Font.BOLD, 18));
        balance.addActionListener(this);
        image.add(balance);

        transfer = new JButton("Transfer");
        transfer.setBounds(348,300, 180, 40);
        transfer.setForeground(Color.black);
        transfer.setFont(new Font("Calibri", Font.BOLD, 18));
        transfer.addActionListener(this);
        image.add(transfer);

        pinChange = new JButton("PIN change");
        pinChange.setBounds(348,350, 180, 40);
        pinChange.setForeground(Color.black);
        pinChange.setFont(new Font("Calibri", Font.BOLD, 18));
        pinChange.addActionListener(this);
        image.add(pinChange);

        statement = new JButton("Account statement");
        statement.setBounds(348,400, 180, 40);
        statement.setForeground(Color.black);
        statement.setFont(new Font("Calibri", Font.BOLD, 18));
        statement.addActionListener(this);
        image.add(statement);

        exit = new JButton("Exit");
        exit.setBounds(348,450, 180, 40);
        exit.setForeground(Color.black);
        exit.setFont(new Font("Calibri", Font.BOLD, 18));
        exit.addActionListener(this);
        image.add(exit);

        setTitle("ATM");
        setSize(900, 800);
        setLocation(900,20);
        getContentPane().setBackground(Color.white);
        setUndecorated(true);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit){
            System.exit(0);
        }
        if(e.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        if(e.getSource() == withdraw){
            setVisible(false);
            new Withdraw(pinnumber).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Transactions("");
    }
}
