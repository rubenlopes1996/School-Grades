/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rubenfilipe
 */
public class DadosAplicacao implements Serializable{
    private static final DadosAplicacao INSTANCE = new DadosAplicacao();
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Aluno> alunos;
    private float media;
    private float media1;
    private float media2;
    private float media3;

    public DadosAplicacao() {
        this.disciplinas = new ArrayList<>();
        this.alunos = new ArrayList<>();    
        lerDadosDoFicheiro();
    }

    public static DadosAplicacao getINSTANCE() {
        return INSTANCE;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
        gravarDados();
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
        gravarDados();
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    private void gravarDados() {                                               
       
        try {
            ObjectOutputStream oos = null;
            File f = new File(System.getProperty("user.home") + File.separator+"NotasEscola");
            oos = new ObjectOutputStream(new FileOutputStream(f));
            
            oos.writeObject(DadosAplicacao.getINSTANCE().getAlunos());
            oos.writeObject(DadosAplicacao.getINSTANCE().getDisciplinas());
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(DadosAplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    
    private void lerDadosDoFicheiro() {
        ObjectInputStream ois = null;
        File f = new File(System.getProperty("user.home")+File.separator+"NotasEscola");
        if (f.canRead()) {
            try {
                ois = new ObjectInputStream(new FileInputStream(f));
                
                setAlunos((ArrayList<Aluno>) ois.readObject());
                setDisciplinas((ArrayList<Disciplina>) ois.readObject());
                
                ois.close();
            } catch (IOException ex) {
              Logger.getLogger(DadosAplicacao.class.getName()).log(Level.SEVERE, null, ex);  
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DadosAplicacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
