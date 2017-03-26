package main;

import banco.Banco;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
//import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.TelaPrincipal;

public class BackupProgram{
    public static void main(String[] args) {
        Banco.iniciaConexao();
        
    try
    {
      for (UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
      Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TelaPrincipal tela = new TelaPrincipal();
                tela.setBounds(400, 200, 500, 400);
                tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JScrollPane scroll = new JScrollPane();
                tela.add(scroll);
                tela.setVisible(true);
            }
        });  
//        SwingUtilities.invokeLater();
    }
   
}




