package panels;






import cards.CartCard;


import cards.FavouriteCard;

import cards.HistoryCard;
import cards.GroceryListCard;

import cards.HistoryCard;

import cards.GroceryListCard;


import cards.HistoryCard;
import cards.GroceryListCard;
import cards.ItemCard;
import cards.SearchCard;


import customBackend.Lists;

import java.awt.CardLayout;
import customBackend.EventListener;
import customBackend.EventHandler;
import customBackend.Profile;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.CartEvent;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.ProductCategory;
import se.chalmers.ait.dat215.project.ShoppingCartListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesper
 */
public class IMatFrame extends javax.swing.JFrame implements EventListener,ShoppingCartListener{
    
    private static EventHandler observer = EventHandler.getInstance();
    private Profile profile = Profile.getInstance();
    private CardLayout mainCardlayout;
    private IMatDataHandler handler = IMatDataHandler.getInstance();
    /**
     * Creates new form IMatFrame
     */
    public IMatFrame() {

        initComponents();
        observer.setObserver(this);
        mainCardlayout = (CardLayout)MainpagePanel.getLayout();
        previousCards.add("homeCard");
        handler.getShoppingCart().addShoppingCartListener(this);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        backgroundPanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        returnButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        cartButton = new javax.swing.JButton();
        sideMenuPanel1 = new panels.sideMenuPanel();
        MainpagePanel = new javax.swing.JPanel();
        homeCard2 = new cards.HomeCard();
        recipeCard1 = new cards.RecipeCard();
        historyCard1 = new cards.HistoryCard();
        listCard1 = new cards.ListCard();
        offersCard1 = new cards.OffersCard();
        searchCard1 = new cards.SearchCard();
        cartCard1 = new cards.CartCard();
        buyCard1 = new cards.BuyCard();
        profileCard1 = new cards.ProfileCard();
        profileChangeCard1 = new cards.ProfileChangeCard();
        priceLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        backgroundPanel.setBackground(new java.awt.Color(204, 204, 255));

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        returnButton.setBackground(new java.awt.Color(255, 255, 255));
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/images/backIcon.png"))); // NOI18N
        returnButton.setBorder(null);
        returnButton.setBorderPainted(false);
        returnButton.setContentAreaFilled(false);
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Sök");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/images/newprofileicon.png"))); // NOI18N
        profileButton.setContentAreaFilled(false);
        profileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/images/profile-icon2.png"))); // NOI18N
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        cartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/images/cart.png"))); // NOI18N
        cartButton.setContentAreaFilled(false);
        cartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        sideMenuPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideMenuPanel1MouseClicked(evt);
            }
        });

        MainpagePanel.setBackground(new java.awt.Color(204, 204, 255));
        MainpagePanel.setLayout(new java.awt.CardLayout());

        homeCard2.setBackground(new java.awt.Color(204, 204, 255));
        MainpagePanel.add(homeCard2, "homeCard");

        javax.swing.GroupLayout recipeCard1Layout = new javax.swing.GroupLayout(recipeCard1);
        recipeCard1.setLayout(recipeCard1Layout);
        recipeCard1Layout.setHorizontalGroup(
            recipeCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        recipeCard1Layout.setVerticalGroup(
            recipeCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        MainpagePanel.add(recipeCard1, "recipeCard");

        javax.swing.GroupLayout historyCard1Layout = new javax.swing.GroupLayout(historyCard1);
        historyCard1.setLayout(historyCard1Layout);
        historyCard1Layout.setHorizontalGroup(
            historyCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        historyCard1Layout.setVerticalGroup(
            historyCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        MainpagePanel.add(historyCard1, "historyCard");

        javax.swing.GroupLayout listCard1Layout = new javax.swing.GroupLayout(listCard1);
        listCard1.setLayout(listCard1Layout);
        listCard1Layout.setHorizontalGroup(
            listCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        listCard1Layout.setVerticalGroup(
            listCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        MainpagePanel.add(listCard1, "listCard");
        MainpagePanel.add(offersCard1, "offersCard");
        MainpagePanel.add(searchCard1, "searchCard");
        MainpagePanel.add(cartCard1, "cartCard");
        MainpagePanel.add(buyCard1, "buyCard");
        MainpagePanel.add(profileCard1, "profileCard");
        MainpagePanel.add(profileChangeCard1, "profileChangeCard");

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pris:");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))
                    .addComponent(sideMenuPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MainpagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addContainerGap())))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton))
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profileButton))))
                .addGap(21, 21, 21)

                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainpagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sideMenuPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 708, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        search();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void sideMenuPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideMenuPanel1MouseClicked
        
    }//GEN-LAST:event_sideMenuPanel1MouseClicked

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        previousCard();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        if(!previousCards.get(previousCards.size()-1).equals("cartCard")){
            switchCard("cartCard");
        }else{
            previousCard();
        }
    }//GEN-LAST:event_cartButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        switchCard("profileCard");
    }//GEN-LAST:event_profileButtonActionPerformed

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            search();

    }//GEN-LAST:event_searchFieldKeyPressed
    
    private void search(){
        searchCard1.setSearchList(lists.search(searchField.getText()));
        switchCard("searchCard");
    }
    
    private void previousCard(){
        if(previousCards.size() > 1){
            previousCards.remove(previousCards.size()-1);
            mainCardlayout.show(MainpagePanel, previousCards.get(previousCards.size()-1));
        }
        
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
            java.util.logging.Logger.getLogger(IMatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMatFrame().setVisible(true);
            }
        });
    }
    
    @Override
    public void update(String selectedItem) {
        selectCard(selectedItem);
    }
    
    public void update(){
        previousCard();
    }
    
    private void selectCard(String listSelected){
        switch(listSelected){
            case("Hem"): switchCard("homeCard");
                        break;
            case("Erbjudande"): switchCard("offersCard");
                        break;
            case("Recept"): switchCard("recipeCard");
                        break;
            case("Mina inköpslistor"): switchCard("listCard");
                        break;
            case("Mina köp"): createHistory();
                        break;
            case("Favoritprodukter"): createFavourite();
                        break;
            case("buyCard"): switchCard("buyCard");
                break;
            case("profileChangeCard"):
                    switchCard("profileChangeCard");
                    break;
        }
    }
    private void createHistory(){
        if(historyCard1 != null){
            mainCardlayout.removeLayoutComponent(historyCard1);
            MainpagePanel.remove(historyCard1);
        }
        historyCard1 = new HistoryCard();
        MainpagePanel.add(historyCard1);
        mainCardlayout.addLayoutComponent("historyCard", historyCard1);
        mainCardlayout.show(MainpagePanel, "historyCard");
        previousCards.add("historyCard");
    }
    
    private void createFavourite(){
        if(favouriteCard != null){
            mainCardlayout.removeLayoutComponent(favouriteCard);
            MainpagePanel.remove(favouriteCard);
        }
        favouriteCard = new FavouriteCard();
        MainpagePanel.add(favouriteCard);
        mainCardlayout.addLayoutComponent("favouriteCard", favouriteCard);
        mainCardlayout.show(MainpagePanel, "favouriteCard");
        previousCards.add("favouriteCard");
    }
    
    private void switchCard(String card){
        mainCardlayout.show(MainpagePanel, card);
        previousCards.add(card);
    }
    
    private ProductCategory chooseCategory(String selectedItem){
        switch(selectedItem){
            case("Baljväxter"):
                return ProductCategory.POD;
            case("Bröd"):
                return ProductCategory.BREAD;
            case("Bär"):
                return ProductCategory.BERRY;
            case("Drycker"):
                return ProductCategory.COLD_DRINKS;
            case("Fisk"):
                return ProductCategory.FISH;
            case("Frukter"):
                return ProductCategory.FRUIT;
            case("Grönsaker"):
                return ProductCategory.VEGETABLE_FRUIT;
            case("Kött"):
                return ProductCategory.MEAT;
            case("Mjöl,socker & salt"):
                return ProductCategory.FLOUR_SUGAR_SALT;
            case("Mjölkprodukter"):
                return ProductCategory.DAIRIES;
            case("Nötter och frön"):
                return ProductCategory.NUTS_AND_SEEDS;
            case("Pasta"):
                return ProductCategory.PASTA;
            case("Potatis & Ris"):
                return ProductCategory.POTATO_RICE;
            case("Sötsaker"):
                return ProductCategory.SWEET;
            case("Örter"):
                return ProductCategory.HERB;
        }   
        return ProductCategory.BERRY;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainpagePanel;
    private javax.swing.JPanel backgroundPanel;
    private cards.BuyCard buyCard1;
    private javax.swing.JButton cartButton;
    private cards.CartCard cartCard1;
    private cards.HistoryCard historyCard1;
    private cards.HomeCard homeCard2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private cards.ListCard listCard1;
    private cards.OffersCard offersCard1;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton profileButton;
    private cards.ProfileCard profileCard1;
    private cards.ProfileChangeCard profileChangeCard1;
    private cards.RecipeCard recipeCard1;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton searchButton;
    private cards.SearchCard searchCard1;
    private javax.swing.JTextField searchField;
    private panels.sideMenuPanel sideMenuPanel1;
    // End of variables declaration//GEN-END:variables
    
    List<String> previousCards = new ArrayList();
    FavouriteCard favouriteCard; 
    Lists lists = Lists.getInstance();

    @Override
    public void closeCartCard() {
        previousCard();
    }

    @Override
    public void addToSideMenu(String name) {
        sideMenuPanel1.addMenuItem(name);
    }

    @Override
    public void grocerySubNodeSelected(String selectedItem) {
        GroceryListCard groceryListCard = new GroceryListCard(selectedItem);
        MainpagePanel.add(groceryListCard);
        mainCardlayout.addLayoutComponent(groceryListCard, selectedItem);
        switchCard(selectedItem);
    }   
    
    @Override
    public void categorySubNodeSelected(String selectedItem) {
        ProductCategory category = chooseCategory(selectedItem);
        ItemCard categoryCard = new ItemCard(category,selectedItem);
        MainpagePanel.add(categoryCard);
        mainCardlayout.addLayoutComponent(categoryCard, selectedItem);
        switchCard(selectedItem);
    }
    
    @Override
    public void shoppingCartChanged(CartEvent ce) {
        
        priceLabel.setText((""+handler.getShoppingCart().getTotal()));
    }

    
}
