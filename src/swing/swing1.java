//knight
package swing;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
public class swing1 implements ActionListener{
    private JPanel jp,panel;
    Container c;
    private GridLayout gd;
    private JButton[][] btn;
    private JButton btn1;
    private ImageIcon icon;
    int counter = 10;
    private JLabel jl;
    Timer timer;
    int count = 0,rr,ll,rr1,ll1,rr2,ll2;
    int arr1[] = {1,1,-1,-1,2,2,-2,-2};
    int arr2[] = {-2,2,-2,2,1,-1,1,-1};
    public void in1(Container c)
    {
        this.c=c;
        panel = new JPanel();
        panel.setLayout(null);
        jl = new JLabel("Timer:10");
        jl.setBounds(220,0,80,25);
        jp = new JPanel();
        gd = new GridLayout(8,8);
        jp.setLayout(gd);
        jp.setBounds(0,25,785,737);
        panel.add(jp);
        c.add(panel,"1");
        panel.add(jl);
        Font f = new Font("Arial",Font.BOLD,22);
        jl.setFont(f);
        btn = new JButton[8][8];
        icon = new ImageIcon(getClass().getResource("knight.png"));
        for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++){
             btn[i][j] = new JButton();
            if((i+j)%2==0){
            btn[i][j].setBackground(Color.BLACK);
        }
            else
            {
            btn[i][j].setBackground(Color.WHITE);  
            }
            jp.add(btn[i][j]);
          btn[i][j].addActionListener(this);
        }
    }
     ActionListener a = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jl.setText("Timer:"+(--counter));
          if (counter <= 0) {
          timer.stop();
          JOptionPane.showMessageDialog(null,"Oops! Your game is over.");
          ((CardLayout)c.getLayout()).show(c,"4");
        }
        
      }
    };
    timer = new Timer(1000, a);
    timer.start();
      
    }
 @Override
    public void actionPerformed(ActionEvent ae){
        Object src = ae.getSource();
     for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
             if(btn[i][j]==src)
             {
                 if(btn[i][j].getIcon()!=icon)
                     count++;
                 break;
             }
         }
     }
          for(int i=0;i<8;i++)
          {
              for(int j=0;j<8;j++)
              {
                  if(btn[i][j]==src)
                  {
                      rr1=0;
                      btn[i][j].setIcon(icon);
                      for (int k = 0; k < 8; k++){
                          rr=arr1[k]+i;
                          ll=arr2[k]+j;
                          if(rr>=0 && rr<8 && ll>=0 && ll<8 && btn[rr][ll].getIcon()==icon)
                          {
                           rr1=1;   
                          }
                      }
                      if(rr1==1){
                          timer.stop();
                            btn[i][j].setIcon(null);
                          btn[i][j].setBackground(Color.red);
                      JOptionPane.showMessageDialog(null,"OOps!Your game is over.");
                       ((CardLayout)c.getLayout()).show(c,"4");
                      }
                      else if(count==16){
                          timer.stop();
                           btn[i][j].setIcon(null);
                          btn[i][j].setBackground(Color.green);
                          JOptionPane.showMessageDialog(null,"Congratulation,your level is complete");
                      swing13 frame = new swing13();
                      frame.in13(c,1);
                      ((CardLayout)c.getLayout()).show(c,"13");
                      }
                  }
              }
          }
          
    }
    
}
