package Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeInformation extends JFrame implements ActionListener ,ItemListener {
    private static final int FRAME_WEIGHT = 800;
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_X_ORIGIN = 200;
    private static final int FRAME_Y_ORIGIN = 200;

    JLabel nameLabel,noLabel,deptLabel,typeLabel,skillLabel,addressLabel;
    JTextField nameInput,noInput;
    JComboBox dept_name;
    String[] dept = {"Production","Sales","Marketing"};
    JRadioButton[] type;
    String[] labour_type = {"Full Time","Part Time"};
    JCheckBox[] checkBox;
    String[] btnText = {"Java","C++","Smalltalk","Ada"};
    JTextArea address ;

    JButton btn_save , btn_clear, btn_exit;

    String text;

    public EmployeeInformation() {
        Container contentPane;
        contentPane = getContentPane();
        contentPane.setLayout(null);


        nameLabel = new JLabel("Employee Name:");
        nameLabel.setBounds(20, 10, 100, 50);
        noLabel = new JLabel("Labour No:");
        noLabel.setBounds(20, 70, 100, 50);
        deptLabel = new JLabel("Department:");
        deptLabel.setBounds(20, 130, 100, 50);
        typeLabel = new JLabel("Labour Type:");
        typeLabel.setBounds(20, 190, 100, 50);
        skillLabel = new JLabel("Language Skill:");
        skillLabel.setBounds(20, 250, 100, 50);
        addressLabel = new JLabel("Address");
        addressLabel.setBounds(20, 310, 100, 50);

        

        contentPane.add(nameLabel);
        contentPane.add(noLabel);
        contentPane.add(deptLabel);
        contentPane.add(typeLabel);
        contentPane.add(skillLabel);
        contentPane.add(addressLabel);


        nameInput = new JTextField(80);
        nameInput.setBounds(200, 10, 500, 50);
        noInput = new JTextField(80);
        noInput.setBounds(200, 70, 500, 50);
        dept_name = new JComboBox(dept);
        dept_name.setBounds(200,130,500,50);

        JPanel radioPanel = new JPanel();
        radioPanel.setBounds(200,190,600,50);

        JPanel checkPanel = new JPanel();
        checkPanel.setBounds(200,250,600,50);

        ButtonGroup jobType = new ButtonGroup();

        type = new JRadioButton[labour_type.length];

        for(int i = 0 ; i< type.length ; i++) {
            type[i] = new JRadioButton(labour_type[i]);
            type[i].addItemListener(this);
            jobType.add(type[i]);
            radioPanel.add(type[i]);
        }

        checkBox = new JCheckBox[btnText.length];

        for(int i = 0 ; i < checkBox.length ; i++) {
            checkBox[i] = new JCheckBox(btnText[i]);

            checkPanel.add(checkBox[i]);
            
        }

        address = new JTextArea();
        address.setBounds(200,310,500,50);


        btn_save = new JButton("Save");
        btn_save.addActionListener(this);
        btn_save.setBounds(200,380,100,50);


        btn_clear = new JButton("Clear");
        btn_clear.addActionListener(this);
        btn_clear.setBounds(350,380,100,50);

        btn_exit = new JButton("Exit");
        btn_exit.addActionListener(this);
        btn_exit.setBounds(500,380,100,50);


        contentPane.add(nameInput);
        contentPane.add(noInput);
        contentPane.add(dept_name);
        contentPane.add(radioPanel);
        contentPane.add(checkPanel);
        contentPane.add(address);
        contentPane.add(btn_save);
        contentPane.add(btn_clear);
        contentPane.add(btn_exit);

        setSize(FRAME_WEIGHT, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed (ActionEvent e) {
        text = "";
        if(e.getSource().equals(btn_save)){
            String nameText = (String) nameInput.getText();
            String noText =  (String) noInput.getText();
            String dNText =  (String) dept_name.getSelectedItem();
            String typeText = "" ;

            int i  = 0 ;
            while(type == null) {
                if(type[i].isSelected()) {
                    typeText = type[i].getText();
                }
            }

            StringBuffer skillText = new StringBuffer() ;
            for (i = 0 ; i < checkBox.length ; i++) {
                if(checkBox[i].isSelected()) {
                    skillText.append(checkBox[i].getText() + "\n");
                }
            }

            text = "Name : " + nameText + "\n"
                    + "Labout No : " + noText + "\n"
                    + "Department : " + dNText + "\n"
                    + "Labour Type " + typeText + "\n"
                    + "Language skill : " + skillText  +"\n"
                    + "Address : " + address.getText();
            JOptionPane.showMessageDialog(null,text);
        }else if (e.getSource().equals(btn_clear)) {
            nameInput.setText("");
            noInput.setText("");
            dept_name.setSelectedIndex(0);
            type[0].setSelected(true);
            for(int i = 0 ; i < checkBox.length ; i++) {
                checkBox[i].setSelected(false);
            }
            address.setText("");
        }else if (e.getSource().equals(btn_exit)){
            int exit = JOptionPane.showConfirmDialog(this, "Are you sure that you want to exit?");

            if(exit == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

    }
    
    public void itemStateChanged(ItemEvent e) {

    }

    public static void main(String[] args) {
        EmployeeInformation frame = new EmployeeInformation();
        frame.setVisible(true);
    }
}
