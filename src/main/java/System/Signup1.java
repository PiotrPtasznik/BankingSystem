package System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Signup1 extends JFrame implements ActionListener {

    public long random;
     JTextField nameTextField, surNameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinCodeTextField ;
     JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
     JRadioButton male, female,  married, unmarried, other;
     JDateChooser dateChooser;
     JButton nextBtn;

    Signup1(){

        Random rand = new Random();
        random = Math.abs((rand.nextLong() % 9000L) + 1000L);

        label1 = new JLabel("Application form number : " + random);
        label1.setBounds(140,20,600,40);
        label1.setFont(new Font("Calibri", Font.BOLD, 38));
        add(label1);

        label2 = new JLabel("Page 1 : Personal details");
        label2.setBounds(290,60,400,30);
        label2.setFont(new Font("Calibri", Font.BOLD, 22));
        add(label2);

        label3 = new JLabel("Name");
        label3.setBounds(200,120,400,30);
        label3.setFont(new Font("Calibri", Font.BOLD, 18));
        add(label3);

        label4 = new JLabel("Surname");
        label4.setBounds(200,160,400,30);
        label4.setFont(new Font("Calibri", Font.BOLD, 18));
        add(label4);

        label5 = new JLabel("Date of birth");
        label5.setBounds(200,200,400,30);
        label5.setFont(new Font("Calibri", Font.BOLD, 18));
        add(label5);

        label6 = new JLabel("Gender");
        label6.setBounds(200,240,400,30);
        label6.setFont(new Font("Calibri", Font.BOLD, 18));
        add(label6);

        label7 = new JLabel("Email");
        label7.setBounds(200,280,400,30);
        label7.setFont(new Font("Calibri", Font.BOLD, 18));
        add(label7);

        label8 = new JLabel("Marital status");
        label8.setBounds(200,320,400,30);
        label8.setFont(new Font("Calibri", Font.BOLD, 18));
        add(label8);

        label9 = new JLabel("Address");
        label9.setBounds(200,360,400,30);
        label9.setFont(new Font("Calibri", Font.BOLD, 18));
        add(label9);

        label10 = new JLabel("City");
        label10.setBounds(200,400,400,30);
        label10.setFont(new Font("Calibri", Font.BOLD, 18));
        add(label10);

        label11 = new JLabel("State");
        label11.setBounds(200,440,400,30);
        label11.setFont(new Font("Calibri", Font.BOLD, 18));
        add(label11);

        label12 = new JLabel("PIN Code");
        label12.setBounds(200,480,400,30);
        label12.setFont(new Font("Calibri", Font.BOLD, 18));
        add(label12);

        nameTextField = new JTextField();
        nameTextField.setBounds(400,120,400,30);
        nameTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(nameTextField);

        surNameTextField = new JTextField();
        surNameTextField.setBounds(400,160,400,30);
        surNameTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(surNameTextField);

        dateChooser  = new JDateChooser();
        dateChooser.setBounds(400,200,200,30);
        dateChooser.setForeground(Color.white);
        add(dateChooser);

        male = new JRadioButton("Male");
        male.setBounds(400,240,80,30);
        male.setFont(new Font("Calibri", Font.BOLD, 18));
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(550,240,80,30);
        female.setFont(new Font("Calibri", Font.BOLD, 18));
        female.setBackground(Color.white);
        add(female);

        ButtonGroup genderBtnGroup = new ButtonGroup();
        genderBtnGroup.add(male);
        genderBtnGroup.add(female);

        emailTextField = new JTextField();
        emailTextField.setBounds(400,280,400,30);
        emailTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(emailTextField);

        married = new JRadioButton("Married");
        married.setBounds(400,320,120,30);
        married.setFont(new Font("Calibri", Font.BOLD, 18));
        married.setBackground(Color.white);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(550,320,120,30);
        unmarried.setFont(new Font("Calibri", Font.BOLD, 18));
        unmarried.setBackground(Color.white);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(700,320,120,30);
        other.setFont(new Font("Calibri", Font.BOLD, 18));
        other.setBackground(Color.white);
        add(other);

        ButtonGroup maritalBtnGroup = new ButtonGroup();
        maritalBtnGroup.add(married);
        maritalBtnGroup.add(unmarried);
        maritalBtnGroup.add(other);

        addressTextField = new JTextField();
        addressTextField.setBounds(400,360,400,30);
        addressTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(addressTextField);

        cityTextField = new JTextField();
        cityTextField.setBounds(400,400,400,30);
        cityTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(cityTextField);

        stateTextField = new JTextField();
        stateTextField.setBounds(400,440,400,30);
        stateTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(stateTextField);

        pinCodeTextField = new JTextField();
        pinCodeTextField.setBounds(400,480,400,30);
        pinCodeTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(pinCodeTextField);

        nextBtn = new JButton("Next");
        nextBtn.setBounds(720, 520, 80, 30);
        nextBtn.setBackground(Color.BLACK);
        nextBtn.setForeground(Color.white);
        nextBtn.addActionListener(this);
        add(nextBtn);

        setTitle("Signup form - Step 1");
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formNum = String.valueOf(random);
        String name = nameTextField.getText();
        String surName = surNameTextField.getText();
        String dob =( (JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        if(female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }
        if(unmarried.isSelected()){
            marital = "Single";
        }
        if(other.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pinCodeTextField.getText();

        try {
            if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name is required");
            }
            else{
                Connector c = new Connector();
                String query = "Insert into signup values('"+formNum+"', '"+name+"', '"+surName+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
               System.out.println(query);
                c.s.executeUpdate(query);

                setVisible(false);
                new Signup2(formNum).setVisible(true);
            }
        }
        catch (Exception ex){
            System.out.println(e);
        }

    }


    public static void main(String[] args) {
        new Signup1();
    }
}
