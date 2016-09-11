
package vista;

import dba.Mysql;
import escuelaperros.Dia;
import escuelaperros.Dueno;
import escuelaperros.Localidad;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vista.FormDueno.consultaLocalidad;


public class FormPerro extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    Connection conn;
    Statement sent;

    public FormPerro() {
        initComponents();
        conn = Mysql.getConnection();
        llenar();
        iniciarComboDuenos();
        iniciarComboDias();
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        buttonIngresar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonBorrar = new javax.swing.JButton();
        comBoxDueno = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comBoxDia = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPerros = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Perro"));

        jLabel1.setText("Cédula: ");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Raza:");

        jLabel4.setText("Dueño: ");

        buttonIngresar.setText("Ingresar");
        buttonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIngresarActionPerformed(evt);
            }
        });

        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonBorrar.setText("Borrar");

        comBoxDueno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Dia:");

        comBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCedula)
                    .addComponent(txtNombre)
                    .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(comBoxDueno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comBoxDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonBorrar)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comBoxDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(comBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIngresar)
                    .addComponent(buttonModificar)
                    .addComponent(buttonBorrar))
                .addGap(40, 40, 40))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado Perros"));

        tablaPerros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPerros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPerrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPerros);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIngresarActionPerformed
            try {
            int idDueno;
            conn = Mysql.getConnection();
            String sql0 = "SELECT * FROM duenos WHERE Apellido='"+comBoxDueno.getSelectedItem()+"';";
            sent = conn.createStatement();
            ResultSet rs0 = sent.executeQuery(sql0);
            rs0.next();
            idDueno= rs0.getInt("idDueno");
            
            int idDia;
            conn = Mysql.getConnection();
            String sql1 = "SELECT * FROM dias WHERE Dia='"+comBoxDia.getSelectedItem()+"';";
            sent = conn.createStatement();
            ResultSet rs1 = sent.executeQuery(sql1);
            rs1.next();
            idDia= rs1.getInt("idDias");
            
            
            String sql = "INSERT INTO perros (Cedula, Nombre, Raza, Dueño, Dia) VALUES(?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, txtCedula.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtRaza.getText());
            ps.setInt(4, idDueno);
            ps.setInt(5, idDia);
            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Dueño ingresado al sistema");
            }
        } catch (SQLException | NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        borrarCampos();
        llenar();
    }//GEN-LAST:event_buttonIngresarActionPerformed

    private void tablaPerrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPerrosMouseClicked
        if(evt.getButton()==1){
            int fila = tablaPerros.getSelectedRow();
            try {
                String sql = "SELECT * FROM perros WHERE idMascota="+tablaPerros.getValueAt(fila,0);
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next();
                txtCedula.setText(rs.getString("Cedula"));
                txtNombre.setText(rs.getString("Nombre"));
                txtRaza.setText(rs.getString("Raza"));
                iniciarcomboDuenos(rs.getInt("Dueño"));
                iniciarcomboDias(rs.getInt("Dia"));
                
                //llenarCombLocalidadID(rs.getInt("Localidad"));
                //txtLocalidad.setText(rs.getString("Localidad"));
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_tablaPerrosMouseClicked

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        try {
            String sql = "UPDATE perros SET Cedula=?, Nombre=?, Raza=?, Dueño=?, Dia=? WHERE idMascota=?";
            int fila = tablaPerros.getSelectedRow();
            String dao = (String)tablaPerros.getValueAt(fila, 0);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtCedula.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtRaza.getText());
            ps.setInt(4,  idDueno(String.valueOf(comBoxDueno.getSelectedItem())));
            ps.setInt(5,  idDia(String.valueOf(comBoxDia.getSelectedItem())));
            ps.setString(6, dao);
            
            int n = ps.executeUpdate();
            if( n > 0 ){
                borrarCampos();
                llenar();
                JOptionPane.showMessageDialog(null, "Se actualizaron datos del Dueño");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
    }//GEN-LAST:event_buttonModificarActionPerformed


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
            java.util.logging.Logger.getLogger(FormPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPerro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBorrar;
    private javax.swing.JButton buttonIngresar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JComboBox<String> comBoxDia;
    private javax.swing.JComboBox<String> comBoxDueno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaPerros;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    private void llenar() {
        try {
            conn = Mysql.getConnection();
            String titulos[] = {"ID", "N° Cédula", "Nombre", "Raza", "Dueño", "Día"};
            String sql = "SELECT * from Perros";
            modelo = new DefaultTableModel(null, titulos);
            sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            String[] fila = new String[6];
            
            while (rs.next()) {
                fila[0] = rs.getString("idMascota");
                fila[1] = rs.getString("Cedula");
                fila[2] = rs.getString("Nombre");
                fila[3] = rs.getString("Raza");
                fila[4] = rs.getString("Dueño");
                fila[5] = rs.getString("Dia");

                modelo.addRow(fila);
            }
            tablaPerros.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static Vector<Dueno>consultaDueno(String consulta){
        Vector<Dueno> dueno = new Vector<Dueno>();
        Dueno amo = null;
        
        try {
            Connection conn = Mysql.getConnection();
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(consulta);
            while(rs.next()){
                amo = new Dueno();
                amo.setApellido(rs.getString(4));
                dueno.add(amo);
            }
            sent.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dueno;
    }
        public static Vector<Dia>consultaDia(String consulta){
        Vector<Dia> diasSemana = new Vector<Dia>();
        Dia dias = null;
        
        try {
            Connection conn = Mysql.getConnection();
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(consulta);
            while(rs.next()){
                dias = new Dia();
                dias.setDia(rs.getString(2));
                diasSemana.add(dias);
            }
            sent.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return diasSemana;
    }

    private void iniciarComboDuenos() {
        String sql0 = "SELECT * FROM duenos;";
        DefaultComboBoxModel locModel = new DefaultComboBoxModel(consultaDueno(sql0));
        comBoxDueno.setModel(locModel);
    }
    
        private void iniciarcomboDuenos(int idDueno){
        
        String sql0 = "SELECT * FROM duenos WHERE idDueno="+String.valueOf(idDueno)+";";
        DefaultComboBoxModel locModel = new DefaultComboBoxModel(consultaDueno(sql0));
        comBoxDueno.setModel(locModel);
    }
        
        private void iniciarComboDias() {
        String sql0 = "SELECT * FROM dias;";
        DefaultComboBoxModel locModel = new DefaultComboBoxModel(consultaDia(sql0));
        comBoxDia.setModel(locModel);
    }
        
        private void iniciarcomboDias(int idDia){
        
        String sql0 = "SELECT * FROM dias WHERE idDias="+String.valueOf(idDia)+";";
        DefaultComboBoxModel locModel = new DefaultComboBoxModel(consultaDia(sql0));
        comBoxDia.setModel(locModel);
    }
        
        private void borrarCampos(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtRaza.setText("");
        iniciarComboDuenos();
        iniciarComboDias();
    }

    private int idDueno(String dueno) {
        String sql0 = "SELECT * FROM localidades WHERE Localidad='"+dueno+"';";
        
        Vector<Dueno> dueno2 = new Vector<Dueno>();
        Dueno amo1 = null;
        
        try {
            Connection conn = Mysql.getConnection();
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql0);
            while(rs.next()){
                amo1 = new Dueno();
                amo1.setIdDueno(rs.getInt(1));
                //amo1.setLocalidad(rs.getString(2));
                dueno2.add(amo1);
            }
            sent.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        int idDueno = amo1.getIdDueno();
        return idDueno;
    }

    private int idDia(String dia) {
        String sql0 = "SELECT * FROM dias WHERE Dia='"+dia+"';";
        
        Vector<Dia> dias = new Vector<Dia>();
        Dia dia1 = null;
        
        try {
            Connection conn = Mysql.getConnection();
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql0);
            while(rs.next()){
                dia1 = new Dia();
                dia1.setIdDias(rs.getInt(1));
                //amo1.setLocalidad(rs.getString(2));
                dias.add(dia1);
            }
            sent.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        int idDueno = dia1.getIdDias();
        return idDueno;
    }
}
