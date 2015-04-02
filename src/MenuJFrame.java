
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
public class MenuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuJFrame
     */
    public MenuJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButtonNext = new javax.swing.JButton();
        jButtonPrevious = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabelHeader = new javax.swing.JLabel();
        jLabelFooter = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RealEstate Program");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextField6.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(490, 383, 280, 34);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextField5.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(490, 333, 280, 34);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextField4.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(490, 282, 280, 34);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextField3.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(490, 231, 280, 34);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextField2.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(490, 180, 280, 34);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextField1.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextField1.setMinimumSize(new java.awt.Dimension(7, 28));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(490, 129, 280, 34);

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
        jButtonNext.setBounds(504, 487, 175, 70);

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
        jButtonPrevious.setBounds(273, 487, 175, 70);

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

        jLabelHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelHeader.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelHeader);
        jLabelHeader.setBounds(250, 20, 470, 60);

        jLabelFooter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFooter.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelFooter);
        jLabelFooter.setBounds(0, 480, 170, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DSA_UI.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseClicked
        
    }//GEN-LAST:event_jButtonResetMouseClicked

    private void jButtonResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMousePressed
        ImageIcon Reset = new ImageIcon (getClass().getResource("/Images/Reset_Clicked.png"));
        jButtonReset.setIcon(Reset);
    }//GEN-LAST:event_jButtonResetMousePressed

    private void jButtonResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseReleased
        ImageIcon Reset = new ImageIcon (getClass().getResource("/Images/Reset.png"));
        jButtonReset.setIcon(Reset);
    }//GEN-LAST:event_jButtonResetMouseReleased

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jButtonAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMousePressed
        ImageIcon Add = new ImageIcon (getClass().getResource("/Images/Add_Clicked.png"));
        jButtonAdd.setIcon(Add);
    }//GEN-LAST:event_jButtonAddMousePressed

    private void jButtonAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseReleased
        ImageIcon Add = new ImageIcon (getClass().getResource("/Images/Add.png"));
        jButtonAdd.setIcon(Add);
    }//GEN-LAST:event_jButtonAddMouseReleased

    private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteMouseClicked

    private void jButtonDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMousePressed
        ImageIcon Delete = new ImageIcon (getClass().getResource("/Images/Delete_Clicked.png"));
        jButtonDelete.setIcon(Delete);
    }//GEN-LAST:event_jButtonDeleteMousePressed

    private void jButtonDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseReleased
        ImageIcon Delete = new ImageIcon (getClass().getResource("/Images/Delete.png"));
        jButtonDelete.setIcon(Delete);
    }//GEN-LAST:event_jButtonDeleteMouseReleased

    private void jButtonSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearchMouseClicked

    private void jButtonSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMousePressed
        ImageIcon Search = new ImageIcon (getClass().getResource("/Images/Search_Clicked.png"));
        jButtonSearch.setIcon(Search);
    }//GEN-LAST:event_jButtonSearchMousePressed

    private void jButtonSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMouseReleased
        ImageIcon Search = new ImageIcon (getClass().getResource("/Images/Search.png"));
        jButtonSearch.setIcon(Search);
    }//GEN-LAST:event_jButtonSearchMouseReleased

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClearMouseClicked

    private void jButtonClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMousePressed
        ImageIcon Clear = new ImageIcon (getClass().getResource("/Images/Clear_Clicked.png"));
        jButtonClear.setIcon(Clear);
    }//GEN-LAST:event_jButtonClearMousePressed

    private void jButtonClearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMouseReleased
        ImageIcon Clear = new ImageIcon (getClass().getResource("/Images/Clear.png"));
        jButtonClear.setIcon(Clear);
    }//GEN-LAST:event_jButtonClearMouseReleased

    private void jButtonPreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPreviousMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPreviousMouseClicked

    private void jButtonPreviousMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPreviousMousePressed
        ImageIcon Previous = new ImageIcon (getClass().getResource("/Images/Previous_Clicked.png"));
        jButtonPrevious.setIcon(Previous);
    }//GEN-LAST:event_jButtonPreviousMousePressed

    private void jButtonPreviousMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPreviousMouseReleased
        ImageIcon Previous = new ImageIcon (getClass().getResource("/Images/Previous.png"));
        jButtonPrevious.setIcon(Previous);
    }//GEN-LAST:event_jButtonPreviousMouseReleased

    private void jButtonNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNextMouseClicked

    private void jButtonNextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNextMousePressed
        ImageIcon Next = new ImageIcon (getClass().getResource("/Images/Next_Clicked.png"));
        jButtonNext.setIcon(Next);
    }//GEN-LAST:event_jButtonNextMousePressed

    private void jButtonNextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNextMouseReleased
        ImageIcon Next = new ImageIcon (getClass().getResource("/Images/Next.png"));
        jButtonNext.setIcon(Next);
    }//GEN-LAST:event_jButtonNextMouseReleased

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPrevious;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFooter;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
