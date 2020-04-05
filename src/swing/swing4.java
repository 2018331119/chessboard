
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
import javax.swing.JTextField;
public class swing4 extends JFrame implements ActionListener{
    private Container c;
    private JTextField jt;
    private JLabel jl;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;
    private Font f;
    swing4()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Description of the developers");
        this.setBounds(100,100,500,500);
        init();
    }
    public void init()
    {
        c = this.getContentPane();
        c.setLayout(null);
        f=new Font("Arial",Font.BOLD,19);
        jl = new JLabel("Select a level");
        jl.setBounds(190,10,121,20);
        jl.setOpaque(true);
        jl.setBackground(Color.yellow);
        jl.setFont(f);
        c.add(jl);
        btn1 = new JButton("Level 1");
        btn1.setBounds(150,50,200,20);
         btn1.setFont(f);
        c.add(btn1);
        btn2 = new JButton("Level 2");
        btn2.setBounds(150,80,200,20);
        btn2.setFont(f);
        c.add(btn2);
        btn3 = new JButton("Level 3");
        btn3.setBounds(150,110,200,20);
        btn3.setFont(f);
        c.add(btn3);
        btn4 = new JButton("Level 4");
        btn4.setBounds(150,140,200,20);
        btn4.setFont(f);
        c.add(btn4);
        btn5 = new JButton("Level 5");
        btn5.setBounds(150,170,200,20);
        btn5.setFont(f);
        c.add(btn5);
        btn6 = new JButton("Level 6");
        btn6.setBounds(150,200,200,20);
        btn6.setFont(f);
        c.add(btn6);
        btn7 = new JButton("Level 7");
        btn7.setBounds(150,230,200,20);
        btn7.setFont(f);
        c.add(btn7);
        btn8 = new JButton("Level 8");
        btn8.setBounds(150,260,200,20);
        btn8.setFont(f);
        c.add(btn8);
        btn9 = new JButton("Level 9");
        btn9.setBounds(150,290,200,20);
        btn9.setFont(f);
        c.add(btn9);
        btn10 = new JButton("Level 10");
        btn10.setBounds(150,320,200,20);
        btn10.setFont(f);
        c.add(btn10);
        btn11 = new JButton("EXIT");
        btn11.setBounds(150,350,200,20);
        btn11.setFont(f);
        c.add(btn11);
        btn11.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);   
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btn1)
        {
            swing5 frame1 = new swing5(1);
            frame1.setVisible(true);
        }
        else if(ae.getSource()==btn11)
        {
            JOptionPane.showMessageDialog(null,"Good Bye!");
            dispose();
        }
        else if(ae.getSource()==btn2)
        {
            swing5 frame1 = new swing5(2);
            frame1.setVisible(true);
        }
        else if(ae.getSource()==btn3)
        {
            swing5 frame1 = new swing5(3);
            frame1.setVisible(true);
        }
        else if(ae.getSource()==btn4)
        {
            swing5 frame1 = new swing5(4);
            frame1.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Sorry! We do not create this level.");
            
        }
    }
    public static void main(String[] args) {
        swing4 frame = new swing4();
        frame.setVisible(true);
    }
}
