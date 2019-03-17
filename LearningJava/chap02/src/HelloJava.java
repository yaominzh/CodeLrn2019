import javax.swing.*;
import java.awt.*;

class HelloComponent extends JComponent {
    public void paintComponent (Graphics g){

        g.drawString("hello, Java!", 125, 95);

    }

}
public class HelloJava {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello, Java!");
        JFrame frame = new JFrame("hello, Java!");
//        JLabel label = new JLabel("hello, Java!", JLabel.CENTER);
//        frame.add(label);
        frame.add(new HelloComponent());
        frame.setSize(300,300);
        frame.setVisible(true);


    }
}
