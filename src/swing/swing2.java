
package swing;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class swing2{
    private JTextField jt;
    private JLabel jl;
    private JPanel jp;
    private JButton jb;
    public void in2(Container c)
    {
        jp = new JPanel();
        jp.setLayout(null);
        c.add(jp,"2");
        jl = new JLabel("Read Carefully off all rule");
        jl.setBounds(100,10,200,20);
        jp.add(jl);
         jt = new JTextField();
        jt.setBounds(100,40,200,200);
        jp.add(jt);
        jb = new JButton("Back");
        jb.setBounds(100,250,100,20);
        jp.add(jb);
         jb.addActionListener(e -> {
             ((CardLayout)c.getLayout()).show(c,"0");
        });
    }
}
