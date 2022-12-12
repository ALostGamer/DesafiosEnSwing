//Area de trabajo
package Ejercicio_3;

//Importaciones necesarias
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ALostGamer
 * @version 1.0
 * @description Programa selector de archivos, solo permite la seleccion de archivos .txt
 */
public class SelectorDeArchivos extends javax.swing.JFrame {

    /**
     * Creacion de JFrame "SelectorDeArchivos"
     */
    public SelectorDeArchivos() {
        initComponents();
        
        // Inicializacion de mis variables
        String carpetaActiva = System.getProperty("user.dir"); //Carpeta de trabajo = Carpeta de proyecto

            File directorioDeApertura = new File(carpetaActiva); //Carpeta de trabajo
        
        
        selectorDeArchivo = new JFileChooser(); //Declaramos el JFileChooser creado

        selectorDeArchivo.setAcceptAllFileFilterUsed(false); //Evitamos utilizar filtros no creados como el generico por defecto y global
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos en .txt", "txt"); //Creamos un filtro de archivos
            selectorDeArchivo.setFileFilter(filtro); //Establecemos el filtro creado
            
        selectorDeArchivo.setCurrentDirectory(directorioDeApertura); //Establecer la carpeta de trabajo
        // Inicializacion de mis variables
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAbrirSelectorDeArchivos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnAbrirSelectorDeArchivos.setFont(new java.awt.Font("Loma", 0, 36)); // NOI18N
        btnAbrirSelectorDeArchivos.setText("Selector de Archivos");
        btnAbrirSelectorDeArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirSelectorDeArchivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbrirSelectorDeArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbrirSelectorDeArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*SELECTOR DE ARCHIVOS TXT*/
    private void btnAbrirSelectorDeArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirSelectorDeArchivosActionPerformed
         int valor = selectorDeArchivo.showOpenDialog(this); //Almacenamos el tipo de boton pulsado
        
        switch (valor) { //El valor depende de...
            case (JFileChooser.APPROVE_OPTION): //Si pulsaste en agregar
                System.out.println("Has seleccionado un archivo");
                
                /*
                File ficheroSeleccionado = selectorDeArchivo.getSelectedFile(); //Guardar el fichero seleccionado
                    String fileName = ficheroSeleccionado.getName(); //Guardar la ruta del fichero
                
                System.out.println("Has seleccionado el archivo \"" + fileName + "\""); //Mostrar el nombre del fichero seleccionado
                */
                
                break;
            case (JFileChooser.CANCEL_OPTION): //Si pulsaste en cancelar o cerrar
                System.out.println("Has salido del selector de archivos");
                break;
            default: //Salida por defecto
                System.out.println("holaMundo");
        }
        
    }//GEN-LAST:event_btnAbrirSelectorDeArchivosActionPerformed
    /*SELECTOR DE ARCHIVOS TXT*/
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectorDeArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectorDeArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectorDeArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectorDeArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectorDeArchivos().setVisible(true);
            }
        });
    }
    
    // Declaracion de mis variables
    JFileChooser selectorDeArchivo;
    // Declaracion de mis variables
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirSelectorDeArchivos;
    // End of variables declaration//GEN-END:variables
}
