package janelas;


import Processos.Arquivos;
import static Processos.Arquivos.buscaProcessoCnpj;
import static Processos.Arquivos.buscaProcessoCpf;
import static Processos.Arquivos.buscaProcessoNumero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class JanelaConsulta extends javax.swing.JFrame {

    /**
     * Creates new form janelaConsulta
     */
    public JanelaConsulta() {
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

        lblInfo = new javax.swing.JLabel();
        tbxDado = new javax.swing.JTextField();
        btnBuscaCPF = new javax.swing.JButton();
        btnBuscaNum = new javax.swing.JButton();
        btnBuscaCNPJ = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInfo.setText("digite o dado que será utilizado para realizar a busca");

        btnBuscaCPF.setText("busca por CPF");
        btnBuscaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCPFActionPerformed(evt);
            }
        });

        btnBuscaNum.setText("busca por numero");
        btnBuscaNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaNumActionPerformed(evt);
            }
        });

        btnBuscaCNPJ.setText("busca por CNPJ");
        btnBuscaCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCNPJActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(240, 0, 0));
        btnBack.setText("VOLTAR");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblInfo)
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addComponent(tbxDado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnBuscaCPF)
                    .addComponent(btnBuscaNum)
                    .addComponent(btnBuscaCNPJ)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnBuscaCNPJ, btnBuscaCPF, btnBuscaNum});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbxDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscaNum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscaCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCNPJActionPerformed
        String dado = tbxDado.getText();
        Arquivos.buscaProcessoCnpj(dado, Arquivos.tamanhoArquivo());
    }//GEN-LAST:event_btnBuscaCNPJActionPerformed

    private void btnBuscaNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNumActionPerformed
        String dado = tbxDado.getText();
        Arquivos.buscaProcessoNumero(dado, Arquivos.tamanhoArquivo());
    }//GEN-LAST:event_btnBuscaNumActionPerformed

    private void btnBuscaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCPFActionPerformed
        String dado = tbxDado.getText();
        Arquivos.buscaProcessoCpf(dado, Arquivos.tamanhoArquivo());
    }//GEN-LAST:event_btnBuscaCPFActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuscaCNPJ;
    private javax.swing.JButton btnBuscaCPF;
    private javax.swing.JButton btnBuscaNum;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTextField tbxDado;
    // End of variables declaration//GEN-END:variables
}