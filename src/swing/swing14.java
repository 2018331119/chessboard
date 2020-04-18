package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class swing14 extends JFrame implements  ActionListener{
    private Container c;
    private JLabel jl,jl1;
    private Font f;
    private JButton jb,jb1;
    private JPasswordField jp;
    static int count;
    swing14(int countt)
    {
        count = countt;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100,20,420,140);
        this.setTitle("Take your password");
        init();
    }
    public void init()
    {
        c=this.getContentPane();
        c.setBackground(Color.green);
        c.setLayout(null);
        f = new Font("Arial",Font.BOLD,19);
        jl = new JLabel("Enter your password: ");
        jl.setBounds(10,10,207,20);
        jl.setFont(f);
        c.add(jl);
         jp = new JPasswordField();
        jp.setBounds(210,10,150,20);
        jp.setFont(f);
        c.add(jp);
         jb = new JButton("Enter");
        jb.setBounds(168,40,84,20);
        jb.setFont(f);
        jb.addActionListener(this);
        c.add(jb);
         jb1 = new JButton("Back");
        jb1.setBounds(168,70,84,20);
        jb1.setFont(f);
        jb1.addActionListener(this);
        c.add(jb1);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==jb){
           String s = jp.getText();
           if(count==2)
           {
                if(s.equals("2")){
            swing5 frame = new swing5(2);
            frame.setVisible(true);
           }
           else
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
           }
           else if(count==3)
           {
                if(s.equals("3")){
            swing5 frame = new swing5(3);
            frame.setVisible(true);
           }
           else
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
           }
           else if(count==4)
           {
                if(s.equals("4")){
            swing5 frame = new swing5(4);
            frame.setVisible(true);
           }
           else
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
           }
           else if(count==5)
           {
                if(s.equals("5")){
            swing5 frame = new swing5(5);
            frame.setVisible(true);
           }
           else
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
           }
           else if(count==6)
           {
                if(s.equals("6")){
            swing5 frame = new swing5(6);
            frame.setVisible(true);
           }
           else
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
           }
           else if(count==7)
           {
                if(s.equals("7")){
            swing5 frame = new swing5(7);
            frame.setVisible(true);
           }
           else
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
           }
           else if(count==8)
           {
                if(s.equals("8")){
            swing5 frame = new swing5(8);
            frame.setVisible(true);
           }
           else
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
           }
        }
          dispose(); 
       }
    public static void main(String[] args){
        swing14 frame = new swing14(2);
        frame.setVisible(true);
    }
}
