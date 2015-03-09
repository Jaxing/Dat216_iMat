/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import se.chalmers.ait.dat215.project.CartEvent;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingCartListener;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author jesper
 */
public class CartItem extends javax.swing.JPanel implements ShoppingCartListener{

    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private ShoppingItem item;
    private IMatDataHandler handler = IMatDataHandler.getInstance();
    /**
     * Creates new form cartItem
     */
    public CartItem(ShoppingItem item, PropertyChangeListener pcl) {
        initComponents();
        this.item = item;
        amountLabel.setText(item.getAmount()+" "+item.getProduct().getUnitSuffix());
        nameLabel.setText(item.getProduct().getName());
        pcs.addPropertyChangeListener(pcl);
    }
    
    public void setItemMarked(boolean b){
        jCheckBox1.setSelected(b);
    }
    
    public boolean isItemMarked(){
        return jCheckBox1.isSelected();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        decreseButton = new javax.swing.JButton();
        increseButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        jLabel1.setText("X");

        setBackground(new java.awt.Color(153, 153, 255));

        jButton1.setText("Ta bort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        decreseButton.setText("-");
        decreseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreseButtonActionPerformed(evt);
            }
        });

        increseButton.setText("+");
        increseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increseButtonActionPerformed(evt);
            }
        });

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addGap(12, 12, 12)
                .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(increseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decreseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(decreseButton)
                    .addComponent(increseButton)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        delete();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void increseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increseButtonActionPerformed
        increse();
    }//GEN-LAST:event_increseButtonActionPerformed

    private void decreseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreseButtonActionPerformed
        if(item.getAmount()>1){
            item.setAmount(item.getAmount()-1);
            amountLabel.setText(item.getAmount()+" "+item.getProduct().getUnitSuffix());
        }
    }//GEN-LAST:event_decreseButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    
    private void delete(){
        handler.getShoppingCart().removeItem(item);
        pcs.fireIndexedPropertyChange("deleted", 0, null, this);
    }
    

    public void increse(){
        item.setAmount(item.getAmount()+1);
        amountLabel.setText(item.getAmount()+" "+item.getProduct().getUnitSuffix());
        //pcs.fireIndexedPropertyChange("increse", 0, null, null);
    }
    
    public ShoppingItem getShoppingItem(){
        return item;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton decreseButton;
    private javax.swing.JButton increseButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void shoppingCartChanged(CartEvent ce) {
        
        if(!ce.isAddEvent()){
            if(ce.getShoppingItem().equals(item))
                delete();
        }else {
            amountLabel.setText(ce.getShoppingItem().getAmount()+" "+ce.getShoppingItem().getProduct().getUnitSuffix());
        }
    }
}
