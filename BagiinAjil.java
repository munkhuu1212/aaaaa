import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI {
    public static void main(String[] args) {
        // JFrame - үндсэн цонх
        JFrame frame = new JFrame("Mini GUI App");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JLabel - текст харуулах
        JLabel label = new JLabel("Enter your name:");
        frame.add(label);

        // JTextField - хэрэглэгчээс текст авах
        JTextField textField = new JTextField(15);
        frame.add(textField);

        // JButton - товчлуур
        JButton button = new JButton("Click Me");
        frame.add(button);

        // JLabel - үр дүн харуулах
        JLabel resultLabel = new JLabel("");
        frame.add(resultLabel);

        // Товч дарахад ажиллах event listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                if (!name.isEmpty()) {
                    resultLabel.setText("Hello, " + name + "!");
                } else {
                    resultLabel.setText("Please enter your name.");
                }
            }
        });

        // Цонхыг харагдах байдлаар тохируулах
        frame.setVisible(true);
    }
}
