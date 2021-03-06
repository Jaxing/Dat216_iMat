package panels;


import customBackend.EventHandler;
import customBackend.EventListener;
import customBackend.Lists;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
public class bannerJPanel extends javax.swing.JPanel {
    private int imgWidth = 800;
    private int imgHeight = 200;
    private IMatDataHandler handler = IMatDataHandler.getInstance();
    private Lists lists = Lists.getInstance();
    private List<Product> allProducts;
    private EventHandler ehandler;
    //private EventListener elistener;
    /**
     * Creates new form banneJpanel
     */
    public bannerJPanel() {
        initComponents();
        startBannerSlider();
        allProducts = lists.getAllProducts();
        initBanners();
        ehandler = EventHandler.getInstance();
        //elistener = ehandler.getObserver();
    }
    
    public void startBannerSlider(){
       timer = new Timer(3000,taskPerformer);
       timer.start();
    }
    
    public void stopBannerSlider(){
        timer.stop();
    }
    
    ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
              CardLayout theLayout = (CardLayout)cardLayoutPanel.getLayout();
              theLayout.next(cardLayoutPanel);
        }
    };
    
    public void initBanners(){
        try{
            Image imgBanner1 = ImageIO.read(getClass().getResource("/imat/images/banner1.jpg"));
            Image rezized = rezize(imgBanner1);
            ImageIcon newImage = new ImageIcon(rezized);
            backGround.setIcon(newImage);
            
            Image imgBanner2 = ImageIO.read(getClass().getResource("/imat/images/banner2.jpg"));
            Image banner2Rezized = rezize(imgBanner2);
            ImageIcon newImageBanner2 = new ImageIcon(banner2Rezized);
            backGround1.setIcon(newImageBanner2);
            
            Image imgBanner3 = ImageIO.read(getClass().getResource("/imat/images/banner3.jpg"));
            Image banner3Rezized = rezize(imgBanner3);
            ImageIcon newImageBanner3 = new ImageIcon(banner3Rezized);
            backGround2.setIcon(newImageBanner3);
        } catch (IOException e){
            System.out.println("Hi");
        }
        
    }
    
   private Image rezize(Image image) {
        int type = BufferedImage.TYPE_INT_ARGB;


        BufferedImage resizedImage = new BufferedImage(imgWidth, imgHeight, type);
        Graphics2D g = resizedImage.createGraphics();

        g.setComposite(AlphaComposite.Src);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.drawImage(image, 0, 0, imgWidth, imgHeight, this);
        g.dispose();


        return resizedImage;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        cardLayoutPanel = new javax.swing.JPanel();
        bannerPanel1 = new ImagePanel();
        jPanel1 = new javax.swing.JPanel();
        showOfferPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();
        bannerPanel2 = new ImagePanel();
        jPanel4 = new javax.swing.JPanel();
        showOfferPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        backGround1 = new javax.swing.JLabel();
        bannerPanel3 = new ImagePanel();
        jPanel5 = new javax.swing.JPanel();
        showOfferPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        backGround2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cardLayoutPanel.setBackground(new java.awt.Color(255, 212, 200));
        cardLayoutPanel.setPreferredSize(new java.awt.Dimension(750, 200));
        cardLayoutPanel.setLayout(new java.awt.CardLayout());

        bannerPanel1.setBackground(new java.awt.Color(204, 204, 255));
        bannerPanel1.setPreferredSize(new java.awt.Dimension(750, 0));
        bannerPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        showOfferPanel1.setBackground(new java.awt.Color(255, 255, 255));
        showOfferPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        showOfferPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showOfferPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showOfferPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showOfferPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showOfferPanelMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Visa erbjudande");

        javax.swing.GroupLayout showOfferPanel1Layout = new javax.swing.GroupLayout(showOfferPanel1);
        showOfferPanel1.setLayout(showOfferPanel1Layout);
        showOfferPanel1Layout.setHorizontalGroup(
            showOfferPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showOfferPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        showOfferPanel1Layout.setVerticalGroup(
            showOfferPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showOfferPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(604, Short.MAX_VALUE)
                .addComponent(showOfferPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(showOfferPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 578;
        gridBagConstraints.ipady = 112;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bannerPanel1.add(jPanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 13, 0);
        bannerPanel1.add(backGround, gridBagConstraints);

        cardLayoutPanel.add(bannerPanel1, "card2");

        bannerPanel2.setBackground(new java.awt.Color(204, 204, 255));
        bannerPanel2.setPreferredSize(new java.awt.Dimension(750, 0));
        bannerPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel4.setOpaque(false);

        showOfferPanel3.setBackground(new java.awt.Color(255, 255, 255));
        showOfferPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        showOfferPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showOfferPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showOfferPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showOfferPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showOfferPanelMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Visa erbjudande");

        javax.swing.GroupLayout showOfferPanel3Layout = new javax.swing.GroupLayout(showOfferPanel3);
        showOfferPanel3.setLayout(showOfferPanel3Layout);
        showOfferPanel3Layout.setHorizontalGroup(
            showOfferPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showOfferPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        showOfferPanel3Layout.setVerticalGroup(
            showOfferPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showOfferPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(592, Short.MAX_VALUE)
                .addComponent(showOfferPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(showOfferPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 578;
        gridBagConstraints.ipady = 112;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bannerPanel2.add(jPanel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 13, 0);
        bannerPanel2.add(backGround1, gridBagConstraints);

        cardLayoutPanel.add(bannerPanel2, "card2");

        bannerPanel3.setBackground(new java.awt.Color(204, 204, 255));
        bannerPanel3.setPreferredSize(new java.awt.Dimension(750, 0));
        bannerPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel5.setOpaque(false);

        showOfferPanel4.setBackground(new java.awt.Color(255, 255, 255));
        showOfferPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        showOfferPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showOfferPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showOfferPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showOfferPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showOfferPanelMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Visa erbjudande");

        javax.swing.GroupLayout showOfferPanel4Layout = new javax.swing.GroupLayout(showOfferPanel4);
        showOfferPanel4.setLayout(showOfferPanel4Layout);
        showOfferPanel4Layout.setHorizontalGroup(
            showOfferPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showOfferPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        showOfferPanel4Layout.setVerticalGroup(
            showOfferPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showOfferPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(592, Short.MAX_VALUE)
                .addComponent(showOfferPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(showOfferPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 578;
        gridBagConstraints.ipady = 112;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bannerPanel3.add(jPanel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 13, 0);
        bannerPanel3.add(backGround2, gridBagConstraints);

        cardLayoutPanel.add(bannerPanel3, "card2");

        add(cardLayoutPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void showOfferPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showOfferPanelMouseEntered
        Color red = new Color(255,102,102);
        showOfferPanel1.setBackground(red);
        showOfferPanel4.setBackground(red);
        showOfferPanel3.setBackground(red);
    }//GEN-LAST:event_showOfferPanelMouseEntered

    private void showOfferPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showOfferPanelMouseExited
        showOfferPanel1.setBackground(Color.white);
        showOfferPanel4.setBackground(Color.white);
        showOfferPanel3.setBackground(Color.white);
    }//GEN-LAST:event_showOfferPanelMouseExited

    private void showOfferPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showOfferPanel1MouseClicked
        ehandler.getObserver().bannerClicked(1);
    }//GEN-LAST:event_showOfferPanel1MouseClicked

    private void showOfferPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showOfferPanel3MouseClicked
        ehandler.getObserver().bannerClicked(2);
    }//GEN-LAST:event_showOfferPanel3MouseClicked

    private void showOfferPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showOfferPanel4MouseClicked
        ehandler.getObserver().bannerClicked(3);
    }//GEN-LAST:event_showOfferPanel4MouseClicked
    
    public int getBannerValue(){
        return bannerValue;
    }
   /* public void setTitle(String title){
        titleLabel.setText(title);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JLabel backGround1;
    private javax.swing.JLabel backGround2;
    private javax.swing.JPanel bannerPanel1;
    private javax.swing.JPanel bannerPanel2;
    private javax.swing.JPanel bannerPanel3;
    private javax.swing.JPanel cardLayoutPanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel showOfferPanel1;
    private javax.swing.JPanel showOfferPanel3;
    private javax.swing.JPanel showOfferPanel4;
    // End of variables declaration//GEN-END:variables
    int bannerValue;
    Timer timer;
}
