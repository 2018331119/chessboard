
package swing;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class swing2 extends JFrame{
    private Container c;
    private JTextField jt;
    private JLabel jl;
    swing2()
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Chess Rule");
        this.setBounds(100,100,500,500);
        init();
    }
    public void init()
    {
        c = this.getContentPane();
        c.setLayout(null);
        jl = new JLabel("Read Carefully off all rule");
        jl.setBounds(100,10,200,20);
        c.add(jl);
         jt = new JTextField();
        jt.setBounds(100,40,200,200);
        c.add(jt);
    }
    public static void main(String[] args) {
        swing2 frame = new swing2();
        frame.setVisible(true);
    }
}
