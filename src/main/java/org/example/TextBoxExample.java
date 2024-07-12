import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class TextBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField firstTextField = new JTextField();
        JTextField secondTextField = new JTextField();

        // Add DocumentListener to firstTextField



        panel.add(new JLabel("First Textbox:"));
       // panel.add(firstTextField);
        //panel.add(new JLabel("Second Textbox:"));
        panel.add(secondTextField);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
