package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import view.TelaPrincipal;

public class BackupProgram {

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
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
                
//                Properties prop = new Properties();
//                InputStream input;

//                try {
//
//                    InputStream resourceAsStream = BackupProgram.class.getResourceAsStream("/Text.properties");
//                    prop.load(resourceAsStream);
//                } catch (IOException e1) {
//                    e1.printStackTrace();
//                }
////
////                try {
////                    input = new FileInputStream("./Text.properties");
////                    prop.load(input);
////                } catch (FileNotFoundException ex) {
////                    Logger.getLogger(BackupProgram.class.getName()).log(Level.SEVERE, null, ex);
////                } catch (IOException ex) {
////                    Logger.getLogger(BackupProgram.class.getName()).log(Level.SEVERE, null, ex);
////                }
//                JFrame testFrame = new JFrame();
//                testFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//                testFrame.setSize(500, 500);
//                JPanel jPanel = new JPanel();
//
//                JDatePickerImpl picker = new JDatePickerImpl(new JDatePanelImpl(new UtilDateModel(), prop), new DateComponentFormatter());
//                picker.setTextEditable(true);
//                picker.setShowYearButtons(true);
//                jPanel.add((JComponent) picker);
//                JPanel DatePanel = new JPanel();
//                DatePanel.setLayout(new BorderLayout());
//                DatePanel.add(jPanel, BorderLayout.WEST);
//                BorderLayout fb = new BorderLayout();
//                testFrame.setLayout(fb);
//                testFrame.getContentPane().add(DatePanel, BorderLayout.WEST);
//                testFrame.setVisible(true);
            }
        });
    }

}
