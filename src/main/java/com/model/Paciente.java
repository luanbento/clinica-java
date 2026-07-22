/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author Luan Silva Bento
 */
public class Paciente extends Pessoa{
    private String convenio;
    
    public Paciente(String nome, int idade, String cpf, String convenio){
        super(nome, idade, cpf);
        this.convenio = convenio;
    } 
    public String getConvenio(){
        return convenio;
    }
    public void setConvenio(String convenio){
        this.convenio = convenio;
    }
    public void exibirPaciente(){
        System.out.println("Paciente: "+ getNome() + "Convenio: " + convenio);
    }
}
