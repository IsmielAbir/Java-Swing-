import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
class labelDemo extends JFrame{

    private Container c;
    JLabel user;

    labelDemo(){
        writeprogram();
    }

    public void writeprogram(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        user = new JLabel();
        user.setText("Welcome in the Java Swing: ");
        user.setBounds(10,10,250,10);

        c.add(user);



    }

    public static void main(String[] args) {
        labelDemo frame = new labelDemo();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,400,500);
    }

}