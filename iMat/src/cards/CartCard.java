package cards;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import customBackend.*;
import java.awt.CardLayout;
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

    private Lists lists;

    /**
     * Creates new form CartPanel
     */
    public CartCard() {
        initComponents();
        handler=IMatDataHandler.getInstance();
        handler.getShoppingCart().addShoppingCartListener(this);

        observer = EventHandler.getInstance();

        listLayout = (CardLayout)cardPanel.getLayout();
        listPanel.setVisible(false);
        lists = Lists.getInstance();
        listModel = new DefaultListModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listPanel = new javax.swing.JPanel();
        cardPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        listNameLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listView = new javax.swing.JList();
        addGroceryButton = new javax.swing.JButton();
        closeLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        grocerylistBox = new javax.swing.JComboBox();
        priceLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fullPanel = new javax.swing.JPanel();
        sizePanel = new javax.swing.JPanel();
        gridPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        listPanel.setBackground(new java.awt.Color(255, 255, 255));
        listPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cardPanel.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        listNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        listNameLabel.setText("Namn på lista");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listNameLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        cardPanel.add(jPanel3, "oldList");

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Namn:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        cardPanel.add(jPanel4, "newList");

        jScrollPane1.setViewportView(listView);

        addGroceryButton.setText("Lägg till");
        addGroceryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroceryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addGroceryButton)
                .addContainerGap())
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addGroceryButton)
                .addGap(7, 7, 7))
        );

        setBackground(new java.awt.Color(153, 153, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setFocusCycleRoot(true);

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

        grocerylistBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inköpslista", "Ny inköpslista" }));
        grocerylistBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                grocerylistBoxItemStateChanged(evt);
            }
        });
        grocerylistBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grocerylistBoxActionPerformed(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceLabel.setText("0");

        clearButton.setText("Ta bort markerade");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        fullPanel.setBackground(new java.awt.Color(153, 153, 255));

        gridPanel.setBackground(new java.awt.Color(153, 153, 255));
        gridPanel.setLayout(new java.awt.GridLayout(0, 1));

        javax.swing.GroupLayout sizePanelLayout = new javax.swing.GroupLayout(sizePanel);
        sizePanel.setLayout(sizePanelLayout);
        sizePanelLayout.setHorizontalGroup(
            sizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
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
                .addGap(0, 250, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(fullPanel);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Pris:");

        jCheckBox1.setText("Markera alla");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(grocerylistBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceLabel)
                        .addGap(222, 222, 222)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearButton, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(clearButton)
                            .addComponent(grocerylistBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       observer.getObserver().update("buyCard");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void grocerylistBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_grocerylistBoxItemStateChanged
        changeList();
    }//GEN-LAST:event_grocerylistBoxItemStateChanged

    private void addGroceryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroceryButtonActionPerformed
        if(grocerylistBox.getSelectedItem().equals("Ny inköpslista")){
            String name = nameTextField.getText();
            createGroceryList();
            addToSideMenu(name);
            addToComboBox(name);
            grocerylistBox.setSelectedItem(name);
        } else{
            incrementGroceryList();
        }
        
    }//GEN-LAST:event_addGroceryButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        for(CartItem i : cl){
            if(i.isItemMarked()){
                handler.getShoppingCart().removeItem(i.getShoppingItem());
            }
        }
        this.repaint();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        observer.getObserver().closeCartCard();
    }//GEN-LAST:event_closeLabelMouseClicked

    private void grocerylistBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grocerylistBoxActionPerformed
        
    }//GEN-LAST:event_grocerylistBoxActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
    for(CartItem i : cl){
           i.setItemMarked(jCheckBox1.isSelected());                   
       }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged
    
    private void viewGroceryList(String name){
        listModel.clear();
        List<Product> products = lists.getList(name);
        
        int i = 0;
        for(Product prod: products){
            listModel.add(i, prod.getName());
            i++;
        }
        
        listView.setModel(listModel);
        listNameLabel.setText(name);
        listLayout.show(cardPanel, "oldList");
    }
        
    private void addToComboBox(String name){
        grocerylistBox.addItem(name);
    }
    
    private void addToSideMenu(String name){
        observer.getObserver().addToSideMenu(name);
    }
    
    private void incrementGroceryList(){
            List<Product> oldList = lists.getList((String)grocerylistBox.getSelectedItem());
            List<ShoppingItem> items = handler.getShoppingCart().getItems();
            System.out.println("Hej");
            for(ShoppingItem item: items){
                oldList.add(item.getProduct());
            }
            changeList();
    }
    
    private void createGroceryList(){
        //List<Product> newList = lists.createNewList(nameTextField.getText());
        List<Product> newList = new ArrayList();
        List<ShoppingItem> items = handler.getShoppingCart().getItems();
        
        for(ShoppingItem item: items){
            newList.add(item.getProduct());
        }
        
        lists.addToList(nameTextField.getText(), newList);
    }
    
    private void changeList(){
        String selectedItem = (String)grocerylistBox.getSelectedItem(); 
        if(selectedItem.equals("Ny inköpslista")){
            listLayout.show(cardPanel, "newList");
            listPanel.setVisible(true);
            
            nameTextField.setText("");
            listModel.clear();
            listView.setModel(listModel);
        } else if(selectedItem.equals("Inköpslista")){
            listPanel.setVisible(false);
        } else{
            viewGroceryList(selectedItem);
        }
    }
    
    private void setPrice(){
        priceLabel.setText(Double.toString(handler.getShoppingCart().getTotal()));
    }
    
    private List<Product> productList = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroceryButton;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel fullPanel;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JComboBox grocerylistBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listNameLabel;
    private javax.swing.JPanel listPanel;
    private javax.swing.JList listView;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JPanel sizePanel;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel listModel;
    private CardLayout listLayout;
    private List<CartItem> cl = new ArrayList();
    
    @Override
    public void shoppingCartChanged(CartEvent ce) {

        if(ce.isAddEvent()){
            ShoppingItem item =ce.getShoppingItem();
            Product p = item.getProduct();
            
            if(productList.contains(p)){
                for(CartItem i : cl){
                    if(i.getShoppingItem().getProduct().equals(p)){
                        for(int k = 0 ; k < item.getAmount(); k++)
                                i.increse();
                        this.repaint();
                        handler.getShoppingCart().removeItem(item);
                    }
                }
            }else{
                CartItem cartItem = new CartItem(item,this);
                cl.add(cartItem);
                productList.add(p);
                gridPanel.add(cartItem);
            }

        }else{
            gridPanel.removeAll();
            productList.removeAll(productList);
            List<ShoppingItem> list = handler.getShoppingCart().getItems();
            for(ShoppingItem item : list){
                gridPanel.add(new CartItem(item,this));
                productList.add(item.getProduct());
            }
        }
        setPrice();

    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Object src = evt.getSource();
        //if(evt.getPropertyName().equals("delete")){
            gridPanel.remove((Component)src);
        //}
        setPrice();
        this.repaint();
        
    }
    
    
}