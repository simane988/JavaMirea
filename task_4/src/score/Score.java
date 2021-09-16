package score;

import javax.swing.*;
import java.awt.*;

public class Score extends JFrame {

    private static final int width = 500;
    private static final int height = 300;
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    Score(){
        super("AC Milan VS Real Madrid");
        setLayout(null);
        setSize(width, height);
        milan.setBounds(10, 30, 50, 50);
        madrid.setBounds(width-50, 30, 50, 50);

        add(milan);
        add(madrid);

        setVisible(true);
    }

    public static void main(String[] args) {
        new  Score();
    }
}
