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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.CardLayout;
public class swing4{
    private JTextField jt;
    private JLabel jl;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13;
    private JPanel jp4;
    private Font f;
    public void in4(Container c)
    {
        jp4 =new JPanel();
        c.add(jp4,"4");   
        jp4.setLayout(null);
        f=new Font("Arial",Font.BOLD,19);
        jl = new JLabel("Select a level");
        jl.setBounds(340,10,121,20);
        jl.setOpaque(true);
        jl.setBackground(Color.yellow);
        jl.setFont(f);
        jp4.add(jl);
        btn1 = new JButton("Level 1");
        btn1.setBounds(300,50,200,20);
         btn1.setFont(f);
        jp4.add(btn1);
        btn2 = new JButton("Level 2");
        btn2.setBounds(300,80,200,20);
        btn2.setFont(f);
        jp4.add(btn2);
        btn3 = new JButton("Level 3");
        btn3.setBounds(300,110,200,20);
        btn3.setFont(f);
        jp4.add(btn3);
        btn4 = new JButton("Level 4");
        btn4.setBounds(300,140,200,20);
        btn4.setFont(f);
        jp4.add(btn4);
        btn5 = new JButton("Level 5");
        btn5.setBounds(300,170,200,20);
        btn5.setFont(f);
        jp4.add(btn5);
        btn6 = new JButton("Level 6");
        btn6.setBounds(300,200,200,20);
        btn6.setFont(f);
        jp4.add(btn6);
        btn7 = new JButton("Level 7");
        btn7.setBounds(300,230,200,20);
        btn7.setFont(f);
        jp4.add(btn7);
        btn8 = new JButton("Level 8");
        btn8.setBounds(300,260,200,20);
        btn8.setFont(f);
        jp4.add(btn8);
        btn9 = new JButton("Level 9");
        btn9.setBounds(300,290,200,20);
        btn9.setFont(f);
        jp4.add(btn9);
        btn10 = new JButton("Level 10");
        btn10.setBounds(300,320,200,20);
        btn10.setFont(f);
        jp4.add(btn10);
         btn11 = new JButton("Level 11");
        btn11.setBounds(300,350,200,20);
        btn11.setFont(f);
        jp4.add(btn11);
         btn12 = new JButton("Level 12");
        btn12.setBounds(300,380,200,20);
        btn12.setFont(f);
        jp4.add(btn12);
        btn13 = new JButton("EXIT");
        btn13.setBounds(300,410,200,20);
        btn13.setFont(f);
        jp4.add(btn13);
        btn13.addActionListener(e -> {
            ((CardLayout) c.getLayout()).show(c,"0");
        });
         btn1.addActionListener(e -> {
             swing5 frame1 = new swing5();
            frame1.in5(c,1);
            ((CardLayout)c.getLayout()).show(c,"5");
         });
          btn2.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,2);
            ((CardLayout) c.getLayout()).show(c,"14");
        });
      btn3.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,3);
             ((CardLayout) c.getLayout()).show(c,"14");
        });
         btn4.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,4);
             ((CardLayout) c.getLayout()).show(c,"14");
        });
        btn5.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,5);
             ((CardLayout) c.getLayout()).show(c,"14");
        });
          btn6.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,6);
             ((CardLayout) c.getLayout()).show(c,"14");
        });
        btn7.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,7);
             ((CardLayout) c.getLayout()).show(c,"14");
        });
            btn8.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,8);
             ((CardLayout) c.getLayout()).show(c,"14");
        });
              btn9.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,9);
             ((CardLayout) c.getLayout()).show(c,"14");
        });
               btn10.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,10);
             ((CardLayout) c.getLayout()).show(c,"14");
        });
                btn11.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,11);
             ((CardLayout) c.getLayout()).show(c,"14");
        });
                 btn12.addActionListener(e -> {
             swing14 frame1 = new swing14();
            frame1.in14(c,12);
             ((CardLayout) c.getLayout()).show(c,"14");
        });
    }
}
