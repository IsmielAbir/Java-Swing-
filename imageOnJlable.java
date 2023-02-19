import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;

class imageOnJlable extends JFrame{

    private Container c;
    JLabel user, image;
    ImageIcon img;


    imageOnJlable(){
        working();
    }

    public void working(){

        c = this.getContentPane();
        c.setLayout(null);

        user = new JLabel("Enter Your Name: ");
        user.setBounds(10,10,150,10);


        img = new ImageIcon(getClass().getResource("assets/ah.JPG"));

        image = new JLabel(img);
        image.setBounds(10,30,200,200);


        c.add(user);
        c.add(image);
        

    }

    public static void main(String[] args) {
        imageOnJlable frame = new imageOnJlable();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(150,50,400,350);
        frame.setTitle("ab");
    }

}