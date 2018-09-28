import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SwingTextInputArea{
  private JFrame mainFrame; //Ventana de la interfaz gráfica
  private JLabel label; //Texto estático
  private JButton button;
  private JTextArea textArea;
  public SwingTextInputArea() {
    mainFrame = new JFrame("Ejemplo Interfaz gráfica");
    mainFrame.setSize(400,400);
    mainFrame.setLayout(new GridLayout(3, 1));
    label = new JLabel("Este es un texto JLabel", JLabel.CENTER);
    mainFrame.add(label);
    button = new JButton("Cambiar texto");
    button.addActionListener(new buttonListener());
    mainFrame.add(button);

    textArea = new JTextArea();
    mainFrame.add(textArea);
    mainFrame.setVisible(true);
  }

  class buttonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      label.setText(textArea.getText());
    }
  }


  public static void main(String[] args) {
    SwingTextInputArea  swingDemo = new SwingTextInputArea();
  }

}
