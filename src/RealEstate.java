
import static java.awt.Frame.ICONIFIED;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thilina
 */
public class RealEstate extends javax.swing.JFrame {

    /**
     * Creates new form MenuJFrame
     */
    
    
    public RealEstate() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jTextFieldNoBedRooms = new javax.swing.JTextField();
        jTextFieldSFeet = new javax.swing.JTextField();
        jTextFieldLPrice = new javax.swing.JTextField();
        jTextFieldLName = new javax.swing.JTextField();
        jTextFieldFName = new javax.swing.JTextField();
        jTextFieldLotNum = new javax.swing.JTextField();
        jButtonNext = new javax.swing.JButton();
        jButtonPrevious = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabelFooter = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RealEstate Program");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button_minimize.png"))); // NOI18N
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMinimize);
        jLabelMinimize.setBounds(755, 13, 15, 16);

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button_close.png"))); // NOI18N
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelClose);
        jLabelClose.setBounds(780, 10, 15, 14);

        jTextFieldNoBedRooms.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldNoBedRooms.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNoBedRooms.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldNoBedRooms.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldNoBedRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoBedRoomsActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNoBedRooms);
        jTextFieldNoBedRooms.setBounds(490, 383, 280, 34);

        jTextFieldSFeet.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldSFeet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSFeet.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldSFeet.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldSFeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSFeetActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldSFeet);
        jTextFieldSFeet.setBounds(490, 333, 280, 34);

        jTextFieldLPrice.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldLPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldLPrice.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldLPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLPriceActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLPrice);
        jTextFieldLPrice.setBounds(490, 282, 280, 34);

        jTextFieldLName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldLName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldLName.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLName);
        jTextFieldLName.setBounds(490, 231, 280, 34);

        jTextFieldFName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldFName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldFName.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFName);
        jTextFieldFName.setBounds(490, 180, 280, 34);

        jTextFieldLotNum.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldLotNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLotNum.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldLotNum.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldLotNum.setMinimumSize(new java.awt.Dimension(7, 28));
        jTextFieldLotNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLotNumActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLotNum);
        jTextFieldLotNum.setBounds(490, 129, 280, 34);

        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Next.png"))); // NOI18N
        jButtonNext.setAlignmentY(0.0F);
        jButtonNext.setBorder(null);
        jButtonNext.setOpaque(false);
        jButtonNext.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNextMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonNextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonNextMouseReleased(evt);
            }
        });
        jPanel1.add(jButtonNext);
        jButtonNext.setBounds(505, 498, 175, 70);

        jButtonPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Previous.png"))); // NOI18N
        jButtonPrevious.setAlignmentY(0.0F);
        jButtonPrevious.setBorder(null);
        jButtonPrevious.setOpaque(false);
        jButtonPrevious.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonPrevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPreviousMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonPreviousMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonPreviousMouseReleased(evt);
            }
        });
        jPanel1.add(jButtonPrevious);
        jButtonPrevious.setBounds(274, 498, 175, 70);

        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clear.png"))); // NOI18N
        jButtonClear.setAlignmentY(0.0F);
        jButtonClear.setBorder(null);
        jButtonClear.setOpaque(false);
        jButtonClear.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonClearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonClearMouseReleased(evt);
            }
        });
        jPanel1.add(jButtonClear);
        jButtonClear.setBounds(0, 380, 175, 70);

        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search.png"))); // NOI18N
        jButtonSearch.setAlignmentY(0.0F);
        jButtonSearch.setBorder(null);
        jButtonSearch.setOpaque(false);
        jButtonSearch.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSearchMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSearchMouseReleased(evt);
            }
        });
        jPanel1.add(jButtonSearch);
        jButtonSearch.setBounds(0, 310, 175, 70);

        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        jButtonDelete.setAlignmentY(0.0F);
        jButtonDelete.setBorder(null);
        jButtonDelete.setOpaque(false);
        jButtonDelete.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonDeleteMouseReleased(evt);
            }
        });
        jPanel1.add(jButtonDelete);
        jButtonDelete.setBounds(0, 240, 175, 70);

        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        jButtonAdd.setAlignmentY(0.0F);
        jButtonAdd.setBorder(null);
        jButtonAdd.setOpaque(false);
        jButtonAdd.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonAddMouseReleased(evt);
            }
        });
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd);
        jButtonAdd.setBounds(0, 170, 175, 70);

        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reset.png"))); // NOI18N
        jButtonReset.setAlignmentY(0.0F);
        jButtonReset.setBorder(null);
        jButtonReset.setOpaque(false);
        jButtonReset.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResetMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonResetMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonResetMouseReleased(evt);
            }
        });
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReset);
        jButtonReset.setBounds(0, 100, 175, 70);

        jLabelFooter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFooter.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelFooter);
        jLabelFooter.setBounds(200, 420, 570, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DSA UI_01.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButtonResetMouseClicked(java.awt.event.MouseEvent evt) {                                          
        
    }                                         

    private void jButtonResetMousePressed(java.awt.event.MouseEvent evt) {                                          
        ImageIcon Reset = new ImageIcon (getClass().getResource("/Images/Reset_Clicked.png"));
        jButtonReset.setIcon(Reset);
    }                                         

    private void jButtonResetMouseReleased(java.awt.event.MouseEvent evt) {                                           
        ImageIcon Reset = new ImageIcon (getClass().getResource("/Images/Reset.png"));
        jButtonReset.setIcon(Reset);
    }                                          

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jButtonAddMousePressed(java.awt.event.MouseEvent evt) {                                        
        ImageIcon Add = new ImageIcon (getClass().getResource("/Images/Add_Clicked.png"));
        jButtonAdd.setIcon(Add);
    }                                       

    private void jButtonAddMouseReleased(java.awt.event.MouseEvent evt) {                                         
        ImageIcon Add = new ImageIcon (getClass().getResource("/Images/Add.png"));
        jButtonAdd.setIcon(Add);
    }                                        

    private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButtonDeleteMousePressed(java.awt.event.MouseEvent evt) {                                           
        ImageIcon Delete = new ImageIcon (getClass().getResource("/Images/Delete_Clicked.png"));
        jButtonDelete.setIcon(Delete);
    }                                          

    private void jButtonDeleteMouseReleased(java.awt.event.MouseEvent evt) {                                            
        ImageIcon Delete = new ImageIcon (getClass().getResource("/Images/Delete.png"));
        jButtonDelete.setIcon(Delete);
    }                                           

    private void jButtonSearchMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButtonSearchMousePressed(java.awt.event.MouseEvent evt) {                                           
        ImageIcon Search = new ImageIcon (getClass().getResource("/Images/Search_Clicked.png"));
        jButtonSearch.setIcon(Search);
    }                                          

    private void jButtonSearchMouseReleased(java.awt.event.MouseEvent evt) {                                            
        ImageIcon Search = new ImageIcon (getClass().getResource("/Images/Search.png"));
        jButtonSearch.setIcon(Search);
    }                                           

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButtonClearMousePressed(java.awt.event.MouseEvent evt) {                                          
        ImageIcon Clear = new ImageIcon (getClass().getResource("/Images/Clear_Clicked.png"));
        jButtonClear.setIcon(Clear);
    }                                         

    private void jButtonClearMouseReleased(java.awt.event.MouseEvent evt) {                                           
        ImageIcon Clear = new ImageIcon (getClass().getResource("/Images/Clear.png"));
        jButtonClear.setIcon(Clear);
    }                                          

    private void jButtonPreviousMouseClicked(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButtonPreviousMousePressed(java.awt.event.MouseEvent evt) {                                             
        ImageIcon Previous = new ImageIcon (getClass().getResource("/Images/Previous_Clicked.png"));
        jButtonPrevious.setIcon(Previous);
    }                                            

    private void jButtonPreviousMouseReleased(java.awt.event.MouseEvent evt) {                                              
        ImageIcon Previous = new ImageIcon (getClass().getResource("/Images/Previous.png"));
        jButtonPrevious.setIcon(Previous);
    }                                             

    private void jButtonNextMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButtonNextMousePressed(java.awt.event.MouseEvent evt) {                                         
        ImageIcon Next = new ImageIcon (getClass().getResource("/Images/Next_Clicked.png"));
        jButtonNext.setIcon(Next);
    }                                        

    private void jButtonNextMouseReleased(java.awt.event.MouseEvent evt) {                                          
        ImageIcon Next = new ImageIcon (getClass().getResource("/Images/Next.png"));
        jButtonNext.setIcon(Next);
    }                                         

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextFieldLotNumActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jTextFieldFNameActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jTextFieldLNameActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jTextFieldLPriceActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jTextFieldSFeetActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jTextFieldNoBedRoomsActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {                                         
        dispose();
    }                                        

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {                                            
        setState(ICONIFIED);
    }                                           

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPrevious;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelFooter;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldFName;
    private javax.swing.JTextField jTextFieldLName;
    private javax.swing.JTextField jTextFieldLPrice;
    private javax.swing.JTextField jTextFieldLotNum;
    private javax.swing.JTextField jTextFieldNoBedRooms;
    private javax.swing.JTextField jTextFieldSFeet;
    // End of variables declaration                   
}
