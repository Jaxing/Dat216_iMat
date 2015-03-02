/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import customBackend.*;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.DefaultListModel;
import panels.CartItem;
import se.chalmers.ait.dat215.project.*;
/**
 *
 * @author jesper
 */
public class CartCard extends javax.swing.JPanel implements ShoppingCartListener, PropertyChangeListener {
    
    private IMatDataHandler handler;
    private EventHandler observer;
    /**
     * Creates new form CartPanel
     */
    public CartCard() {
        initComponents();
        handler=IMatDataHandler.getInstance();
        handler.getShoppingCart().addShoppingCartListener(this);
        observer = EventHandler.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fullPanel = new javax.swing.JPanel();
        sizePanel = new javax.swing.JPanel();
        gridPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(true);
        setOpaque(false);

        closeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeLabel.setText("x");
        closeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        jButton1.setText("Köp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Lägg till");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Välj", "Ny inköpslista" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total pris:  0");

        clearButton.setText("Rensa");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        gridPanel.setLayout(new java.awt.GridLayout(0, 1));

        javax.swing.GroupLayout sizePanelLayout = new javax.swing.GroupLayout(sizePanel);
        sizePanel.setLayout(sizePanelLayout);
        sizePanelLayout.setHorizontalGroup(
            sizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        sizePanelLayout.setVerticalGroup(
            sizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fullPanelLayout = new javax.swing.GroupLayout(fullPanel);
        fullPanel.setLayout(fullPanelLayout);
        fullPanelLayout.setHorizontalGroup(
            fullPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullPanelLayout.createSequentialGroup()
                .addComponent(sizePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        fullPanelLayout.setVerticalGroup(
            fullPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullPanelLayout.createSequentialGroup()
                .addComponent(sizePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 299, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(fullPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 537, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       observer.getObserver().update("buyCard");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(jComboBox1.getSelectedItem().equals("Ny inköpslista")){
           
           String listName = (String)JOptionPane.showInputDialog(jComboBox1, "Ange nya listans namn:");
            if(!customBackend.Lists.getInstance().creatNewList(listName)) {
             JOptionPane.showConfirmDialog(jComboBox1, "Det namnen är inte tillgänligt.");
           }
        }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox1.getSelectedItem().equals("Ny inköpslista")){
            
            if(!customBackend.Lists.getInstance().creatNewList((String)JOptionPane.showInputDialog(jComboBox1, "Ange nya listans namn:"))) {
             
                JOptionPane.showConfirmDialog(jComboBox1, "Det namnen är inte tillgänligt.");
            }
        }
        if(!productList.isEmpty()){
            customBackend.Lists.getInstance().addToList((String)jComboBox1.getSelectedItem(),productList);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        handler.getShoppingCart().clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        observer.getObserver().closeCartCard();
    }//GEN-LAST:event_closeLabelMouseClicked

    private List<Product> productList = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel fullPanel;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel sizePanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void shoppingCartChanged(CartEvent ce) {
        System.out.print("Cart1");
        if(ce.isAddEvent()){
            ShoppingItem item =ce.getShoppingItem();
            Product p = item.getProduct();
            productList.add(p);
            gridPanel.add(new CartItem(item,this));
        }else{
            gridPanel.removeAll();
            List<ShoppingItem> list = handler.getShoppingCart().getItems();
            for(ShoppingItem item : list){
                gridPanel.add(new CartItem(item,this));
            }
        }
    }
    
    

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Object src = evt.getSource();
        gridPanel.remove((Component)src);
        this.repaint();
    }
}
