/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;
import modelos.JogoDaVelha;

/**
 *
 * @author Gustavo Camargo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    JogoDaVelha objClasse = new JogoDaVelha();
    boolean vezJogador = true;
    boolean evtClick = false;
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_L1C1 = new javax.swing.JButton();
        jButton_L1C2 = new javax.swing.JButton();
        jButton_L1C3 = new javax.swing.JButton();
        jButton_L2C1 = new javax.swing.JButton();
        jButton_L2C2 = new javax.swing.JButton();
        jButton_L2C3 = new javax.swing.JButton();
        jButton_L3C1 = new javax.swing.JButton();
        jButton_L3C2 = new javax.swing.JButton();
        jButton_L3C3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_L1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/branco.png"))); // NOI18N
        jButton_L1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_L1C1ActionPerformed(evt);
            }
        });

        jButton_L1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/branco.png"))); // NOI18N
        jButton_L1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_L1C2ActionPerformed(evt);
            }
        });

        jButton_L1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/branco.png"))); // NOI18N
        jButton_L1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_L1C3ActionPerformed(evt);
            }
        });

        jButton_L2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/branco.png"))); // NOI18N
        jButton_L2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_L2C1ActionPerformed(evt);
            }
        });

        jButton_L2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/branco.png"))); // NOI18N
        jButton_L2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_L2C2ActionPerformed(evt);
            }
        });

        jButton_L2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/branco.png"))); // NOI18N
        jButton_L2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_L2C3ActionPerformed(evt);
            }
        });

        jButton_L3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/branco.png"))); // NOI18N
        jButton_L3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_L3C1ActionPerformed(evt);
            }
        });

        jButton_L3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/branco.png"))); // NOI18N
        jButton_L3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_L3C2ActionPerformed(evt);
            }
        });

        jButton_L3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/branco.png"))); // NOI18N
        jButton_L3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_L3C3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_L3C1)
                    .addComponent(jButton_L2C1)
                    .addComponent(jButton_L1C1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_L1C2)
                    .addComponent(jButton_L2C2)
                    .addComponent(jButton_L3C2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_L1C3)
                    .addComponent(jButton_L2C3)
                    .addComponent(jButton_L3C3))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_L1C3)
                    .addComponent(jButton_L1C2)
                    .addComponent(jButton_L1C1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_L2C1)
                    .addComponent(jButton_L2C2)
                    .addComponent(jButton_L2C3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_L3C1)
                    .addComponent(jButton_L3C2)
                    .addComponent(jButton_L3C3))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_L1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_L1C1ActionPerformed
        System.out.println(vezJogador);
        if ( vezJogador ){
            System.out.println(vezJogador);
            if ( objClasse.getValor(0, 0 ) == 0) {
                objClasse.setValor(0, 0, 1);
                jButton_L1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/x.png")));
                vezJogador = false;
                System.out.println("Passou primeiro IF");
                if (objClasse.verificaVitoria(0, 0) == true ){
                     System.out.println("Ganhou");
                }
            }
        }
            if (vezJogador == false && objClasse.getValor(0, 0 ) == 0 ) {
                System.out.println("Passou segundo IF");
                System.out.println(vezJogador);
                objClasse.setValor(0, 0, 2);
                jButton_L1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/o.png")));
                vezJogador = true;
                if (objClasse.verificaVitoria(0, 0) == true ){
                    System.out.println("Ganhou");
                }
            }
        
    }//GEN-LAST:event_jButton_L1C1ActionPerformed

    private void jButton_L1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_L1C2ActionPerformed
        System.out.println(vezJogador);
        if ( vezJogador ){
            System.out.println(vezJogador);
            if ( objClasse.getValor(0, 1 ) == 0) {
                objClasse.setValor(0, 1, 1);
                jButton_L1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/x.png")));
                vezJogador = false;
                System.out.println("Passou primeiro IF");
                if (objClasse.verificaVitoria(0, 1) == true ){
                     System.out.println("Ganhou");
                }
            }
        }
            if (vezJogador == false && objClasse.getValor(0, 1 ) == 0 ) {
                System.out.println("Passou segundo IF");
                System.out.println(vezJogador);
                objClasse.setValor(0, 1, 2);
                jButton_L1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/o.png")));
                vezJogador = true;
                if (objClasse.verificaVitoria(0, 1) == true ){
                    System.out.println("Ganhou");
                }
            }
    }//GEN-LAST:event_jButton_L1C2ActionPerformed

    private void jButton_L1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_L1C3ActionPerformed
        System.out.println(vezJogador);
        if ( vezJogador ){
            System.out.println(vezJogador);
            if ( objClasse.getValor(0, 2 ) == 0) {
                objClasse.setValor(0, 2, 1);
                jButton_L1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/x.png")));
                vezJogador = false;
                System.out.println("Passou primeiro IF");
                if (objClasse.verificaVitoria(0, 2) == true ){
                     System.out.println("Ganhou");
                }
            }
        }
            if (vezJogador == false && objClasse.getValor(0, 2 ) == 0 ) {
                System.out.println("Passou segundo IF");
                System.out.println(vezJogador);
                objClasse.setValor(0, 2, 2);
                jButton_L1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/o.png")));
                vezJogador = true;
                if (objClasse.verificaVitoria(0, 2) == true ){
                    System.out.println("Ganhou");
                }
            }
    }//GEN-LAST:event_jButton_L1C3ActionPerformed

    private void jButton_L2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_L2C1ActionPerformed
        System.out.println(vezJogador);
        if ( vezJogador ){
            System.out.println(vezJogador);
            if ( objClasse.getValor(1, 0 ) == 0) {
                objClasse.setValor(1, 0, 1);
                jButton_L2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/x.png")));
                vezJogador = false;
                System.out.println("Passou primeiro IF");
                if (objClasse.verificaVitoria(1, 0) == true ){
                     System.out.println("Ganhou");
                }
            }
        }
            if (vezJogador == false && objClasse.getValor(1, 0 ) == 0 ) {
                System.out.println("Passou segundo IF");
                System.out.println(vezJogador);
                objClasse.setValor(1, 0, 2);
                jButton_L2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/o.png")));
                vezJogador = true;
                if (objClasse.verificaVitoria(1, 0) == true ){
                    System.out.println("Ganhou");
                }
            }
    }//GEN-LAST:event_jButton_L2C1ActionPerformed

    private void jButton_L2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_L2C2ActionPerformed
        System.out.println(vezJogador);
        if ( vezJogador ){
            System.out.println(vezJogador);
            if ( objClasse.getValor(1, 1 ) == 0) {
                objClasse.setValor(1, 1, 1);
                jButton_L2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/x.png")));
                vezJogador = false;
                System.out.println("Passou primeiro IF");
                if (objClasse.verificaVitoria(1, 1) == true ){
                     System.out.println("Ganhou");
                }
            }
        }
            if (vezJogador == false && objClasse.getValor(1, 1 ) == 0 ) {
                System.out.println("Passou segundo IF");
                System.out.println(vezJogador);
                objClasse.setValor(1, 1, 2);
                jButton_L2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/o.png")));
                vezJogador = true;
                if (objClasse.verificaVitoria(1, 1) == true ){
                    System.out.println("Ganhou");
                }
            }
    }//GEN-LAST:event_jButton_L2C2ActionPerformed

    private void jButton_L2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_L2C3ActionPerformed
        System.out.println(vezJogador);
        if ( vezJogador ){
            System.out.println(vezJogador);
            if ( objClasse.getValor(1, 2 ) == 0) {
                objClasse.setValor(1, 2, 1);
                jButton_L2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/x.png")));
                vezJogador = false;
                System.out.println("Passou primeiro IF");
                if (objClasse.verificaVitoria(1, 2) == true ){
                     System.out.println("Ganhou");
                }
            }
        }
            if (vezJogador == false && objClasse.getValor(1, 2 ) == 0 ) {
                System.out.println("Passou segundo IF");
                System.out.println(vezJogador);
                objClasse.setValor(1, 2, 2);
                jButton_L2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/o.png")));
                vezJogador = true;
                if (objClasse.verificaVitoria(1, 2) == true ){
                    System.out.println("Ganhou");
                }
            }
    }//GEN-LAST:event_jButton_L2C3ActionPerformed

    private void jButton_L3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_L3C1ActionPerformed
        System.out.println(vezJogador);
        if ( vezJogador ){
            System.out.println(vezJogador);
            if ( objClasse.getValor(2, 0 ) == 0) {
                objClasse.setValor(2, 0, 1);
                jButton_L3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/x.png")));
                vezJogador = false;
                System.out.println("Passou primeiro IF");
                if (objClasse.verificaVitoria(2, 0) == true ){
                     System.out.println("Ganhou");
                }
            }
        }
            if (vezJogador == false && objClasse.getValor(2, 0 ) == 0 ) {
                System.out.println("Passou segundo IF");
                System.out.println(vezJogador);
                objClasse.setValor(2, 0, 2);
                jButton_L3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/o.png")));
                vezJogador = true;
                if (objClasse.verificaVitoria(2, 0) == true ){
                    System.out.println("Ganhou");
                }
            }
    }//GEN-LAST:event_jButton_L3C1ActionPerformed

    private void jButton_L3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_L3C2ActionPerformed
        System.out.println(vezJogador);
        if ( vezJogador ){
            System.out.println(vezJogador);
            if ( objClasse.getValor(2, 1 ) == 0) {
                objClasse.setValor(2, 1, 1);
                jButton_L3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/x.png")));
                vezJogador = false;
                System.out.println("Passou primeiro IF");
                if (objClasse.verificaVitoria(2, 1) == true ){
                     System.out.println("Ganhou");
                }
            }
        }
            if (vezJogador == false && objClasse.getValor(2, 1 ) == 0 ) {
                System.out.println("Passou segundo IF");
                System.out.println(vezJogador);
                objClasse.setValor(2, 1, 2);
                jButton_L3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/o.png")));
                vezJogador = true;
                if (objClasse.verificaVitoria(2, 1) == true ){
                    System.out.println("Ganhou");
                }
            }
    }//GEN-LAST:event_jButton_L3C2ActionPerformed

    private void jButton_L3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_L3C3ActionPerformed
        System.out.println(vezJogador);
        if ( vezJogador ){
            System.out.println(vezJogador);
            if ( objClasse.getValor(2, 2 ) == 0) {
                objClasse.setValor(2, 2, 1);
                jButton_L3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/x.png")));
                vezJogador = false;
                System.out.println("Passou primeiro IF");
                if (objClasse.verificaVitoria(2, 2) == true ){
                     System.out.println("Ganhou");
                }
            }
        }
            if (vezJogador == false && objClasse.getValor(2, 2 ) == 0 ) {
                System.out.println("Passou segundo IF");
                System.out.println(vezJogador);
                objClasse.setValor(2, 2, 2);
                jButton_L3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/o.png")));
                vezJogador = true;
                if (objClasse.verificaVitoria(2, 2) == true ){
                    System.out.println("Ganhou");
                }
            }
    }//GEN-LAST:event_jButton_L3C3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_L1C1;
    private javax.swing.JButton jButton_L1C2;
    private javax.swing.JButton jButton_L1C3;
    private javax.swing.JButton jButton_L2C1;
    private javax.swing.JButton jButton_L2C2;
    private javax.swing.JButton jButton_L2C3;
    private javax.swing.JButton jButton_L3C1;
    private javax.swing.JButton jButton_L3C2;
    private javax.swing.JButton jButton_L3C3;
    // End of variables declaration//GEN-END:variables
}
