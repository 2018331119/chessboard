package swing;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class swing5{
    private JPanel jp5;
    private JTextField jt;
    private JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6;
    private JButton jb,jb1;
    private Font f;
    public void in5(Container c,int count)
    {
        jp5 = new JPanel();
        jp5.setLayout(null);
        c.add(jp5,"5");
        f = new Font("Arial",Font.BOLD,19);
        jl = new JLabel();
        jl.setBounds(10,10,400,20);
        jl.setFont(f);
        jp5.add(jl);
         jl1 = new JLabel();
        jl1.setBounds(10,40,300,20);
        jl1.setFont(f);
        jp5.add(jl1);
         jl2 = new JLabel();
        jl2.setBounds(10,70,500,20);
        jl2.setFont(f);
        jp5.add(jl2);
        jl3 = new JLabel();
        jl3.setBounds(10,100,300,20);
        jl3.setFont(f);
        jp5.add(jl3);
        jl4 = new JLabel();
        jl4.setBounds(10,130,300,20);
        jl4.setFont(f);
        jp5.add(jl4);
        jl5 = new JLabel();
        jl5.setBounds(10,160,300,20);
        jl5.setFont(f);
        jp5.add(jl5);
         jl6 = new JLabel();
        jl6.setBounds(10,190,300,20);
        jl6.setFont(f);
        jp5.add(jl6);
        jb = new JButton("START");
        jb.setBounds(180,220,120,20);
        jb.setFont(f);
        jp5.add(jb);
        jb1 = new JButton("BACK");
        jb1.setBounds(180,250,120,20);
        jb1.setFont(f);
        jp5.add(jb1);
       if(count==1)
       {
           jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there is 0 knight");
           jl2.setText("You have to placed 16 Knight.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
       else  if(count==2)
       {
             jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there is 0 Rock");
           jl2.setText("You have to placed 8 Rock.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        else  if(count==3)
       {
             jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there is 0 Queen");
           jl2.setText("You have to placed 8 Queen.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        else  if(count==4)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there is 0 Bishop");
           jl2.setText("You have to placed 8 Bishop.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        else  if(count==5)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there is 1 knight");
           jl2.setText("You have to placed 16 Knight.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        else  if(count==6)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there is 1 Rock");
           jl2.setText("You have to placed 8 Rock.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        else  if(count==7)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there is 1 Queen");
           jl2.setText("You have to placed 8 Queen.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        else  if(count==8)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there is 1 Bishop");
           jl2.setText("You have to placed 8 Bishop.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        else  if(count==9)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there are 2 knight");
           jl2.setText("You have to placed 16 Knight.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        else  if(count==10)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there are 2 Rock");
           jl2.setText("You have to placed 8 Rock.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        else  if(count==11)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there are 2 Queen");
           jl2.setText("You have to placed 8 Queen.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        else  if(count==12)
       {
            jl.setText("You are given a 8X8 chessboard.");
           jl1.setText("Initially there are 2 Bishop");
           jl2.setText("You have to placed 8 Bishop.");
           jl3.setText("So that they can't attack each");
           jl4.setText("other in their first move.");
            jl5.setText("You have 10 seconds.");
           jl6.setText("Press START to start the game.");
       }
        jb.addActionListener(e -> {
            if(count==1){
         swing1 frame = new swing1();
            frame.in1(c);
            ((CardLayout) c.getLayout()).show(c,"1");
        }
        else if(count==2)
        {
            swing6 frame = new swing6();
            frame.in6(c);
             ((CardLayout) c.getLayout()).show(c,"6");
        }
        else if(count==3)
        {
            swing7 frame = new swing7();
              frame.in7(c);
            ((CardLayout) c.getLayout()).show(c,"7");
        }
        else if(count==4)
        {
            swing8 frame = new swing8();
              frame.in8(c);
              ((CardLayout) c.getLayout()).show(c,"8");
        }
        else if(count==5)
        {
            swing9 frame = new swing9();
              frame.in9(c);
             ((CardLayout) c.getLayout()).show(c,"9");
        }
        else if(count==6)
        {
            swing10 frame = new swing10();
              frame.in10(c);
             ((CardLayout) c.getLayout()).show(c,"10");
        }
        else if(count==7)
        {
            swing11 frame = new swing11();
              frame.in11(c);
             ((CardLayout) c.getLayout()).show(c,"11");
        }
        else if(count==8)
        {
            swing12 frame = new swing12();
              frame.in12(c);
              ((CardLayout) c.getLayout()).show(c,"12");
        }
           else if(count==9)
        {
            swing15 frame = new swing15();
              frame.in15(c);
              ((CardLayout) c.getLayout()).show(c,"15");
        }
             else if(count==10)
        {
            swing16 frame = new swing16();
              frame.in16(c);
              ((CardLayout) c.getLayout()).show(c,"16");
        }
             else if(count==11)
        {
            swing17 frame = new swing17();
              frame.in17(c);
              ((CardLayout) c.getLayout()).show(c,"17");
        }
             else if(count==12)
        {
            swing18 frame = new swing18();
              frame.in18(c);
              ((CardLayout) c.getLayout()).show(c,"18");
        }
        });
         jb1.addActionListener(e -> {
           ((CardLayout) c.getLayout()).show(c,"4");
        });
    }
    } 
