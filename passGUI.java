import javax.swing.*;
import java.awt.BorderLayout;

public class passGUI extends JFrame{

    public passGUI(){
        super("Password Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        JButton button = new JButton("Click Me!");

        add(label);
        add(button);

        setLayout(new BorderLayout());

        pack();

    }

    public static void main(String[] args){
         new passGUI();
    }


    
}
