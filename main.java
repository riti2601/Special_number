import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main{
    public static void main(String[] args) {
        
        JButton find = new JButton();
        find.setText("Find");
        find.setBounds(200,250,100,50);
        find.setFocusable(false);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,500,250);
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("Special Number");
        frame.setLayout(null);
        frame.add(panel1);
        frame.add(find);

    }
}
