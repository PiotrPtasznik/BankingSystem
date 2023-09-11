package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AccountStatement extends JFrame implements ActionListener {
    JButton backBtn;
    JLabel label1, label2, label3, label4;

    String pin;
    AccountStatement(String pin){
        this.pin = pin;

        getContentPane().setBackground(Color.WHITE);
        setSize(400,600);
        setLocation(900,20);

        label1 = new JLabel();
        label1.setBounds(20, 140, 400, 200);
        add(label1);

        label2 = new JLabel("Online Banking");
        label2.setBounds(150, 20, 100, 20);
        add(label2);

        label3 = new JLabel();
        label3.setBounds(20, 80, 300, 20);
        add(label3);

        label4 = new JLabel();
        label4.setBounds(20, 400, 300, 20);
        add(label4);


        /////////////////////////////////////

        //        DODAĆ SCROLLOWANIE   !!!     //

        ///////////////////////////////////

        try{
            Connector connector = new Connector();
            ResultSet rs = connector.s.executeQuery("select * from login where pinnumber = '"+pin+"'");
            while(rs.next()){
                label3.setText("Card Number:    " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            int balance = 0;
            Connector connector  = new Connector();
            ResultSet rs = connector.s.executeQuery("SELECT * FROM bank where pin = '"+pin+"'");
            while(rs.next()){
                label1.setText(label1.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            label4.setText("Your total Balance is "+balance +" $");
        }catch(Exception e){
            e.printStackTrace();
        }

        setLayout(null);
        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Calibri", Font.BOLD, 18));
        backBtn.setBounds(20, 500, 100, 40);
        backBtn.addActionListener(this);
        add(backBtn);

    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pin).setVisible(true);
    }

    public static void main(String[] args){
        new AccountStatement("").setVisible(true);
    }

}


