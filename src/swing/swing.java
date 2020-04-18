
package swing;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class swing extends JFrame implements ActionListener{
    private Container c1;
    private JLabel label1;
    private JButton btn1,btn2,btn3,btn4;
    private Font f;
    swing()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("NEW GAME");
        init1();
    }
    public void init1()
    {
        c1 = this.getContentPane();
        c1.setLayout(null);
        c1.setBackground(Color.yellow);
        f = new Font("Arial",Font.BOLD,22);
        label1 = new JLabel("Welcome to new game");
        label1.setBounds(100,10,240,30);
         label1.setForeground(Color.GREEN);
         label1.setOpaque(true);
         label1.setBackground(Color.BLUE);
         label1.setFont(f);
        c1.add(label1);
        btn1 = new JButton("START");
        btn1.setBounds(150,50,150,30);
        c1.add(btn1);
         btn2 = new JButton("RULES");
        btn2.setBounds(150,90,150,30);
        c1.add(btn2);
         btn3 = new JButton("DEVELOPERS");
        btn3.setBounds(150,130,150,30);
        c1.add(btn3);
         btn4 = new JButton("EXIT");
        btn4.setBounds(150,170,150,30);
        c1.add(btn4);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        
    }
     @Override
   public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==btn1)
         {
             JOptionPane.showMessageDialog(null,"Welcome to our new game");
             swing4 frame1 = new swing4();
               frame1.setVisible(true);
         }
         else if(ae.getSource()==btn2)
         {             JOptionPane.showMessageDialog(null,"Game rules are one click away");
             swing2 frame = new swing2();
               frame.setVisible(true);
         }
         else if(ae.getSource()==btn3)
         {
             JOptionPane.showMessageDialog(null,"Bio of this game developer is one click away");
             swing3 frame = new swing3();
               frame.setVisible(true);
         }
         else if(ae.getSource()==btn4)
         {
             JOptionPane.showMessageDialog(null,"See you next time");
             System.exit(0);
             
         }
   }
    public static void main(String[] args) {
    swing newframe = new swing();
    newframe.setVisible(true);
    }  
}
