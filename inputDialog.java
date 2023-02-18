import javax.swing.JOptionPane;
class inputDialog{
    public static void main(String[] args) {
       String ab = JOptionPane.showInputDialog("Enter you name");
        JOptionPane.showMessageDialog(null, ab+" Welcome");
    }
}