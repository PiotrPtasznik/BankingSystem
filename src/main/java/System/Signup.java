package System;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Signup extends JFrame {
    Signup(){
        setLayout(null);

        Random rand = new Random();
        long random = Math.abs((rand.nextLong() % 9000L) + 1000L);

        JLabel fromNum = new JLabel("Application form number : " + random);
        fromNum.setBounds(140,20,600,40);
        fromNum.setFont(new Font("Calibri", Font.BOLD, 38));
        add(fromNum);

        JLabel personDetails = new JLabel("Page 1 : Personal details");
        personDetails.setBounds(290,60,400,30);
        personDetails.setFont(new Font("Calibri", Font.BOLD, 22));
        add(personDetails);

        JLabel name = new JLabel("Name");
        name.setBounds(200,120,400,30);
        name.setFont(new Font("Calibri", Font.BOLD, 18));
        add(name);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(400,120,400,30);
        nameTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(nameTextField);

        JLabel surName = new JLabel("Surname");
        surName.setBounds(200,160,400,30);
        surName.setFont(new Font("Calibri", Font.BOLD, 18));
        add(surName);

        JTextField surNameTextField = new JTextField();
        surNameTextField.setBounds(400,160,400,30);
        surNameTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(surNameTextField);

        JLabel birthDate = new JLabel("Date of birth");
        birthDate.setBounds(200,200,400,30);
        birthDate.setFont(new Font("Calibri", Font.BOLD, 18));
        add(birthDate);

        JDateChooser dateChooser  = new JDateChooser();
        dateChooser.setBounds(400,200,200,30);
        dateChooser.setForeground(Color.white);
        add(dateChooser);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(200,240,400,30);
        gender.setFont(new Font("Calibri", Font.BOLD, 18));
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(400,240,80,30);
        male.setFont(new Font("Calibri", Font.BOLD, 18));
        male.setBackground(Color.white);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(550,240,80,30);
        female.setFont(new Font("Calibri", Font.BOLD, 18));
        female.setBackground(Color.white);
        add(female);

        ButtonGroup genderBtnGroup = new ButtonGroup();
        genderBtnGroup.add(male);
        genderBtnGroup.add(female);



        JLabel email = new JLabel("Email");
        email.setBounds(200,280,400,30);
        email.setFont(new Font("Calibri", Font.BOLD, 18));
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(400,280,400,30);
        emailTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(emailTextField);

        JLabel marital = new JLabel("Marital status");
        marital.setBounds(200,320,400,30);
        marital.setFont(new Font("Calibri", Font.BOLD, 18));
        add(marital);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(400,320,120,30);
        married.setFont(new Font("Calibri", Font.BOLD, 18));
        married.setBackground(Color.white);
        add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(550,320,120,30);
        unmarried.setFont(new Font("Calibri", Font.BOLD, 18));
        unmarried.setBackground(Color.white);
        add(unmarried);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(700,320,120,30);
        other.setFont(new Font("Calibri", Font.BOLD, 18));
        other.setBackground(Color.white);
        add(other);

        ButtonGroup maritalBtnGroup = new ButtonGroup();
        maritalBtnGroup.add(married);
        maritalBtnGroup.add(unmarried);
        maritalBtnGroup.add(other);

        JLabel address = new JLabel("Address");
        address.setBounds(200,360,400,30);
        address.setFont(new Font("Calibri", Font.BOLD, 18));
        add(address);

        JTextField addressTextField = new JTextField();
        addressTextField.setBounds(400,360,400,30);
        addressTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(addressTextField);

        JLabel city = new JLabel("city");
        city.setBounds(200,400,400,30);
        city.setFont(new Font("Calibri", Font.BOLD, 18));
        add(city);

        JTextField cityTextField = new JTextField();
        cityTextField.setBounds(400,400,400,30);
        cityTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(cityTextField);

        JLabel state = new JLabel("state");
        state.setBounds(200,440,400,30);
        state.setFont(new Font("Calibri", Font.BOLD, 18));
        add(state);

        JTextField stateTextField = new JTextField();
        stateTextField.setBounds(400,440,400,30);
        stateTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(stateTextField);

        JLabel pinCode = new JLabel("PIN Code");
        pinCode.setBounds(200,480,400,30);
        pinCode.setFont(new Font("Calibri", Font.BOLD, 18));
        add(pinCode);

        JTextField pinCodeTextField = new JTextField();
        pinCodeTextField.setBounds(400,480,400,30);
        pinCodeTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(pinCodeTextField);

        JButton next = new JButton("Next");
        next.setBounds(720, 520, 80, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        add(next);


        getContentPane().setBackground(Color.white);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);


    }

    public static void main(String[] args) {

        new Signup();
    }

}
