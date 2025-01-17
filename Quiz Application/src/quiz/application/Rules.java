package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start, back;
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(new Color(196, 202, 254));
        setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/welcome.png")); // Related to I/O devices (loading images)
        JLabel image = new JLabel(i1);
        image.setBounds(-100, -180, 1000, 500);
        Image scaledImage = i1.getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
        image.setIcon(new ImageIcon(scaledImage)); 
        add(image);
        
        JLabel heading = new JLabel("Greetings " + name + ","); //font title // Display user name
        heading.setBounds(50, 150, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
        heading.setForeground(new Color(78, 39, 128));
        add(heading);
        
        JLabel rules = new JLabel(); //font title // Text for rules
        rules.setBounds(50, 220, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>" +
                        "1. This quiz contain 10 quetions." + "<br><br>" +
                        "2. This quiz cover both structure and function topics which are I/O Devices and I/O Operation." + "<br><br>" +
                        "3. You are required to answer all of them." + "<br><br>" +
                        "4. For each questions, you only have 15 seconds to answer." + "<br><br>" +
                        "5. The questions are based on the previous slide." + "<br><br>" +
                        "6. You only have 15 seconds to answer each questions." + "<br><br>" +
                        "7. If you think this quiz is hard, just remember that your final questions will be harder." + "<br><br>" +
                        "8. Goodluck." + "<br><br>" +
                "<html>"
        );
        add(rules);
        
        back = new JButton("Back"); // Button for going back (I/O operations)
        back.setBounds(270, 550, 100, 30);
        back.setBackground(new Color(130, 143, 255));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
              
        start = new JButton("Start"); // Button to start quiz (I/O operations)
        start.setBounds(440, 550, 100, 30);
        start.setBackground(new Color(130, 143, 255));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650); // Window setup
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == start){ // Starts quiz (program execution)
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login(); // Redirects to login (program execution)
        }
    }
    
    public static void main(String[] args){
        new Rules("User");
    }
    
}

/*References
    From Code for Interview Channel
    1) https://youtu.be/5P8lCgteYKQ?si=Q0yYhGPwWkGhmjpj
    2) https://youtu.be/2WGY6SqWnJQ?si=EnvJkzqzFoRu5k4W
    Notes: The code may have error as I cannot send sir the location for the pictures
*/
