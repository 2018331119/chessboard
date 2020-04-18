package swing;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class swing5 extends JFrame implements ActionListener{
    private Container c;
    private JTextField jt;
    private JLabel jl,jl1,jl2,jl3,jl4,jl5;
    private JButton jb,jb1;
    private Font f;
    static int count;
    swing5(int countt)
    {
        count = countt;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Instruction of game level");
        this.setBounds(100,100,500,500);
        init();
    }
    public void init()
    {
        c = this.getContentPane();
        c.setLayout(null);
        f = new Font("Arial",Font.BOLD,19);
        jl = new JLabel();
        jl.setBounds(10,10,400,20);
        jl.setFont(f);
        c.add(jl);
         jl1 = new JLabel();
        jl1.setBounds(10,40,300,20);
        jl1.setFont(f);
        c.add(jl1);
         jl2 = new JLabel();
        jl2.setBounds(10,70,500,20);
        jl2.setFont(f);
        c.add(jl2);
        jl3 = new JLabel();
        jl3.setBounds(10,100,300,20);
        jl3.setFont(f);
        c.add(jl3);
        jl4 = new JLabel();
        jl4.setBounds(10,130,300,20);
        jl4.setFont(f);
        c.add(jl4);
        jl5 = new JLabel();
        jl5.setBounds(10,160,300,20);
        jl5.setFont(f);
        c.add(jl5);
        jb = new JButton("START");
        jb.setBounds(180,190,120,20);
        jb.setFont(f);
        c.add(jb);
        jb.addActionListener(this);
         jb1 = new JButton("BACK");
        jb1.setBounds(180,190,120,20);
        jb1.setFont(f);
        c.add(jb1);
        jb1.addActionListener(this);
       if(count==1)
       {
           jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("You have to placed 16 Knight.");
           jl2.setText("So that they can't attack each");
           jl3.setText("other in their first move.");
            jl4.setText("You have 10 seconds.");
           jl5.setText("Press START to start the game.");
       }
       else  if(count==2)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("You have to placed 8 Rock.");
           jl2.setText("So that they can't attack each");
           jl3.setText("other in their first move.");
           jl4.setText("You have 10 seconds.");
           jl5.setText("Press START to start the game.");
       }
        else  if(count==3)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("You have to placed 8 Queen.");
           jl2.setText("So that they can't attack each");
           jl3.setText("other in their first move.");
            jl4.setText("You have 10 seconds.");
           jl5.setText("Press START to start the game.");
       }
        else  if(count==4)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("You have to placed 8 Bishop.");
           jl2.setText("So that they can't attack each");
           jl3.setText("other in their first move.");
            jl4.setText("You have 10 seconds.");
           jl5.setText("Press START to start the game.");
       }
        else  if(count==5)
       {
           jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("You have to placed 16 knight");
           jl2.setText("Press START to start the game");
       }
        else  if(count==6)
       {
           jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("You have to placed 16 rock");
           jl2.setText("Press START to start the game");
       }
        else  if(count==7)
       {
           jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("You have to placed 16 queen");
           jl2.setText("Press START to start the game");
       }
        else  if(count==8)
       {
           jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("You have to placed 16 Bishop");
           jl2.setText("Press START to start the game");
       }
       
    }
   @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==jb){
        if(count==1){
         swing1 frame = new swing1();
            frame.setVisible(true);
        }
        else if(count==2)
        {
            swing6 frame = new swing6();
            frame.setVisible(true);
        }
        else if(count==3)
        {
            swing7 frame = new swing7();
            frame.setVisible(true);
        }
        else if(count==4)
        {
            swing8 frame = new swing8();
            frame.setVisible(true);
        }
        else if(count==5)
        {
            swing9 frame = new swing9();
            frame.setVisible(true);
        }
        else if(count==6)
        {
            swing10 frame = new swing10();
            frame.setVisible(true);
        }
        else if(count==7)
        {
            swing11 frame = new swing11();
            frame.setVisible(true);
        }
        else if(count==8)
        {
            swing12 frame = new swing12();
            frame.setVisible(true);
        }
        
        }
        else
            dispose();
    } 
    public static void main(String[] args) {
        swing5 frame = new swing5(0);
        frame.setVisible(true);
    }
}
