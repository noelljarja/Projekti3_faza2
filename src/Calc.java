import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Projekti 3 Faza 2
Noel Ljarja Grupi 4
Java, Informatike 2020
9.5.2020
Projekti 3 faza 2

Programi realizon llogaritjen e numrit qe vendoset nga perdoruesi me rritjen ose zbritjen simas hapit qe zgjedh perdoruesi.  Veprimi gjithashtu zgjidhet nga perdoruesi.
 */
public class Calc extends JFrame{
    private JTextField textField1;
    private JComboBox comboBox1;
    private JRadioButton rritRadioButton;
    private JRadioButton zvogeloRadioButton;
    private JButton llogaritButton;
    private JPanel frame;

    public Calc() {
        llogaritButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rritRadioButton.isSelected()||zvogeloRadioButton.isSelected()) {
                    int nr = 0;
                    int hapi = 1;
                    int rezultat = 0;
                    nr = Integer.parseInt(textField1.getText());
                    hapi = Integer.parseInt(comboBox1.getSelectedItem().toString());
                    if (rritRadioButton.isSelected()) {
                        rezultat = nr + hapi;
                    }
                    if (zvogeloRadioButton.isSelected()) {
                        rezultat = nr - hapi;
                    }
                    textField1.setText("" + rezultat);
                }
            }
        });
    }
    public static void main(String [] args){
        Calc calcFrame = new Calc();
        calcFrame.setContentPane(calcFrame.frame);
        calcFrame.pack();
        calcFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        calcFrame.setVisible(true);
    }
}
