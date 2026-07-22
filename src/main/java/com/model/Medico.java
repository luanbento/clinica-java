/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;
// @author Luan Silva Bento
public class Medico extends Pessoa {
    private String especialidade;
    private String crm;
    
    public Medico(String nome, int idade, String cpf, String especialidade, String crm){
        super(nome, idade, cpf);
        this.especialidade = especialidade;
        this.crm = crm;
    }
    public String getEspecialidade(){
        return especialidade;       
    }
    public String getCrm(){
        return crm;       
    }
    public void SetEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public void SetCrm(String crm){
        this.crm = crm;
    }
    public void exibirMedico(){
        System.out.println("Doutor: " + getNome() + "Especialidade: "+ especialidade);
    }
}
