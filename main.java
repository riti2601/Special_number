import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class main extends JFrame implements ActionListener{
    
    static JButton automorphic;
    static JButton palindrome;
    static JTextField num;
    static JLabel result;

    public main(){

        JLabel label1 = new JLabel("<html><h1>Enter a number:</h1></html>");
        label1.setBounds(300,50, 200, 100);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setForeground(Color.WHITE);
        //label1.setText();
        
        num = new JTextField();
        num.setBounds(350,150,100,50);

        automorphic = new JButton();
        automorphic.setText("Automorphic");
        automorphic.setBounds(200,10,150,50);
        automorphic.setFocusable(false);
        automorphic.addActionListener(this);

        palindrome = new JButton();
        palindrome.setText("Palindrome");
        palindrome.setBounds(50, 10, 150, 50);
        palindrome.setFocusable(false);
        palindrome.addActionListener(this);

        result = new JLabel();
        result.setBounds(300, 100, 200, 50); 
        result.setForeground(Color.BLACK);
        result.setOpaque(true);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,800,250);
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setLayout(null);
        panel1.add(label1);
        panel1.add(num);
        

        JPanel panel2 = new JPanel();
        panel2.setBounds(0,250,800,250);
        panel2.setBackground(Color.BLACK);
        panel2.setLayout(null);
        panel2.add(automorphic);
        panel2.add(palindrome);
        panel2.add(result);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setVisible(true);
        frame.setTitle("Special Number");
        frame.setLayout(null);
        frame.add(panel1);
        frame.add(panel2);
    }

    public void actionPerformed(ActionEvent e) {
        // Action to perform when the button is clicked
        if(e.getSource()==automorphic){
            String input = num.getText();
        int number = Integer.parseInt(input);
        int square = number * number;
        String squareStr = String.valueOf(square);
        String numStr = String.valueOf(number);
        
        if (squareStr.endsWith(numStr)) {
            result.setText("an automorphic number!");
        } else {
            result.setText("not an automorphic number!");
        }
        
        }
        if(e.getSource() == palindrome){
            String input = num.getText();
            String reverse = new StringBuilder(input).reverse().toString();
            if (input.equals(reverse)) {
                result.setText(" a palindrome!");
            } else {
                result.setText("not a palindrome!");
            }
        }

    }    public static void main(String[] args) {
        new main();

    }
}
