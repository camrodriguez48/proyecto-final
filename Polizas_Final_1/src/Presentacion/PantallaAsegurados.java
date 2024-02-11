/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PantallaAsegurados extends javax.swing.JFrame {
    private int NumAsegurados=0;
    
    /**
     * Creates new form PantallaAsegurados
     */
    public PantallaAsegurados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtNombres = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtFechaNacimiento = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBXCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CBXHospital = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CBXEstado = new javax.swing.JComboBox<>();
        Nuevo = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TXTBuscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabLista = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Datos del Asegurado");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Nombre");
        jLabel2.setAutoscrolls(true);

        jScrollPane1.setViewportView(TxtNombres);

        jScrollPane2.setViewportView(TxtFechaNacimiento);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Fecha Nacimiento");
        jLabel3.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Categoria");
        jLabel4.setAutoscrolls(true);

        CBXCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria A", "Categoria B", "Categoria C", "Categoria D" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Hospital");
        jLabel5.setAutoscrolls(true);

        CBXHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "La Misericordia", "Santa Clara", "San Rafael", "Reina Sofia" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Estado ");
        jLabel6.setAutoscrolls(true);

        CBXEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        CBXEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXEstadoActionPerformed(evt);
            }
        });

        Nuevo.setText("NUEVA POLIZA");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Cerrar.setText("CERRAR");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        BTNEliminar.setText("ELIMINAR POLIZA");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        Registrar.setText("REGISTRAR POLIZA");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBXHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBXEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTNEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(61, 61, 61)
                                .addComponent(CBXCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(71, 71, 71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CBXCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBXHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBXEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jLabel7.setText("Buscar Asegurados");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Nombre");
        jLabel8.setAutoscrolls(true);

        TXTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(426, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel9.setText("Asegurados Registrados");

        TabLista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(TabLista);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /** Método para seleccionar una asegurado para editarlo*/
    private void TabListaMouseClicked(java.awt.event.MouseEvent evt) {                                      
       //activa los botones 
       this.Registrar.setText("Actualizar");
       this.BTNEliminar.setEnabled(true);
        
        //Creación de una fila de JTable y captura la fila, con el evento clic
        int fila=TabLista.rowAtPoint(evt.getPoint());
        Logica.ClsAsegurados aseg=new Logica.ClsAsegurados();
        //Captura de los datos de la asegurado para editarlo
         this.NumAsegurados=Integer.parseInt(TabLista.getValueAt(fila, 0).toString());
         this.TxtNombres.setText(TabLista.getValueAt(fila, 1).toString());
         this.CBXCategoria.setSelectedItem(TabLista.getValueAt(fila, 3).toString());
         this.CBXHospital.setSelectedItem(TabLista.getValueAt(fila, 4).toString());
         this.CBXEstado.setSelectedItem(TabLista.getValueAt(fila, 5).toString());
         //captura la fecha y le da formato correcto Dia,mes,año
         String dia=TabLista.getValueAt(fila, 2).toString().substring(8, 10);
         String mes=TabLista.getValueAt(fila, 2).toString().substring(5, 7);
         String anio=TabLista.getValueAt(fila, 2).toString().substring(0, 4);
         String FECHA=""+dia+"/"+mes+"/"+anio;
         
         this.TxtFechaNacimiento.setText(FECHA);
       
    }                           
    
    /**  Método para buscar Personas */
    private void TXTBuscarKeyPressed(java.awt.event.KeyEvent evt) {                                     
      
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        Logica.ClsAsegurados aseg=new  Logica.ClsAsegurados();
                //Extraemos la lista de personas dentro de un modelo
        modelo=aseg.BusquedaAsegurados (this.TXTBuscar.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTabla();
        
    }
        
    
    private void CBXEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXEstadoActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        this.Registrar.setText("Registrar");
        this.Limpiarcampos();
        this.NumAsegurados=0;
        this.BTNEliminar.setEnabled(false);
    }//GEN-LAST:event_NuevoActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
    this.hide();
    }//GEN-LAST:event_CerrarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        // TODO add your handling code here:

        if (this.NumAsegurados==0){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un asegurado");
            return;
        }
        //Captura la confirmacion
        int confirmacion= JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar?", "Confirma la acción", 2);

        if (confirmacion==0){ //evaluamos la confirmación
            boolean confirmacion2=true;
            Logica.ClsAsegurados aseg=new Logica.ClsAsegurados();
            confirmacion2=aseg.EliminarAsegurados( this.NumAsegurados);
            if (confirmacion2==false){ //Evaluamos el resultado de la operacion
                JOptionPane.showMessageDialog(rootPane, "Eliminación correcta");
                Limpiarcampos();  //Limpiamos los campos
                this.BTNEliminar.setEnabled(false); //Deshabilitamos el botón
                this.ListarAsegurados(); //recargamos la lista
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se pudo Eliminar");
            }
        }
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        //Validación de campos

        if (this.TxtNombres.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre del Asegurado");
            TxtNombres.requestFocus();//rabFocus();
            return ;
        }
        if (this.TxtFechaNacimiento.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar la fecha de nacimiento del Asegurado");
            TxtFechaNacimiento.requestFocus();
            return ;
        }
            
        Logica.ClsAsegurados asegurados=new Logica.ClsAsegurados();  //objeto tipo Asegurado
        asegurados.NumAsegurados=this.NumAsegurados;
        asegurados.NomAseg=this.TxtNombres.getText();
        asegurados.FechaNac=this.TxtFechaNacimiento.getText();
        
        //Selecciona el item
        int seleccionado=CBXCategoria.getSelectedIndex();
        asegurados.Categoria=(String)this.CBXCategoria.getItemAt(seleccionado);//texto del Item seleccionado

        int seleccionado2=CBXHospital.getSelectedIndex();
        asegurados.Hospital=(String)this.CBXHospital.getItemAt(seleccionado);
        
        int seleccionado3=CBXEstado.getSelectedIndex();
        asegurados.Estado=(String)this.CBXEstado.getItemAt(seleccionado);
        
        //Evaluamos si el usuario esta Registrando una nueva Asegurado o esta actualizando
            if(this.NumAsegurados==0){
            boolean respuesta=true; //bandera
            respuesta=asegurados.RegistrarAsegurados(); //ejecuta el método que registra Asegurado
            ListarAsegurados(); //actualiza la tabla

            //lanza el aviso
            if (respuesta==false)
            {
                JOptionPane.showMessageDialog(rootPane, "Se ha registrado correctamente");
                Limpiarcampos();
                this.BTNEliminar.setEnabled(false);
            }
            else{  JOptionPane.showMessageDialog(rootPane, "Persona No registrada"); }

        }
        else //actualiza los datos de la Asegurado
        {
            boolean respuesta2=true; //bandera
            respuesta2=asegurados.ActualizarAsegurados(); //ejecuta el método que Actualiza Asegurado
            ListarAsegurados(); //actualiza la tabla

            //lanza el aviso
            if (respuesta2==false)
            {
                JOptionPane.showMessageDialog(rootPane, "Se ha Actualizado correctamente");
                Limpiarcampos();
                this.BTNEliminar.setEnabled(false);
            }
            else{  JOptionPane.showMessageDialog(rootPane, "No se actualizó"); }

        }

    }//GEN-LAST:event_RegistrarActionPerformed

    private void TXTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PantallaAsegurados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAsegurados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAsegurados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAsegurados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAsegurados().setVisible(true);
            }
        });
    }
    
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JComboBox<String> CBXCategoria;
    private javax.swing.JComboBox<String> CBXEstado;
    private javax.swing.JComboBox<String> CBXHospital;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField TXTBuscar;
    private javax.swing.JTable TabLista;
    private javax.swing.JTextPane TxtFechaNacimiento;
    private javax.swing.JTextPane TxtNombres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
   
 /**Métodos Auxiliares*/
    private void ListarAsegurados(){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto Asegurado
        Logica.ClsAsegurados asegurados=new Logica.ClsAsegurados();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=asegurados.ListarAsegurados();

        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
        //Oculta la primera columna
        OcultarColumnaTabla();
    }

    public void Limpiarcampos(){
       this.CBXCategoria.setSelectedIndex(0);
       this.CBXHospital.setSelectedIndex(0);
       this.CBXEstado.setSelectedIndex(0);
       this.TxtNombres.setText("");
       this.TxtFechaNacimiento.setText("");
    }
    
    private  void OcultarColumnaTabla(){
            //Oculta la primera columna de la tabla
       this.TabLista.getColumnModel().getColumn(0).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(0).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(0).setPreferredWidth(0);
       
       
       
       this.TabLista.getColumnModel().getColumn(7).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(7).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(7).setPreferredWidth(0);
       
       
       
       
       this.TabLista.getColumnModel().getColumn(8).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(8).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(8).setPreferredWidth(0);
    }

}