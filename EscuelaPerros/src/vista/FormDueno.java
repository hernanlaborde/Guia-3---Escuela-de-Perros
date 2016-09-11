
package vista;

import dba.Mysql;
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


public class FormDueno extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    Connection conn;
    Statement sent;
    //int localidadSelec;
    
 
    public FormDueno() {
        initComponents();
        conn = Mysql.getConnection();
        llenar();
        //llenarCombLocalidad(-1);
        iniciarcomboLocalidades();
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumIdentificacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        buttonIngresar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonBorrar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        comBoxLocalidad = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDuenos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dueño"));

        jLabel1.setText("N° Documento:");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Teléfono:");

        jLabel6.setText("Localidad:");

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
        buttonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");

        comBoxLocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(buttonIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(txtApellido)
                    .addComponent(txtDireccion)
                    .addComponent(txtTelefono)
                    .addComponent(txtNumIdentificacion)
                    .addComponent(comBoxLocalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comBoxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIngresar)
                    .addComponent(buttonModificar)
                    .addComponent(buttonBorrar)
                    .addComponent(jButton4))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado Dueños"));

        tablaDuenos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaDuenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDuenosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDuenos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
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
            int idLoc;
            conn = Mysql.getConnection();
            String sql0 = "SELECT * FROM localidades WHERE Localidad='"+comBoxLocalidad.getSelectedItem()+"';";
            sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql0);
            rs.next();
            idLoc= rs.getInt("idLocalidad");
            
            
            String sql = "INSERT INTO duenos (NumeroIdentificacion, Nombre, Apellido, Direccion, Telefono, Localidad) VALUES(?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, txtNumIdentificacion.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtApellido.getText());
            ps.setString(4, txtDireccion.getText());
            ps.setString(5, txtTelefono.getText());
            ps.setInt(6, idLoc);

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

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        try {
            String sql = "UPDATE duenos SET NumeroIdentificacion=?, Nombre=?, Apellido=?, Direccion=?, Telefono=?, Localidad=? WHERE idDueno=?";
            int fila = tablaDuenos.getSelectedRow();
            String dao = (String)tablaDuenos.getValueAt(fila, 0);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtNumIdentificacion.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtApellido.getText());
            ps.setString(4, txtDireccion.getText());
            ps.setString(5, txtTelefono.getText());
            ps.setInt(6,  idLocalidad(String.valueOf(comBoxLocalidad.getSelectedItem())));
            ps.setString(7, dao);
            
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

    private void tablaDuenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDuenosMouseClicked
        if(evt.getButton()==1){
            int fila = tablaDuenos.getSelectedRow();
            try {
                String sql = "SELECT * FROM duenos WHERE idDueno="+tablaDuenos.getValueAt(fila,0);
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next();
                txtNumIdentificacion.setText(rs.getString("NumeroIdentificacion"));
                txtNombre.setText(rs.getString("Nombre"));
                txtApellido.setText(rs.getString("Apellido"));
                txtDireccion.setText(rs.getString("Direccion"));
                txtTelefono.setText(rs.getString("Telefono"));
                iniciarcomboLocalidades(rs.getInt("Localidad"));
                //llenarCombLocalidadID(rs.getInt("Localidad"));
                //txtLocalidad.setText(rs.getString("Localidad"));
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_tablaDuenosMouseClicked

    private void buttonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarActionPerformed
        try {
            int fila = tablaDuenos.getSelectedRow();
            String sql = "DELETE FROM duenos WHERE idDueno="+tablaDuenos.getValueAt(fila, 0);
            sent = conn.createStatement();
            int n = sent.executeUpdate(sql);
            if( n > 0 ){
                llenar();
                borrarCampos();
                JOptionPane.showMessageDialog(null, "Datos Dueño Eliminados.");
            }
                
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }//GEN-LAST:event_buttonBorrarActionPerformed


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
            java.util.logging.Logger.getLogger(FormDueno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDueno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDueno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDueno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDueno().setVisible(true);
            }
        });
    }

    private void llenar(){
        try {
            conn = Mysql.getConnection();
            String titulos[] = {"ID", "N° Identidad", "Nombre", "Apellido", "Dirección", "Teléfono", "Localidad"};
            String sql = "SELECT * from duenos";
            modelo = new DefaultTableModel(null, titulos);
            sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            String[] fila = new String[7];
            
            while (rs.next()) {
                fila[0] = rs.getString("idDueno");
                fila[1] = rs.getString("NumeroIdentificacion");
                fila[2] = rs.getString("Nombre");
                fila[3] = rs.getString("Apellido");
                fila[4] = rs.getString("Direccion");
                fila[5] = rs.getString("Telefono");
                fila[6] = rs.getString("Localidad");

                modelo.addRow(fila);
            }
            tablaDuenos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void borrarCampos(){
        txtNumIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        iniciarcomboLocalidades();

    }
    
    private void llenarCombLocalidad(int loc){
        
        this.comBoxLocalidad.removeAllItems();
        try {
            conn = Mysql.getConnection();
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("SELECT * FROM localidades");
            while(rs.next()){
                this.comBoxLocalidad.addItem(rs.getString("Localidad"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        this.comBoxLocalidad.setSelectedIndex(loc);
    }
        private void llenarCombLocalidadID(int loc){
        
        this.comBoxLocalidad.removeAllItems();
        try {
            conn = Mysql.getConnection();
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("SELECT * FROM localidades WHERE idLocalidad='"+String.valueOf(loc)+"';");
            while(rs.next()){
                this.comBoxLocalidad.addItem(rs.getString("Localidad"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        this.comBoxLocalidad.setSelectedIndex(loc);
    }
    
    public static Vector<Localidad>consultaLocalidad(String consulta){
        Vector<Localidad> localidad = new Vector<Localidad>();
        Localidad loc = null;
        
        try {
            Connection conn = Mysql.getConnection();
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(consulta);
            while(rs.next()){
                loc = new Localidad();
                loc.setIdLocalidad(rs.getInt(1));
                loc.setLocalidad(rs.getString(2));
                localidad.add(loc);
            }
            sent.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return localidad;
    }
  
    private void iniciarcomboLocalidades(){
        
        String sql0 = "SELECT * FROM localidades;";
        DefaultComboBoxModel locModel = new DefaultComboBoxModel(consultaLocalidad(sql0));
        comBoxLocalidad.setModel(locModel);
    }
    private void iniciarcomboLocalidades(int idLoc){
        
        String sql0 = "SELECT * FROM localidades WHERE idLocalidad="+String.valueOf(idLoc)+";";
        DefaultComboBoxModel locModel = new DefaultComboBoxModel(consultaLocalidad(sql0));
        comBoxLocalidad.setModel(locModel);
    }
    
    private int idLocalidad(String localidad){
        String sql0 = "SELECT * FROM localidades WHERE Localidad='"+localidad+"';";
        
        Vector<Localidad> localidad2 = new Vector<Localidad>();
        Localidad loc = null;
        
        try {
            Connection conn = Mysql.getConnection();
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql0);
            while(rs.next()){
                loc = new Localidad();
                loc.setIdLocalidad(rs.getInt(1));
                loc.setLocalidad(rs.getString(2));
                localidad2.add(loc);
            }
            sent.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        int idLocalidad = loc.getIdLocalidad();
        return idLocalidad;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBorrar;
    private javax.swing.JButton buttonIngresar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JComboBox<String> comBoxLocalidad;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDuenos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumIdentificacion;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
