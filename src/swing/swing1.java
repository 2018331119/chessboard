//knight
package swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class swing1 extends JFrame implements ActionListener{
    private Container c;
    private GridLayout gd;
    private JButton[][] btn;
    private JButton btn1;
    private ImageIcon icon;
    int count = 0,rr,ll,rr1,ll1,rr2,ll2;
    int arr1[] = {1,1,-1,-1,2,2,-2,-2};
    int arr2[] = {-2,2,-2,2,1,-1,1,-1};
    swing1()
    {
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100,20,1200,800);
        this.setTitle("Chessboard");
        init();
    }
    public void init()
    {
        c = this.getContentPane();
        c.setBackground(Color.yellow);
        gd = new GridLayout(8,8);
        c.setLayout(gd);
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
            btn[i][j].addActionListener(this);
             c.add(btn[i][j]);
        }
    }
}
 @Override
    public void actionPerformed(ActionEvent ae) {
      if(count<=14)
      {
          count++;
          Object src = ae.getSource();
          for(int i=0;i<8;i++)
          {
              for(int j=0;j<8;j++)
              {
                  if(btn[i][j]==src)
                  {
                      rr1=0;
                      btn[i][j].setIcon(null);
                      btn[i][j].setIcon(icon);
                      for (int k = 0; k < 8; k++) {
                          rr=arr1[k]+i;
                          ll=arr2[k]+j;
                          if(rr>=0 && rr<8 && ll>=0 && ll<8 && btn[rr][ll].getIcon()==icon)
                          {
                           rr1=1;   
                          }
                      }
                      if(rr1==1){
                          btn[i][j].setIcon(null);
                          btn[i][j].setBackground(Color.red);
                      JOptionPane.showMessageDialog(null,"OOps!Your game is over.");
                      dispose();
                      }
                      else
                          return;
                  }
              }
          }
      }
      else
      {
          Object src = ae.getSource();
          for(int i=0;i<8;i++)
          {
              for(int j=0;j<8;j++)
              {
                  if(btn[i][j]==src)
                  {
                      rr1=0;
                      btn[i][j].setIcon(null);
                      btn[i][j].setBackground(Color.green);
                      for (int k = 0; k < 8; k++) {
                          rr=arr1[k]+i;
                          ll=arr2[k]+j;
                          if(rr>=0 && rr<8 && ll>=0 && ll<8 && btn[rr][ll].getBackground()==Color.green)
                          {
                           rr1=1;   
                          }
                      }
                      if(rr1==1){
                          btn[i][j].setBackground(Color.red);
                      JOptionPane.showMessageDialog(null,"OOps!Your game is over.");
                      }
                      else
                          JOptionPane.showMessageDialog(null,"Congratulation,your level is complete");
                      dispose();
                  }
              }
          }
      }
    }   
    public static void main(String[] args) {
        swing1 frame = new swing1();
       frame.setVisible(true);
    }
}
