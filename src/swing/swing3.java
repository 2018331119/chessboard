
package swing;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class swing3 extends JFrame{
    private Container c;
    private JTextField jt;
    private JLabel jl;
    swing3()
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Description of the developers");
        this.setBounds(100,100,500,500);
        init();
    }
    public void init()
    {
        c = this.getContentPane();
        c.setLayout(null);
        jl = new JLabel("Read carefully about all developers");
        jl.setBounds(100,10,200,20);
        c.add(jl);
         jt = new JTextField();
        jt.setBounds(100,40,200,200);
        c.add(jt);
    }
    public static void main(String[] args) {
        swing3 frame = new swing3();
        frame.setVisible(true);
    }
}
