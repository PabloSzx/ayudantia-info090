import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SwingDemo{
  private JFrame mainFrame; //Ventana de la interfaz gráfica
  public JLabel label; //Texto estático
  private JButton button;
  public SwingDemo() {
    mainFrame = new JFrame("Ejemplo Interfaz gráfica");
    mainFrame.setSize(400,400);
    mainFrame.setLayout(new GridLayout(3, 1));
    label = new JLabel("Este es un texto JLabel", JLabel.CENTER);
    mainFrame.add(label);
    button = new JButton("Cambiar texto");
    button.addActionListener(new buttonListener());
    mainFrame.add(button);
    JCheckBox manzana = new JCheckBox("Manzana");
    manzana.addItemListener(new checkBoxListener());
    mainFrame.add(manzana);

    JRadioButton hombre = new JRadioButton("Hombre", true);
    JRadioButton mujer = new JRadioButton("Mujer");
    ButtonGroup group = new ButtonGroup();
    group.add(hombre);
    group.add(mujer);
    hombre.addItemListener(new radioButtonListener());
    mujer.addItemListener(new radioButtonListener());

    mainFrame.add(hombre);
    mainFrame.add(mujer);
    mainFrame.setVisible(true);
  }

  class buttonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      label.setText("El texto ha sido cambiado");
    }
  }

  class checkBoxListener implements ItemListener {
    public void itemStateChanged(ItemEvent e) {
      label.setText(("Manzana Checkbox: " + (e.getStateChange()==1?"checked":"unchecked")));
    }
  }

  class radioButtonListener implements ItemListener {
    public void itemStateChanged(ItemEvent e) {
      label.setText(((JRadioButton)e.getItem()).getText()
      +" radioButton: " + (e.getStateChange()==1?"checked":"unchecked"));
    }
  }

  public static void main(String[] args) {
    SwingDemo  swingDemo = new SwingDemo();
  }

}
