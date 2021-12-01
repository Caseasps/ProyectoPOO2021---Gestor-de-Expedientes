/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dao.DaoMedicoGestor;
import javax.swing.JOptionPane;
/**
 *
 * @author
 */
public class FrmMostrarExpediente extends javax.swing.JFrame {
    private DaoMedicoGestor dmg = new DaoMedicoGestor();
    /**
     * Creates new form FrmMostrarExpediente
     */
    public FrmMostrarExpediente() {
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

        jPanel1 = new javax.swing.JPanel();
        LblNombre1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblApellido1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LblEdad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblEscolaridad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LblFechaNac = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LblNombreMadre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LblNombrePadre = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LblSexo = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        LblId = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LblGrupoEtnico = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LblOficio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LblDireccion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        LblAlimentacion = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LblHorasActFisica = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LblHorasLaborales = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TpConsumo = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        TpCirugias = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        TpHospitalizaciones = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        TpEnfCronicas = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        TpEnfContag = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        TpEnfHereditaria = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        TpEnfInfectoCont = new javax.swing.JTextPane();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        CbInmunizacion = new javax.swing.JCheckBox();
        BtnEliminarExpediente = new javax.swing.JButton();
        BtnEditarExpediente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Expediente");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Generales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        LblNombre1.setText("Nombre");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        LblApellido1.setText("Apellido");

        jLabel4.setText("Edad:");

        LblEdad.setText("XX");

        jLabel5.setText("Escolaridad:");

        LblEscolaridad.setText("Escolaridad");

        jLabel6.setText("Fecha de Nacimiento:");

        LblFechaNac.setText("XX/XX/XXXX");

        jLabel8.setText("Nombre de Madre:");

        LblNombreMadre.setText("NombreMadre");

        jLabel9.setText("Nombre de Padre:");

        LblNombrePadre.setText("NombrePadre");

        jLabel11.setText("Sexo:");

        LblSexo.setText("X");

        jLabel23.setText("ID:");

        LblId.setText("XXXXXXXXX");

        jLabel7.setText("Grupo Etnico:");

        LblGrupoEtnico.setText("Grupo");

        jLabel10.setText("Oficio:");

        LblOficio.setText("Oficio");

        jLabel3.setText("Direccion:");

        LblDireccion.setText("Direccion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblId))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LblApellido1)
                                        .addComponent(LblNombre1))
                                    .addComponent(LblEdad)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblGrupoEtnico)
                                    .addComponent(LblSexo)
                                    .addComponent(LblFechaNac))))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblNombreMadre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblEscolaridad)
                                    .addComponent(LblNombrePadre)
                                    .addComponent(LblOficio)
                                    .addComponent(LblDireccion))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(LblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LblNombre1)
                    .addComponent(jLabel8)
                    .addComponent(LblNombreMadre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LblApellido1)
                    .addComponent(jLabel9)
                    .addComponent(LblNombrePadre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LblEdad)
                    .addComponent(jLabel5)
                    .addComponent(LblEscolaridad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblSexo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)
                        .addComponent(LblOficio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LblFechaNac)
                    .addComponent(jLabel3)
                    .addComponent(LblDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LblGrupoEtnico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Antecedentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel12.setText("Alimentación:");

        LblAlimentacion.setText("alim");

        jLabel13.setText("Consumo:");

        jLabel14.setText("Horas de actividad física:");

        LblHorasActFisica.setText("Horas");

        jLabel15.setText("Horas Laborales: ");

        LblHorasLaborales.setText("Horas ");

        jLabel16.setText("Inmunización: ");

        jLabel17.setText("Cirugías:");

        jLabel21.setText("Enfermedades Cronicas:");

        jLabel19.setText("Hospitalizaciones:");

        jLabel20.setText("Enfermedades contagiosas:");

        jLabel22.setText("Enfermedad Hereditaria:");

        jLabel18.setText("Enfermedades infecto contagiosas: ");

        TpConsumo.setEditable(false);
        jScrollPane6.setViewportView(TpConsumo);

        TpCirugias.setEditable(false);
        jScrollPane7.setViewportView(TpCirugias);

        TpHospitalizaciones.setEditable(false);
        jScrollPane8.setViewportView(TpHospitalizaciones);

        TpEnfCronicas.setEditable(false);
        jScrollPane9.setViewportView(TpEnfCronicas);

        TpEnfContag.setEditable(false);
        jScrollPane10.setViewportView(TpEnfContag);

        TpEnfHereditaria.setEditable(false);
        jScrollPane11.setViewportView(TpEnfHereditaria);

        TpEnfInfectoCont.setEditable(false);
        jScrollPane12.setViewportView(TpEnfInfectoCont);

        jLabel24.setText("Hora(s)");

        jLabel25.setText("Hora(s)");

        CbInmunizacion.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblHorasActFisica))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel12))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblHorasLaborales)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(LblAlimentacion))
                                    .addComponent(CbInmunizacion))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane11)
                        .addComponent(jScrollPane9)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addComponent(jScrollPane7)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addComponent(jScrollPane12))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(LblHorasActFisica)
                    .addComponent(jLabel13)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(LblHorasLaborales)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(CbInmunizacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblAlimentacion)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jScrollPane12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnEliminarExpediente.setText("Eliminar");
        BtnEliminarExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarExpedienteActionPerformed(evt);
            }
        });

        BtnEditarExpediente.setText("Editar");
        BtnEditarExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarExpedienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnEditarExpediente)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEliminarExpediente)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditarExpediente)
                    .addComponent(BtnEliminarExpediente))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public Boolean MostrarExpediente (String ID){
        String[] datos = new String[23];
        datos = dmg.buscarPaciente(ID);
        LblId.setText(datos[0]);
        LblNombre1.setText(datos[1]);
        LblApellido1.setText(datos[2]);
        LblDireccion.setText(datos[3]);
        LblEdad.setText(datos[4]);
        LblEscolaridad.setText(datos[5]);
        LblFechaNac.setText(datos[6]);
        LblGrupoEtnico.setText(datos[7]);
        LblNombreMadre.setText(datos[8]);
        LblNombrePadre.setText(datos[9]);
        LblOficio.setText(datos[10]);
        LblSexo.setText(datos[11]);
        LblAlimentacion.setText(datos[12]);
        TpConsumo.setText(datos[13]);
        LblHorasActFisica.setText(datos[14]);
        LblHorasLaborales.setText(datos[15]);
        if (datos[16].equalsIgnoreCase("true"))
            CbInmunizacion.setSelected(true);
        TpCirugias.setText(datos[17]);
        TpEnfCronicas.setText(datos[18]);
        TpEnfInfectoCont.setText(datos[19]);
        TpHospitalizaciones.setText(datos[20]);
        TpEnfContag.setText(datos[21]);
        TpEnfHereditaria.setText(datos[22]);
        
        if (datos[0] == null)
            return false;
        
        return true;
    }
    
    private void BtnEditarExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEditarExpedienteActionPerformed

    private void BtnEliminarExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarExpedienteActionPerformed
        int eliminacion = 0;
        
        eliminacion = dmg.eliminarPaciente(this.LblId.getText());
        
         if (eliminacion == 1){
            this.dispose();
            JOptionPane.showMessageDialog(this, "Expediente Eliminado",
                    "Expediente", JOptionPane.INFORMATION_MESSAGE);
            String msg = dmg.actualizarBD();
            JOptionPane.showMessageDialog(this, msg, "Eliminar Expediente", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar Expediente",
                    "Expediente", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_BtnEliminarExpedienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMostrarExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMostrarExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMostrarExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMostrarExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMostrarExpediente().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditarExpediente;
    private javax.swing.JButton BtnEliminarExpediente;
    private javax.swing.JCheckBox CbInmunizacion;
    private javax.swing.JLabel LblAlimentacion;
    private javax.swing.JLabel LblApellido1;
    private javax.swing.JLabel LblDireccion;
    private javax.swing.JLabel LblEdad;
    private javax.swing.JLabel LblEscolaridad;
    private javax.swing.JLabel LblFechaNac;
    private javax.swing.JLabel LblGrupoEtnico;
    private javax.swing.JLabel LblHorasActFisica;
    private javax.swing.JLabel LblHorasLaborales;
    private javax.swing.JLabel LblId;
    private javax.swing.JLabel LblNombre1;
    private javax.swing.JLabel LblNombreMadre;
    private javax.swing.JLabel LblNombrePadre;
    private javax.swing.JLabel LblOficio;
    private javax.swing.JLabel LblSexo;
    private javax.swing.JTextPane TpCirugias;
    private javax.swing.JTextPane TpConsumo;
    private javax.swing.JTextPane TpEnfContag;
    private javax.swing.JTextPane TpEnfCronicas;
    private javax.swing.JTextPane TpEnfHereditaria;
    private javax.swing.JTextPane TpEnfInfectoCont;
    private javax.swing.JTextPane TpHospitalizaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
