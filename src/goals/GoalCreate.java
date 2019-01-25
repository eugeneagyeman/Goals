package goals;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GoalCreate extends javax.swing.JFrame {

    public GoalCreate() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        buildTitle = new javax.swing.JLabel();
        catagoryLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        typeLbl = new javax.swing.JLabel();
        startLbl = new javax.swing.JLabel();
        endLbl = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        typeBox = new javax.swing.JComboBox();
        catagoryTf = new javax.swing.JTextField();
        startTf = new javax.swing.JTextField();
        endTf = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        additf = new javax.swing.JTextArea();
        AdditionLbl = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buildTitle.setFont(new java.awt.Font("Avenir Next", 0, 48)); // NOI18N
        buildTitle.setText("Set a Goal.");
        buildTitle.setToolTipText("");
        buildTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        catagoryLbl.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        catagoryLbl.setText("Goal Catagory");

        nameLbl.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        nameLbl.setText("Goal Name");

        typeLbl.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        typeLbl.setText("Goal Type");

        startLbl.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        startLbl.setText("Start Date (DD-MM-YYYY)");

        endLbl.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        endLbl.setText("End Date (DD-MM-YYYY)");

        typeBox.setFont(new java.awt.Font("Arial Unicode MS", 0, 20)); // NOI18N
        typeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Definitive", "Numerical" }));

        startTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTfActionPerformed(evt);
            }
        });

        createBtn.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        additf.setColumns(20);
        additf.setRows(5);
        jScrollPane1.setViewportView(additf);

        AdditionLbl.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        AdditionLbl.setText("Additional Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(catagoryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(catagoryTf))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(typeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(endLbl)
                                            .addGap(18, 18, 18)
                                            .addComponent(endTf, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(startLbl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(startTf, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6))
                                        .addComponent(AdditionLbl, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 12, Short.MAX_VALUE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buildTitle)
                        .addGap(161, 161, 161))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buildTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catagoryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catagoryTf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startTf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endTf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AdditionLbl)
                        .addGap(85, 85, 85)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
       
       String goal = "";
       boolean correct = true;
       String name = nameTf.getText(); // Info taken from what user entered
       String catagory = catagoryTf.getText();
       String type = (String) typeBox.getSelectedItem();
       String start = startTf.getText();
       String end = endTf.getText();
       String additionalinfo = additf.getText();
       
       SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy"); // Creates date format to check dates
       Date today = new Date(); // Todays date
       Date startDate = new Date();
       Date endDate = new Date();
       ft.format(today);
        try {

            startDate = ft.parse(start); // If the date is not an actual date
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Start date is not valid", "Error", WIDTH);
                correct = false;        
        }
        try {

            endDate = ft.parse(end); 
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "End date is not valid", "Error", WIDTH);
                correct = false;
        }
        if(startDate.before(today)){ //If start is before today
           
           JOptionPane.showMessageDialog(null, "Start date is not valid", "Error", WIDTH); 
           correct = false;
        }
        if(endDate.before(today) || endDate.before(startDate)){ // If end is before today or start date
           
           JOptionPane.showMessageDialog(null, "End date is not valid", "Error", WIDTH); 
           correct = false;
        }
       
        if(correct){
            start = ft.format(startDate); // If date is ok, it is written to txt file
            end = ft.format(endDate);

            goal = name+"#"+catagory+"#"+type+"#"+start+"#"+end+"#"+additionalinfo;
            goal = FileWriting.encryption(goal);

            try {
                FileWriting.addGoal(goal);
            } catch (IOException ex) {
                Logger.getLogger(GoalCreate.class.getName()).log(Level.SEVERE, null, ex);
            }

            setVisible(false);
            Menu.menu();
       } 
    }//GEN-LAST:event_createBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setVisible(false);
        String [] args = {};
        Login.main(args);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void startTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startTfActionPerformed

    public static void create() {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoalCreate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdditionLbl;
    private javax.swing.JTextArea additf;
    private javax.swing.JLabel buildTitle;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel catagoryLbl;
    private javax.swing.JTextField catagoryTf;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel endLbl;
    private javax.swing.JTextField endTf;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JLabel startLbl;
    private javax.swing.JTextField startTf;
    private javax.swing.JComboBox typeBox;
    private javax.swing.JLabel typeLbl;
    // End of variables declaration//GEN-END:variables
}
