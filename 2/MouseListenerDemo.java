import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseListenerDemo {

  JFrame mainFrame;
  JLabel label;
  JLabel in;

  public MouseListenerDemo() {
    mainFrame = new JFrame("Ejemplo Interfaz gráfica");
    mainFrame.setSize(400,400);

    label = new JLabel("Mouse Listener");
    in = new JLabel("Mouse in or out frame");

    mainFrame.setLayout(new GridLayout(2, 1));
    mainFrame.add(label);
    mainFrame.add(in);
    mainFrame.addMouseListener(new Mouse());

    mainFrame.setVisible(true);
  }

  class Mouse implements MouseListener {
    public void mouseClicked(MouseEvent e) {
      label.setText("Mouse Clicked: ("+e.getX()+", "+e.getY() +")");
    }
    public void mousePressed(MouseEvent e) {
      label.setText("Mouse Pressed: ("+e.getX()+", "+e.getY() +")");
    }
    public void mouseReleased(MouseEvent e) {
      label.setText("Mouse Released: ("+e.getX()+", "+e.getY() +")");

    }
    public void mouseEntered(MouseEvent e) {
      in.setText("Mouse dentro del frame");
    }
    public void mouseExited(MouseEvent e) {
      in.setText("Mouse fuera del frame");
    }
  }

  public static void main(String[] args) {
    MouseListenerDemo swingDemo = new MouseListenerDemo();
  }
}
