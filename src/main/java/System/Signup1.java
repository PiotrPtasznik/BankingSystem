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
     JLabel fromNum, personDetails, name, surName, birthDate, gender, email, marital, address, city, state, pinCode;
     JRadioButton male, female,  married, unmarried, other;
     JDateChooser  dateChooser;

    JButton next;
    Signup1(){
        setLayout(null);

        Random rand = new Random();
        random = Math.abs((rand.nextLong() % 9000L) + 1000L);

        fromNum = new JLabel("Application form number : " + random);
        fromNum.setBounds(140,20,600,40);
        fromNum.setFont(new Font("Calibri", Font.BOLD, 38));
        add(fromNum);

        personDetails = new JLabel("Page 1 : Personal details");
        personDetails.setBounds(290,60,400,30);
        personDetails.setFont(new Font("Calibri", Font.BOLD, 22));
        add(personDetails);

        name = new JLabel("Name");
        name.setBounds(200,120,400,30);
        name.setFont(new Font("Calibri", Font.BOLD, 18));
        add(name);

        nameTextField = new JTextField();
        nameTextField.setBounds(400,120,400,30);
        nameTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(nameTextField);

        surName = new JLabel("Surname");
        surName.setBounds(200,160,400,30);
        surName.setFont(new Font("Calibri", Font.BOLD, 18));
        add(surName);

        surNameTextField = new JTextField();
        surNameTextField.setBounds(400,160,400,30);
        surNameTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(surNameTextField);

        birthDate = new JLabel("Date of birth");
        birthDate.setBounds(200,200,400,30);
        birthDate.setFont(new Font("Calibri", Font.BOLD, 18));
        add(birthDate);

        dateChooser  = new JDateChooser();
        dateChooser.setBounds(400,200,200,30);
        dateChooser.setForeground(Color.white);
        add(dateChooser);

        gender = new JLabel("Gender");
        gender.setBounds(200,240,400,30);
        gender.setFont(new Font("Calibri", Font.BOLD, 18));
        add(gender);

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

        email = new JLabel("Email");
        email.setBounds(200,280,400,30);
        email.setFont(new Font("Calibri", Font.BOLD, 18));
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(400,280,400,30);
        emailTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(emailTextField);

        marital = new JLabel("Marital status");
        marital.setBounds(200,320,400,30);
        marital.setFont(new Font("Calibri", Font.BOLD, 18));
        add(marital);

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

        address = new JLabel("Address");
        address.setBounds(200,360,400,30);
        address.setFont(new Font("Calibri", Font.BOLD, 18));
        add(address);

        addressTextField = new JTextField();
        addressTextField.setBounds(400,360,400,30);
        addressTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(addressTextField);

        city = new JLabel("city");
        city.setBounds(200,400,400,30);
        city.setFont(new Font("Calibri", Font.BOLD, 18));
        add(city);

        cityTextField = new JTextField();
        cityTextField.setBounds(400,400,400,30);
        cityTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(cityTextField);

        state = new JLabel("state");
        state.setBounds(200,440,400,30);
        state.setFont(new Font("Calibri", Font.BOLD, 18));
        add(state);

        stateTextField = new JTextField();
        stateTextField.setBounds(400,440,400,30);
        stateTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(stateTextField);

        pinCode = new JLabel("PIN Code");
        pinCode.setBounds(200,480,400,30);
        pinCode.setFont(new Font("Calibri", Font.BOLD, 18));
        add(pinCode);

        pinCodeTextField = new JTextField();
        pinCodeTextField.setBounds(400,480,400,30);
        pinCodeTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(pinCodeTextField);

        next = new JButton("Next");
        next.setBounds(720, 520, 80, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.white);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formNum = "" + random;
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
            marital = "Unmarried";
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
