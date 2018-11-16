import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class DrawImageDemo {
    private JFrame mainFrame;

    public DrawImageDemo() {
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
            
            BufferedImage image = null;
            
            try {
                image = ImageIO.read(new File("../velocimetro.jpeg"));
                } catch (Exception e) {
                //TODO: handle exception
            }

            Graphics2D g2d = (Graphics2D)g;

            g2d.rotate(0.5);

            g.drawImage(image, 120, 20, 500, 500, null);
            
        }  
    }

    public static void main(String[] args) {
        DrawImageDemo swingDrawDemo = new DrawImageDemo();
    }



}