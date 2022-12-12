//Area de trabajo
package Ejercicio_2;

//Importaciones necesarias
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author ALostGamer
 * @version 1.0
 * @description Programa capaz de editar visualmente dos paneles distintos entre sí, el panel a editar se seleccionara por medio de un 'ToggleButton' y la edicion se realizara desde un 'MenuBar'.
 */
public class SelectorDePaneles extends javax.swing.JFrame {

    /**
     * Creacion de JFrame "SelectorDePaneles"
     */
    public SelectorDePaneles() {
        initComponents();
        
        // Inicializacion de mis variables
        textoPane1 = lblDePruebaPane1.getText();
            fuentePorDefecto1 = lblDePruebaPane1.getFont();
            fuenteActual1 = lblDePruebaPane1.getFont();
        textoPane2 = lblDePruebaPane2.getText();
            fuentePorDefecto2 = lblDePruebaPane2.getFont();
            fuenteActual2 = lblDePruebaPane2.getFont();
        // Declaracion de mis variables
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPane1 = new javax.swing.JPanel();
        lblDePruebaPane1 = new javax.swing.JLabel();
        jPane2 = new javax.swing.JPanel();
        lblDePruebaPane2 = new javax.swing.JLabel();
        tglButtonCambioPane = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPane1 = new javax.swing.JMenu();
        jMenuPane2 = new javax.swing.JMenu();
        jMenuOpciones = new javax.swing.JMenu();
        jMenuTamaño = new javax.swing.JMenu();
        jMenuItemTamaño1 = new javax.swing.JMenuItem();
        jMenuItemTamaño2 = new javax.swing.JMenuItem();
        jMenuColor = new javax.swing.JMenu();
        jMenuItemColor1 = new javax.swing.JMenuItem();
        jMenuItemColor2 = new javax.swing.JMenuItem();
        jMenuItemColor3 = new javax.swing.JMenuItem();
        jMenuTipografia = new javax.swing.JMenu();
        jMenuItemTipografía1 = new javax.swing.JMenuItem();
        jMenuItemTipografía2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblDePruebaPane1.setFont(new java.awt.Font("Loma", 0, 15)); // NOI18N
        lblDePruebaPane1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDePruebaPane1.setText("Este es un texto de Prueba");

        javax.swing.GroupLayout JPane1Layout = new javax.swing.GroupLayout(JPane1);
        JPane1.setLayout(JPane1Layout);
        JPane1Layout.setHorizontalGroup(
            JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDePruebaPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPane1Layout.setVerticalGroup(
            JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDePruebaPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblDePruebaPane2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDePruebaPane2.setText("Este es un texto de Prueba");

        javax.swing.GroupLayout jPane2Layout = new javax.swing.GroupLayout(jPane2);
        jPane2.setLayout(jPane2Layout);
        jPane2Layout.setHorizontalGroup(
            jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDePruebaPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPane2Layout.setVerticalGroup(
            jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDePruebaPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        tglButtonCambioPane.setText("PANE_2");
        tglButtonCambioPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglButtonCambioPaneActionPerformed(evt);
            }
        });

        jMenuPane1.setText("Borrar Formato Pane1");
        jMenuPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuPane1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenuPane1);

        jMenuPane2.setText("Borrar Formato Pane2");
        jMenuPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuPane2MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenuPane2);

        jMenuOpciones.setText("Opciones");

        jMenuTamaño.setText("TamañoDeLetra");

        jMenuItemTamaño1.setText("Tamaño 12");
        jMenuItemTamaño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTamaño1ActionPerformed(evt);
            }
        });
        jMenuTamaño.add(jMenuItemTamaño1);

        jMenuItemTamaño2.setText("Tamaño 16");
        jMenuItemTamaño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTamaño2ActionPerformed(evt);
            }
        });
        jMenuTamaño.add(jMenuItemTamaño2);

        jMenuOpciones.add(jMenuTamaño);

        jMenuColor.setText("ColorDeLetra");

        jMenuItemColor1.setText("Color Rojo");
        jMenuItemColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemColor1ActionPerformed(evt);
            }
        });
        jMenuColor.add(jMenuItemColor1);

        jMenuItemColor2.setText("Color Verde");
        jMenuItemColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemColor2ActionPerformed(evt);
            }
        });
        jMenuColor.add(jMenuItemColor2);

        jMenuItemColor3.setText("Color Azul");
        jMenuItemColor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemColor3ActionPerformed(evt);
            }
        });
        jMenuColor.add(jMenuItemColor3);

        jMenuOpciones.add(jMenuColor);

        jMenuTipografia.setText("TipografiaDeLetra");

        jMenuItemTipografía1.setText("Tipografía 1");
        jMenuItemTipografía1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTipografía1ActionPerformed(evt);
            }
        });
        jMenuTipografia.add(jMenuItemTipografía1);

        jMenuItemTipografía2.setText("Tipografía 2");
        jMenuItemTipografía2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTipografía2ActionPerformed(evt);
            }
        });
        jMenuTipografia.add(jMenuItemTipografía2);

        jMenuOpciones.add(jMenuTipografia);

        jMenuBar1.add(jMenuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(tglButtonCambioPane, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(tglButtonCambioPane, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*SELECTOR DE PANEL*/
    private void tglButtonCambioPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglButtonCambioPaneActionPerformed
        /**
         * ARTE VISUAL PARA EL USUARIO
         * 
         * Seleccionado 'ToggleButton'
         *  > Panel_1 (superior) habilitado
         * Deseleccionado 'ToggleButton'
         *  > Panel_2 (inferior) habilitado
         */
        if (tglButtonCambioPane.isSelected()) {
            tglButtonCambioPane.setText("PANE_1"); //Texto 'ToggleButton'
        } else {
            tglButtonCambioPane.setText("PANE_2"); //Texto 'ToggleButton'
        }
    }//GEN-LAST:event_tglButtonCambioPaneActionPerformed
    /*SELECTOR DE PANEL*/
    
    /*ELIMINAR FORMATO TEXTO*/
    private void jMenuPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPane1MousePressed
        lblDePruebaPane1.setFont(fuentePorDefecto1); //Fuente por defecto
        lblDePruebaPane1.setForeground(Color.BLACK); //Color por defecto
    }//GEN-LAST:event_jMenuPane1MousePressed

    private void jMenuPane2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPane2MousePressed
        lblDePruebaPane2.setFont(fuentePorDefecto2); //Fuente por defecto
        lblDePruebaPane2.setForeground(Color.BLACK); //Color por defecto
    }//GEN-LAST:event_jMenuPane2MousePressed
    /*ELIMINAR FORMATO TEXTO*/
    /*CAMBIAR DIMENSIONES TEXTO*/
    private void jMenuItemTamaño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTamaño1ActionPerformed
        /**
         * Dimensiones de texto 1: 12
         * Fuente actual del texto
         * Tipo de texto por defecto (plano)
         */
        
        if (tglButtonCambioPane.isSelected()) {
            lblDePruebaPane1.setFont(new Font(fuenteActual1.getFamily(), Font.PLAIN, 12));
            fuenteActual1 = lblDePruebaPane1.getFont();
        } else if (!tglButtonCambioPane.isSelected()){
            lblDePruebaPane2.setFont(new Font(fuenteActual2.getFamily(), Font.PLAIN, 12));
            fuenteActual2 = lblDePruebaPane2.getFont();
        }
    }//GEN-LAST:event_jMenuItemTamaño1ActionPerformed

    private void jMenuItemTamaño2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTamaño2ActionPerformed
        /**
         * Dimensiones de texto 2: 16
         * Fuente actual del texto
         * Tipo de texto por defecto (plano)
         */
        
        if (tglButtonCambioPane.isSelected()) {
            lblDePruebaPane1.setFont(new Font(fuenteActual1.getFamily(), Font.PLAIN, 16));
            fuenteActual1 = lblDePruebaPane1.getFont();
        } else if (!tglButtonCambioPane.isSelected()){
            lblDePruebaPane2.setFont(new Font(fuenteActual2.getFamily(), Font.PLAIN, 16));
            fuenteActual2 = lblDePruebaPane2.getFont();
        }
    }//GEN-LAST:event_jMenuItemTamaño2ActionPerformed
    /*CAMBIAR DIMENSIONES TEXTO*/
    /*CAMBIAR COLOR TEXTO*/
    private void jMenuItemColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemColor1ActionPerformed
        /**
         * Color de texto 1: Rojo
         */
        
        if (tglButtonCambioPane.isSelected()) {
            lblDePruebaPane1.setForeground(Color.RED);
        } else if (!tglButtonCambioPane.isSelected()){
            lblDePruebaPane2.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jMenuItemColor1ActionPerformed

    private void jMenuItemColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemColor2ActionPerformed
        /**
         * Color de texto 2: Verde
         */
        
        if (tglButtonCambioPane.isSelected()) {
            lblDePruebaPane1.setForeground(Color.GREEN);
        } else if (!tglButtonCambioPane.isSelected()){
            lblDePruebaPane2.setForeground(Color.GREEN);
        }
    }//GEN-LAST:event_jMenuItemColor2ActionPerformed

    private void jMenuItemColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemColor3ActionPerformed
        /**
         * Color de texto 3: Azul
         */
        
        if (tglButtonCambioPane.isSelected()) {
            lblDePruebaPane1.setForeground(Color.BLUE);
        } else if (!tglButtonCambioPane.isSelected()){
            lblDePruebaPane2.setForeground(Color.BLUE);
        }
    }//GEN-LAST:event_jMenuItemColor3ActionPerformed
    /*CAMBIAR COLOR TEXTO*/
    /*CAMBIAR TIPOGRAFIA TEXTO*/
    private void jMenuItemTipografía1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTipografía1ActionPerformed
        /**
         * Dimensiones actual del texto
         * Fuente de texto 1: Purisa
         * Tipo de texto por defecto (plano)
         */
        
        if (tglButtonCambioPane.isSelected()) {
            lblDePruebaPane1.setFont(new Font("Purisa", Font.PLAIN, fuenteActual1.getSize()));
            fuenteActual1 = lblDePruebaPane1.getFont();
        } else if (!tglButtonCambioPane.isSelected()){
            lblDePruebaPane2.setFont(new Font("Purisa", Font.PLAIN, fuenteActual2.getSize()));
            fuenteActual2 = lblDePruebaPane2.getFont();
        }
    }//GEN-LAST:event_jMenuItemTipografía1ActionPerformed

    private void jMenuItemTipografía2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTipografía2ActionPerformed
        /**
         * Dimensiones actual del texto
         * Fuente de texto 1: Pagul
         * Tipo de texto por defecto (plano)
         */
        
        if (tglButtonCambioPane.isSelected()) {
            lblDePruebaPane1.setFont(new Font("Pagul", Font.PLAIN, 16));
            fuenteActual1 = lblDePruebaPane1.getFont();
        } else if (!tglButtonCambioPane.isSelected()){
            lblDePruebaPane2.setFont(new Font("Pagul", Font.PLAIN, 12));
            fuenteActual2 = lblDePruebaPane2.getFont();
        }
    }//GEN-LAST:event_jMenuItemTipografía2ActionPerformed
    /*CAMBIAR TIPOGRAFIA TEXTO*/
    
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
            java.util.logging.Logger.getLogger(SelectorDePaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectorDePaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectorDePaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectorDePaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectorDePaneles().setVisible(true);
            }
        });
    }

    // Declaracion de mis variables
    String textoPane1;
    Font fuentePorDefecto1, fuenteActual1;
    String textoPane2;
    Font fuentePorDefecto2, fuenteActual2;
    // Declaracion de mis variables
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuColor;
    private javax.swing.JMenuItem jMenuItemColor1;
    private javax.swing.JMenuItem jMenuItemColor2;
    private javax.swing.JMenuItem jMenuItemColor3;
    private javax.swing.JMenuItem jMenuItemTamaño1;
    private javax.swing.JMenuItem jMenuItemTamaño2;
    private javax.swing.JMenuItem jMenuItemTipografía1;
    private javax.swing.JMenuItem jMenuItemTipografía2;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JMenu jMenuPane1;
    private javax.swing.JMenu jMenuPane2;
    private javax.swing.JMenu jMenuTamaño;
    private javax.swing.JMenu jMenuTipografia;
    private javax.swing.JPanel jPane2;
    private javax.swing.JLabel lblDePruebaPane1;
    private javax.swing.JLabel lblDePruebaPane2;
    private javax.swing.JToggleButton tglButtonCambioPane;
    // End of variables declaration//GEN-END:variables
}
