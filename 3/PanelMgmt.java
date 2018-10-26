import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class PanelMgmt {
    private JFrame mainFrame;

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;

    public void createPanel() {
        this.panel1 = new JPanel(new GridLayout(2,2));
        this.panel1.add(new JLabel("Hola"));
        this.panel1.add(new JLabel("Como"));
        this.panel1.add(new JLabel("Estas"));
        this.panel1.add(new JLabel("XD"));


        this.panel2 = new DrawPanel();

        this.panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.panel3.add(new JLabel("Centrado"));


        this.panel4 = new JPanel(new BorderLayout());
        this.panel4.add(new JButton("Press ME"), BorderLayout.WEST);

        this.panel5 = new JPanel(null);
        JLabel label = new JLabel("Posicionado, este string estara cortado");
        label.setBounds(75, 30, 150, 50);
        this.panel5.add(label);
    }

    public PanelMgmt() {
        this.mainFrame = new JFrame("Panel Management");

        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.mainFrame.setSize(1440, 900);
        this.mainFrame.setLayout(new GridLayout(3, 2));
        this.createPanel();
        this.mainFrame.add(panel1);
        this.mainFrame.add(panel2);
        this.mainFrame.add(panel3);
        this.mainFrame.add(panel4);
        this.mainFrame.add(panel5);
        this.mainFrame.setVisible(true);

    }

    class DrawPanel extends JPanel{
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(new Color(25, 75, 200));
            g.fillRect(0, 0, 50, 50);
            g.setColor(new Color(0, 50, 100));
            g.fillOval(100, 75, 50, 50);
        }
    }
    public static void main(String[] args) {
        new PanelMgmt();
    }
}