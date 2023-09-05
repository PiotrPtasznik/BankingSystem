package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener {
    JTextField amount;
    JButton withdrawBtn, backBtn;
    JLabel label1, label2;
    String pin;
    Withdraw(String pin){
        this.pin = pin;

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
        Image i2 = i.getImage().getScaledInstance(900,800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);

        label1 = new JLabel("The maximum withdraw amount is 10.000$");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Calibri", Font.BOLD, 18));
        label1.setBounds(120,250,400,20);
        image.add(label1);

        label2 = new JLabel("Enter the amount you want to withdraw");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Calibri", Font.BOLD, 18));
        label2.setBounds(120,300,400,20);
        image.add(label2);

        amount = new JTextField();
        amount.setFont(new Font("Calibri", Font.BOLD, 25));
        amount.setBounds(120,350,330,30);
        image.add(amount);

        withdrawBtn = new JButton("Withdraw");
        withdrawBtn.setFont(new Font("Calibri", Font.BOLD, 18));
        withdrawBtn.setBounds(340,400,180,40);
        withdrawBtn.addActionListener(this);
        image.add(withdrawBtn);

        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Calibri", Font.BOLD, 18));
        backBtn.setBounds(120,400,180,40);
        backBtn.addActionListener(this);
        image.add(backBtn);

        image.setBounds(0,0,900,800);
        add(image);

        setLayout(null);
        setSize(900,800);
        setLocation(900,20);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            String quantity = amount.getText();
            Date date = new Date();
            if(ae.getSource()==withdrawBtn){
                if(amount.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                }else{
                    Connector connector = new Connector();
                    ResultSet rs = connector.s.executeQuery("select * from bank where pin = '"+pin+"'");
                    int balance = 0;
                    while(rs.next()){
                        if(rs.getString("type").equals("Deposit")){
                            balance += Integer.parseInt(rs.getString("amount"));
                        }else{
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    if(balance < Integer.parseInt(quantity)){
                        JOptionPane.showMessageDialog(null, "You dont have enough funds");
                        return;
                    }
                    connector.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdraw', '"+quantity+"')");
                    JOptionPane.showMessageDialog(null, quantity + " $ Withdrawn Successfully");

                }
            }else if(ae.getSource()==backBtn){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error: "+e);
        }

    }

    public static void main(String[] args){
        new Withdraw("").setVisible(true);
    }

}

