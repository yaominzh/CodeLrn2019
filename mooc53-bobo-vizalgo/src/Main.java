import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame jframe = new JFrame("Welcome!");
            jframe.setSize(500, 500);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.setResizable(false);
            jframe.setVisible(true);
        });
    }
}
