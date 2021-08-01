package System;

import javax.swing.JOptionPane;


public class NewCustomer extends javax.swing.JInternalFrame {
    
    public NewCustomer() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cleanNewTechForm = new javax.swing.JButton();
        saveNewTechForm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        techID = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        techLastName = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        techAddress = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        techCellphone = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        techName = new javax.swing.JTextPane();

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Nuevo cliente");
        setOpaque(true);

        jLabel1.setText("Cédula");

        jLabel2.setText("Apellido");

        jLabel3.setText("Nombre");

        jLabel4.setText("Dirección");

        jLabel5.setText("Teléfono");

        cleanNewTechForm.setText("Cancelar");
        cleanNewTechForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanNewTechFormActionPerformed(evt);
            }
        });

        saveNewTechForm.setText("Guardar");
        saveNewTechForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewTechFormActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(techID);

        jScrollPane2.setViewportView(techLastName);

        jScrollPane3.setViewportView(techAddress);

        jScrollPane4.setViewportView(techCellphone);

        jScrollPane5.setViewportView(techName);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cleanNewTechForm)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saveNewTechForm)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(129, 129, 129)
                                    .addComponent(jLabel2)
                                    .addGap(3, 3, 3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanNewTechForm)
                    .addComponent(saveNewTechForm))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cleanNewTechFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanNewTechFormActionPerformed
        cleanNewTechForm();
        setVisible(false);
    }//GEN-LAST:event_cleanNewTechFormActionPerformed

    private void saveNewTechFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewTechFormActionPerformed
        validateTechForm();
    }//GEN-LAST:event_saveNewTechFormActionPerformed

    private void cleanNewTechForm(){
        techAddress.setText("");
        techCellphone.setText("");
        techID.setText("");
        techLastName.setText("");
        techName.setText("");
    }
    
    private void validateTechForm(){
        String[] data = new String[5];
        data[0] = techID.getText();
        data[1] = techName.getText();
        data[2] = techLastName.getText();
        data[3] = techAddress.getText();
        data[4] = techCellphone.getText(); 
        
        for(int i = 0; i < 5; i++){
            if(data[i].equals("")){
                JOptionPane.showMessageDialog(null, "Aún faltan datos por ingresar");
                
                return;
            }
        }
        
        saveTechData();
       
                
    }
    
    private void saveTechData(){
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanNewTechForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private java.awt.Panel panel1;
    private javax.swing.JButton saveNewTechForm;
    private javax.swing.JTextPane techAddress;
    private javax.swing.JTextPane techCellphone;
    private javax.swing.JTextPane techID;
    private javax.swing.JTextPane techLastName;
    private javax.swing.JTextPane techName;
    // End of variables declaration//GEN-END:variables
}
