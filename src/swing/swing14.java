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
import javax.swing.JPasswordField;

public class swing14{
    private JPanel panel;
    private JLabel jl,jl1;
    private Font f;
    private JButton jb,jb1;
    private JPasswordField jp;
    public void in14(Container c,int count)
    {
        panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setLayout(null);
        c.add(panel,"14");
        f = new Font("Arial",Font.BOLD,19);
        jl = new JLabel("Enter your password: ");
        jl.setBounds(10,10,207,20);
        jl.setFont(f);
        panel.add(jl);
         jp = new JPasswordField();
        jp.setBounds(210,10,150,20);
        jp.setFont(f);
        panel.add(jp);
         jb = new JButton("Enter");
        jb.setBounds(168,40,84,20);
        jb.setFont(f);
        panel.add(jb);
         jb.addActionListener(e -> {
          String s = jp.getText();
           if(count==2)
           {
                if(s.equals("2")){
            swing5 frame = new swing5();
            frame.in5(c,2);
            System.out.println("14");
             ((CardLayout) c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
            ((CardLayout) c.getLayout()).show(c,"4");
           }
           }
           else if(count==3)
           {
                if(s.equals("3")){
            swing5 frame = new swing5();
            frame.in5(c,3);
              ((CardLayout)c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
            ((CardLayout)c.getLayout()).show(c,"4");
           }
           }
           else if(count==4)
           {
                if(s.equals("4")){
            swing5 frame = new swing5();
             frame.in5(c,4);
              ((CardLayout)c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
           ((CardLayout)c.getLayout()).show(c,"4");
           }
           }
           else if(count==5)
           {
                if(s.equals("5")){
            swing5 frame = new swing5();
             frame.in5(c,5);
               ((CardLayout)c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
          ((CardLayout)c.getLayout()).show(c,"4");
           }
           }
           else if(count==6)
           {
                if(s.equals("6")){
            swing5 frame = new swing5();
               frame.in5(c,6);
              ((CardLayout)c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
            ((CardLayout)c.getLayout()).show(c,"4");
           }
           }
           else if(count==7)
           {
                if(s.equals("7")){
            swing5 frame = new swing5();
              frame.in5(c,7);
            ((CardLayout)c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
           ((CardLayout)c.getLayout()).show(c,"4");
           }
           }
           else if(count==8)
           {
                if(s.equals("8")){
            swing5 frame = new swing5();
              frame.in5(c,8);
             ((CardLayout)c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
                 ((CardLayout)c.getLayout()).show(c,"4");
           }
           }
            else if(count==9)
           {
                if(s.equals("9")){
            swing5 frame = new swing5();
              frame.in5(c,9);
             ((CardLayout)c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
                 ((CardLayout)c.getLayout()).show(c,"4");
           }
           }
            else if(count==10)
           {
                if(s.equals("10")){
            swing5 frame = new swing5();
              frame.in5(c,10);
             ((CardLayout)c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
                 ((CardLayout)c.getLayout()).show(c,"4");
           }
           }
            else if(count==11)
           {
                if(s.equals("11")){
            swing5 frame = new swing5();
              frame.in5(c,11);
             ((CardLayout)c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
                 ((CardLayout)c.getLayout()).show(c,"4");
           }
           }
            else if(count==12)
           {
                if(s.equals("12")){
            swing5 frame = new swing5();
              frame.in5(c,12);
             ((CardLayout)c.getLayout()).show(c,"5");
           }
                else{
               JOptionPane.showMessageDialog(null, "Sorry! Your password is incorrect.");
                 ((CardLayout)c.getLayout()).show(c,"4");
           }
           }
         });
         jb1 = new JButton("Back");
        jb1.setBounds(168,70,84,20);
        jb1.setFont(f);
        panel.add(jb1);
         jb1.addActionListener(e -> {
           ((CardLayout)c.getLayout()).show(c,"4");
        });
    }
}
