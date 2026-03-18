import javax.swing.*;
import java.awt.event.*;
public class Ff extends JFrame implements ActionListener{
 private JLabel l1, l2, l3;
 private JTextField t1, t2;
 private JButton b1, b2;
 public Ff(){
  setLayout(null);
  l1 = new JLabel("Valor 1");
  l1.setBounds(15,10,100,30);
  add(l1);
  l2 = new JLabel("Valor 2");
  l2.setBounds(15,40,100,30);
  add(l2);
  l3 = new JLabel("Resultado:");
  l3.setBounds(120,95,100,30);
  add(l3);
  t1 = new JTextField();
  t1.setBounds(100,10,100,30);
  add(t1);
  t2 = new JTextField();
  t2.setBounds(100,45,100,30);
  add(t2);
  b1 = new JButton("Sumar");
  b1.setBounds(15,95,90,30);
  add(b1);
  b1.addActionListener(this);
  b2 = new JButton("Cerrar");
  b2.setBounds(230,95,90,30);
  add(b2);
  b2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
 if(e.getSource() == b1){
  int s1 = 0, s2 = 0, r = 0;
  s1 = Integer.parseInt(t1.getText());
  s2 = Integer.parseInt(t2.getText());
  r = s1 + s2;
  l3.setText("Resultado: " + r);
  t1.setText("");
  t2.setText("");
  }
 if(e.getSource() == b2){
  System.exit(0);
  }
 } 
 public static void main(String args[]){
 
 Ff ff1 = new Ff();
 ff1.setBounds(0,0,350,200);
 ff1.setResizable(true);
 ff1.setVisible(true);
 ff1.setLocationRelativeTo(null);
 }
}