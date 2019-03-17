import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class HelloComponent4 extends JComponent implements MouseMotionListener, ActionListener,Runnable {
    String theMessage;
    int messageX = 125;
    int messageY = 95;
    JButton theButton;
    int colorIndex;
    static Color[] someColors = {
            Color.black,
            Color.red,
            Color.green,
            Color.blue,
            Color.magenta
    };
    boolean blinkState;

    public HelloComponent4(String message) {
        theMessage = message;
        theButton = new JButton("Change color");
        setLayout(new FlowLayout());
        add(theButton);
        theButton.addActionListener((ActionListener) this);
        addMouseMotionListener(this);
        Thread t = new Thread(this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        g.setColor(blinkState?getBackground():currentColor());
        g.drawString(theMessage, messageX, messageY);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == theButton)
            changeColor();

    }

    synchronized private void changeColor() {
        if (++colorIndex == someColors.length)
            colorIndex = 0;
        setForeground(currentColor());
        repaint();

    }

    synchronized private Color currentColor() {
        return someColors[colorIndex];
    }

    @Override
    public void run() {
        try{
            while(true){
                blinkState = !blinkState; //toggle
                repaint();
                Thread.sleep(300);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

public class HelloJava4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloJava4");
        frame.add(new HelloComponent4("Hello, Java4!"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);


    }
}
