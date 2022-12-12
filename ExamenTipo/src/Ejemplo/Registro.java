//Area de trabajo
package Ejemplo;

//Importaciones necesarias
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ALostGamer
 * @version 1.0
 * @description Ventana unica de registro e insercion de datos de una persona, a una tabla de datos. DATOS:{SEXO | NOMBRE | CIUDAD}. La ventana permite insercion de datos, borrado de datos y limpieza de lados.
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creacion de JFrame "Registro"
     */
    public Registro() {
        initComponents();
        
        modeloDeTabla = (DefaultTableModel) tableDatos.getModel(); //Inicializamos el modelo de datos
        
        this.getContentPane().setBackground(new java.awt.Color(rojo, verde, azul)); //Cargamos el color de fondo por defecto
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        PaneElementos = new javax.swing.JPanel();
        PaneRadioButtons = new javax.swing.JPanel();
        rbtnHombre = new javax.swing.JRadioButton();
        rbtnMujer = new javax.swing.JRadioButton();
        jScrollPane = new javax.swing.JScrollPane();
        txtAreaNombre = new javax.swing.JTextArea();
        lblNombre = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        comboCiudades = new javax.swing.JComboBox<>();
        sliderR = new javax.swing.JSlider();
        sliderG = new javax.swing.JSlider();
        spinnerB = new javax.swing.JSpinner();
        btnSendData = new javax.swing.JButton();
        btnRemoveData = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(777, 555));

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SEXO", "NOMBRE", "CIUDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDatos);
        if (tableDatos.getColumnModel().getColumnCount() > 0) {
            tableDatos.getColumnModel().getColumn(0).setResizable(false);
            tableDatos.getColumnModel().getColumn(1).setResizable(false);
            tableDatos.getColumnModel().getColumn(2).setResizable(false);
        }

        PaneElementos.setBackground(new java.awt.Color(254, 173, 1));
        PaneElementos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PaneElementos.setForeground(new java.awt.Color(1, 1, 1));

        PaneRadioButtons.setBackground(new java.awt.Color(213, 181, 76));
        PaneRadioButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        grupoSexo.add(rbtnHombre);
        rbtnHombre.setText("Hombre");
        rbtnHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnHombreActionPerformed(evt);
            }
        });

        grupoSexo.add(rbtnMujer);
        rbtnMujer.setText("Mujer");
        rbtnMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMujerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaneRadioButtonsLayout = new javax.swing.GroupLayout(PaneRadioButtons);
        PaneRadioButtons.setLayout(PaneRadioButtonsLayout);
        PaneRadioButtonsLayout.setHorizontalGroup(
            PaneRadioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneRadioButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaneRadioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbtnHombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnMujer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaneRadioButtonsLayout.setVerticalGroup(
            PaneRadioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneRadioButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(rbtnMujer)
                .addContainerGap())
        );

        txtAreaNombre.setColumns(20);
        txtAreaNombre.setRows(5);
        txtAreaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaNombreKeyReleased(evt);
            }
        });
        jScrollPane.setViewportView(txtAreaNombre);

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre:");

        lblCiudad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCiudad.setText("Ciudad:");

        comboCiudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "León", "Palencia", "Burgos", "Zamora", "Valladolid", "Soria", "Salamanca", "Ávila", "Segovia" }));
        comboCiudades.setSelectedIndex(-1);
        comboCiudades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCiudadesItemStateChanged(evt);
            }
        });

        sliderR.setMajorTickSpacing(50);
        sliderR.setMaximum(255);
        sliderR.setPaintLabels(true);
        sliderR.setPaintTicks(true);
        sliderR.setValue(0);
        sliderR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRStateChanged(evt);
            }
        });

        sliderG.setMajorTickSpacing(50);
        sliderG.setMaximum(255);
        sliderG.setPaintLabels(true);
        sliderG.setPaintTicks(true);
        sliderG.setValue(0);
        sliderG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderGStateChanged(evt);
            }
        });

        spinnerB.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        spinnerB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerBStateChanged(evt);
            }
        });

        javax.swing.GroupLayout PaneElementosLayout = new javax.swing.GroupLayout(PaneElementos);
        PaneElementos.setLayout(PaneElementosLayout);
        PaneElementosLayout.setHorizontalGroup(
            PaneElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneElementosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaneElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spinnerB, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PaneElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sliderG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sliderR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaneElementosLayout.createSequentialGroup()
                            .addGroup(PaneElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PaneRadioButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(PaneElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane)
                                .addComponent(comboCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaneElementosLayout.setVerticalGroup(
            PaneElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneElementosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PaneRadioButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PaneElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaneElementosLayout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addGroup(PaneElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboCiudades)
                            .addComponent(lblCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sliderR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sliderG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spinnerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSendData.setText("ENVIAR LOS DATOS");
        btnSendData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendDataActionPerformed(evt);
            }
        });

        btnRemoveData.setText("REMOVER LOS DATOS");
        btnRemoveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDataActionPerformed(evt);
            }
        });

        btnClear.setText("LIMPIAR LA TABLA");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PaneElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemoveData, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSendData, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(PaneElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendData, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveData, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    INICIO INTRODUCCION DEL SEXO DE LA PERSONA
    * El valor se asigna por primera vez al pulsar cualquiera de los dos 'RadioButtons'
    */
    private void rbtnHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnHombreActionPerformed
        sexo = "Hombre";
    }//GEN-LAST:event_rbtnHombreActionPerformed

    private void rbtnMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMujerActionPerformed
        sexo = "Mujer";
    }//GEN-LAST:event_rbtnMujerActionPerformed
    /*
    FIN INTRODUCCION DEL SEXO DE LA PERSONA
    */
////////////////////////////////////////////////////////////////////////////////
    /*
    INICIO INTRODUCCION DE LA CIUDAD DE LA PERSONA
    * EL valor se asigna una vez el valor del 'ComboBox' fue alterado
    */
    private void comboCiudadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCiudadesItemStateChanged
        ciudad = comboCiudades.getItemAt(comboCiudades.getSelectedIndex());
    }//GEN-LAST:event_comboCiudadesItemStateChanged
    /*
    FIN INTRODUCCION DE LA CIUDAD DE LA PERSONA
    */
////////////////////////////////////////////////////////////////////////////////
    /*
    INICIO INTRODUCCION DEL NOMBRE DE LA PERSONA
    * El nombre no puede tener mas de 10 caracteres
    * EL nombre muestra un aviso si se intentan introducir mas de 10 caracteres por medios forzosos
    * (OPCIONAL) No se pueden introducir saltos de linea en el 'TextArea'
    */
    private void txtAreaNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaNombreKeyReleased
        nombre = txtAreaNombre.getText();
        
        if (nombre.length()>=10) {
            if (nombre.length()>=12) {
                JOptionPane.showMessageDialog(
                    this,
                    "EL nombre tiene un limite de 10 caracteres",
                    "LIMITE DE CARACTERES",
                    JOptionPane.WARNING_MESSAGE
                );
            }
            nombre = nombre.substring(0, 10);
        }
        nombre = nombre.replace("\n", "");
        
        txtAreaNombre.setText(nombre);
    }//GEN-LAST:event_txtAreaNombreKeyReleased
    /*
    FIN INTRODUCCION DEL NOMBRE DE LA PERSONA
    */
    
    
    /*
    INICIO ENVIO DE DATOS A LA TABLA
    */
    private void btnSendDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendDataActionPerformed
        if (sexo.isEmpty() || nombre.trim().isEmpty() || ciudad.isEmpty() ) {
            if (sexo.isEmpty()) {
                JOptionPane.showMessageDialog(
                    this,
                    "Es necesario marcar un sexo.",
                    "SEXO",
                    JOptionPane.WARNING_MESSAGE
                );
            }
            if (nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    this,
                    "Es necesario escribir un nombre.",
                    "NOMBRE",
                    JOptionPane.WARNING_MESSAGE
                );
            }
            if (ciudad.isEmpty()) {
                JOptionPane.showMessageDialog(
                    this,
                    "Es necesario escoger una ciudad.",
                    "CIUDAD",
                    JOptionPane.WARNING_MESSAGE
                );
            }
        } else {
            String datos[] = {sexo, nombre, ciudad};
            
            modeloDeTabla.addRow(datos);
            tableDatos.setModel(modeloDeTabla);
        }
    }//GEN-LAST:event_btnSendDataActionPerformed
    /*
    FIN ENVIO DE DATOS A LA TABLA
    */
    
    /*
    INICIO LIMPIEZA DE DATOS
    */
    private void btnRemoveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDataActionPerformed
        if (sexo.isEmpty() && nombre.trim().isEmpty() && ciudad.isEmpty() ) {
            
            JOptionPane.showMessageDialog(
                this,
                "Es necesario completar algun campo para remover los datos.",
                "FALTA DE CAMPOS",
                JOptionPane.ERROR_MESSAGE
            );
        } else {
            grupoSexo.clearSelection();
                sexo = "";
            comboCiudades.setSelectedIndex(-1);
                ciudad = "";
            txtAreaNombre.setText("");
                nombre = "";
        }
    }//GEN-LAST:event_btnRemoveDataActionPerformed
    /*
    FIN LIMPIEZA DE DATOS
    */
    
    /*
    INICIO BORRADO DE DATOS A LA TABLA
    */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        if (modeloDeTabla.getRowCount()==0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Es necesario que exista algún campo en la tabla para limpiar la tabla.",
                    "DATOS DE LA TABLA",
                    JOptionPane.ERROR_MESSAGE
                );
        } else {
            for (int i = modeloDeTabla.getRowCount()-1; i >= 0; i--) {
                modeloDeTabla.removeRow(i);
            }
            tableDatos.setModel(modeloDeTabla);
        }
    }//GEN-LAST:event_btnClearActionPerformed
    /*
    FIN BORRADO DE DATOS A LA TABLA
    */
    
    /*
    INICIO CAMBIO DE COLOR DE FONDO PANTALLA PRINCIPAL
    */
    private void sliderRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRStateChanged
        rojo = (int) (sliderR.getValue());
        
        this.getContentPane().setBackground(new java.awt.Color(rojo, verde, azul));
    }//GEN-LAST:event_sliderRStateChanged

    private void sliderGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGStateChanged
        verde = (int) (sliderG.getValue());
        
        this.getContentPane().setBackground(new java.awt.Color(rojo, verde, azul));
    }//GEN-LAST:event_sliderGStateChanged

    private void spinnerBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerBStateChanged
        azul = (int) (spinnerB.getValue());
        
        this.getContentPane().setBackground(new java.awt.Color(rojo, verde, azul));
    }//GEN-LAST:event_spinnerBStateChanged
    /*
    FIN CAMBIO DE COLOR DE FONDO PANTALLA PRINCIPAL
    */
    
    
    
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    
    
    // Declaracion de mis variables
    private String sexo = "";
    private String ciudad = "";
    private String nombre = "";
    
    private int rojo = 0;
    private int verde = 0;
    private int azul = 0;
    
    private DefaultTableModel modeloDeTabla;
    // Final de la Declaracion de mis variables

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneElementos;
    private javax.swing.JPanel PaneRadioButtons;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemoveData;
    private javax.swing.JButton btnSendData;
    private javax.swing.JComboBox<String> comboCiudades;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JRadioButton rbtnHombre;
    private javax.swing.JRadioButton rbtnMujer;
    private javax.swing.JSlider sliderG;
    private javax.swing.JSlider sliderR;
    private javax.swing.JSpinner spinnerB;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextArea txtAreaNombre;
    // End of variables declaration//GEN-END:variables
}
