/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import customBackend.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import panels.ItemPanel;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author jesper
 */
public class GroceryListCard extends javax.swing.JPanel {
    Lists lists;
    List<Product> groceryList = null; 
    //List<ItemPanel> itemPanels = new ArrayList();
    /**
     * Creates new form ItemCard
     */
    public GroceryListCard(String listName) {
        lists = Lists.getInstance();
        groceryList = lists.getList(listName);
        initComponents();
        createPanels();
    }
    
    private void createPanels(){
        gridPanel.removeAll();
        if(groceryList != null){
            for(Product p: groceryList){
                ItemPanel panel = new ItemPanel(p);
                panel.setSize(376, 200);
                gridPanel.add(panel);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fullPanel = new javax.swing.JPanel();
        sizePanel = new javax.swing.JPanel();
        gridPanel = new javax.swing.JPanel();
        listName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(775, 1079));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        fullPanel.setBackground(new java.awt.Color(255, 255, 255));

        gridPanel.setBackground(new java.awt.Color(255, 255, 255));
        gridPanel.setLayout(new java.awt.GridLayout(0, 1));

        javax.swing.GroupLayout sizePanelLayout = new javax.swing.GroupLayout(sizePanel);
        sizePanel.setLayout(sizePanelLayout);
        sizePanelLayout.setHorizontalGroup(
            sizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sizePanelLayout.createSequentialGroup()
                .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fullPanelLayout.setVerticalGroup(
            fullPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullPanelLayout.createSequentialGroup()
                .addComponent(sizePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 960, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(fullPanel);

        listName.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listName)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fullPanel;
    private javax.swing.JPanel gridPanel;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listName;
    private javax.swing.JPanel sizePanel;
    // End of variables declaration//GEN-END:variables
}
