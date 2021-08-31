package codigos;


import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 */
public class resultado extends javax.swing.JFrame {

    /**
     * Creates new form resultado
     */
    public resultado() throws IOException {
        initComponents();
        Color fundo = new Color(253,236,166);
        getContentPane().setBackground(fundo);
        Arquivo2();
    }
    public void Arquivo2() throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader("pesquisa_resultado.txt"));
        String titulo2[] = new String[1000];
        String autor2[] = new String[1000];
        String genero2[] = new String[1000];
        String anodolivro2[] = new String[1000];
        String editora2[] = new String[1000];  
        int status2[] = new int[1000]; 
        
        try {
            int q= 0;
            String linha;
            
            while(fr.ready()){
                linha = fr.readLine();
                String[] campos = linha.split(";");
                titulo2[q] = campos[0];
                anodolivro2[q] = campos[1];
                editora2[q] = campos[2];
                autor2[q] = campos[3];
                genero2[q] = campos[4];
                status2[q] = Integer.parseInt(campos[5]);
                
                if(status2[q] == 1){
                    DefaultTableModel teste = (DefaultTableModel) tabela_resultado.getModel();
                    Object[] dados = {titulo2[q],anodolivro2[q],editora2[q],autor2[q],genero2[q],"Disponivel"};
                    teste.addRow(dados);
                } else{
                    DefaultTableModel teste = (DefaultTableModel) tabela_resultado.getModel();
                    Object[] dados = {titulo2[q],anodolivro2[q],editora2[q],autor2[q],genero2[q],"Indisponivel"};
                    teste.addRow(dados);
                }
                q++;
            }
            
            
            fr.close();
        
        }catch (IOException e){
            System.out.println("Erro na leitura do arquivo.");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_resultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Chá da Tarde");
        setResizable(false);

        jLabel2.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        voltar.setBackground(new java.awt.Color(255, 255, 153));
        voltar.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel1.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel4.setFont(new java.awt.Font("Impact", 0, 50)); // NOI18N
        jLabel4.setText("Resultado");

        jPanel1.setBackground(new java.awt.Color(253, 236, 166));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tabela_resultado.setBackground(new java.awt.Color(255, 255, 153));
        tabela_resultado.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        tabela_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Ano ", "Editora", "Autor", "Genero", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_resultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_resultadoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabela_resultadoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_resultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jScrollPane1)
                    .addGap(7, 7, 7)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(voltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 218, Short.MAX_VALUE)
                        .addComponent(voltar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(778, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        pesquisarLivro frame1 = new pesquisarLivro();
        frame1.setVisible(rootPaneCheckingEnabled);
        resultado.this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarActionPerformed

    private void tabela_resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_resultadoMouseClicked
        String titulo2, autor2, genero2,anodolivro2, editora2,status2;
        
        titulo2 = (String) tabela_resultado.getValueAt(tabela_resultado.getSelectedRow(), 0);
        anodolivro2 = (String) tabela_resultado.getValueAt(tabela_resultado.getSelectedRow(), 1);
        editora2 = (String) tabela_resultado.getValueAt(tabela_resultado.getSelectedRow(), 2);
        autor2 = (String) tabela_resultado.getValueAt(tabela_resultado.getSelectedRow(), 3);
        genero2 = (String) tabela_resultado.getValueAt(tabela_resultado.getSelectedRow(), 4);
        status2 = (String) tabela_resultado.getValueAt(tabela_resultado.getSelectedRow(), 5);
        
        BufferedWriter fw;          
        try {
            fw = new BufferedWriter(new FileWriter("pesquisa_resultadoE.txt"));
            PrintWriter pw = new PrintWriter (fw);
            pw.println(titulo2+";"+anodolivro2+";"+editora2+";"+autor2+";"+genero2+";"+status2+";0");
            fw.close();
            
            resultadoLivro frame1 = new resultadoLivro();
            frame1.setVisible(rootPaneCheckingEnabled);
            resultado.this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(pesquisarLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_resultadoMouseClicked

    private void tabela_resultadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_resultadoMouseReleased
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_resultadoMouseReleased

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
            java.util.logging.Logger.getLogger(resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new resultado().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(resultado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_resultado;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}