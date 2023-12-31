/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

/**
 *
 * @author USER
 */
public class principal_ventana extends javax.swing.JFrame {
    private secundaria_ventana secundaria_ventana;
    private personas personas;
    /**
     * Creates new form principal_ventana
     */
    public principal_ventana() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        datostxtar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JTextField();
        edadtxt = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        btntraer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datostxtar.setBackground(new java.awt.Color(0, 0, 0));
        datostxtar.setColumns(20);
        datostxtar.setForeground(new java.awt.Color(255, 255, 255));
        datostxtar.setRows(5);
        jScrollPane1.setViewportView(datostxtar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 280));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("mangaka:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        nombretxt.setBackground(new java.awt.Color(153, 0, 0));
        nombretxt.setForeground(new java.awt.Color(0, 255, 255));
        nombretxt.setBorder(null);
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });
        getContentPane().add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 160, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("manga:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("cantidad disponible:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        apellidotxt.setBackground(new java.awt.Color(102, 0, 0));
        apellidotxt.setForeground(new java.awt.Color(0, 255, 255));
        apellidotxt.setBorder(null);
        apellidotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidotxtActionPerformed(evt);
            }
        });
        getContentPane().add(apellidotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 130, 150, 20));

        edadtxt.setBackground(new java.awt.Color(153, 0, 0));
        edadtxt.setForeground(new java.awt.Color(0, 255, 255));
        edadtxt.setBorder(null);
        edadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadtxtActionPerformed(evt);
            }
        });
        getContentPane().add(edadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 200, 150, 20));

        btnmodificar.setBackground(new java.awt.Color(102, 0, 255));
        btnmodificar.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(0, 255, 255));
        btnmodificar.setText("enviar datos");
        btnmodificar.setBorder(null);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 100, 30));

        btntraer.setBackground(new java.awt.Color(51, 0, 255));
        btntraer.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        btntraer.setForeground(new java.awt.Color(0, 255, 255));
        btntraer.setText("Agregar nuevos datos");
        btntraer.setToolTipText("");
        btntraer.setBorder(null);
        btntraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntraerActionPerformed(evt);
            }
        });
        getContentPane().add(btntraer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 140, 30));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Base de datos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/nod0.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -10, 150, 430));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/nod0.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 360, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed

    }//GEN-LAST:event_nombretxtActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        
        personas = new personas(nombretxt.getText(), apellidotxt.getText(), Integer.parseInt(edadtxt.getText()));
        
        if (secundaria_ventana != null){
            secundaria_ventana.setVisible(true);
        }else{
            secundaria_ventana = new secundaria_ventana(personas);
            secundaria_ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btntraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntraerActionPerformed
        personas pe =secundaria_ventana.getpersonos();
        nombretxt.setText(pe.getNombre());
        apellidotxt.setText(pe.getmanga());
        edadtxt.setText(pe.getEdad()+"");
        
        datostxtar.append(pe.toString()+ "\n");
        
    }//GEN-LAST:event_btntraerActionPerformed

    private void edadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadtxtActionPerformed

    private void apellidotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidotxtActionPerformed

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
            java.util.logging.Logger.getLogger(principal_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal_ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btntraer;
    private javax.swing.JTextArea datostxtar;
    private javax.swing.JTextField edadtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}
