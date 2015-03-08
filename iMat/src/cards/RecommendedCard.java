package cards;



import customBackend.Lists;
import java.util.ArrayList;
import java.util.List;
import panels.ItemPanel;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author jesper
 */
public class RecommendedCard extends javax.swing.JPanel {

    private Lists lists;
    private List<Product> products;
    private IMatDataHandler handler = IMatDataHandler.getInstance();
    /**
     * Creates new form ItemCard
     */
    public RecommendedCard() {
        lists = Lists.getInstance();
        initComponents();
        products = lists.getRecommended();
        createPanels();
    }
    
    int size=0;
    private void createPanels(){
            size = size + products.size();
            for(Product p: products){
                ItemPanel panel = new ItemPanel(p);
                panel.setSize(376, 200);
                gridPanel.add(panel);
            }
            gridPanel.setSize(gridPanel.getWidth(), size*200 + 20);
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
        jPanel2 = new javax.swing.JPanel();
        searchtextLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gridPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(775, 1079));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        searchtextLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchtextLabel.setText("Rekommenderade");

        jScrollPane2.setBackground(new java.awt.Color(102, 102, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        gridPanel.setBackground(new java.awt.Color(102, 102, 255));
        gridPanel.setLayout(new java.awt.GridLayout(0, 2, 5, 5));
        jScrollPane2.setViewportView(gridPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchtextLabel)
                .addContainerGap(597, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchtextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(616, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel searchtextLabel;
    // End of variables declaration//GEN-END:variables
}