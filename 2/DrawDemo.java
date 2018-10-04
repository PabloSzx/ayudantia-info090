import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawDemo {
    private JFrame mainFrame;

    public DrawDemo() {
        this.mainFrame = new JFrame("DrawDemo");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.mainFrame.setSize(1440, 900);
        this.mainFrame.add(new DrawPanel());
        this.mainFrame.setVisible(true);
    }

    public class DrawPanel extends JPanel {
        public DrawPanel() {

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);       
            g.drawString("Panel de Ejemplo",10,20);
            g.drawRect(100, 100, 500, 500);
            g.fillRect(100, 100, 350, 350);
        }  
    }

    public static void main(String[] args) {
        DrawDemo swingDrawDemo = new DrawDemo();
    }



}