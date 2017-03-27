package view;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class TelaPrincipal extends JFrame{
    public JButton buttonBackup ;
    public JButton buttonRemove ;
    public JButton buttonRestore;
    public JPanel panel;

    public JLabel labelIcon;

    public TelaPrincipal(){
        this.setName("Backup de Arquivos");
        this.setLayout(new GridBagLayout());
        
        ImageIcon imageRemove = new ImageIcon(new ImageIcon("/icons/remove.png").getImage().
                getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        ImageIcon imageBackup = new ImageIcon(new ImageIcon("/icons/backup.jpeg").getImage().
                getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        ImageIcon imageRestore = new ImageIcon(new ImageIcon("/icons/restore.jpeg").getImage().
                getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        
        
        buttonBackup = new JButton("Backup", imageBackup);
        buttonBackup.setHorizontalTextPosition(SwingConstants.RIGHT);
        buttonBackup.setPreferredSize(new Dimension(80, 80));

        
        buttonRestore = new JButton("Restore", imageRestore);
        buttonRestore.setHorizontalTextPosition(SwingConstants.RIGHT);
        buttonRestore.setPreferredSize(new Dimension(80, 80));
        
        buttonRemove = new JButton("Restore", imageRemove);
        buttonRemove.setHorizontalTextPosition(SwingConstants.RIGHT);
        buttonRemove.setPreferredSize(new Dimension(80, 80));
       
        
        panel = new JPanel(new GridBagLayout());
//        panel.add(buttonBackup , genConstraint(0, 0, 1, 1));
//        panel.add(buttonRestore, genConstraint(1, 0, 1, 1));
//        panel.add(buttonRemove , genConstraint(2, 0, 1, 1));
        panel.add(new PanelUp(), genConstraint(0, 0, 1, 1));
        

//        panel.add(buttonBackup,genConstraint(COLUNA,LINHA,QUANTAS CELULAS ELE OCUPA NA LINHA,QUANTAS CELULAS ELE OCUPA NA COLUNA));
        this.add(panel);
        addActionListeners();
    }
    
    public void clickedBtnBackup(){
//        TelaBackup backup = new TelaBackup("Backup");
//        backup.setBounds(20, 20, 800, 800);
//        JScrollPane scroll = new JScrollPane();
//        backup.add(scroll);
//        backup.setVisible(true);
    }
    
    public void clickedBtnRestore(){
//        TelaBackup backup = new TelaBackup("Restore");
//        backup.setBounds(20, 20, 800, 800);
//        JScrollPane scroll = new JScrollPane();
//        backup.add(scroll);
//        backup.setVisible(true);
    }
    
     public GridBagConstraints genConstraint(int x, int y, int w, int h){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = x;
        c.gridy = y;
        c.gridwidth = w;
        c.gridheight = h;
        c.insets = new Insets(10, 10, 10, 10);
        return c;
     }
     
     public void addActionListeners(){
         
        buttonBackup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickedBtnBackup();
            }
        });
        buttonRestore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                clickedBtnRestore();
            }
        });
     }
}

//    public JLabel labelInicial;
//    labelInicial = new JLabel("Backup de Arquivos");
//        labelInicial.setPreferredSize(new Dimension(300, 100));
//        labelInicial.setFont(new Font("Serif", Font.PLAIN, 35));
//        labelInicial.setAlignmentX(LEFT_ALIGNMENT);