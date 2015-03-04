/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import customBackend.EventHandler;
import customBackend.Profile;

/**
 *
 * @author jesper
 */
public class ProfileChangeCard extends javax.swing.JPanel {
    private Profile profile = Profile.getInstance();
    private EventHandler eventHandler = EventHandler.getInstance();
    /**
     * Creates new form ProfileChangeCard
     */
    public ProfileChangeCard() {
        initComponents();
        openCard();
    }

    public void openCard(){
        if(profile.isLoggedIn()){
            if(!profile.getCreditCard().isEmpty()){
                cardNumberTextField.setText(profile.getCreditCard());
                cardTypeName.setText(profile.getCardType());
            }
            ccvTextField.setText(profile.getCCV()+"");
            if(!profile.getEmail().isEmpty()){
                emailTextField.setText(profile.getEmail());
            }
            expireDateDayCombobox.setSelectedIndex(profile.getValideMonth()-1);
            expireDateMonthComobox.setSelectedIndex(profile.getValideYear()-15);
            if(!profile.getUsername().isEmpty()){
                registerUsernameTextField.setText(profile.getUsername());
            }
            if(!profile.getPostCode().isEmpty()){
                zippCodeTextField.setText(profile.getPostCode());
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

        registerCardPanel = new javax.swing.JPanel();
        registerCancelButton1 = new javax.swing.JButton();
        registerAcceptButton1 = new javax.swing.JButton();
        newUserLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        ccvTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cardTypeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        expireDateMonthComobox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        expireDateDayCombobox = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        zippCodeTextField = new javax.swing.JTextField();
        cardTypeName = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        registerPasswordField = new javax.swing.JPasswordField();
        registerPasswordConfirmLabel = new javax.swing.JLabel();
        emailConfirmTextField = new javax.swing.JTextField();
        registerUsernameLabel = new javax.swing.JLabel();
        badMatchLabel = new javax.swing.JLabel();
        registerPasswordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailConfirmLabel = new javax.swing.JLabel();
        registerPasswordConfirmField = new javax.swing.JPasswordField();
        registerUsernameTextField = new javax.swing.JTextField();

        registerCardPanel.setBackground(new java.awt.Color(153, 153, 255));

        registerCancelButton1.setText("Avbryt");
        registerCancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCancelButton1ActionPerformed(evt);
            }
        });

        registerAcceptButton1.setText("Ändra");
        registerAcceptButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAcceptButton1ActionPerformed(evt);
            }
        });

        newUserLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newUserLabel1.setText("Profil");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Kortnummer");

        cardNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberTextFieldActionPerformed(evt);
            }
        });

        ccvTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Korttyp");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Utgångsdatum");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CCV");

        expireDateMonthComobox.setEditable(true);
        expireDateMonthComobox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        expireDateMonthComobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("/");

        expireDateDayCombobox.setEditable(true);
        expireDateDayCombobox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        expireDateDayCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Leverans Adress");

        addressTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Stad");

        cityTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Postnummer");

        zippCodeTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cardTypeName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardTypeName.setToolTipText("");

        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        registerPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        registerPasswordConfirmLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerPasswordConfirmLabel.setText("Lösenord igen:");

        emailConfirmTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        registerUsernameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerUsernameLabel.setText("Användarnamn:");

        badMatchLabel.setForeground(new java.awt.Color(255, 0, 0));

        registerPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerPasswordLabel.setText("Lösenord:");

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailLabel.setText("E-mailadress:");

        emailConfirmLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailConfirmLabel.setText("E-mail igen:");

        registerPasswordConfirmField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        registerUsernameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout registerCardPanelLayout = new javax.swing.GroupLayout(registerCardPanel);
        registerCardPanel.setLayout(registerCardPanelLayout);
        registerCardPanelLayout.setHorizontalGroup(
            registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerCardPanelLayout.createSequentialGroup()
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerCancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                        .addGap(0, 293, Short.MAX_VALUE)
                        .addComponent(cardTypeLabel)))
                .addGap(402, 402, 402)
                .addComponent(registerAcceptButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(registerCardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerCardPanelLayout.createSequentialGroup()
                                .addComponent(newUserLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerCardPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(badMatchLabel)
                        .addGap(324, 324, 324))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerCardPanelLayout.createSequentialGroup()
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registerCardPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(registerCardPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ccvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(zippCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                                                        .addComponent(expireDateMonthComobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(expireDateDayCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(registerCardPanelLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(cardNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(registerUsernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerCardPanelLayout.createSequentialGroup()
                                                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(emailConfirmLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(registerPasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(registerPasswordConfirmLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(10, 10, 10)))
                                        .addGap(18, 18, 18)
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(registerUsernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(emailConfirmTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(registerPasswordConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13))))
                            .addComponent(cardTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(213, 213, 213))))
        );
        registerCardPanelLayout.setVerticalGroup(
            registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerCardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newUserLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cardTypeLabel)
                .addGap(18, 18, 18)
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                        .addComponent(registerUsernameLabel)
                        .addGap(77, 77, 77)
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerPasswordLabel)
                            .addComponent(registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerPasswordConfirmLabel)
                            .addComponent(registerPasswordConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cardNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailConfirmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailConfirmLabel)))
                    .addComponent(registerUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(expireDateMonthComobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(expireDateDayCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(zippCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerAcceptButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerCancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(badMatchLabel)
                .addGap(120, 120, 120)
                .addComponent(cardTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 559, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerCancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCancelButton1ActionPerformed
        eventHandler.getObserver().update();
    }//GEN-LAST:event_registerCancelButton1ActionPerformed

    private void cardNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberTextFieldActionPerformed
        
    }//GEN-LAST:event_cardNumberTextFieldActionPerformed

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void registerAcceptButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAcceptButton1ActionPerformed
        profile.setCreditCard(cardNumberTextField.getText());
        eventHandler.getObserver().update();
    }//GEN-LAST:event_registerAcceptButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel badMatchLabel;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JLabel cardTypeLabel;
    private javax.swing.JLabel cardTypeName;
    private javax.swing.JTextField ccvTextField;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel emailConfirmLabel;
    private javax.swing.JTextField emailConfirmTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox expireDateDayCombobox;
    private javax.swing.JComboBox expireDateMonthComobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel newUserLabel1;
    private javax.swing.JButton registerAcceptButton1;
    private javax.swing.JButton registerCancelButton1;
    private javax.swing.JPanel registerCardPanel;
    private javax.swing.JPasswordField registerPasswordConfirmField;
    private javax.swing.JLabel registerPasswordConfirmLabel;
    private javax.swing.JPasswordField registerPasswordField;
    private javax.swing.JLabel registerPasswordLabel;
    private javax.swing.JLabel registerUsernameLabel;
    private javax.swing.JTextField registerUsernameTextField;
    private javax.swing.JTextField zippCodeTextField;
    // End of variables declaration//GEN-END:variables
}
