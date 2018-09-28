import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutDemo {
   private JFrame mainFrame;

   public GridLayoutDemo(){
      mainFrame = new JFrame();
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(filas,columnas));
      // mainFrame.setLayout(new GridLayout(3,2));
      mainFrame.add(new JButton("UNO"));
      mainFrame.add(new JButton("DOS"));
      mainFrame.add(new JButton("TRES"));
      mainFrame.add(new JButton("CUATRO"));
      mainFrame.add(new JButton("CINCO"));
      mainFrame.add(new JButton("SEIS"));
      mainFrame.setVisible(true);

   }
   public static void main(String[] args){
      GridLayoutDemo swingLayoutDemo = new GridLayoutDemo();
   }
}
