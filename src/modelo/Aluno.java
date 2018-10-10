/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author rubenfilipe
 */
public class Aluno implements Serializable{
    
    private String nome;
    private int numero;
    private Data data;
    private String curso;

    public Aluno(String nome, int numero, Data data, String curso) {
        this.nome = nome;
        
        if(numero < 1000000 || numero > 3000000){
            throw new IllegalArgumentException("2");
        }
        this.numero = numero;
        
        this.data = data;
 
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Data getData() {
        return data;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return nome + " " + numero + ", nasceu a " + data + " - " + curso;
    }
    
    
    
}
