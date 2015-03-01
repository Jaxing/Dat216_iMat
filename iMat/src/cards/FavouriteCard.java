/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import customBackend.Lists;
import java.util.ArrayList;
import java.util.List;
import panels.ItemPanel;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author jesper
 */
public class FavouriteCard extends javax.swing.JPanel {
    Lists lists;
    List<Product> favProducts = lists.getFavourit();
    List<ItemPanel> itemPanels = new ArrayList();
    /**
     * Creates new form ItemCard
     */
    public FavouriteCard() {
        lists = Lists.getInstance();
        initComponents();
    }
    
    public void createPanels(){
        if(favProducts != null){
            mainPanel.remove(noFavouriteLabel);
            for(Product p: favProducts){
                ItemPanel panel = new ItemPanel(p);
                panel.setSize(376, 200);
                mainPanel.add(panel);
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemPanel2 = new panels.ItemPanel();
        itemPanel1 = new panels.ItemPanel();
        itemPanel6 = new panels.ItemPanel();
        itemPanel3 = new panels.ItemPanel();
        itemPanel4 = new panels.ItemPanel();
        itemPanel8 = new panels.ItemPanel();
        itemPanel10 = new panels.ItemPanel();
        itemPanel9 = new panels.ItemPanel();
        itemPanel5 = new panels.ItemPanel();
        itemPanel7 = new panels.ItemPanel();
        itemPanel11 = new panels.ItemPanel();
        itemPanel13 = new panels.ItemPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        noFavouriteLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(775, 1079));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.GridLayout(0, 2));

        noFavouriteLabel.setText("Inga favoritmarkerade produkter :(");
        mainPanel.add(noFavouriteLabel);

        jScrollPane2.setViewportView(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panels.ItemPanel itemPanel1;
    private panels.ItemPanel itemPanel10;
    private panels.ItemPanel itemPanel11;
    private panels.ItemPanel itemPanel13;
    private panels.ItemPanel itemPanel2;
    private panels.ItemPanel itemPanel3;
    private panels.ItemPanel itemPanel4;
    private panels.ItemPanel itemPanel5;
    private panels.ItemPanel itemPanel6;
    private panels.ItemPanel itemPanel7;
    private panels.ItemPanel itemPanel8;
    private panels.ItemPanel itemPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel noFavouriteLabel;
    // End of variables declaration//GEN-END:variables
}
