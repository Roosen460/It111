import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

        public static void  main(String [] args) {

//        declare our variables
//        we are going to make them CONSTANTS


            final int WINDOW_WIDTH = 420;
            final int WINDOW_HEIGHT = 430;

            // Create a window

            JFrame window = new JFrame();
            window.setTitle("My Simple Window");
            window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLayout(null);
            window.getContentPane().setBackground(Color.RED);

            // This centers the window on the screen
            window.setLocationRelativeTo(null);

            // My first label
            JLabel label1 = new JLabel("My First Big Label!!!");
            label1.setBounds(25, 20, 300, 30);
            label1.setFont(new Font("Arial", Font.PLAIN, 18));
            label1.setForeground(Color.BLACK);
            window.add(label1);

            // Inserting text field
            JTextField textField1 = new JTextField();
            textField1.setBounds(25, 50, 200, 30);
            window.add(textField1);

            // My second label
            JLabel label2 = new JLabel("My Second Big Label!");
            label2.setBounds(25, 90, 300, 30);
            label2.setFont(new Font("Arial", Font.BOLD, 18)); // Bold for second label
            label2.setForeground(Color.BLACK);
            window.add(label2);

            // Inserting text field
            JTextField textField2 = new JTextField();
            textField2.setBounds(25, 120, 200, 30);
            window.add(textField2);

            // Display the window
            window.setVisible(true);
        }
}



















