/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dao.DaoMedicoGestor;
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
        jLabel3 = new javax.swing.JLabel();
        LblDireccion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LblEdad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblEscolaridad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LblFechaNac = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LblGrupoEtnico = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LblNombreMadre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LblNombrePadre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LblOficio = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LblSexo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LblAlimentacion = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LblConsumo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LblHorasActFisica = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LblHorasLaborales = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LblInmunizacion = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        LblCirugias = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LblEnfInfectoCont = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LblHospitalizaciones = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        LblEnfCronicas = new javax.swing.JLabel();
        LblEnfContag = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        LblEnfHereditaria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblNombre1.setText("Nombre");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        LblApellido1.setText("Apellido");

        jLabel3.setText("Direccion:");

        LblDireccion.setText("Direccion");

        jLabel4.setText("Edad:");

        LblEdad.setText("Edad");

        jLabel5.setText("Escolaridad:");

        LblEscolaridad.setText("Escolaridad");

        jLabel6.setText("Fecha de Nacimiento:");

        LblFechaNac.setText("Fecha de Nacimiento");

        jLabel7.setText("Grupo Etnico:");

        LblGrupoEtnico.setText("Grupo Etnico");

        jLabel8.setText("Nombre de Madre:");

        LblNombreMadre.setText("Nombre de Madre");

        jLabel9.setText("Nombre de Padre:");

        LblNombrePadre.setText("Nombre de Padre");

        jLabel10.setText("Oficio:");

        LblOficio.setText("Oficio");

        jLabel11.setText("Sexo:");

        LblSexo.setText("Sexo");

        jLabel12.setText("Alimentación:");

        LblAlimentacion.setText("Alimentacion");

        jLabel13.setText("Consumo:");

        LblConsumo.setText("Consumo");

        jLabel14.setText("Horas de actividad física:");

        LblHorasActFisica.setText("Horas de actividad física");

        jLabel15.setText("Horas Laborales: ");

        LblHorasLaborales.setText("Horas Laborales ");

        jLabel16.setText("Inmunización: ");

        LblInmunizacion.setText("Inmunizacion");

        jLabel17.setText("Cirujías:");

        LblCirugias.setText("Cirujías");

        jLabel18.setText("Enfermedades infecto contagiosas: ");

        LblEnfInfectoCont.setText("Enfermedades infecto contagiosas ");

        jLabel19.setText("Hospitalizaciones:");

        LblHospitalizaciones.setText("Hospitalizaciones");

        jLabel20.setText("Enfermedades contagiosas:");

        jLabel21.setText("Enfermedades Cronicas:");

        LblEnfCronicas.setText("Enfermedades Cronicas");

        LblEnfContag.setText("Enfermedades contagiosas");

        jLabel22.setText("Enfermedad Hereditaria:");

        LblEnfHereditaria.setText("Enfermedad Hereditaria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNombre1)
                            .addComponent(LblApellido1)
                            .addComponent(LblEdad)
                            .addComponent(LblDireccion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNombreMadre)
                            .addComponent(LblEscolaridad)
                            .addComponent(LblGrupoEtnico)
                            .addComponent(LblFechaNac)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblSexo)
                            .addComponent(LblNombrePadre)
                            .addComponent(LblOficio))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblEnfHereditaria)
                    .addComponent(LblEnfContag)
                    .addComponent(LblHospitalizaciones)
                    .addComponent(LblAlimentacion)
                    .addComponent(LblConsumo)
                    .addComponent(LblHorasActFisica)
                    .addComponent(LblHorasLaborales)
                    .addComponent(LblInmunizacion)
                    .addComponent(LblCirugias)
                    .addComponent(LblEnfCronicas)
                    .addComponent(LblEnfInfectoCont))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(LblAlimentacion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(LblConsumo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(LblHorasActFisica))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(LblHorasLaborales))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(LblInmunizacion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(LblCirugias))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(LblEnfCronicas))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(LblEnfInfectoCont))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(LblHospitalizaciones))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(LblEnfContag, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(LblEnfHereditaria)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNombre1)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LblApellido1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblDireccion)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LblEdad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LblEscolaridad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(LblFechaNac))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(LblGrupoEtnico))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(LblNombreMadre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(LblNombrePadre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(LblOficio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(LblSexo))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(678, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    public void MostrarExpediente (String ID){
        String[] datos = new String[23];
        datos = dmg.buscarPaciente(ID);
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
        LblConsumo.setText(datos[13]);
        LblHorasActFisica.setText(datos[14]);
        LblHorasLaborales.setText(datos[15]);
        LblInmunizacion.setText(datos[16]);
        LblCirugias.setText(datos[17]);
        LblEnfCronicas.setText(datos[18]);
        LblEnfInfectoCont.setText(datos[19]);
        LblHospitalizaciones.setText(datos[20]);
        LblEnfContag.setText(datos[21]);
        LblEnfHereditaria.setText(datos[22]);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblAlimentacion;
    private javax.swing.JLabel LblApellido1;
    private javax.swing.JLabel LblCirugias;
    private javax.swing.JLabel LblConsumo;
    private javax.swing.JLabel LblDireccion;
    private javax.swing.JLabel LblEdad;
    private javax.swing.JLabel LblEnfContag;
    private javax.swing.JLabel LblEnfCronicas;
    private javax.swing.JLabel LblEnfHereditaria;
    private javax.swing.JLabel LblEnfInfectoCont;
    private javax.swing.JLabel LblEscolaridad;
    private javax.swing.JLabel LblFechaNac;
    private javax.swing.JLabel LblGrupoEtnico;
    private javax.swing.JLabel LblHorasActFisica;
    private javax.swing.JLabel LblHorasLaborales;
    private javax.swing.JLabel LblHospitalizaciones;
    private javax.swing.JLabel LblInmunizacion;
    private javax.swing.JLabel LblNombre1;
    private javax.swing.JLabel LblNombreMadre;
    private javax.swing.JLabel LblNombrePadre;
    private javax.swing.JLabel LblOficio;
    private javax.swing.JLabel LblSexo;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
