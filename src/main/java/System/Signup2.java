package System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    long random;
    JTextField phoneNumberTextField, occupationTextField;
    JLabel additionalDetails, phoneNumber, education, insurance, income, employment, occupation, retirement, drivingLicense, drivingLicenseNumber;
    JRadioButton insured, uninsured, employed, unemployed, retired, unretired , drivingLicenseY , drivingLicenseN;
    JButton nextBtn;
    JComboBox educationCBox, incomeCBox, drivingLicenseCBox;
    String formNum;

    Signup2(String formNum){
        this.formNum = formNum;
        setLayout(null);

        additionalDetails = new JLabel("Page 2 : Additional details");
        additionalDetails.setBounds(290,60,400,30);
        additionalDetails.setFont(new Font("Calibri", Font.BOLD, 22));
        add(additionalDetails);

        phoneNumber = new JLabel("Phone number");
        phoneNumber.setBounds(200,120,400,30);
        phoneNumber.setFont(new Font("Calibri", Font.BOLD, 18));
        add(phoneNumber);

        phoneNumberTextField = new JTextField();
        phoneNumberTextField.setBounds(400,120,400,30);
        phoneNumberTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(phoneNumberTextField);

        education = new JLabel("Level of education");
        education.setBounds(200,160,400,30);
        education.setFont(new Font("Calibri", Font.BOLD, 18));
        add(education);

        String[] educationValues = {"--", "Uneducated", "Primary", "Secondary", "High School", "Associate's Degree", "Bachelor's Degree", "Master's Degree", "Doctoral Degree"};
        educationCBox = new JComboBox<>(educationValues);
        educationCBox.setBounds(400,160,200,30);
        educationCBox.setFont(new Font("Calibri", Font.BOLD, 18));
        educationCBox.setBackground(Color.white);
        add(educationCBox);


        insurance = new JLabel("Insured");
        insurance.setBounds(200,200,400,30);
        insurance.setFont(new Font("Calibri", Font.BOLD, 18));
        add(insurance);

        insured = new JRadioButton("Insured");
        insured.setBounds(400,200,140,30);
        insured.setFont(new Font("Calibri", Font.BOLD, 18));
        insured.setBackground(Color.white);
        add(insured);

        uninsured = new JRadioButton("Uninsured");
        uninsured.setBounds(550,200,140,30);
        uninsured.setFont(new Font("Calibri", Font.BOLD, 18));
        uninsured.setBackground(Color.white);
        add(uninsured);

        ButtonGroup genderBtnGroup = new ButtonGroup();
        genderBtnGroup.add(insured);
        genderBtnGroup.add(uninsured);

        income = new JLabel("Income");
        income.setBounds(200,240,400,30);
        income.setFont(new Font("Calibri", Font.BOLD, 18));
        add(income);

        String[] incomeValues = {"--", "Less than 1000$", "1000-2000$", "2000-5000$", "5000-10 000$", "Over 10 000$"};
        incomeCBox = new JComboBox<>(incomeValues);
        incomeCBox.setBounds(400,240,200,30);
        incomeCBox.setFont(new Font("Calibri", Font.BOLD, 18));
        incomeCBox.setBackground(Color.white);
        add(incomeCBox);

        employment = new JLabel("Employed");
        employment.setBounds(200,280,400,30);
        employment.setFont(new Font("Calibri", Font.BOLD, 18));
        add(employment);

        employed = new JRadioButton("Employed");
        employed.setBounds(400,280,120,30);
        employed.setFont(new Font("Calibri", Font.BOLD, 18));
        employed.setBackground(Color.white);
        add(employed);

        unemployed = new JRadioButton("Unemployed");
        unemployed.setBounds(550,280,140,30);
        unemployed.setFont(new Font("Calibri", Font.BOLD, 18));
        unemployed.setBackground(Color.white);
        add(unemployed);

        ButtonGroup maritalBtnGroup = new ButtonGroup();
        maritalBtnGroup.add(employed);
        maritalBtnGroup.add(unemployed);

        occupation = new JLabel("Occupation");
        occupation.setBounds(200,320,400,30);
        occupation.setFont(new Font("Calibri", Font.BOLD, 18));
        add(occupation);

        occupationTextField = new JTextField();
        occupationTextField.setBounds(400,320,400,30);
        occupationTextField.setFont(new Font("Calibri", Font.BOLD, 18));
        add(occupationTextField);

        retirement = new JLabel("Pensioner");
        retirement.setBounds(200,360,400,30);
        retirement.setFont(new Font("Calibri", Font.BOLD, 18));
        add(retirement);

        retired = new JRadioButton("Yes");
        retired.setBounds(400,360,120,30);
        retired.setFont(new Font("Calibri", Font.BOLD, 18));
        retired.setBackground(Color.white);
        add(retired);

        unretired = new JRadioButton("No");
        unretired.setBounds(550,360,140,30);
        unretired.setFont(new Font("Calibri", Font.BOLD, 18));
        unretired.setBackground(Color.white);
        add(unretired);

        ButtonGroup retirement = new ButtonGroup();
        maritalBtnGroup.add(retired);
        maritalBtnGroup.add(unretired);

        drivingLicense = new JLabel("Driving license");
        drivingLicense.setBounds(200,400,400,30);
        drivingLicense.setFont(new Font("Calibri", Font.BOLD, 18));
        add(drivingLicense);

        drivingLicenseY = new JRadioButton("Have");
        drivingLicenseY.setBounds(400,400,120,30);
        drivingLicenseY.setFont(new Font("Calibri", Font.BOLD, 18));
        drivingLicenseY.setBackground(Color.white);
        add(drivingLicenseY);

        drivingLicenseN = new JRadioButton("Dont have");
        drivingLicenseN.setBounds(550,400,140,30);
        drivingLicenseN.setFont(new Font("Calibri", Font.BOLD, 18));
        drivingLicenseN.setBackground(Color.white);
        add(drivingLicenseN);

        ButtonGroup drivingLicense = new ButtonGroup();
        drivingLicense.add(drivingLicenseY);
        drivingLicense.add(drivingLicenseN);
      
        drivingLicenseNumber = new JLabel("Driving License Type");
        drivingLicenseNumber.setBounds(200,440,400,30);
        drivingLicenseNumber.setFont(new Font("Calibri", Font.BOLD, 18));
        add(drivingLicenseNumber);

        String[] drivingLicenseValues = {"--", "AM", "A1", "A2", "A", "B", "Other", "None"};
        drivingLicenseCBox = new JComboBox<>(drivingLicenseValues);
        drivingLicenseCBox.setBounds(400,440,200,30);
        drivingLicenseCBox.setFont(new Font("Calibri", Font.BOLD, 18));
        drivingLicenseCBox.setBackground(Color.white);
        add(drivingLicenseCBox);
        
        nextBtn = new JButton("Next");
        nextBtn.setBounds(720, 480, 80, 30);
        nextBtn.setBackground(Color.BLACK);
        nextBtn.setForeground(Color.white);
        nextBtn.addActionListener(this);
        add(nextBtn);


        getContentPane().setBackground(Color.white);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String phone = phoneNumberTextField.getText();
        String education = (String) educationCBox.getSelectedItem();

        String insurance = null;
        if (insured.isSelected()){
            insurance = "Insured";
        }
        if(uninsured.isSelected()){
            insurance = "Uninsured";
        }

        String income = (String) incomeCBox.getSelectedItem();

        String employment = null;
        if (employed.isSelected()){
            employment = "Employed";
        }
        if(unemployed.isSelected()){
            employment = "Unemployed";
        }

        String occupation = occupationTextField.getText();

        String pensioner = null;
        if (retired.isSelected()){
            employment = "Retired";
        }
        if(unretired.isSelected()){
            employment = "Unretired";
        }

        String drivingLicense = null;
        if (drivingLicenseY.isSelected()){
            drivingLicense = "Has driving license";
        }
        if(drivingLicenseN.isSelected()){
            drivingLicense = "No driving license";
        }

        String drivingLicenseValues = (String) drivingLicenseCBox.getSelectedItem();

        try {
            Connector c = new Connector();
            String query = "Insert into signup2 values('"+formNum+"', '"+phone+"', '"+education+"','"+insurance+"','"+income+"','"+employment+"','"+occupation+"','"+pensioner+"','"+drivingLicense+"','"+drivingLicenseValues+"')";
            c.s.executeUpdate(query);

            setVisible(false);
            new Signup3(formNum).setVisible(true);

        }
        catch (Exception ex){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}


