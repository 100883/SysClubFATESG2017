package apresentacao;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

        //Maximiza a tela
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu6 = new javax.swing.JMenu();
        pnlPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuAssociadoCadastro = new javax.swing.JMenuItem();
        mnuTipoAssociadoCadastro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuPedido = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuPesquisarAssociado = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SysClube - Sistema para Automação de Clubes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlPrincipal.setBackground(new java.awt.Color(0, 51, 51));
        pnlPrincipal.setForeground(new java.awt.Color(0, 51, 51));
        pnlPrincipal.setFocusCycleRoot(false);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");

        mnuAssociadoCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuAssociadoCadastro.setText("Associados");
        mnuAssociadoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAssociadoCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAssociadoCadastro);

        mnuTipoAssociadoCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mnuTipoAssociadoCadastro.setText("Tipo Associado");
        jMenu1.add(mnuTipoAssociadoCadastro);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimentações");

        mnuPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        mnuPedido.setText("Pedidos");
        mnuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPedidoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuPedido);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Relatórios");

        mnuPesquisarAssociado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mnuPesquisarAssociado.setText("Pesquisar Associado");
        mnuPesquisarAssociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPesquisarAssociadoActionPerformed(evt);
            }
        });
        jMenu4.add(mnuPesquisarAssociado);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sair");

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenu5.add(mnuSair);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAssociadoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAssociadoCadastroActionPerformed
        try {

            AssociadoCadastro janela = new AssociadoCadastro();
            this.pnlPrincipal.add(janela);
            janela.setVisible(true);
            centraliza(janela);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_mnuAssociadoCadastroActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed

        sair();

    }//GEN-LAST:event_mnuSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sair();
    }//GEN-LAST:event_formWindowClosing

    private void mnuPesquisarAssociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPesquisarAssociadoActionPerformed
        try {

            AssociadoPesquisa janela = new AssociadoPesquisa(pnlPrincipal);
            this.pnlPrincipal.add(janela);
            janela.setVisible(true);
            centraliza(janela);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_mnuPesquisarAssociadoActionPerformed

    private void mnuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPedidoActionPerformed
        try {

            PedidoCadastro janela = new PedidoCadastro(pnlPrincipal);
            this.pnlPrincipal.add(janela);
            janela.setVisible(true);
            centraliza(janela);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_mnuPedidoActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem mnuAssociadoCadastro;
    private javax.swing.JMenuItem mnuPedido;
    private javax.swing.JMenuItem mnuPesquisarAssociado;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenuItem mnuTipoAssociadoCadastro;
    private javax.swing.JDesktopPane pnlPrincipal;
    // End of variables declaration//GEN-END:variables

    private void sair() {
        int resposta = JOptionPane.showConfirmDialog(null,
                "Confirma a saída do Sistema?", "SysClube",
                JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    //Centraliza os JInternalFrame
    public static void centraliza(JInternalFrame objeto) {
        Dimension d = objeto.getDesktopPane().getSize();
        objeto.setLocation((d.width - objeto.getSize().width) / 2,
                (d.height - objeto.getSize().height) / 2);
    }
}
