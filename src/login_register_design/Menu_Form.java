/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_register_design;



import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.sql.*;
import java.time.Clock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Menu_Form extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Form
     */
    
    public Menu_Form() {
        
        
        initComponents();
        
         this.setLocationRelativeTo(null);
      
        
        Border border_label = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255,255,153));
        jLabel_Products.setBorder(border_label);
        
        jLabel_AddProduct.setBorder(border_label);
               
        jLabel_EditProduct.setBorder(border_label);
             

        
        
         Border border_exit = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255,255,153));
        jLabel_ExitAcc.setBorder(border_exit);
      
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        jLabel_minimize.setBorder(label_border);

        
        
        
        
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
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_AddProduct = new javax.swing.JLabel();
        jLabel_EditProduct = new javax.swing.JLabel();
        jLabel_Products = new javax.swing.JLabel();
        jButton_Wallet = new javax.swing.JButton();
        jLabel_ExitAcc = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_Menu = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_Welcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_AddProduct.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel_AddProduct.setForeground(new java.awt.Color(255, 255, 153));
        jLabel_AddProduct.setText("Add Product");
        jLabel_AddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_AddProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AddProductMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_AddProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_AddProductMouseExited(evt);
            }
        });

        jLabel_EditProduct.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel_EditProduct.setForeground(new java.awt.Color(255, 255, 153));
        jLabel_EditProduct.setText("My Products");
        jLabel_EditProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EditProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EditProductMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_EditProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EditProductMouseExited(evt);
            }
        });

        jLabel_Products.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel_Products.setForeground(new java.awt.Color(255, 255, 153));
        jLabel_Products.setText("Products");
        jLabel_Products.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ProductsMouseExited(evt);
            }
        });

        jButton_Wallet.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Wallet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Wallet.setForeground(new java.awt.Color(255, 255, 153));
        jButton_Wallet.setText("WALLET");
        jButton_Wallet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton_WalletFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton_WalletFocusLost(evt);
            }
        });
        jButton_Wallet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_WalletMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_WalletMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_WalletMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_AddProduct)
                    .addComponent(jLabel_EditProduct)
                    .addComponent(jLabel_Products))
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Wallet, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel_Products)
                .addGap(67, 67, 67)
                .addComponent(jLabel_EditProduct)
                .addGap(72, 72, 72)
                .addComponent(jLabel_AddProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jButton_Wallet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel_ExitAcc.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel_ExitAcc.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_ExitAcc.setText(">>Log Out");
        jLabel_ExitAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ExitAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ExitAccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ExitAccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ExitAccMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_ExitAcc)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ExitAcc)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel_Menu.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_Menu.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel_Menu.setForeground(new java.awt.Color(255, 255, 153));
        jLabel_Menu.setText("Menu");

        jLabel_minimize.setBackground(new java.awt.Color(254, 254, 254));
        jLabel_minimize.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_minimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_minimize.setText(" -");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jLabel_close.setBackground(new java.awt.Color(254, 254, 254));
        jLabel_close.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_close.setText(" X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jLabel_Welcome.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel_Welcome.setForeground(new java.awt.Color(255, 255, 153));
        jLabel_Welcome.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(jLabel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jLabel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Welcome)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_minimize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel_close, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_ProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ProductsMouseEntered
        // TODO add your handling code here:
        Border border_label = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(51,255,204));
        jLabel_Products.setBorder(border_label);
        
        
    }//GEN-LAST:event_jLabel_ProductsMouseEntered

    private void jLabel_ProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ProductsMouseExited
        // TODO add your handling code here:
         Border border_label = BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(255,255,153));
        jLabel_Products.setBorder(border_label);
    }//GEN-LAST:event_jLabel_ProductsMouseExited

    private void jLabel_AddProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddProductMouseEntered
        // TODO add your handling code here:
         Border border_label = BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(51,255,204));
        jLabel_AddProduct.setBorder(border_label);
    }//GEN-LAST:event_jLabel_AddProductMouseEntered

    private void jLabel_EditProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EditProductMouseEntered
        // TODO add your handling code here:
         Border border_label = BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(51,255,204));
        jLabel_EditProduct.setBorder(border_label);
    }//GEN-LAST:event_jLabel_EditProductMouseEntered

    private void jLabel_AddProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddProductMouseExited
        // TODO add your handling code here:
        Border border_label = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255,255,153));
        jLabel_AddProduct.setBorder(border_label);
        
    }//GEN-LAST:event_jLabel_AddProductMouseExited

    private void jLabel_EditProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EditProductMouseExited
        // TODO add your handling code here:
        Border border_label = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255,255,153));
        jLabel_EditProduct.setBorder(border_label);
    }//GEN-LAST:event_jLabel_EditProductMouseExited

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.YELLOW);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.YELLOW);

    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.red);

    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jLabel_ExitAccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExitAccMouseEntered
        // TODO add your handling code here:
        
        Border border_label = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE);
        jLabel_ExitAcc.setBorder(border_label);
        
    }//GEN-LAST:event_jLabel_ExitAccMouseEntered

    private void jLabel_ExitAccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExitAccMouseExited
        // TODO add your handling code here:
         Border border_label = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255,255,153));
        jLabel_ExitAcc.setBorder(border_label);
        
    }//GEN-LAST:event_jLabel_ExitAccMouseExited

    private void jLabel_ExitAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExitAccMouseClicked
        // TODO add your handling code here:
        
        Object[] options = {"Yes", "No"};
        
       int Answer = JOptionPane.showOptionDialog(null, "Are You Sure You Want To Log Out?","Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
        null, options,options[1]);
    if(Answer == JOptionPane.YES_OPTION){
         Login_Form lf = new Login_Form();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
    else if (Answer == JOptionPane.CANCEL_OPTION) {
    return;
} 
        
    }//GEN-LAST:event_jLabel_ExitAccMouseClicked

    private void jLabel_ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ProductsMouseClicked
        // TODO add your handling code here:
        Products_Form pf = new Products_Form();
        pf.setVisible(true);
        pf.pack();
        pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_ProductsMouseClicked

    private void jLabel_AddProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddProductMouseClicked
        // TODO add your handling code here:
        
       AddProduct_Form af = new AddProduct_Form();
       af.setVisible(true);
       af.pack();
       af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel_AddProductMouseClicked

    private void jButton_WalletFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton_WalletFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton_WalletFocusGained

    private void jButton_WalletFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton_WalletFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_WalletFocusLost

    private void jButton_WalletMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_WalletMouseEntered
        // TODO add your handling code here:
        
        jButton_Wallet.setBackground(new Color(51,100,100));
    }//GEN-LAST:event_jButton_WalletMouseEntered

    private void jButton_WalletMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_WalletMouseExited
        // TODO add your handling code here:
        jButton_Wallet.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jButton_WalletMouseExited

    private void jButton_WalletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_WalletMouseClicked
        // TODO add your handling code here:
        
         MyWallet_Form lf = new MyWallet_Form();
                             lf.setVisible(true);
                             lf.pack();
                             lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
        
        
    }//GEN-LAST:event_jButton_WalletMouseClicked

    private void jLabel_EditProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EditProductMouseClicked
        // TODO add your handling code here:
        
        MyProducts_Form lf = new MyProducts_Form();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_jLabel_EditProductMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Wallet;
    private javax.swing.JLabel jLabel_AddProduct;
    private javax.swing.JLabel jLabel_EditProduct;
    private javax.swing.JLabel jLabel_ExitAcc;
    private javax.swing.JLabel jLabel_Menu;
    private javax.swing.JLabel jLabel_Products;
    public static javax.swing.JLabel jLabel_Welcome;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}