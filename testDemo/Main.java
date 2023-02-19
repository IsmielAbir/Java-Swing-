package testDemo;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        multiplaction frame = new multiplaction();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,20,330,800);
        frame.setTitle("Multiplication Table");
    }
}
