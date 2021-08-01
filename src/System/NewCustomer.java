package System;

import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class NewCustomer extends javax.swing.JInternalFrame {
    
    public NewCustomer() throws SQLException {
        initComponents();
        Server connection = new Server();
        connection.getData(dataTable);
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
        jScrollPane3 = new javax.swing.JScrollPane();
        techAddress = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        techCellphone = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        techName = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        saveNewTechForm1 = new javax.swing.JButton();
        saveNewTechForm2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        techLastName = new javax.swing.JTextPane();

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

        cleanNewTechForm.setBackground(new java.awt.Color(204, 204, 204));
        cleanNewTechForm.setText("Limpiar");
        cleanNewTechForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanNewTechFormActionPerformed(evt);
            }
        });

        saveNewTechForm.setBackground(new java.awt.Color(0, 51, 51));
        saveNewTechForm.setForeground(new java.awt.Color(255, 255, 255));
        saveNewTechForm.setText("Guardar");
        saveNewTechForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewTechFormActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(techID);

        jScrollPane3.setViewportView(techAddress);

        jScrollPane4.setViewportView(techCellphone);

        jScrollPane5.setViewportView(techName);

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellidos", "Dirección", "Celular"
            }
        ));
        jScrollPane6.setViewportView(dataTable);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(0).setResizable(false);
            dataTable.getColumnModel().getColumn(3).setResizable(false);
            dataTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );

        saveNewTechForm1.setBackground(new java.awt.Color(153, 0, 0));
        saveNewTechForm1.setForeground(new java.awt.Color(255, 255, 255));
        saveNewTechForm1.setText("Eliminar");
        saveNewTechForm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewTechForm1ActionPerformed(evt);
            }
        });

        saveNewTechForm2.setBackground(new java.awt.Color(0, 102, 102));
        saveNewTechForm2.setForeground(new java.awt.Color(255, 255, 255));
        saveNewTechForm2.setText("Modificar");
        saveNewTechForm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewTechForm2ActionPerformed(evt);
            }
        });

        jScrollPane7.setViewportView(techLastName);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cleanNewTechForm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                        .addComponent(saveNewTechForm))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 49, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane4)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(saveNewTechForm2)
                                                        .addComponent(jLabel5))
                                                    .addGap(0, 0, Short.MAX_VALUE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(saveNewTechForm1)))))
                        .addGap(40, 40, 40))))
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
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveNewTechForm)
                    .addComponent(cleanNewTechForm)
                    .addComponent(saveNewTechForm2)
                    .addComponent(saveNewTechForm1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cleanNewTechFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanNewTechFormActionPerformed
        cleanNewTechForm();
    }//GEN-LAST:event_cleanNewTechFormActionPerformed

    private void saveNewTechFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewTechFormActionPerformed
        validateTechForm();
    }//GEN-LAST:event_saveNewTechFormActionPerformed

    private void saveNewTechForm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewTechForm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveNewTechForm1ActionPerformed

    private void saveNewTechForm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewTechForm2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveNewTechForm2ActionPerformed

    private void cleanNewTechForm(){
        techAddress.setText("");
        techCellphone.setText("");
        techID.setText("");
        techLastName.setText("");
        techName.setText("");
    }
    
    private void validateTechForm(){
        try {
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
            
        } catch (SQLException ex) {
            Logger.getLogger(NewCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void saveTechData() throws SQLException{
        Server connection = new Server();
        String[] data = new String[5];
        data[0] = techID.getText();
        data[1] = techName.getText();
        data[2] = techLastName.getText();
        data[3] = techAddress.getText();
        data[4] = techCellphone.getText();
        connection.insertData(data);
        renderTable(connection);
    }
    
    private void renderTable(Server connection) throws SQLException{
        DefaultTableModel table;
        table= (DefaultTableModel)dataTable.getModel(); 
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        table.setRowCount(0);
        cleanNewTechForm();
        connection.getData(dataTable);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanNewTechForm;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private java.awt.Panel panel1;
    private javax.swing.JButton saveNewTechForm;
    private javax.swing.JButton saveNewTechForm1;
    private javax.swing.JButton saveNewTechForm2;
    private javax.swing.JTextPane techAddress;
    private javax.swing.JTextPane techCellphone;
    private javax.swing.JTextPane techID;
    private javax.swing.JTextPane techLastName;
    private javax.swing.JTextPane techName;
    // End of variables declaration//GEN-END:variables
}
