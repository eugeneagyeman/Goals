package goals;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account extends javax.swing.JFrame {

    public Account() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createLbl = new javax.swing.JLabel();
        userLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        goalLbl = new javax.swing.JLabel();
        locationLbl = new javax.swing.JLabel();
        userTf = new javax.swing.JTextField();
        passTf = new javax.swing.JTextField();
        nameTf = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        ageTf = new javax.swing.JTextField();
        locationTf = new javax.swing.JTextField();
        goalBox = new javax.swing.JComboBox();
        cancelBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createLbl.setFont(new java.awt.Font("Avenir Next", 0, 48)); // NOI18N
        createLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLbl.setText("Create Account");

        userLbl.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        userLbl.setText("Enter Username");

        passLbl.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        passLbl.setText("Enter Password");

        nameLbl.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        nameLbl.setText("Enter Name");

        goalLbl.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        goalLbl.setText("Select Ultimate Goal");

        locationLbl.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        locationLbl.setText("Enter Location");

        userTf.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N

        passTf.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N

        nameTf.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N

        ageLbl.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        ageLbl.setText("Enter Age");

        ageTf.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N

        locationTf.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N

        goalBox.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        goalBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enjoying Life", "Being Healthy", "Pursuing Ideals & Passions", "Achieving Intellectual Growth", "Achieving Self-Knowledge", "Travelling", "Other" }));

        cancelBtn.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        createBtn.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        createBtn.setText("Create Account");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(locationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(createLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userTf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passTf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ageTf))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(locationTf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(goalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(goalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userTf)
                    .addComponent(userLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passTf)
                    .addComponent(passLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTf)
                    .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageTf)
                    .addComponent(ageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(locationTf)
                    .addComponent(locationLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(goalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(goalBox))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setVisible(false); // Returns to log in menu if cancel button is clicked
        String [] args ={};
        Login.main(args);             
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String username = userTf.getText(); // Gets username from TF
        String password = passTf.getText(); // gets password from TF
        String name = nameTf.getText(); // Gets name from TF
        String age = ageTf.getText(); // Gets age from TF
        String location = locationTf.getText(); // Gets location from TF
        String goal = (String) goalBox.getSelectedItem(); // Gets selected goal from drop down box
       
        
        try {
            FileWriting.create(username, password, name, age, location, goal); // Creates user file
        } catch (IOException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setVisible(false); // Returns to log in page
        String [] args = {};
        Login.main(args);

    }//GEN-LAST:event_createBtnActionPerformed

    public static void account() {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTf;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel createLbl;
    private javax.swing.JComboBox goalBox;
    private javax.swing.JLabel goalLbl;
    private javax.swing.JLabel locationLbl;
    private javax.swing.JTextField locationTf;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JLabel passLbl;
    private javax.swing.JTextField passTf;
    private javax.swing.JLabel userLbl;
    private javax.swing.JTextField userTf;
    // End of variables declaration//GEN-END:variables
}
