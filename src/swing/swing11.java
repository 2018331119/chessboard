//queen and 2nd division
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
import javax.swing.Timer;
import static swing.swing1.counter;
public class swing11 extends JFrame implements ActionListener{
    private Container c;
    private GridLayout gd;
    private JButton[][] btn;
    private JButton btn1;
    private ImageIcon icon;
    private int i,j;
     Timer timer;
    int count = 0,rr,ll,rr1,ll1,rr2,ll2;
    int arr1[] = {1,1,-1,-1,2,2,-2,-2};
    int arr2[] = {-2,2,-2,2,1,-1,1,-1};
    swing11()
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
        icon = new ImageIcon(getClass().getResource("queen.jpg"));
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
        btn[5][3].setBackground(Color.green);
        i=5;
        j=3;
        for (int k = 0; k < 8; k++) {
                          btn[i][k].setBackground(Color.green);
                          btn[k][j].setBackground(Color.green);
                          
                      }
         for (int k = 0; k < 8; k++) {
                          btn[4][k].setBackground(Color.green);
                          btn[k][3].setBackground(Color.green);
                      }
        for (int k = 1; k < 8; k++) {
                          if((i-k>=0) && (j-k>=0))
                          {
                             btn[i-k][j-k].setBackground(Color.green);  
                          }
                          if((i+k<=7) && (j+k<=7))
                          {
                          btn[i+k][j+k].setBackground(Color.green);   
                          }
                           if((i+k<=7) && (j-k>=0))
                          {
                           btn[i+k][j-k].setBackground(Color.green);  
                          }
                            if((i-k>=0) && (j+k<=7))
                          {
                           btn[i-k][j+k].setBackground(Color.green);  
                          }
                      }
        btn[7][7].setBackground(Color.red);
         ActionListener a = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Counter = " + counter);

        if (++counter > 10) {
          timer.stop();
          JOptionPane.showMessageDialog(null,"Oops! Your game is over.");
          System.exit(0);
        }
      }
    };

    timer = new Timer(1000, a);
    timer.start();
}
 @Override
    public void actionPerformed(ActionEvent ae){
          Object src = ae.getSource();
          for(int i=0;i<8;i++)
          {
              for(int j=0;j<8;j++)
              {
                  if(btn[i][j]==src)
                  {
                      rr1=0;
                   //   btn[i][j].setIcon(null);
                   //   btn[i][j].setIcon(icon);
                       for (int k = 0; k < 8; k++) {
                          if(k!=i && btn[k][j].getBackground()!=Color.green)
                          {
                           rr1=1;   
                          }
                          if(k!=j && btn[i][k].getBackground()!=Color.green)
                          {
                           rr1=1;   
                          }
                          
                      }
                       for (int k = 1; k < 8; k++) {
                          if((i-k>=0) && (j-k>=0) && btn[i-k][j-k].getBackground()!=Color.green)
                          {
                           rr1=1;   
                          }
                          if((i+k<=7) && (j+k<=7) && btn[i+k][j+k].getBackground()!=Color.green)
                          {
                           rr1=1;   
                          }
                           if((i+k<=7) && (j-k>=0) && btn[i+k][j-k].getBackground()!=Color.green)
                          {
                           rr1=1;   
                          }
                            if((i-k>=0) && (j+k<=7) && btn[i-k][j+k].getBackground()!=Color.green)
                          {
                           rr1=1;   
                          }
                      }
                   //  System.out.println(rr1);
                      if(rr1==1 || btn[i][j].getBackground()!=Color.green){
                          timer.stop();
                          btn[i][j].setIcon(null);
                          btn[i][j].setBackground(Color.red);
                      JOptionPane.showMessageDialog(null,"OOps!Your game is over.");
                      }
                      else
                      {
                          timer.stop();
                          btn[i][j].setIcon(icon);
                           JOptionPane.showMessageDialog(null,"Congratulation!");
                       swing13 frame = new swing13(7);
                      frame.setVisible(true);
                      }
                      dispose();
                  }
              }
          }
    }   
    public static void main(String[] args) {
        swing11 frame = new swing11();
       frame.setVisible(true);
    }
}
