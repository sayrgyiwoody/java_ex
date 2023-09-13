package chapter_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch14RadioButtonSample extends JFrame implements ActionListener,ItemListener {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JRadioButton[] radioButtons;

    public void actionPerformed(ActionEvent e){
        String favorite = null;

        int i = 0;
        while(favorite == null) {
            if(radioButtons[i].isSelected()){
                favorite = radioButtons[i].getText();
            }
            i++;
        }

        JOptionPane.showMessageDialog(this,"Your favorite language is "+ favorite);
    }

    public void itemStateChanged(ItemEvent e) {
        JRadioButton source = (JRadioButton) e.getSource();

        String state;

        if(e.getStateChange() == ItemEvent.SELECTED) {
            state = " is selected";
        }else {
            state = " is deselected";
        }

        JOptionPane.showMessageDialog(this,"JRadioButton '" + source.getText() + "' " + state);
    }

    public Ch14RadioButtonSample() {
        Container contentPane;
        JPanel radioPanel,okPanel;
        ButtonGroup languageGroup;

        JButton okButton;
        String[] btnText = {"Java","C++","Smalltalk","Ada"};
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());

        radioPanel = new JPanel(new GridLayout(0,1));
        radioPanel.setBorder(BorderFactory.createTitledBorder("Pick you favorite"));

        languageGroup = new ButtonGroup();
        radioButtons = new JRadioButton[btnText.length];

        for(int i = 0 ; i < btnText.length ; i++) {
            radioButtons[i] = new JRadioButton(btnText[i]);
            radioButtons[i].addItemListener(this);;

            languageGroup.add(radioButtons[i]);
            radioPanel.add(radioButtons[i]);
        }
        radioButtons[0].setSelected(true);

        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("Ok");
        okButton.addActionListener(this);
        okPanel.add(okButton);

        contentPane.add(radioPanel,BorderLayout.CENTER);
        contentPane.add(okPanel,BorderLayout.SOUTH);

        setTitle("Porgram Ch14RadioButton");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Ch14RadioButtonSample frame = new Ch14RadioButtonSample();
        frame.setVisible(true);
    }
}
