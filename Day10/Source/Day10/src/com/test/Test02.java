package com.test;
import java.awt.*;
import java.awt.event.*;

public class Test02 extends Frame{

   Button btok;
   
   public Test02() {
      super("ù��° ������");
      btok = new Button("Click");
   }
   
   public void go() {
      
      addWindowListener(new WindowListener() {
         
         @Override
         public void windowOpened(WindowEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void windowIconified(WindowEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void windowDeiconified(WindowEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void windowDeactivated(WindowEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
            
         }
         
         @Override
         public void windowClosed(WindowEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void windowActivated(WindowEvent e) {
            // TODO Auto-generated method stub
            
         }
      });
      
      add(btok);
      btok.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println("Ŭ�� ����");
            
         }
         
      });
      
      setSize(new Dimension(600, 400));
      setFont(new Font("�ü�", Font.BOLD, 40));
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new Test02().go();
   }
}