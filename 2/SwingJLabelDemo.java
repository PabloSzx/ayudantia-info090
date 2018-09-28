import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingJLabelDemo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingJLabelDemo(){
      prepareGUI();
   }
   public static void main(String[] args){
      SwingJLabelDemo  swingControlDemo = new SwingJLabelDemo();
      swingControlDemo.showLabelDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Ejemplo de Java Swing");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      headerLabel = new JLabel("", JLabel.CENTER);
      statusLabel = new JLabel("",JLabel.CENTER);
      statusLabel.setSize(350,100);
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
   }
   private void showLabelDemo(){
      headerLabel.setText("JLabel");
      JLabel label  = new JLabel("", JLabel.CENTER);
      label.setText("Bienvenido a tu primera interfaz de usuario.");
      label.setOpaque(true);
      label.setBackground(Color.GRAY);
      label.setForeground(Color.WHITE);
      controlPanel.add(label);
      statusLabel.setText("Status");

      mainFrame.setVisible(true);  
   }
}
