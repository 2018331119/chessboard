package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class swing13 extends JFrame implements  ActionListener{
    private Container c;
    private JLabel jl,jl1;
    private Font f;
    private JButton jb;
    static int count;
    swing13(int countt)
    {
        count = countt;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,20,420,100);
        this.setTitle("Take your password");
        init();
    }
    public void init()
    {
        c=this.getContentPane();
        c.setBackground(Color.green);
        c.setLayout(null);
        f = new Font("Arial",Font.BOLD,19);
        jl = new JLabel();
        jl.setBounds(10,20,500,20);
        jl.setFont(f);
        c.add(jl);
         jb = new JButton("Back");
        jb.setBounds(169,40,81,20);
        jb.setFont(f);
        jb.addActionListener(this);
        c.add(jb);
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
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       dispose();
    }
    public static void main(String[] args) {
        swing13 frame = new swing13(0);
        frame.setVisible(true);
    }
}
