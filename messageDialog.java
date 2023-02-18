import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class messageDialog{
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("assets/ah.JPG");
        JOptionPane.showMessageDialog(null, "wrong password","ab", JOptionPane.ERROR_MESSAGE, icon);
    }
}