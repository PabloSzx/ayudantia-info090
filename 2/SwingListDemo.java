import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SwingListDemo {
  private JFrame mainFrame; //Ventana de la interfaz gráfica
  public JLabel label;
  private JButton button;
  JList<String> fruitList;

  public void createFrame() {
    mainFrame = new JFrame("Ejemplo Interfaz gráfica");
    mainFrame.setSize(400,400);
    mainFrame.setLayout(new GridLayout(3, 1));
    label = new JLabel("Este es un texto JLabel", JLabel.CENTER);
    mainFrame.add(label);
  }

  public SwingListDemo() {

    createFrame();
    DefaultListModel<String> fruitsName = new DefaultListModel<String>();

    fruitsName.addElement("Apple");
    fruitsName.addElement("Grapes");
    fruitsName.addElement("Mango");
    fruitsName.addElement("Pear");

    fruitList = new JList<String>(fruitsName);

    mainFrame.add(fruitList);

    button = new JButton("Show");

    button.addActionListener(new ListListener());
    mainFrame.add(button);

    mainFrame.setVisible(true);
  }

  class ListListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      String data = "";
      if(fruitList.getSelectedIndex() != -1){
        data += "Frutas seleccionadas: ";
        for(Object vegetable:fruitList.getSelectedValuesList()){
          data += vegetable + " ";
        }
      }
      label.setText(data);
    }
  }

  public static void main(String[] args) {
    SwingListDemo  swingDemo = new SwingListDemo();
  }

}
