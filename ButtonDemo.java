import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;

class ButtonDemo extends JFrame{

    private Container c;

    JButton b;


    ButtonDemo(){
        addButton();
    }

    public void addButton(){

        c = this.getContentPane();
        c.setLayout(null);

        b = new JButton("Submit");
        b.setBounds(10,10,200,20);
        c.add(b);

    }



    public static void main(String[] args) {
        ButtonDemo frame = new ButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,600,600);
        frame.setTitle("Add Buuton");
    }
}
