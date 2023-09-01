package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup3 extends JFrame implements ActionListener {
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
    JCheckBox serviceCBox1, serviceCBox2,serviceCBox3,serviceCBox4,serviceCBox5,serviceCBox6, serviceCBox7;
    JButton submitBtn, cancelBtn;
    JRadioButton radioBtn1, radioBtn2, radioBtn3, radioBtn4;
    String formNum;

    Signup3(String formNum){
        setLayout(null);
        this.formNum = formNum;

        label1 = new JLabel("Page 3: Account Details");
        label1.setFont(new Font("Raleway", Font.BOLD, 22));
        label1.setBounds(280,40,400,40);
        add(label1);

        label2 = new JLabel("Account Type:");
        label2.setFont(new Font("Raleway", Font.BOLD, 18));
        label2.setBounds(100,140,200,30);
        add(label2);

        label3 = new JLabel("Card Number:");
        label3.setFont(new Font("Raleway", Font.BOLD, 18));
        label3.setBounds(100,300,200,30);
        add(label3);

        label4 = new JLabel("XXXX-XXXX-XXXX-XXXX");
        label4.setFont(new Font("Raleway", Font.BOLD, 18));
        label4.setBounds(330,300,250,30);
        add(label4);

        label5 = new JLabel("(Your 16-digit Card number)");
        label5.setFont(new Font("Raleway", Font.BOLD, 12));
        label5.setBounds(100,330,200,20);
        add(label5);

        label6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        label6.setFont(new Font("Raleway", Font.BOLD, 12));
        label6.setBounds(330,330,500,20);
        add(label6);

        label7 = new JLabel("PIN:");
        label7.setFont(new Font("Raleway", Font.BOLD, 18));
        label7.setBounds(100,370,200,30);
        add(label7);

        label8 = new JLabel("XXXX");
        label8.setFont(new Font("Raleway", Font.BOLD, 18));
        label8.setBounds(330,370,200,30);
        add(label8);

        label9 = new JLabel("(4-digit password)");
        label9.setFont(new Font("Raleway", Font.BOLD, 12));
        label9.setBounds(100,400,200,20);
        add(label9);

        label10 = new JLabel("Services Required:");
        label10.setFont(new Font("Raleway", Font.BOLD, 18));
        label10.setBounds(100,450,200,30);
        add(label10);


        submitBtn = new JButton("Submit");
        submitBtn.setFont(new Font("Raleway", Font.BOLD, 14));
        submitBtn.setBackground(Color.BLACK);
        submitBtn.setForeground(Color.WHITE);
        submitBtn.setBounds(250,720,100,30);
        submitBtn.addActionListener(this);
        add(submitBtn);

        cancelBtn = new JButton("Cancel");
        cancelBtn.setFont(new Font("Raleway", Font.BOLD, 14));
        cancelBtn.setBackground(Color.BLACK);
        cancelBtn.setForeground(Color.WHITE);
        cancelBtn.setBounds(420,720,100,30);
        cancelBtn.addActionListener(this);
        add(cancelBtn);



        serviceCBox1 = new JCheckBox("ATM CARD");
        serviceCBox1.setBackground(Color.WHITE);
        serviceCBox1.setFont(new Font("Raleway", Font.BOLD, 16));
        serviceCBox1.setBounds(100,450,200,30);
        add(serviceCBox1);

        serviceCBox2 = new JCheckBox("Internet Banking");
        serviceCBox2.setBackground(Color.WHITE);
        serviceCBox2.setFont(new Font("Raleway", Font.BOLD, 16));
        serviceCBox2.setBounds(100,500,200,30);
        add(serviceCBox2);

        serviceCBox3 = new JCheckBox("Mobile Banking");
        serviceCBox3.setBackground(Color.WHITE);
        serviceCBox3.setFont(new Font("Raleway", Font.BOLD, 16));
        serviceCBox3.setBounds(350,500,200,30);
        add(serviceCBox3);

        serviceCBox4 = new JCheckBox("EMAIL Alerts");
        serviceCBox4.setBackground(Color.WHITE);
        serviceCBox4.setFont(new Font("Raleway", Font.BOLD, 16));
        serviceCBox4.setBounds(100,550,200,30);
        add(serviceCBox4);

        serviceCBox5 = new JCheckBox("Cheque Book");
        serviceCBox5.setBackground(Color.WHITE);
        serviceCBox5.setFont(new Font("Raleway", Font.BOLD, 16));
        serviceCBox5.setBounds(350,550,200,30);
        add(serviceCBox5);

        serviceCBox6 = new JCheckBox("E-Statement");
        serviceCBox6.setBackground(Color.WHITE);
        serviceCBox6.setFont(new Font("Raleway", Font.BOLD, 16));
        serviceCBox6.setBounds(350,450,200,30);
        add(serviceCBox6);

        serviceCBox7 = new JCheckBox("I allow processing my personal data.",true);
        serviceCBox7.setBackground(Color.WHITE);
        serviceCBox7.setFont(new Font("Raleway", Font.BOLD, 12));
        serviceCBox7.setBounds(100,680,600,20);
        add(serviceCBox7);


        radioBtn1 = new JRadioButton("Saving Account");
        radioBtn1.setFont(new Font("Raleway", Font.BOLD, 16));
        radioBtn1.setBackground(Color.WHITE);
        radioBtn1.setBounds(100,180,150,30);
        add(radioBtn1);

        radioBtn2 = new JRadioButton("Fixed Deposit Account");
        radioBtn2.setFont(new Font("Raleway", Font.BOLD, 16));
        radioBtn2.setBackground(Color.WHITE);
        radioBtn2.setBounds(350,180,300,30);
        add(radioBtn2);

        radioBtn3 = new JRadioButton("Current Account");
        radioBtn3.setFont(new Font("Raleway", Font.BOLD, 16));
        radioBtn3.setBackground(Color.WHITE);
        radioBtn3.setBounds(100,220,250,30);
        add(radioBtn3);

        radioBtn4 = new JRadioButton("Recurring Deposit Account");
        radioBtn4.setFont(new Font("Raleway", Font.BOLD, 16));
        radioBtn4.setBackground(Color.WHITE);
        radioBtn4.setBounds(350,220,250,30);
        add(radioBtn4);

        ButtonGroup radioBtnGroup = new ButtonGroup();
        radioBtnGroup.add(radioBtn1);
        radioBtnGroup.add(radioBtn2);
        radioBtnGroup.add(radioBtn3);
        radioBtnGroup.add(radioBtn4);


        getContentPane().setBackground(Color.WHITE);
        setSize(850,850);
        setLocation(500,120);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        {
            String accountType = null;
            if(radioBtn1.isSelected()){
                accountType = "Saving Account";
            }
            else if(radioBtn2.isSelected()){
                accountType = "Fixed Deposit Account";
            }
            else if(radioBtn3.isSelected()){
                accountType = "Current Account";
            }else if(radioBtn4.isSelected()){
                accountType = "Recurring Deposit Account";
            }

            Random ran = new Random();
            long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
            String cardNum = "" + Math.abs(first7);

            long first3 = (ran.nextLong() % 9000L) + 1000L;
            String pin = "" + Math.abs(first3);

            String service = "";
            if(serviceCBox1.isSelected()){
                service = service + " ATM Card";
            }
            if(serviceCBox2.isSelected()){
                service = service + " Internet Banking";
            }
            if(serviceCBox3.isSelected()){
                service = service + " Mobile Banking";
            }
            if(serviceCBox4.isSelected()){
                service = service + " EMAIL Alerts";
            }
            if(serviceCBox5.isSelected()){
                service = service + " Cheque Book";
            }
            if(serviceCBox6.isSelected()){
                service = service + " E-Statement";
            }

            try{
                if(e.getSource()==submitBtn){

                    if(accountType.equals("")){
                        JOptionPane.showMessageDialog(null, "Fill all the required fields");
                    }else{
                        Connector connector = new Connector();
                        String q1 = "insert into signup3 values('"+formNum+"','"+accountType+"','"+cardNum+"','"+pin+"','"+service+"')";
                        String q2 = "insert into login values('"+formNum+"', '"+cardNum+"', '"+pin+"')";
                        connector.s.executeUpdate(q1);
                        connector.s.executeUpdate(q2);
                        JOptionPane.showMessageDialog(null, "Card Number: " + cardNum + "\n Pin:"+ pin);
                    }
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        } if (e.getSource() == cancelBtn){
            System.out.println("gggggg");
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}

