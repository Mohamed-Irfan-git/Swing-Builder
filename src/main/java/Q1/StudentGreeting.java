package Q1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGreeting {
    public static void main(String[] args) {

        //Create fram
        JFrame frame = new JFrame("Student Greeting");
        frame.setSize(350,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Labl;
        JLabel label = new JLabel("Username");
        label.setBounds(30,30,100,20);
        frame.add(label);


        JTextField textField = new JTextField();
        textField.setBounds(130,30,150,25);
        frame.add(textField);

        JButton button = new JButton("Click");
        button.setBounds(150,70,100,25);
        frame.add(button);

        JLabel result = new JLabel("");
        result.setBounds(90, 130, 200, 20);
        frame.add(result);


        //this is lambda instead of calling callback function
        //this make is easy
       button.addActionListener(actionEvent -> {
          String text =  textField.getText();
          result.setText(text);
       });


       frame.setVisible(true);



    }
}
