import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Container;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Login extends JFrame{

    private Container c;
    JLabel user, user1;
    Font f;
    JButton btn, btn1;
    JTextField text;
    JPasswordField text1;


    Login(){
        loginItem();
    }

    public void loginItem(){

        c = this.getContentPane();
        c.setLayout(null);

        f = new Font("Arial", Font.ITALIC, 18);

        user = new JLabel("UserName: ");
        user.setBounds(20,20,100,20);
        user.setFont(f);
        c.add(user);

       text = new JTextField();
       text.setFont(f);

       text.setBounds(120,20, 150,20);
       c.add(text);


       user1 = new JLabel("Password: ");
       user1.setBounds(20,60,100,20);
       user1.setFont(f);
       c.add(user1);

      text1 = new JPasswordField();
      text1.setFont(f);
      text1.setBounds(120,60, 150,20);
      c.add(text1);


      btn = new JButton("Submit");
      btn.setFont(f);
      btn.setBounds(20,100,100,20);
      c.add(btn);

      btn1 = new JButton("Clear");
      btn1.setFont(f);
      btn1.setBounds(140,100,100,20);
      c.add(btn1);


      btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText("");
                text1.setText("");

            }
        });


        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String u = text.getText();
                String p = text1.getText();

                if(u.equals("ab") && p.equals("ab")){
                JOptionPane.showMessageDialog(null, "Welcome "+u);
                imageOnJlable imm = new imageOnJlable();
                imm.setVisible(true);
                }
                else
                JOptionPane.showMessageDialog(null, "You input wrong passwrod; try again");
                

            }
        });
      


    }


    public static void main(String[] args) {
        Login frame = new Login();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,600,600);
        frame.setTitle("Register");

        
    }
    
}
