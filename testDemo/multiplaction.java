package testDemo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.*;

public class multiplaction extends JFrame{


    private Container c;
    JLabel imagelable, textlable;
    ImageIcon img;
    JTextArea textArea;
    JTextField textfield;
    JButton btn;
    Cursor cur;


    multiplaction(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        img = new ImageIcon(getClass().getResource("12.JPG"));

        imagelable = new JLabel(img);
        imagelable.setBounds(20,20,img.getIconWidth(), img.getIconHeight());
        c.add(imagelable);

        textlable = new JLabel("Enter Any Number: ");
        textlable.setBounds(20, 300, 120,20);
        c.add(textlable);

        textfield = new JTextField();
        textfield.setBounds(130, 300, 140, 20);
        c.add(textfield);

        cur = new Cursor(Cursor.HAND_CURSOR);

        btn = new JButton("Clear");
        btn.setBounds(130, 330, 140, 20);
        btn.setCursor(cur);
        c.add(btn);


        textArea = new JTextArea();
        textArea.setBounds(20, 360, 250,400);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        c.add(textArea);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                textArea.setText("");
                textfield.setText("");

            }
        });

        textfield.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                int num  = Integer.parseInt(textfield.getText());

                for(int i=1;i<=10;i++){
                    int res = num*i;

                    String r = String.valueOf(res);
                    String n = String.valueOf(num);
                    String inc = String.valueOf(i);

                    textArea.append(n+" X "+inc+" = "+r+"\n");

                }

            }
        });
       
    }



    public static void main(String[] args) {
       
    }
    
}
