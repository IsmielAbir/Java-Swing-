import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
class labelDemo extends JFrame{

    private Container c;
    JLabel user, second;
    Font f;

    labelDemo(){
        writeprogram();
    }

    public void writeprogram(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);

        f = new Font("Arial", Font.ITALIC, 14);
        
        user = new JLabel();
        user.setText("Welcome in the Java Swing: ");
        user.setBounds(10,10,250,10);
        user.setFont(f);
        user.setToolTipText("Test");


        second = new JLabel("What's your plan");
        second.setBounds(10,40,250,20);

        c.add(second);

        c.add(user);



    }

    public static void main(String[] args) {
        labelDemo frame = new labelDemo();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,400,500);
    }

}