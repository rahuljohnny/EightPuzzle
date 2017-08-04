/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myimageapp;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;
import java.util.Random;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JoHnNyStEiN
 */
public class id extends javax.swing.JFrame {
    int move=0;
     GregorianCalendar c1=new GregorianCalendar();
      GregorianCalendar c2=new GregorianCalendar();
    static String []test=new String[10];
    static long s;
    static int le;
    static String line;
    String []t={"/org/me/myimageapp/newpackage/1.jpg","/org/me/myimageapp/newpackage/2.jpg",
        "/org/me/myimageapp/newpackage/3.jpg","/org/me/myimageapp/newpackage/4.jpg",
        "/org/me/myimageapp/newpackage/5.jpg","/org/me/myimageapp/newpackage/6.jpg",
        "/org/me/myimageapp/newpackage/7.jpg","/org/me/myimageapp/newpackage/8.jpg",
        "/org/me/myimageapp/newpackage/0.jpg"};
    public id(){
        initComponents();
           String path="E:\\textsave.txt";
        File fff=new File(path);  
               
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(fff));
         line=br.readLine();
         le=Integer.valueOf(line);
         System.out.println("dffd"+le);
         br.close();
        }
        catch (Exception ex)
        {
           
        }
         
       shuffle();
        c1.setTime(c1.getTime());
         s=System.currentTimeMillis();
         String ttt=btn1.getIcon().toString();
         System.out.println(ttt);
         
         
        
           if(btn0.getIcon().toString().endsWith("/0.jpg"))//
            {
              btn0.setVisible(false);
            }
             if(btn1.getIcon().toString().endsWith("/0.jpg"))
            {
              btn1.setVisible(false);
            }
             if(btn2.getIcon().toString().endsWith("/0.jpg"))
            {
              btn2.setVisible(false);
            }
             if(btn3.getIcon().toString().endsWith("/0.jpg"))
            {
              btn3.setVisible(false);
            }
             if(btn4.getIcon().toString().endsWith("/0.jpg"))
            {
              btn4.setVisible(false);
            }
             if(btn5.getIcon().toString().endsWith("/0.jpg"))
            {
              btn5.setVisible(false);
            }
          if(btn6.getIcon().toString().endsWith("/0.jpg"))
            {
              btn6.setVisible(false);
            }
          if(btn7.getIcon().toString().endsWith("/0.jpg"))
            {
              btn7.setVisible(false);
            }              
         if(btn8.getIcon().toString().endsWith("/0.jpg"))
            {
              btn8.setVisible(false);
            } 
              
    }

public void puzzle(){
    String []t={"/org/me/myimageapp/newpackage/1.jpg","/org/me/myimageapp/newpackage/2.jpg",
        "/org/me/myimageapp/newpackage/3.jpg","/org/me/myimageapp/newpackage/4.jpg",
        "/org/me/myimageapp/newpackage/5.jpg","/org/me/myimageapp/newpackage/6.jpg",
        "/org/me/myimageapp/newpackage/7.jpg","/org/me/myimageapp/newpackage/8.jpg"};
    System.out.println("value of t 0"+t[0].length());
    move++;
    jLabel1.setText("Moves : "+String.valueOf(move));
    
    test[0]=btn1.getIcon().toString();
    test[0]=test[0].substring(test[0].length()-(test[0].length()-83));
   // System.out.println("value of test 0000"+test[0]);
    test[1]=btn2.getIcon().toString();
     test[1]=test[1].substring(test[1].length()-(test[1].length()-83));
      //System.out.println("value of test 1"+test[1].length());
     test[2]=btn3.getIcon().toString();
      test[2]=test[2].substring(test[2].length()-(test[2].length()-83));
      test[3]=btn4.getIcon().toString();
       test[3]=test[3].substring(test[3].length()-(test[3].length()-83));
       test[4]=btn5.getIcon().toString();
        test[4]=test[4].substring(test[4].length()-(test[4].length()-83));
        test[5]=btn6.getIcon().toString();
         test[5]=test[5].substring(test[5].length()-(test[5].length()-83));
         test[6]=btn7.getIcon().toString();
          test[6]=test[6].substring(test[6].length()-(test[6].length()-83));
          test[7]=btn8.getIcon().toString();
          test[7]=test[7].substring(test[7].length()-(test[7].length()-83));
          
          //test[8]=btn0.getIcon().toString();
         // test[8]=test[8].substring(test[8].length()-(test[8].length()-50));
    
    int j=0;
   for(int i=0;i<t.length;i++)
   {
       //System.out.println("For i "+i);
       System.out.println("test[i] "+test[i]);
       System.out.println("t[i] "+t[i]);
        //System.out.println("value of test i"+test[i]);
        if(t[i].equals(test[i]))
        {
            j++;  
              
        }
        else{
           break;
        }
   }
   
   //For high score
   
   
   long e=System.currentTimeMillis();
   long f=(e-s);
   int  ff=(int) (f/1000);
   String score=String.valueOf(ff);
   //System.out.println("ssssssssssssssssssssss="+ff);
   c2.setTime(c2.getTime());
   int d1=c2.get(c2.DATE)-c1.get(c1.DATE);
   System.out.println("J="+j);
   if(j==8)
   {    
      JOptionPane.showMessageDialog(null,"                Bravo ! solved ! \n You have taken "+ff+" Seconds and "+move+" Moves");
      //JOptionPane.showMessageDialog(null,"Least time"+score);
      move=0;
        try {
  // FileWriter savefile=new FileWriter("textsave.txt");
           // savefile.write(2);
            String path="E:\\textsave.txt";
        File fff=new File(path);  
             BufferedWriter  fw=new BufferedWriter(new FileWriter(fff));
            PrintWriter pw=new PrintWriter(fw);
             
        
         
         if(line==null || le>ff)
         {
              pw.print(score);
              pw.close();
         }
         
        } catch ( Exception ee ) {
            
        }
   }  
}
public static <T> void shuffle(T[] array) { //template
    Random random = new Random();

    for (int i = array.length - 1; i >= 1; --i) {
        int j = random.nextInt(i+1);
        T temp = array [i];
        array[i] = array[j];
        array[j] = temp;
    }
}
public void shuffle(){
           Random random = new Random();
          int limit=0;
          if(main.level=="Childish")
          {
              limit=7;
          }
           if(main.level=="Teenish")
            {
                limit=5;
            }
            if(main.level=="Wisish")
          {
              limit=1;
          }
            
    for (int i = t.length - 1; i > limit; --i) {
        int k = random.nextInt(8);
        System.out.println(k);
        String temp = t [i];
        t[i] = t[k];
        t[k] = temp;
    }
  
       btn1.setIcon(new ImageIcon(getClass().getResource(""+t[0]+"")));
       btn2.setIcon(new ImageIcon(getClass().getResource(""+t[1]+"")));
       btn3.setIcon(new ImageIcon(getClass().getResource(""+t[2]+"")));
       btn4.setIcon(new ImageIcon(getClass().getResource(""+t[3]+"")));
       btn5.setIcon(new ImageIcon(getClass().getResource(""+t[4]+"")));
       btn6.setIcon(new ImageIcon(getClass().getResource(""+t[5]+"")));
       btn7.setIcon(new ImageIcon(getClass().getResource(""+t[6]+"")));
       btn8.setIcon(new ImageIcon(getClass().getResource(""+t[7]+"")));
       btn0.setIcon(new ImageIcon(getClass().getResource(""+t[8]+"")));
   
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")//k..............m.........................
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(560, 396));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 153, 113));

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/2.jpg"))); // NOI18N
        btn2.setBorderPainted(false);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn2MousePressed(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 156, 113));

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/3.jpg"))); // NOI18N
        btn3.setBorderPainted(false);
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn3MousePressed(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 153, 113));

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/4.jpg"))); // NOI18N
        btn4.setBorderPainted(false);
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn4MousePressed(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 153, 120));

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/5.jpg"))); // NOI18N
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn5MousePressed(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 156, 120));

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/6.jpg"))); // NOI18N
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn6MousePressed(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 153, 120));

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/7.jpg"))); // NOI18N
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn7MousePressed(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 153, 112));

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/8.jpg"))); // NOI18N
        btn8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btn8ItemStateChanged(evt);
            }
        });
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn8MousePressed(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        btn8.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btn8PropertyChange(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 156, 112));

        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/0.jpg"))); // NOI18N
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn0MousePressed(evt);
            }
        });
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 153, 110));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Moves : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, -1));

        jButton1.setText("Shuffle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(788, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         
        if(btn1.isVisible()){
            if(btn2.isVisible()==false)
            {
                btn2.setIcon(btn1.getIcon());
                btn2.setVisible(true);  
                btn1.setVisible(false); 
                 btn1.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn4.isVisible()==false)
            {
  
                btn4.setIcon(btn1.getIcon());
                btn4.setVisible(true);
                btn1.setVisible(false); 
                btn1.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
             
        }
         puzzle();
            
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        
        // TODO add your handling code here:
       
        if(btn2.isVisible())
        {
            
            if(btn1.isVisible()==false)
            {
                //btn2=btn1;
                btn1.setIcon(btn2.getIcon());
                btn1.setVisible(true);  
                btn2.setVisible(false);
                btn2.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn3.isVisible()==false)
            {
                
                //btn4=btn1;
                
                btn3.setIcon(btn2.getIcon());
                btn3.setVisible(true);
                btn2.setVisible(false);
                  btn2.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(!btn5.isVisible())
            {
                
                btn5.setIcon(btn2.getIcon());
                btn5.setVisible(true);
                btn2.setVisible(false);
                  btn2.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            
        }
    puzzle();
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(btn6.isVisible())
        {
            if(btn3.isVisible()==false)
            {
                //btn2=btn1;
                btn3.setIcon(btn6.getIcon());
                btn3.setVisible(true);  
                btn6.setVisible(false);
                
                btn6.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn5.isVisible()==false)
            {
                
                //btn4=btn1;
                btn5.setIcon(btn6.getIcon());
                btn5.setVisible(true);
                btn6.setVisible(false);
                
                  btn6.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn0.isVisible()==false)
            {
                
                //btn4=btn1;
                btn0.setIcon(btn6.getIcon());
                btn0.setVisible(true);
                btn6.setVisible(false);
                  btn6.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
        
        }
      //System.out.println(btn6.getIcon().toString());
      puzzle();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if(btn7.isVisible())
        {
           
            if(btn4.isVisible()==false)
            {
                //btn2=btn1;
                btn4.setIcon(btn7.getIcon());
                btn4.setVisible(true); 
                btn7.setVisible(false);
                
                btn7.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn8.isVisible()==false)
            {
                
                //btn4=btn1;
                btn8.setIcon(btn7.getIcon());
                btn8.setVisible(true);
                btn7.setVisible(false);
                
                  btn7.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
           
        
        }
     puzzle();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed
        // TODO add your handling code here:if(btn1.isVisible())
       
    }//GEN-LAST:event_btn1MousePressed

    private void btn0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn0MousePressed

    private void btn8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MousePressed
        // TODO add your handling code here:
   
         
    }//GEN-LAST:event_btn8MousePressed

    private void btn7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn7MousePressed

    private void btn6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn6MousePressed

    private void btn5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn5MousePressed

    private void btn4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MousePressed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_btn4MousePressed

    private void btn3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3MousePressed

    private void btn2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2MousePressed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        if(btn0.isVisible())
        {
          
            if(btn6.isVisible()==false)
            {
                //btn2=btn1;
                btn6.setIcon(btn0.getIcon());
                btn6.setVisible(true);  
                btn0.setVisible(false);
                
                  btn0.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn8.isVisible()==false)
            {
                
                //btn4=btn1;
                btn8.setIcon(btn0.getIcon());
                btn8.setVisible(true);
                btn0.setVisible(false);
                
                  btn0.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
        }
       puzzle();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         if(btn8.isVisible())
        {
        
            if(btn5.isVisible()==false)
            {
                //btn2=btn1;
                btn5.setIcon(btn8.getIcon());
                btn5.setVisible(true);  
                btn8.setVisible(false);
                   btn8.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn7.isVisible()==false)
            {
                
                //btn4=btn1;
                btn7.setIcon(btn8.getIcon());
                btn7.setVisible(true);
                btn8.setVisible(false);
                   btn8.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn0.isVisible()==false)
            {
                
                //btn4=btn1;
                btn0.setIcon(btn8.getIcon());
                btn0.setVisible(true);
                btn8.setVisible(false);
                btn8.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
        
        }
      
     puzzle();
         
        
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if(btn5.isVisible())
        {
          
            if(btn2.isVisible()==false)
            {
                //btn2=btn1;
                btn2.setIcon(btn5.getIcon());
                btn2.setVisible(true);
                btn5.setVisible(false);
                
                  btn5.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn4.isVisible()==false)
            {
                
                //btn4=btn1;
                btn4.setIcon(btn5.getIcon());
                btn4.setVisible(true);
                btn5.setVisible(false);
                  btn5.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn6.isVisible()==false)
            {
                
                //btn4=btn1;
                btn6.setIcon(btn5.getIcon());
                btn6.setVisible(true);
                btn5.setVisible(false);
                
                  btn5.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn8.isVisible()==false)
            {
                
                //btn4=btn1;
                btn8.setIcon(btn5.getIcon());
                btn8.setVisible(true);
                btn5.setVisible(false);
                
                  btn5.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
        
        }
         puzzle();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
                if(btn3.isVisible())
        {
          
            if(btn2.isVisible()==false)
            {
                //btn2=btn1;
                btn2.setIcon(btn3.getIcon());
                btn2.setVisible(true);  
                btn3.setVisible(false);
                
                  btn3.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn6.isVisible()==false)
            {
                
                //btn4=btn1;
                
                btn6.setIcon(btn3.getIcon());
                btn6.setVisible(true);
                btn3.setVisible(false);
                
                  btn3.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            
            
        }
       puzzle();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if(btn4.isVisible())
        {
          
            if(btn1.isVisible()==false)
            {
                //btn2=btn1;
                btn1.setIcon(btn4.getIcon());
                btn1.setVisible(true);  
                btn4.setVisible(false);
                
                  btn4.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn5.isVisible()==false)
            {
                
                //btn4=btn1;
                btn5.setIcon(btn4.getIcon());
                btn5.setVisible(true);
                btn4.setVisible(false);
                
                  btn4.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
            else if(btn7.isVisible()==false)
            {
                
                //btn4=btn1;
                btn7.setIcon(btn4.getIcon());
                btn7.setVisible(true);
                btn4.setVisible(false);
                
                  btn4.setIcon(new ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/1.jpg")));
            }
        
        }
         puzzle();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
          
    }//GEN-LAST:event_btn3MouseClicked

    private void btn8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btn8ItemStateChanged
            
    }//GEN-LAST:event_btn8ItemStateChanged

    private void btn8PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btn8PropertyChange
   
    }//GEN-LAST:event_btn8PropertyChange
 public void close()
{
    WindowEvent winClosingEvent=new  WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      close();
        id ob=new id();
      ob.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();  
        main ob1=new main();
          ob1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new id().setVisible(true);
                
        ;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
