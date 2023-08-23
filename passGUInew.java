import javax.swing.*;
import java.awt.*;

public class passGUInew {
    public passGUInew() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");

        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.setLayout(new GridLayout(2, 1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Password Generator");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new passGUInew();

    }

}
