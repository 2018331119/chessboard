package swing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class swing13{
    private JPanel jp;
    private JLabel jl,jl1;
    private Font f;
    private JButton jb;
    public void in13(Container c,int count)
    {
        jp = new JPanel();
        jp.setBackground(Color.green);
        jp.setLayout(null);
        c.add(jp,"13");
        f = new Font("Arial",Font.BOLD,19);
        jl = new JLabel();
        jl.setBounds(10,20,500,20);
        jl.setFont(f);
        jp.add(jl);
         jb = new JButton("Back");
        jb.setBounds(169,40,81,20);
        jb.setFont(f);
        jp.add(jb);
        if(count==1)
        {
            jl.setText("This is your next level password: 2");
        }
        else  if(count==2)
        {
            jl.setText("This is your next level password: 3");
        }
        else if(count==3)
        {
            jl.setText("This is your next level password: 4");
        }
         else if(count==4)
        {
            jl.setText("This is your next level password: 5");
        }
          else if(count==5)
        {
            jl.setText("This is your next level password: 6");
        }
           else if(count==6)
        {
            jl.setText("This is your next level password: 7");
        }
           else if(count==7)
        {
            jl.setText("This is your next level password: 8");
        }
           else if(count==8)
        {
            jl.setText("This is your next level password: 9");
        }
             else if(count==9)
        {
            jl.setText("This is your next level password: 10");
        }
               else if(count==10)
        {
            jl.setText("This is your next level password: 11");
        }
                 else if(count==11)
        {
            jl.setText("This is your next level password: 12");
        }
        else
           {
               jl.setText("This is your next level password: 8");
           }
        jb.addActionListener(e ->{
           ((CardLayout)c.getLayout()).show(c,"4");
                });
    }
}
