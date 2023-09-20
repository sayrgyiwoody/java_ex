package chapter_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch14JList extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JList list;

    public Ch14JList(){
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel listPanel , okPanel;

        listPanel = new JPanel(new GridLayout(0, 1));
        okPanel = new JPanel(new FlowLayout());

        JButton okButton = new JButton("ok");
        okButton.addActionListener(this);
        okPanel.add(okButton);

        String [] names = {"Ape", "Bat", "Bee", "Cat",
        "Dog", "Eel", "Fox", "Gnu",
        "Hen", "Man", "Sow", "Yak"};

        list = new JList(names);
        listPanel.add(new JScrollPane(list));
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);


        contentPane.add(listPanel,BorderLayout.CENTER);
        contentPane.add(okPanel,BorderLayout.SOUTH);

        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        setTitle("JList test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){
        // Object[] selected = list.getSelectedValues();

        // for(int i = 0 ; i< selected.length ; i++){
        //     System.out.println((String)selected[i]);
        // }
        JOptionPane.showMessageDialog(null,list.getSelectedValue());

    }

    public static void main(String [] args){
        Ch14JList frame = new Ch14JList();
        frame.setVisible(true);
    }
}