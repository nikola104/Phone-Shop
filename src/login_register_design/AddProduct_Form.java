/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_register_design;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import static login_register_design.Login_Form.current_user_username;
public class AddProduct_Form extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct_Form
     */
    public AddProduct_Form() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //set fields borders
        Border textfield_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
        jTextField_Phone_Model.setBorder(textfield_border);
        jTextField_Price.setBorder(textfield_border);
        jTextField_Condition.setBorder(textfield_border);
        jTextArea_Description.setBorder(textfield_border);
        
        
        //set return menu border
         Border return_menu_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0,153,153));
        jLabel_return_menu.setBorder(return_menu_border);
        
    }
    
    
     public boolean verifyFields(){
     
            String phone_model = jTextField_Phone_Model.getText();
            String price = String.valueOf(jTextField_Price.getText());
            String condition = jTextField_Condition.getText();
            String descrip = jTextArea_Description.getText();
            
            
            if(phone_model.trim().equals("") || price.equals("")|| condition.trim().equals("") || 
                    descrip.trim().equals("")){
                JOptionPane.showConfirmDialog(null, "One Or More Fields Are Empty","Empty Fields", 2);
            return false;
            
            } else if(condition.length() > 10){
                JOptionPane.showConfirmDialog(null, "The Condition Field Must Be Under 10 Characters","Lots of characters", 2);
                return false;
            }else if(phone_model.length() > 20){
                 JOptionPane.showConfirmDialog(null, "The Phone Model Field Must Be Under 20 Characters","Lots of characters", 2);
                return false;
            }
            
            else return true;   
     }
     
     
     
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_return_menu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Phone_Model = new javax.swing.JTextField();
        jTextField_Price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Condition = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_addProduct = new javax.swing.JButton();

        jTextField3.setText("What Is The Product ?");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Product");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Add Product");

        jLabel_minimize.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_minimize.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
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

        jLabel_close.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_close.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
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

        jLabel_return_menu.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel_return_menu.setForeground(new java.awt.Color(0, 153, 153));
        jLabel_return_menu.setText("<--  Return To Menu ");
        jLabel_return_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_return_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_return_menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_return_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_return_menuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_return_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(209, 209, 209)
                .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_minimize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel_close, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_return_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Phone Model:");

        jTextField_Phone_Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Phone_ModelActionPerformed(evt);
            }
        });

        jTextField_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PriceActionPerformed(evt);
            }
        });
        jTextField_Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PriceKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Price:");

        jTextField_Condition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ConditionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Condition:");

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Description:");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sinq.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lilava.jpg"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zelena.jpg"))); // NOI18N

        jButton_addProduct.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jButton_addProduct.setText("ADD PRODUCT");
        jButton_addProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addProduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton_addProductFocusGained(evt);
            }
        });
        jButton_addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jButton_addProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton_addProduct)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Price, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                            .addComponent(jTextField_Phone_Model)
                            .addComponent(jTextField_Condition, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Phone_Model, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Condition, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        // TODO add your handling code here:

        jLabel_minimize.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        // TODO add your handling code here:

        jLabel_minimize.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        // TODO add your handling code here:

        jLabel_close.setForeground(Color.red);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        // TODO add your handling code here:

        jLabel_close.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jTextField_Phone_ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Phone_ModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Phone_ModelActionPerformed

    private void jTextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PriceActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField_ConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ConditionActionPerformed

    private void jButton_addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addProductActionPerformed
        // TODO add your handling code here:

            if(verifyFields()){
                try{
                    
            String phone_model = jTextField_Phone_Model.getText();
            Double price = Double.parseDouble(jTextField_Price.getText());
            String condition = jTextField_Condition.getText();
            String descrip = jTextArea_Description.getText();
            
            java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
                    
                    PreparedStatement ps;
                    ResultSet rs;
                    
String addPhoneQuerry = "insert into phones (phone_model,price,phone_condition,phone_description,date_of_add,user_phone,user_id) values(?,?,?,?,?,?,?)";
                    
                    ps = My_CNX.getConnection().prepareStatement(addPhoneQuerry);
                    
                    ps.setString(1, phone_model);
                    ps.setDouble(2, price);
                    ps.setString(3, condition);
                    ps.setString(4, descrip);
                    ps.setTimestamp(5, date);
                    ps.setString(6,Login_Form.current_user_number);
                    ps.setInt(7, Login_Form.current_user_ID);
                    
                    if(ps.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Your product was added successfully");
                        Products_Form lf = new Products_Form();
                             lf.setVisible(true);
                             lf.pack();
                             lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                         this.dispose();
                    }else{
                         JOptionPane.showMessageDialog(null, "Error : Check Your Information!");
                    }
                    
                    
                }catch(SQLException ex){
                    Logger.getLogger(AddProduct_Form.class.getName()).log(Level.SEVERE,null,ex);
                }catch(NumberFormatException e){
                         JOptionPane.showMessageDialog(null, "Error : Only Numbers allowed on price field!");
                }
                
                
            }
            
        
        
        
        
        
    }//GEN-LAST:event_jButton_addProductActionPerformed

    private void jLabel_return_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_return_menuMouseClicked
                // TODO add your handling code here
        
         Menu_Form lf = new Menu_Form();
                             lf.setVisible(true);
                             lf.pack();
                             lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                        
                        Menu_Form.jLabel_Welcome.setText("Hello, "+current_user_username+" what u want to do?");
        
    }//GEN-LAST:event_jLabel_return_menuMouseClicked

    private void jLabel_return_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_return_menuMouseEntered
        // TODO add your handling code here:
        Border return_menu_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE);
        jLabel_return_menu.setBorder(return_menu_border);
    }//GEN-LAST:event_jLabel_return_menuMouseEntered

    private void jLabel_return_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_return_menuMouseExited
        // TODO add your handling code here:
        Border return_menu_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0,153,153));
        jLabel_return_menu.setBorder(return_menu_border);
        
    }//GEN-LAST:event_jLabel_return_menuMouseExited

    private void jTextField_PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PriceKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PriceKeyTyped

    private void jButton_addProductFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton_addProductFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_addProductFocusGained

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
            java.util.logging.Logger.getLogger(AddProduct_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JLabel jLabel_return_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField_Condition;
    private javax.swing.JTextField jTextField_Phone_Model;
    private javax.swing.JTextField jTextField_Price;
    // End of variables declaration//GEN-END:variables
}
