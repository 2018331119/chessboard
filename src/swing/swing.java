package swing;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class swing extends JFrame implements ActionListener{
    private Container c1;
    private JLabel label1;
    private JButton btn1,btn2,btn3,btn4;
    private Font f;
    private JPanel jp;
    private CardLayout cd;
    swing()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10,10,800,800);
        this.setTitle("NEW GAME");
        cd = new CardLayout();
        init1();
    }
    public void init1()
    {
        c1 = this.getContentPane();
        c1.setLayout(cd);
        f = new Font("Arial",Font.BOLD,22);
        jp = new JPanel();
        jp.setBackground(Color.pink);
        jp.setLayout(null);
        c1.add(jp,"0");
        label1 = new JLabel("Welcome to new game");
        label1.setBounds(280,10,240,30);
         label1.setForeground(Color.MAGENTA);
         label1.setOpaque(true);
         label1.setBackground(Color.GREEN);
         label1.setFont(f);
        jp.add(label1);
        btn1 = new JButton("START");
        btn1.setBounds(325,50,150,30);
        jp.add(btn1);
         btn2 = new JButton("RULES");
        btn2.setBounds(325,90,150,30);
        jp.add(btn2);
         btn3 = new JButton("DEVELOPERS");
        btn3.setBounds(325,130,150,30);
        jp.add(btn3);
         btn4 = new JButton("EXIT");
        btn4.setBounds(325,170,150,30);
        jp.add(btn4);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
    }
     @Override
   public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==btn1)
         {
             swing4 frame1 = new swing4();
             frame1.in4(c1);
             cd.show(c1,"4");
         }
         else if(ae.getSource()==btn2)
         {
             swing2 frame = new swing2();
               frame.in2(c1);
               cd.show(c1,"2");
         }
         else if(ae.getSource()==btn3)
         {
             swing3 frame = new swing3();
               frame.in3(c1);
               cd.show(c1,"3");
         }
         else if(ae.getSource()==btn4)
         {
             System.exit(0);  
         }
   }
    public static void main(String[] args) {
    swing newframe = new swing();
    newframe.setVisible(true);
    }  
}
