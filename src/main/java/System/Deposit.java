package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    JLabel label1;
    JTextField amount;
    JButton backBtn, depositBtn;
    String pinnnumber;

    Deposit(String pinnumber){
        this.pinnnumber = pinnumber;

        ImageIcon imgIc1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
        Image imgIc2 = imgIc1.getImage().getScaledInstance(900,800, Image.SCALE_DEFAULT);
        ImageIcon imgIc3 = new ImageIcon(imgIc2);
        JLabel image = new JLabel(imgIc3);
        image.setBounds(0,0,900,800 );
        add(image);

        label1 = new JLabel("ENTER AMOUNT :");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Calibri", Font.BOLD, 40));
        label1.setBounds(120,280, 400, 60);
        image.add(label1);

        amount = new JTextField();
        amount.setFont(new Font("Calibri", Font.BOLD, 18));
        amount.setBounds(120,340,400,40);
        image.add(amount);

        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Calibri", Font.BOLD, 18));
        backBtn.setForeground(Color.black);
        backBtn.setBounds(120,400,180,40);
        backBtn.addActionListener(this);
        image.add(backBtn);

        depositBtn = new JButton("Deposit");
        depositBtn.setFont(new Font("Calibri", Font.BOLD, 18));
        depositBtn.setForeground(Color.black);
        depositBtn.setBounds(340,400,180,40);
        depositBtn.addActionListener(this);
        image.add(depositBtn);

        setTitle("ATM");
        setSize(900,800);
        setLocation(900,20);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == depositBtn){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Enter the amount you want to deposit");
            }
            else {
                try {
                    Connector connector = new Connector();
                    String query = "Insert into bank values('"+pinnnumber+"', '"+date+"', 'Deposit', '"+number+"')";
                    connector.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, number + " $ Deposited Successfully");
                    setVisible(false);
                    new Transactions(pinnnumber).setVisible(true);
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }

        if(e.getSource() == backBtn){
            setVisible(false);
            new Transactions(pinnnumber).setVisible(true);
        }
    }

    public static void main (String[] args){
        new Deposit("");
    }
}
