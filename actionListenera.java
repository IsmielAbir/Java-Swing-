import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Container;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionListenera extends JFrame{

    private Container c;
    private JTextField text1, text2;

    actionListenera(){
        action();
    }

    public void action(){

        c = this.getContentPane();
        c.setLayout(null);
        
        text1 = new JTextField();
        text1.setBounds(10,10,200,25);
        c.add(text1);


        text2 = new JTextField();
        text2.setBounds(10,50,200,25);
        c.add(text2);


       text1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String a = text1.getText();
            JOptionPane.showMessageDialog(null, "Text is "+ a);
        }

       });


       
       text2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String a = text2.getText();
            JOptionPane.showMessageDialog(null, "Text is "+ a);
        }

       });
    }


    public static void main(String[] args) {
        actionListenera frame = new actionListenera();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,450);
        frame.setTitle("Ab");
    }
    
}
