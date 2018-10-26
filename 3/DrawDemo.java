import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawDemo {
    private JFrame mainFrame;
    private DrawPanel panel;
    private Integer i = 0;
    
    public DrawDemo() {
        this.mainFrame = new JFrame("DrawDemo");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.mainFrame.setSize(1440, 900);
        this.panel = new DrawPanel();
        this.mainFrame.add(this.panel);
        this.mainFrame.addKeyListener(new Keyboard());
        this.mainFrame.setVisible(true);
    }

    public class DrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("Panel de Ejemplo: " + i,10,20);
            g.drawRect(100, 100, 500, 500);
            g.fillRect(100, 100, 350, 350);
        }  
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
              i++;
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
              panel.repaint();
              break;
            }
          }
        }
    
        public void keyReleased(KeyEvent e) {
          // System.out.println("keyReleased: "+e);
        }
      }
    

    public static void main(String[] args) {
        DrawDemo swingDrawDemo = new DrawDemo();
    }

}