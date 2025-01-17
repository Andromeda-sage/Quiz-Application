package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    JButton retry, menu;
    
    Score(String name, int score){        
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(new Color(196, 202, 254));
        setLayout(null);
        
        if(score == 100){
            // Internal Memory: Dynamically allocating memory for the label objects during runtime.
            JLabel heading = new JLabel("Congrats " + name + "! Respect earned! ^o^"); //question number
            heading.setBounds(45, 30, 700, 30); //(x-axis, y-axis, font space, outer boundaries)
            heading.setFont(new Font("Times New Roman", Font.PLAIN, 26)); //(font type, plain, font size)
            heading.setForeground(new Color(78, 39, 128));
            add(heading); 
            
            // External Memory: Accessing an external resource (image file) stored in the file system.
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/AURA.jpg")); 
            Image i2 = i1.getImage().getScaledInstance(300, 220, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(220, 80, 300, 250);
            add(image);
            
        } else if (score < 100 && score >= 80){
            JLabel heading = new JLabel("Congrats " + name + "   ^o^"); //question number
            heading.setBounds(45, 30, 700, 30); //(x-axis, y-axis, font space, outer boundaries)
            heading.setFont(new Font("Times New Roman", Font.PLAIN, 26)); //(font type, plain, font size)
            heading.setForeground(new Color(78, 39, 128));
            add(heading);            
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/HIGHH.jpg")); 
            Image i2 = i1.getImage().getScaledInstance(300, 220, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(220, 80, 300, 250);
            add(image);
            
        } else if (score < 80 && score >= 60){
            JLabel heading = new JLabel("Congrats " + name + "   ^o^"); //question number
            heading.setBounds(45, 30, 700, 30); //(x-axis, y-axis, font space, outer boundaries)
            heading.setFont(new Font("Times New Roman", Font.PLAIN, 26)); //(font type, plain, font size)
            heading.setForeground(new Color(78, 39, 128));
            add(heading);            
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/HIGH2.jpg")); 
            Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(230, 80, 300, 250);
            add(image); 
            
        } else if (score < 60 && score >= 40){
            JLabel heading = new JLabel("Congrats " + name + "   ^o^. Gotta study more!"); //question number
            heading.setBounds(45, 30, 700, 30); //(x-axis, y-axis, font space, outer boundaries)
            heading.setFont(new Font("Times New Roman", Font.PLAIN, 26)); //(font type, plain, font size)
            heading.setForeground(new Color(78, 39, 128));
            add(heading);            
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/PASS.jpg")); 
            Image i2 = i1.getImage().getScaledInstance(300, 220, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(220, 80, 300, 250);
            add(image);   
            
        } else if (score < 40 && score >= 20){
            JLabel heading = new JLabel("Congrats " + name + ". Never give up. Study more!"); //question number
            heading.setBounds(45, 30, 700, 30); //(x-axis, y-axis, font space, outer boundaries)
            heading.setFont(new Font("Times New Roman", Font.PLAIN, 26)); //(font type, plain, font size)
            heading.setForeground(new Color(78, 39, 128));
            add(heading);            
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/HELP.jpg")); 
            Image i2 = i1.getImage().getScaledInstance(300, 180, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(220, 80, 300, 250);
            add(image);  
            
        } else if (score < 20 && score!= 0){
            JLabel heading = new JLabel(name + "... You need to study more ^-^"); //question number
            heading.setBounds(45, 30, 700, 30); //(x-axis, y-axis, font space, outer boundaries)
            heading.setFont(new Font("Times New Roman", Font.PLAIN, 26)); //(font type, plain, font size)
            heading.setForeground(new Color(78, 39, 128));
            add(heading);            
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/FAIL.jpg")); 
            Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(220, 80, 300, 250);
            add(image); 
            
        }else {
            JLabel heading = new JLabel(name + "...? Are you even trying?"); //question number
            heading.setBounds(45, 30, 700, 30); //(x-axis, y-axis, font space, outer boundaries)
            heading.setFont(new Font("Times New Roman", Font.PLAIN, 26)); //(font type, plain, font size)
            heading.setForeground(new Color(78, 39, 128));
            add(heading);            
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/0.jpg"));
            Image i2 = i1.getImage().getScaledInstance(300, 220, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(230, 80, 300, 250);
            add(image);
            
        }   
        
        JLabel lblscore = new JLabel("Your score is " + score); //question number
        lblscore.setBounds(280, 380, 300, 30); //(x-axis, y-axis, font space, outer boundaries)
        lblscore.setFont(new Font("Times New Roman", Font.PLAIN, 26)); //(font type, plain, font size)
        lblscore.setForeground(new Color(78, 39, 128));
        add(lblscore);
        
        // I/O Modules: Buttons act as input devices, and GUI components display the output.
        retry = new JButton("Retry");
        retry.setBounds(400, 420, 120, 30);
        retry.setBackground(new Color(130, 143, 255));
        retry.setForeground(Color.WHITE);
        retry.addActionListener(this);  // Interruptions: Event-driven programming to handle button clicks.     
        add(retry);
        
        menu = new JButton("Main Menu");
        menu.setBounds(230, 420, 120, 30);
        menu.setBackground(new Color(130, 143, 255));
        menu.setForeground(Color.WHITE);
        menu.addActionListener(this); // Interruptions: Action listeners manage asynchronous events.     
        add(menu);
        
        setVisible(true);
    }
    
     // Functionality and CPU: Handles button click events, a practical example of program execution.
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == retry){
            // Cache Memory: Method calls and reloading components might leverage caching mechanisms.
            setVisible(false);
            new Quiz("User");
        } else {
            setVisible(false);
            new Login();  // Memory Management: Dynamically creates a new Login instance.
        }
    }
    
    public static void main(String[] args){
        // Program Execution: The main method initializes the application.
        new Score("User", 0);
    }
}

/*References
    From Code for Interview Channel
    1) https://youtu.be/5P8lCgteYKQ?si=Q0yYhGPwWkGhmjpj
    2) https://youtu.be/2WGY6SqWnJQ?si=EnvJkzqzFoRu5k4W
    Notes: The code may have error as I cannot send sir the location for the pictures
*/