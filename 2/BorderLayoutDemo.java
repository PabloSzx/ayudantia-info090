import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutDemo {
  private JFrame mainFrame;

  public BorderLayoutDemo() {
    mainFrame = new JFrame();
    mainFrame.setSize(400,400);
    mainFrame.setLayout(new BorderLayout());

    mainFrame.add(new JButton("Center"),BorderLayout.CENTER);
    mainFrame.add(new JButton("East"),BorderLayout.EAST);
    mainFrame.add(new JButton("West"),BorderLayout.WEST);
    mainFrame.add(new JButton("North"),BorderLayout.NORTH);
    mainFrame.add(new JButton("South"),BorderLayout.SOUTH);

    mainFrame.setVisible(true);

  }

  public static void main(String[] args) {
    BorderLayoutDemo swingDemo = new BorderLayoutDemo();
  }
}
