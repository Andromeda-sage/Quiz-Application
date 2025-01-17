package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{
    
    String questions[][] = new String[10][6]; // Array for storing questions and related options (Memory-related, internal memory)
    String answers[][] = new String[10][5]; // Array for storing correct answers (Memory-related, internal memory)
    String useranswers[][] = new String[10][1]; // Stores user-selected answers (Memory-related, internal memory)
    JLabel qno, question, questionImage; 
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit;
    
    public int timer = 15; // Timer for each question (Function-related: Program execution)
    public int ans_given = 0;
    public int count = 0; // Tracks current question number (Function-related: Program execution)
    public int score = 0; // Tracks user's score (Memory-related, internal memory)
    
    String name;
    
    Quiz(String name){
        this.name = name; // Storing user name (Memory-related, internal memory)
        setBounds(220, 70, 1100, 700);
        getContentPane().setBackground(new Color(196, 202, 254));
        setLayout(null);

        next = new JButton("Next");
        next.setBounds(750, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(130, 143, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        submit = new JButton("Submit"); // Submit button for the quiz (Function-related: I/O operations)
        submit.setBounds(750, 550, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(130, 143, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        qno = new JLabel(); // Display question number (Function-related: Program execution)
        qno.setBounds(150, 400, 50, 30); //(x-axis, y-axis, font space, outer boundaries)
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24)); //(font type, bold, font size)
        add(qno);
        
        question = new JLabel(); // Display question text (I/O operations)
        question.setBounds(200, 400, 900, 30); //(x-axis, y-axis, font space, outer boundaries)
        question.setFont(new Font("Tahoma", Font.PLAIN, 24)); //(font type, bold, font size)
        add(question);
        
        questionImage = new JLabel(); // Display related question image (I/O devices)
        questionImage.setBounds(100, 450, 300, 200);
        questionImage.setBorder(BorderFactory.createLineBorder(new Color(196, 202, 254)));
        add(questionImage);
        
        // Populating questions array (Structure-related: Internal memory)
        questions[0][0] = "What is the primary role of an I/O device in a computer system?";
        questions[0][1] = "To store data permanently";
        questions[0][2] = "To allow data exchange between the computer and the external environment";
        questions[0][3] = "To store data temporarily";
        questions[0][4] = "To manage system memory";
        questions[0][5] = "icons/OPERATION.png"; // Example of using external memory for images
        
        questions[1][0] = "Which of the following is NOT considered as an external device?";
        questions[1][1] = "Printer";
        questions[1][2] = "Keyboard";
        questions[1][3] = "Central Processing Unit (CPU)";
        questions[1][4] = "Mouse";
        questions[1][5] = "icons/HYBRID.png"; // Example of using external memory for images
        
        questions[2][0] = "In Programmed I/O, how does the processor handle data transfer?";
        questions[2][1] = "It continuously checks the device status and manages the transfer";
        questions[2][2] = "It delegates the task entirely to the I/O device";
        questions[2][3] = "It waits for an interrupt signal from the device";
        questions[2][4] = "It uses Direct Memory Access (DMA)";
        questions[2][5] = "icons/PROCESSOR.jpg"; // Example of using external memory for images
        
        questions[3][0] = "What is a key advantage of Interrupt-driven I/O over Programmed I/O?";
        questions[3][1] = "Reduced hardware complexity";
        questions[3][2] = "Decreased processor idle time";
        questions[3][3] = "Increased processor involvement";
        questions[3][4] = "Simplified programming";
        questions[3][5] = "icons/INTER.png"; // Example of using external memory for images
        
        questions[4][0] = "What is the function of devices categorized as communication devices?";
        questions[4][1] = "To communicate with equipment or devices";
        questions[4][2] = "To communicate with remote devices";
        questions[4][3] = "To communicate with user";
        questions[4][4] = "To communicate with CPU";
        questions[4][5] = "icons/MODEM.png"; // Example of using external memory for images
        
        questions[5][0] = "In the context of I/O operations, what does DMA stand for?";
        questions[5][1] = "Direct Memory Access";
        questions[5][2] = "Direct Module Access";
        questions[5][3] = "Direct Memory Allocation";
        questions[5][4] = "Data Memory Access";
        questions[5][5] = "icons/DMA.jpeg"; // Example of using external memory for images
        
        questions[6][0] = "Which of the following devices is a hybrid external device?";
        questions[6][1] = "Monitor";
        questions[6][2] = "Touchscreen";
        questions[6][3] = "Printer";
        questions[6][4] = "Scanner";
        questions[6][5] = "icons/SCREEN.jpg"; // Example of using external memory for images
        
        questions[7][0] = "What happens when an interrupt is generated by an I/O device?";
        questions[7][1] = "The processor pauses its current tasks to address the I/O device's needs";
        questions[7][2] = "The processor ignores the signal";
        questions[7][3] = "The processor immediately stops all operations";
        questions[7][4] = "The I/O device takes over the processor's tasks";
        questions[7][5] = "icons/INTERR.jpg"; // Example of using external memory for images
        
        questions[8][0] = "Which I/O method is most efficient for high-volume data transfers?";
        questions[8][1] = "Programmed I/O";
        questions[8][2] = "Interrupt-driven I/O";
        questions[8][3] = "Direct Memory Access (DMA)";
        questions[8][4] = "Polling";
        questions[8][5] = "icons/TRANSFER.jpg"; // Example of using external memory for images
        
        questions[9][0] = "How many categories are there for external devices?";
        questions[9][1] = "None";
        questions[9][2] = "1";
        questions[9][3] = "2";
        questions[9][4] = "3";
        questions[9][5] = "icons/EXDE.jpg"; // Example of using external memory for images
        
        answers[0][2] = "To allow data exchange between the computer and the external environment";
        answers[1][3] = "Central Processing Unit (CPU)";
        answers[2][1] = "It continuously checks the device status and manages the transfer";
        answers[3][2] = "Decreased processor idle time";
        answers[4][2] = "To communicate with remote devices";
        answers[5][1] = "Direct Memory Access";
        answers[6][2] = "Touchscreen";
        answers[7][1] = "The processor pauses its current tasks to address the I/O device's needs";
        answers[8][3] = "Direct Memory Access (DMA)";
        answers[9][4] = "3";
        
        opt1 = new JRadioButton(); // Option 1 for answers (I/O operations)
        opt1.setBounds(200, 440, 700, 30);
        opt1.setBackground(new Color(196, 202, 254));
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton(); // Option 2 (I/O operations)
        opt2.setBounds(200, 480, 750, 30);
        opt2.setBackground(new Color(196, 202, 254));
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
          
        opt3 = new JRadioButton(); // Option 3 (I/O operations)
        opt3.setBounds(200, 520, 700, 30);
        opt3.setBackground(new Color(196, 202, 254));
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
          
        opt4 = new JRadioButton(); // Option 4 (I/O operations)
        opt4.setBounds(200, 560, 700, 30);
        opt4.setBackground(new Color(196, 202, 254));
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();  // Grouping options for single selection (I/O operations)
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        start(count); // Starts the quiz (Function-related: Program execution)
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(groupoptions.getSelection() == null){
                useranswers[count][0] = ""; // Storing user answers (Memory-related: Internal memory)
            } else{
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setVisible(false); //stop next button on last question
                submit.setEnabled(true);
            }
            
            count++; // Moving to the next question (Function-related: Program execution)
            start(count);     
            
        } else if (ae.getSource() == submit){
            ans_given = 1;
                if(groupoptions.getSelection() == null){
                    useranswers[count][0] = "";
                } else{
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for(int i = 0; i < useranswers.length; i++){
                    if(useranswers[i][0].equals(answers[i][1])){
                        score += 10;
                    } else if(useranswers[i][0].equals(answers[i][2])){
                        score += 10;
                    } else if(useranswers[i][0].equals(answers[i][3])){
                        score += 10;
                    } else if(useranswers[i][0].equals(answers[i][4])){
                        score += 10;                        
                    } else{
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        // Displaying timer (Function-related: Program execution)
        
        String time = " " + timer + " ";
        g.setColor(new Color(130, 143, 255));
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if(timer > 0){
            g.drawString(time, 1010, 670);
        } else{
            g.drawString("Times up!!", 930, 670);
        }
        
        timer--; //14
        
        try{
            Thread.sleep(1000);
            repaint();
        } catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        } else if(timer < 0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setVisible(false); //stop next button on last question
                submit.setEnabled(true);
            }
            if(count == 9){ //submit button
                if(groupoptions.getSelection() == null){
                    useranswers[count][0] = "";
                } else{
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for(int i = 0; i < useranswers.length; i++){
                    if(useranswers[i][0].equals(answers[i][1])){
                        score += 10;
                    }else if(useranswers[i][0].equals(answers[i][2])){
                        score += 10;
                    }else if(useranswers[i][0].equals(answers[i][3])){
                        score += 10;
                    }else if(useranswers[i][0].equals(answers[i][4])){
                        score += 10;
                    } else{
                        score += 0;
                    }
                }
                setVisible(false); 
                new Score(name, score);
            } else{ //next
                if(groupoptions.getSelection() == null){
                    useranswers[count][0] = "";
                } else{
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++;//0//1
                start(count);
            }

        }
        
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". "); // Display question number (I/O operations)
        question.setText(questions[count][0]); // Display question text (I/O operations)
        
        // Displaying options (I/O operations)
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]); 
        
        groupoptions.clearSelection(); //get rid of previous choice
        
        // Displaying images (I/O operations)
        String imagePath = questions[count][5]; //change pic each question
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource(imagePath));
        questionImage.setBounds(300, -50, 1000, 500);
        Image scaledImage = i2.getImage().getScaledInstance(500, 280, Image.SCALE_SMOOTH);
        questionImage.setIcon(new ImageIcon(scaledImage));
    }
    
    public static void main(String[] args){
        new Quiz("User"); // Starting the program (Function-related: Program execution)
    }
    
}

/*References
    From Code for Interview Channel
    1) https://youtu.be/5P8lCgteYKQ?si=Q0yYhGPwWkGhmjpj
    2) https://youtu.be/2WGY6SqWnJQ?si=EnvJkzqzFoRu5k4W

    Notes: The code may have error as I cannot send sir the location for the pictures for each question
*/