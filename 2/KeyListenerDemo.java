import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyListenerDemo {

  JFrame mainFrame;

  public KeyListenerDemo() {
    mainFrame = new JFrame("Ejemplo Interfaz gráfica");
    mainFrame.setSize(400,400);

    mainFrame.addKeyListener(new Keyboard());

    mainFrame.setVisible(true);
  }

  class Keyboard implements KeyListener {
    public void keyTyped(KeyEvent e) {
      // System.out.println("keyTyped: "+e);
    }

    public void keyPressed(KeyEvent e) {
      //37 es izquierda
      //39 es derecha
      //38 es arriba
      //40 es abajo
      //32 es la tecla espacio
      switch (e.getKeyCode()) {
        case 37:
        {
          System.out.println("Flecha hacia la izquierda presionada");
          break;
        }
        case 39:
        {
          System.out.println("Flecha hacia la derecha presionada");
          break;
        }
        case 38:
        {
          System.out.println("Flecha hacia arriba presionada");
          break;
        }
        case 40:
        {
          System.out.println("Flecha hacia abajo presionada");
          break;
        }
        case 32:
        {
          System.out.println("Barra espaciadora presionada");
          break;
        }
      }
    }

    public void keyReleased(KeyEvent e) {
      // System.out.println("keyReleased: "+e);
    }
  }

  public static void main(String[] args) {
    KeyListenerDemo swingDemo = new KeyListenerDemo();
  }
}
