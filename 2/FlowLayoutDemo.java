import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutDemo {
  private JFrame mainFrame;
  public FlowLayoutDemo() {
    mainFrame = new JFrame();
    mainFrame.setSize(400,400);
    mainFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
    // mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
    // mainFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));

    mainFrame.add(new JButton("UNO"));
    mainFrame.add(new JButton("DOS"));
    mainFrame.add(new JButton("TRES"));
    mainFrame.add(new JButton("CUATRO"));
    mainFrame.add(new JButton("CINCO"));

    mainFrame.setVisible(true);
  }

  public static void main(String[] args) {
    FlowLayoutDemo swingDemo = new FlowLayoutDemo();

  }
}
