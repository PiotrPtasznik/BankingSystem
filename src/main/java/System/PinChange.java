package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    JPasswordField changePinTextField1, changePinTextField2;
    JButton changeBtn, backBtn;
    JLabel l1,l2,l3,image;
    String pin;
    PinChange(String pin){
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(900, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        image = new JLabel(i3);
        image.setBounds(0, 0, 900, 800);
        add(image);

        l1 = new JLabel("Change your pin");
        l1.setFont(new Font("Calibri", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        l1.setBounds(240,230,800,35);
        image.add(l1);

        l2 = new JLabel("New PIN:");
        l2.setFont(new Font("Calibri", Font.BOLD, 18));
        l2.setForeground(Color.WHITE);
        l2.setBounds(140,290,150,35);
        image.add(l2);

        l3 = new JLabel("Re-Enter New PIN:");
        l3.setFont(new Font("Calibri", Font.BOLD, 18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(140,340,200,35);
        image.add(l3);

        changePinTextField1 = new JPasswordField();
        changePinTextField1.setFont(new Font("Calibri", Font.BOLD, 18));
        changePinTextField1.setBounds(340,290,180,25);
        image.add(changePinTextField1);

        changePinTextField2 = new JPasswordField();
        changePinTextField2.setFont(new Font("Calibri", Font.BOLD, 18));
        changePinTextField2.setBounds(340,340,180,25);
        image.add(changePinTextField2);

        changeBtn = new JButton("Change");
        changeBtn.setBounds(340,400,180,40);
        changeBtn.addActionListener(this);
        image.add(changeBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(120,400,180,40);
        backBtn.addActionListener(this);
        image.add(backBtn);


        setSize(900,800);
        setLocation(900,20);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            String npin = changePinTextField1.getText();
            String rpin = changePinTextField2.getText();

            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }

            if(ae.getSource()== changeBtn){
                if (changePinTextField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (changePinTextField2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }

                Connector connector = new Connector();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q2 = "update login set pinnumber = '"+rpin+"' where pinnumber = '"+pin+"' ";
                String q3 = "update signup3 set pin = '"+rpin+"' where pin = '"+pin+"' ";

                connector.s.executeUpdate(q1);
                connector.s.executeUpdate(q2);
                connector.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);

            }else if(ae.getSource()== backBtn){
                new Transactions(pin).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main (String[] args){
        new PinChange("").setVisible(true);
    }
}
