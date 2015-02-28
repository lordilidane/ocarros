/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectofinal;
//import static agualinda.escritorio.PEscritorio;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.edisoncor.gui.panel.Panel;



/**
 *
 * @author Felipe Buitrago
 */
public class PanelDeBusquedas extends javax.swing.JPanel {
  
    
static  ControlSQL controlSql = new ControlSQL(); 
  String nombreTabla="";
  DefaultTableModel modelo = new DefaultTableModel();
    public PanelDeBusquedas() {
        initComponents();     
        tabla.setAutoCreateRowSorter(true);
         
       
    }
   
   //este es el llamar panel antiguo
//     public void llamarPanel(Panel panel,String nombreTabla){
//      
//     this.nombreTabla = nombreTabla;
//     panel.setLayout(new FlowLayout()); 
//     modelo = controlSql.CargarTabla(tabla, nombreTabla,parametroBox,boxBusqueda,parametro1);      
//      panel.add(this,BorderLayout.CENTER);      
//      this.show();     
//      tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//      tabla.doLayout();
//  
//     
//    }
     
     public void llamarPanel(Panel panel,String nombreTabla){
      
       
     this.nombreTabla = nombreTabla;
     this.setSize(panel.getSize());
     this.getAutoscrolls();
     modelo = controlSql.CargarTabla(tabla, nombreTabla,parametroBox,boxBusqueda,parametro1);      
     panel.add(this,BorderLayout.CENTER);
     this.show();     
     tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     tabla.doLayout();
  
     
    }
     /**
      * este metodo me retorna el id consegutivo de determinada tabla 
      * pero !!tambien se encuentra en la clase ControSQL
      * @param nomnbreTabla tabla que se desea saber el siguiente consecutivo id
      * @return valor consecutivo en String
      */
    public String SiguienteID(String nomnbreTabla){
        String SQL = "select ifnull(max(id_"+nomnbreTabla+"),0) as cantidad from "+nomnbreTabla;
        Object objeto = controlSql.ejecutarConsulta(SQL);
        int cantidadRegistros = Integer.parseInt(objeto+"");
        cantidadRegistros++;
   
    return cantidadRegistros+"";
    }
   
    public void PanelDeBusquedas(String nombreTabla){
       controlSql.CargarTabla(tabla, nombreTabla,parametroBox,boxBusqueda,parametro1);
   
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        parametro1 = new javax.swing.JLabel();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        parametroBox = new javax.swing.JComboBox();
        boxBusqueda = new javax.swing.JComboBox();
        ImaneCelda = new javax.swing.JLabel();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();
        buttonAction3 = new org.edisoncor.gui.button.ButtonAction();

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(204, 204, 204));

        tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                tablaComponentRemoved(evt);
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        parametro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        parametro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parametro1.setText("Parametro 1");

        buttonAction1.setText("Buscar");
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });

        parametroBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        parametroBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        parametroBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parametroBoxActionPerformed(evt);
            }
        });

        boxBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonAction2.setText("Restablecer");
        buttonAction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction2ActionPerformed(evt);
            }
        });

        buttonAction3.setText("Eliminar");
        buttonAction3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(parametroBox, 0, 193, Short.MAX_VALUE)
                            .addComponent(boxBusqueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonAction3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(parametro1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addGap(58, 58, 58))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(ImaneCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parametroBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parametro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImaneCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
      controlSql.buscar(tabla, nombreTabla, parametroBox, boxBusqueda);
    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void parametroBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parametroBoxActionPerformed
     controlSql.cargarBoxDeBusqueda(nombreTabla,parametroBox,boxBusqueda);
    }//GEN-LAST:event_parametroBoxActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
              int fila = tabla.rowAtPoint(evt.getPoint());
         int columna = tabla.columnAtPoint(evt.getPoint());
        controlSql.mostrarImagen(nombreTabla, tabla.getValueAt(fila,0)+"", ImaneCelda);  
        DefaultTableModel tm = (DefaultTableModel) tabla.getModel(); 
        String dato=String.valueOf(tm.getValueAt(tabla.getSelectedRow(),0));
       
    }//GEN-LAST:event_tablaMouseClicked

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed
            tabla.setModel(modelo);
    }//GEN-LAST:event_buttonAction2ActionPerformed

    private void tablaComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tablaComponentRemoved
     String id = ((tabla.getValueAt(tabla.getSelectedRow(),0)+""));
     String columna= (tabla.getColumnName(tabla.getSelectedColumn()));
     String valor = (tabla.getValueAt(tabla.getSelectedRow(),tabla.getSelectedColumn())+""); 
     controlSql.actualizar(nombreTabla, columna, valor, id);
    }//GEN-LAST:event_tablaComponentRemoved

    private void tablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyReleased
        DefaultTableModel tm = (DefaultTableModel) tabla.getModel(); 
        String dato=String.valueOf(tm.getValueAt(tabla.getSelectedRow(),0));
        controlSql.mostrarImagen(nombreTabla, dato+"", ImaneCelda);  
       
       
    }//GEN-LAST:event_tablaKeyReleased

    private void buttonAction3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction3ActionPerformed
        DefaultTableModel tm = (DefaultTableModel) tabla.getModel(); 
        String id=String.valueOf(tm.getValueAt(tabla.getSelectedRow(),0));
        String nombre=String.valueOf(tm.getValueAt(tabla.getSelectedRow(),1));
        controlSql.eliminar(nombreTabla, nombre, id, panel1);
        controlSql.CargarTabla(tabla, nombreTabla, parametroBox, boxBusqueda, parametro1);
     
    }//GEN-LAST:event_buttonAction3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImaneCelda;
    private javax.swing.JComboBox boxBusqueda;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.button.ButtonAction buttonAction3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JLabel parametro1;
    private javax.swing.JComboBox parametroBox;
    public static javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
