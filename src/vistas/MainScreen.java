/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Aluno;
import modelo.DadosAplicacao;
import modelo.Disciplina;

/**
 *
 * @author rubenfilipe
 */
public class MainScreen extends javax.swing.JFrame {

    private DefaultListModel listagem;
    private static int selectedIndex;

    public MainScreen(int selectedIndex) {
        initComponents();
        atualizarDisciplinas();
        calcularMédia();
        this.selectedIndex = selectedIndex;
        lblAluno.setText(DadosAplicacao.getINSTANCE().getAlunos().get(selectedIndex).getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdicionarDisciplina = new javax.swing.JButton();
        btnRemoverDisciplina = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDisciplinas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblAluno = new javax.swing.JLabel();
        btnSelecionarAluno = new javax.swing.JButton();
        lblMedia1 = new javax.swing.JLabel();
        lblMedia2 = new javax.swing.JLabel();
        lblMedia3 = new javax.swing.JLabel();
        lblMediaFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdicionarDisciplina.setText("Adicionar disciplina");
        btnAdicionarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDisciplinaActionPerformed(evt);
            }
        });

        btnRemoverDisciplina.setText("Remover disciplina");
        btnRemoverDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverDisciplinaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstDisciplinas);

        jLabel1.setText("Média 1º ano:");

        jLabel2.setText("Média 2º ano:");

        jLabel3.setText("Média 3º ano:");

        jLabel4.setText("Média final:");

        jLabel9.setText("Aluno:");

        btnSelecionarAluno.setText("Selecionar aluno");
        btnSelecionarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdicionarDisciplina, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRemoverDisciplina, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelecionarAluno))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblMedia1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblMedia2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMediaFinal))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(lblMedia3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lblAluno))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblMedia1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblMedia2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblMedia3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblMediaFinal))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAdicionarDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoverDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelecionarAluno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDisciplinaActionPerformed
        if(lblAluno.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor adicione um aluno");
            throw new IllegalArgumentException();
        }
        AdicionarDisciplina adicionarDisciplina = new AdicionarDisciplina(this, rootPaneCheckingEnabled);
        adicionarDisciplina.setVisible(true);
        atualizarDisciplinas();
        calcularMédia();
    }//GEN-LAST:event_btnAdicionarDisciplinaActionPerformed

    private void btnRemoverDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverDisciplinaActionPerformed

        DefaultListModel model = (DefaultListModel) lstDisciplinas.getModel();
        if(model.size() == 0){
            JOptionPane.showMessageDialog(this, "Por favor adicione primeiro uma disciplina");
        }else{

        if(lstDisciplinas.isSelectionEmpty()){
           JOptionPane.showMessageDialog(this, "Por favor selecione uma disciplina para apagar");
        }
        int selectedIndex = lstDisciplinas.getSelectedIndex();
            model.remove(selectedIndex);

        }
        calcularMédia();
    }//GEN-LAST:event_btnRemoverDisciplinaActionPerformed

    private void btnSelecionarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarAlunoActionPerformed
        SelecionarAluno selecionarAluno = new SelecionarAluno();
        selecionarAluno.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSelecionarAlunoActionPerformed

    private void calcularMédia(){
        float nota1 = 0;
        float media1 = 0;
        int ects1 = 0;
        float nota2 =0;
        float media2 = 0;
        int ects2 = 0;
        float nota3 = 0;
        float media3 = 0;
        int ects3 = 0;
        float nota = 0;
        float media = 0;
        int ects = 0;

        for (Disciplina d : DadosAplicacao.getINSTANCE().getDisciplinas()) {
             if(d.getAno()==1){
                ects1+=d.getEcts();
                nota1 += d.getNota()*d.getEcts();
             }else if(d.getAno() == 2){
                nota2+=d.getNota()*d.getEcts();
                ects2 +=d.getEcts();
             }else{
                nota3+=d.getNota()*d.getEcts();
                ects3+=d.getEcts();
             }
         }
        nota = nota1+nota2+nota3;
        media = media1+media2+media3;
        ects = ects1+ects2+ects3;

        if(ects1!=0){
            media1 = (nota1)/ects1;
        }
        if(ects2 !=0){
            media2 = (nota2)/ects2;
        }
        if(ects3!=0){
            media3= (nota3)/ects3;

        }
        if(ects != 0){
            media = (nota)/ects;
        }

        lblMedia1.setText(Float.toString(media1));
        lblMedia2.setText(Float.toString(media2));
        lblMedia3.setText(Float.toString(media3));
        lblMediaFinal.setText(Float.toString(media));
    }

    public void atualizarDisciplinas(){
        listagem = new DefaultListModel();

        for (Disciplina d : DadosAplicacao.getINSTANCE().getDisciplinas()) {
            listagem.addElement(d);
        }
        lstDisciplinas.setModel(listagem);
    }
    
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen(selectedIndex).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarDisciplina;
    private javax.swing.JButton btnRemoverDisciplina;
    private javax.swing.JButton btnSelecionarAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblMedia1;
    private javax.swing.JLabel lblMedia2;
    private javax.swing.JLabel lblMedia3;
    private javax.swing.JLabel lblMediaFinal;
    private javax.swing.JList<Disciplina> lstDisciplinas;
    // End of variables declaration//GEN-END:variables
}
