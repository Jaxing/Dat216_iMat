package panels;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import customBackend.Observer;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesper
 */
public class IMatFrame extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form IMatFrame
     */
    public IMatFrame() {
        
        
        
        initComponents();
        //initBanners();
       // initBannerSlider();
    }
   
    /*public void initBanners(){
        fruitBanner.setTitle("Frukt och grönt!");
        meatBanner.setTitle("Kött och fläsk");
        bananaBanner.setTitle("Bananer i pyjamas");
    }*/
    
    /*public void initBannerSlider(){
       timer = new Timer(3000,taskPerformer);
       timer.start();
    }
    
    ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
              CardLayout theLayout = (CardLayout)bannerCardLayoutPanel.getLayout();
              theLayout.next(bannerCardLayoutPanel);
        }
    };*/
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
        itemCard1 = new cards.ItemCard();
        historyCard1 = new cards.HistoryCard();
        listCard1 = new cards.ListCard();
        offersCard1 = new cards.OffersCard();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        backgroundPanel.setBackground(new java.awt.Color(204, 204, 255));

        searchField.setText("jTextField1");

        returnButton.setText("jButton1");

        searchButton.setText("Sök");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        profileButton.setText("jButton3");

        cartButton.setText("jButton4");

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
            .addGap(0, 764, Short.MAX_VALUE)
        );
        recipeCard1Layout.setVerticalGroup(
            recipeCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        MainpagePanel.add(recipeCard1, "recipeCard");
        MainpagePanel.add(itemCard1, "itemCard");

        javax.swing.GroupLayout historyCard1Layout = new javax.swing.GroupLayout(historyCard1);
        historyCard1.setLayout(historyCard1Layout);
        historyCard1Layout.setHorizontalGroup(
            historyCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
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
            .addGap(0, 762, Short.MAX_VALUE)
        );
        listCard1Layout.setVerticalGroup(
            listCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        MainpagePanel.add(listCard1, "listCard");
        MainpagePanel.add(offersCard1, "offersCard");

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
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MainpagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(profileButton)
                        .addComponent(cartButton))
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(returnButton)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton)))
                .addGap(18, 18, 18)
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
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 692, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void sideMenuPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideMenuPanel1MouseClicked
        
    }//GEN-LAST:event_sideMenuPanel1MouseClicked

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
    
    public void selectCard(String listSelected){
        switch(listSelected){
            case("Hem"): switchCard("homeCard");
                break;
            
        }
    }
    
    private void switchCard(String card){
        CardLayout layout = (CardLayout)MainpagePanel.getLayout();
        layout.show(MainpagePanel, card);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainpagePanel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton cartButton;
    private cards.HistoryCard historyCard1;
    private cards.HomeCard homeCard2;
    private cards.ItemCard itemCard1;
    private javax.swing.JToggleButton jToggleButton1;
    private cards.ListCard listCard1;
    private cards.OffersCard offersCard1;
    private javax.swing.JButton profileButton;
    private cards.RecipeCard recipeCard1;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private panels.sideMenuPanel sideMenuPanel1;
    // End of variables declaration//GEN-END:variables
    Timer timer; 

    

    
}
