//Area de trabajo
package Ejercicio_1;

/**
 *
 * @author ALostGamer
 * @version 1.0
 * @description Programa que recoge una serie de datos y los devuelve en los campos correspondientes a donde deberían ir ubicados. DATOS:{NOMBRE | SEXO | DEPORTE | EDAD | SALARIO}.
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creacion de JFrame "Formulario"
     */
    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        lblNombre = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblDeporte = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        rbtnHombre = new javax.swing.JRadioButton();
        rbtnMujer = new javax.swing.JRadioButton();
        cmboDeportes = new javax.swing.JComboBox<>();
        spEdad = new javax.swing.JSpinner();
        slSalario = new javax.swing.JSlider();
        lblNombre1 = new javax.swing.JLabel();
        lblSexo1 = new javax.swing.JLabel();
        lblDeporte1 = new javax.swing.JLabel();
        lblEdad1 = new javax.swing.JLabel();
        lblSalario1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblResultadoNombre = new javax.swing.JLabel();
        lblResultadoSexo = new javax.swing.JLabel();
        lblResultadoDeporte = new javax.swing.JLabel();
        lblResultadoEdad = new javax.swing.JLabel();
        lblResultadoSalario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(630, 420));
        setResizable(false);

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("NOMBRE:");

        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSexo.setText("SEXO:");

        lblDeporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDeporte.setText("DEPORTE:");

        lblEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEdad.setText("EDAD:");

        lblSalario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalario.setText("SALARIO:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        grupoSexo.add(rbtnHombre);
        rbtnHombre.setText("H");
        rbtnHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnHombreActionPerformed(evt);
            }
        });

        grupoSexo.add(rbtnMujer);
        rbtnMujer.setText("M");
        rbtnMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMujerActionPerformed(evt);
            }
        });

        cmboDeportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futbol", "Baloncesto", "Artes Marciales" }));
        cmboDeportes.setSelectedIndex(2);
        cmboDeportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboDeportesActionPerformed(evt);
            }
        });

        spEdad.setModel(new javax.swing.SpinnerNumberModel(25, 18, 99, 5));
        spEdad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spEdadStateChanged(evt);
            }
        });

        slSalario.setMajorTickSpacing(500);
        slSalario.setMaximum(3000);
        slSalario.setMinimum(950);
        slSalario.setPaintLabels(true);
        slSalario.setPaintTicks(true);
        slSalario.setValue(1500);
        slSalario.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slSalarioStateChanged(evt);
            }
        });

        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre1.setText("NOMBRE:");

        lblSexo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSexo1.setText("SEXO:");

        lblDeporte1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDeporte1.setText("DEPORTE:");

        lblEdad1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEdad1.setText("EDAD:");

        lblSalario1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalario1.setText("SALARIO:");

        btnGuardar.setText("GUARDAR");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.setEnabled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblResultadoNombre.setText("___________");

        lblResultadoSexo.setText("___________");

        lblResultadoDeporte.setText("___________");

        lblResultadoEdad.setText("___________");

        lblResultadoSalario.setText("___________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDeporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbtnHombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbtnMujer))
                                .addComponent(txtNombre)
                                .addComponent(cmboDeportes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(spEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDeporte1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSexo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEdad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSalario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblResultadoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(lblResultadoSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResultadoDeporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResultadoEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResultadoSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblResultadoNombre)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(rbtnHombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtnMujer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSexo1)
                            .addComponent(lblResultadoSexo))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmboDeportes)
                            .addComponent(lblDeporte)
                            .addComponent(lblDeporte1)
                            .addComponent(lblResultadoDeporte))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(lblEdad)
                            .addComponent(lblEdad1)
                            .addComponent(lblResultadoEdad))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalario)
                            .addComponent(lblSalario1)
                            .addComponent(lblResultadoSalario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*TEXT*/
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        /**
         * Comprobacion del estado del TextArea cada vez que sobre el mencionado se presiona una tecla
         */
        String texto = txtNombre.getText(); //Almacen de texto
          
        /*Comprobante longitud de texto superior a 10 caracteres*/
            if (texto.length() >= 10) {
                texto = texto.substring(0, 9);
                txtNombre.setText(texto);
            }
        /*Comprobante longitud de texto superior a 10 caracteres*/
        
        estadoBotonEnviar(); //El boton guardar puede usarse...
        estadoBotonBorrar(); //El boton resetear puede usarse...
    }//GEN-LAST:event_txtNombreKeyTyped
    /*TEXT*/
    
    /*BOTON RESETEAR*/
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtNombre.setText("");
        grupoSexo.clearSelection();
        cmboDeportes.setSelectedIndex(2);
        spEdad.setValue(25);
        slSalario.setValue(1500);
        
        lblResultadoNombre.setText("___________");
        lblResultadoSexo.setText("___________");
        lblResultadoDeporte.setText("___________");
        lblResultadoEdad.setText("___________");
        lblResultadoSalario.setText("___________");
        
        btnReset.setEnabled(false);
    }//GEN-LAST:event_btnResetActionPerformed
    /*BOTON RESETEAR*/
    /*BOTON GUARDAR*/
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText().toUpperCase();
        String sexo="";
        if (rbtnHombre.isSelected()) {
            sexo = "H";
        } else if (rbtnMujer.isSelected()) {
            sexo = "M";
        }
        String deporte = cmboDeportes.getItemAt(cmboDeportes.getSelectedIndex()).toUpperCase();
        String edad = spEdad.getValue().toString();
        String salario = Integer.toString(slSalario.getValue());
        
        lblResultadoNombre.setText(nombre);
        lblResultadoSexo.setText(sexo);
        lblResultadoDeporte.setText(deporte);
        lblResultadoEdad.setText(edad);
        lblResultadoSalario.setText(salario);
        
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_btnGuardarActionPerformed
    /*BOTON GUARDAR*/
    
    /*SEXO*/
    private void rbtnHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnHombreActionPerformed
        estadoBotonEnviar(); //El boton guardar puede usarse...
        estadoBotonBorrar(); //El boton resetear puede usarse...
    }//GEN-LAST:event_rbtnHombreActionPerformed

    private void rbtnMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMujerActionPerformed
        estadoBotonEnviar(); //El boton guardar puede usarse...
        estadoBotonBorrar(); //El boton resetear puede usarse...
    }//GEN-LAST:event_rbtnMujerActionPerformed
    /*SEXO*/
    /*DEPORTES*/
    private void cmboDeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboDeportesActionPerformed
        estadoBotonEnviar(); //El boton guardar puede usarse...
    }//GEN-LAST:event_cmboDeportesActionPerformed
    /*DEPORTES*/
    /*EDAD*/
    private void spEdadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spEdadStateChanged
        estadoBotonEnviar(); //El boton guardar puede usarse...
    }//GEN-LAST:event_spEdadStateChanged
    /*EDAD*/
    /*SALARIO*/
    private void slSalarioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slSalarioStateChanged
        estadoBotonEnviar(); //El boton guardar puede usarse...
    }//GEN-LAST:event_slSalarioStateChanged
    /*SALARIO*/
    
    /*ESTADO DEL BOTON GUARDAR*/
    private void estadoBotonEnviar() {
        /**
         * En caso de que se cumpla lo siguiente, el boton Enviar estara operativo...
         *  > El campo nombre no este vacio.
         *  > El sexo haya sido escogido.
         *  > El deporte haya sido escogido.
         *  > La edad sea valida.
         *  > El salario sea valido.
         * 
         * Si alguna de estas caracteristicas no se cumple el boton enviar no estara operativo
         */
        if (!txtNombre.getText().isEmpty()) { //Texto vacio
            if (rbtnHombre.isSelected() || rbtnMujer.isSelected()) { //Sexo seleccionado
                if (cmboDeportes.getSelectedIndex()!=-1) { //Deporte seleccionado
                    if (((int) (spEdad.getValue()) >= 18) && ((int) (spEdad.getValue()) <= 99)) { //Edad valida
                        if ((slSalario.getValue() >= 950) && (slSalario.getValue() <= 3000)) { //Salario valido
                            btnGuardar.setEnabled(true); //Boton activado
                        } else {
                            btnGuardar.setEnabled(false); //Boton desactivado
                        }
                    } else {
                        btnGuardar.setEnabled(false); //Boton desactivado
                    }
                } else {
                    btnGuardar.setEnabled(false); //Boton desactivado
                }
            } else {
                btnGuardar.setEnabled(false); //Boton desactivado
            }
        } else {
            btnGuardar.setEnabled(false); //Boton desactivado
        }
    }
    /*ESTADO DEL BOTON GUARDAR*/
    /*ESTADO DEL BOTON RESETEAR*/
    private void estadoBotonBorrar() {
        /**
         * En caso de que se cumpla lo siguiente, el boton borrar estara operativo...
         *  > El campo nombre no este vacio.
         *  > El sexo haya sido escogido.
         *  > El deporte haya sido escogido (Por defecto el deporte ya esta seleccionado).
         * 
         * Si alguna de estas caracteristicas no se cumple el boton borrar no estara operativo
         */
        if (!txtNombre.getText().isEmpty() || (rbtnHombre.isSelected() || rbtnMujer.isSelected())) {
            btnReset.setEnabled(true); //Boton activado
        } else {
            btnReset.setEnabled(false); //Boton desactivado
        }
    }
    /*ESTADO DEL BOTON RESETEAR*/
    
    /**
     * Metodo de Inicio de Programa
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmboDeportes;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel lblDeporte;
    private javax.swing.JLabel lblDeporte1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdad1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblResultadoDeporte;
    private javax.swing.JLabel lblResultadoEdad;
    private javax.swing.JLabel lblResultadoNombre;
    private javax.swing.JLabel lblResultadoSalario;
    private javax.swing.JLabel lblResultadoSexo;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSalario1;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JRadioButton rbtnHombre;
    private javax.swing.JRadioButton rbtnMujer;
    private javax.swing.JSlider slSalario;
    private javax.swing.JSpinner spEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
