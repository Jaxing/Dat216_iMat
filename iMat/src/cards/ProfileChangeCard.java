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
        //if(profile.isLoggedIn()){
            if(!profile.getCreditCard().isEmpty()){
                cardNumberTextField.setText(profile.getCreditCard());
                cardNameLabel.setText(profile.getCardType());
            }
            ccvTextField.setText(profile.getCCV()+"");
            if(!profile.getEmail().isEmpty()){
                emailTextField.setText(profile.getEmail());
                emailConfirmTextField.setText(profile.getEmail());
            }
            expireDateYearCombobox.setSelectedIndex(profile.getValideMonth());
            expireDateMonthComobox.setSelectedIndex(profile.getValideYear()-14);
            if(!profile.getUsername().isEmpty()){
                registerUsernameTextField.setText(profile.getUsername());
            }
            if(!profile.getPostCode().isEmpty()){
                zippCodeTextField.setText(profile.getPostCode());
            }
        //}
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
        jLabel1 = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        ccvTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cardTypeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        expireDateMonthComobox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        expireDateYearCombobox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        zippCodeTextField = new javax.swing.JTextField();
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
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        newUserLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cardNameLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        registerCardPanel.setBackground(new java.awt.Color(255, 255, 255));

        registerCancelButton1.setText("Avbryt");
        registerCancelButton1.setToolTipText("Gå tillbaka till profilen utan att ändra");
        registerCancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCancelButton1ActionPerformed(evt);
            }
        });

        registerAcceptButton1.setText("Spara");
        registerAcceptButton1.setToolTipText("Spara ändringarna");
        registerAcceptButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAcceptButton1ActionPerformed(evt);
            }
        });

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
        expireDateMonthComobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("/");

        expireDateYearCombobox.setEditable(true);
        expireDateYearCombobox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        expireDateYearCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Leverans Adress");

        addressTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Postnummer");

        zippCodeTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        newUserLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newUserLabel1.setText("Profil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newUserLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newUserLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout registerCardPanelLayout = new javax.swing.GroupLayout(registerCardPanel);
        registerCardPanel.setLayout(registerCardPanelLayout);
        registerCardPanelLayout.setHorizontalGroup(
            registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerCardPanelLayout.createSequentialGroup()
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerCardPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registerUsernameLabel)
                            .addComponent(emailLabel)
                            .addComponent(emailConfirmLabel)
                            .addComponent(registerPasswordLabel)
                            .addComponent(registerPasswordConfirmLabel))
                        .addGap(18, 18, 18)
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registerUsernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailConfirmTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registerPasswordConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cardTypeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(badMatchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ccvTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerCardPanelLayout.createSequentialGroup()
                                .addComponent(expireDateMonthComobox, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expireDateYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(zippCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
            .addGroup(registerCardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                        .addComponent(registerCancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerAcceptButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        registerCardPanelLayout.setVerticalGroup(
            registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerCardPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                        .addComponent(badMatchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                        .addComponent(cardTypeLabel)
                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerCardPanelLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(registerUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(registerUsernameLabel))
                                        .addGap(77, 77, 77)
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(registerPasswordLabel)
                                            .addComponent(registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(registerPasswordConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(registerPasswordConfirmLabel)))
                                    .addGroup(registerCardPanelLayout.createSequentialGroup()
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(cardNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel2)
                                            .addComponent(cardNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(expireDateMonthComobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(expireDateYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ccvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerCardPanelLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(emailConfirmLabel)
                                            .addComponent(emailConfirmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(zippCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(154, 154, 154))
                            .addGroup(registerCardPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registerCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(registerCancelButton1)
                                    .addComponent(registerAcceptButton1))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerCardPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerCancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCancelButton1ActionPerformed
        eventHandler.getObserver().update();
    }//GEN-LAST:event_registerCancelButton1ActionPerformed

    private void cardNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberTextFieldActionPerformed
        
    }//GEN-LAST:event_cardNumberTextFieldActionPerformed

    private void registerAcceptButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAcceptButton1ActionPerformed
        if(!registerUsernameTextField.getText().equals(""))
            profile.setUsername(registerUsernameTextField.getText());
        if(registerPasswordField.getText().equals(registerPasswordConfirmField.getText())){
            profile.setPassword(registerPasswordField.getText());
        } else {
            badMatchLabel.setText("Lösenorden matchar ej");
            return;
        }
        
        if(emailTextField.getText().equals(emailConfirmTextField.getText())){
            profile.setEmail(emailTextField.getText());
        } else {
           badMatchLabel.setText("Email addressen matchar ej");
           return;
        }
        profile.setCreditCard(cardNumberTextField.getText());
        
        profile.setAddress(addressTextField.getText());
        if(!ccvTextField.getText().isEmpty())
            profile.setCCV(Integer.parseInt(ccvTextField.getText()));
        
        profile.setValidDate(Integer.parseInt((String)expireDateMonthComobox.getSelectedItem()), Integer.parseInt((String)expireDateYearCombobox.getSelectedItem()));
        
        eventHandler.getObserver().update();
    }//GEN-LAST:event_registerAcceptButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel badMatchLabel;
    private javax.swing.JLabel cardNameLabel;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JLabel cardTypeLabel;
    private javax.swing.JTextField ccvTextField;
    private javax.swing.JLabel emailConfirmLabel;
    private javax.swing.JTextField emailConfirmTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox expireDateMonthComobox;
    private javax.swing.JComboBox expireDateYearCombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
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
