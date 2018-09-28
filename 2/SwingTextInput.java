import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SwingTextInput{
  private JFrame mainFrame; //Ventana de la interfaz gráfica
  private JLabel label; //Texto estático
  private JButton button;
  private JTextField textField;
  public SwingTextInput() {
    mainFrame = new JFrame("Ejemplo Interfaz gráfica");
    mainFrame.setSize(400,400);
    mainFrame.setLayout(new GridLayout(3, 1));
    label = new JLabel("Este es un texto JLabel", JLabel.CENTER);
    mainFrame.add(label);
    button = new JButton("Cambiar texto");
    button.addActionListener(new buttonListener());
    mainFrame.add(button);
    
    textField = new JTextField();
    mainFrame.add(textField);
    mainFrame.setVisible(true);
  }

  class buttonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      label.setText(textField.getText());
    }
  }


  public static void main(String[] args) {
    SwingTextInput  swingDemo = new SwingTextInput();
  }

}
