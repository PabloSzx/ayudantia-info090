import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SwingComboBoxDemo {
  private JFrame mainFrame; //Ventana de la interfaz gráfica
  public JLabel label;
  private JButton button;
  JComboBox<String> fruitCombo;

  public void createFrame() {
    mainFrame = new JFrame("Ejemplo Combo Box");
    mainFrame.setSize(400,400);
    mainFrame.setLayout(new GridLayout(3, 1));
    label = new JLabel("Este es un texto JLabel", JLabel.CENTER);
    mainFrame.add(label);
  }

  public SwingComboBoxDemo() {

    createFrame();
    DefaultComboBoxModel<String> fruitsName = new DefaultComboBoxModel<String>();

    fruitsName.addElement("Apple");
    fruitsName.addElement("Grapes");
    fruitsName.addElement("Mango");
    fruitsName.addElement("Pear");

    fruitCombo = new JComboBox<String>(fruitsName);
    fruitCombo.setSelectedIndex(0);

    mainFrame.add(fruitCombo);

    button = new JButton("Show");


    button.addActionListener(new comboBoxListener());
    mainFrame.add(button);

    mainFrame.setVisible(true);
  }

  class comboBoxListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      String data = "";
      if(fruitCombo.getSelectedIndex() != -1){
        data = "Frutas seleccionadas: " +
        fruitCombo.getItemAt(fruitCombo.getSelectedIndex());
      }
      label.setText(data);
    }
  }

  public static void main(String[] args) {
    SwingComboBoxDemo  swingDemo = new SwingComboBoxDemo();
  }

}
