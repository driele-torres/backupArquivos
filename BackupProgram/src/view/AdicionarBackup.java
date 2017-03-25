package view;

import java.awt.Container;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class AdicionarBackup extends javax.swing.JFrame
{
  public AdicionarBackup()
  {
    initComponents();
  }
  







  private void initComponents()
  {
    setDefaultCloseOperation(3);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGap(0, 400, 32767));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGap(0, 300, 32767));
    

    pack();
  }
  






//  public static void main(String[] args)
//  {
//    try
//    {
//      for (UIManager.LookAndFeelInfo info) {
//        if ("Nimbus".equals(info.getName())) {
//          UIManager.setLookAndFeel(info.getClassName());
//          break;
//        }
//      }
//    } catch (ClassNotFoundException ex) {
//      Logger.getLogger(AdicionarBackup.class.getName()).log(Level.SEVERE, null, ex);
//    } catch (InstantiationException ex) {
//      Logger.getLogger(AdicionarBackup.class.getName()).log(Level.SEVERE, null, ex);
//    } catch (IllegalAccessException ex) {
//      Logger.getLogger(AdicionarBackup.class.getName()).log(Level.SEVERE, null, ex);
//    } catch (UnsupportedLookAndFeelException ex) {
//      Logger.getLogger(AdicionarBackup.class.getName()).log(Level.SEVERE, null, ex);
//    }
//   
//    EventQueue.invokeLater(new AdicionarBackup());
//  }
}