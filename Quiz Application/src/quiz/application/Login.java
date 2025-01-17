package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules, exit; // Global declaration (related to program structure, internal memory allocation for variables)
    JTextField tfname; // Text field for user input (related to I/O devices)
    
    Login(){
        getContentPane().setBackground(Color.WHITE); // Setting background color (not directly structure/function related)
        setLayout(null); // Setting layout manager (not structure/function specific)
        
        JLabel name = new JLabel("Enter your name"); // GUI label (related to I/O devices, user interface design)
        name.setBounds(535, 300, 300, 20); //(x-axis, y-axis, font space, outer boundaries) // Positioning label on screen
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18)); //(font type, bold, font size) // Font settings
        name.setForeground(Color.BLACK);
        add(name);
        
        // Loading an image icon (could relate to I/O operations for fetching resources)
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/header.png")); //image
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1200, 280);
        Image scaledImage = i1.getImage().getScaledInstance(1000, 250, Image.SCALE_SMOOTH); // Image scaling (I/O operation)
        image.setIcon(new ImageIcon(scaledImage));
        add(image);
        
        tfname = new JTextField(); //font in box (user input) // Input field for user (related to I/O devices and operations)
        tfname.setBounds(450, 330, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules"); // Button for rules (related to I/O devices)
        rules.setBounds(615, 370, 120, 25);
        rules.setBackground(new Color(130, 143, 255));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this); // Event handling (related to program execution)
        add(rules);
        
        exit = new JButton("Exit"); // Button for exit (related to I/O devices)
        exit.setBounds(465, 370, 120, 25);
        exit.setBackground(new Color(130, 143, 255));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this); // Event handling (related to program execution)
        add(exit);
        
        // Background image setup
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/bg.png")); // Image loading (I/O operation)
        JLabel image1 = new JLabel(i2);
        image1.setBounds(0, 0, 1200, 500);
        Image scaledImage1 = i2.getImage().getScaledInstance(2000, 1000, Image.SCALE_SMOOTH); // Image scaling
        image1.setIcon(new ImageIcon(scaledImage1));
        add(image1);       
        
        setSize(1200, 500); // Setting window size
        setLocation(200, 150); // Positioning window on screen
        setVisible(true); // Displaying window
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules){ //if click rules button // Event handling for button click (related to program execution)
            String name = tfname.getText(); // Capturing user input (related to I/O operations)
            setVisible(false); //close current window
            new Rules(name); //open new window (rules window) (related to program execution)
        }else {
            setVisible(false); // Closing current window
            System.exit(0); // Exiting program (related to program execution)
        } 
    }
    
    public static void main(String[] args){
        new Login(); // Starting program (related to program execution)
    }
}

/*References
    From Code for Interview Channel
    1) https://youtu.be/5P8lCgteYKQ?si=Q0yYhGPwWkGhmjpj
    2) https://youtu.be/2WGY6SqWnJQ?si=EnvJkzqzFoRu5k4W

    Notes: The code may have error as I cannot send sir the location for the picture
*/