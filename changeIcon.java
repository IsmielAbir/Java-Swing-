import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class changeIcon extends JFrame {
    private ImageIcon icon;
    private Container c;

    changeIcon(){
        change();
    }

    public void change(){

        
        c = this.getContentPane();
        c.setBackground(Color.BLUE);

        icon = new ImageIcon(getClass().getResource("assets/ah.JPG"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        changeIcon frame = new changeIcon();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    
}
