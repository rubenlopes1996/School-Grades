/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author rubenfilipe
 */
public class Disciplina implements Serializable{
    
    private String nome;
    private int ano;
    private int semestre;
    private int ects;
    private int nota;

    public Disciplina(String nome, int ano, int semestre, int ects, int nota) {
        this.nome = nome;
        if(ano < 1 || ano >5){
            throw new IllegalArgumentException("7");
        }
        this.ano = ano;
        
        if(semestre < 1 || semestre > 2){
            throw new IllegalArgumentException("8");

        }
        this.semestre = semestre;
        
        if (ects < 0) {
            throw new IllegalArgumentException("9");

        }
        this.ects = ects;
        
        if(nota < 0 || nota > 20){
            throw new IllegalArgumentException("10");
            
        }
        this.nota = nota;
    }
    
     @Override
    public String toString() {
        return nome +" "+ ano +"º ano "+semestre+"º semestre " + "- " + ects + " Ects " + nota +" valores"; 
    }
    
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getEcts() {
        return ects;
    }

    public int getNota() {
        return nota;
    }

   
    
    
}
