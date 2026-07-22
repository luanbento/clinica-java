/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view;

/**
 *
 * @author Luan Silva Bento
 */
import com.model.Medico;
import com.model.Paciente;
import com.model.Consulta;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final ArrayList<Medico> medicos = new ArrayList<>();
    private final ArrayList<Paciente> pacientes = new ArrayList<>();
    private final ArrayList<Consulta> consultas = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);
    
    public void exibirMenu(){
        int opcao;
        
        do {
            System.out.println("MENU CLINICA");
            System.out.println("1 - Cadastrar Médico");
            System.out.println("2 - Cadastrar Paciente");
            System.out.println("3 - Agendar Consulta");
            System.out.println("4 - Listar Consultas");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao){
                case 1:
                    cadastrarMedico();
                    break;
                case 2:
                    cadastrarPaciente();
                    break;
                case 3:
                    agendarConsulta();
                    break;
                case 4:
                    listarConsultas();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 0);
    }
    private void cadastrarMedico(){
        System.out.println("Nome do médico: ");
        String nome = sc.nextLine();
        
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        
        System.out.println("CPF: ");
        String cpf = sc.nextLine();
        
        System.out.println("Especialidade: ");
        String especialidade = sc.nextLine();
        
        System.out.println("CRM: ");
        String crm = sc.nextLine();
        
        medicos.add(new Medico(nome, idade, cpf, especialidade, crm));
        System.out.println("Médico cadastrado com sucesso!");             
    }
    private void  cadastrarPaciente(){
        System.out.println("Nome do paciente: ");
        String nome = sc.nextLine();
        
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        
        System.out.println("CPF: ");
        String cpf = sc.nextLine();
        
        System.out.println("Convênio: ");
        String convenio = sc.nextLine();
        
        pacientes.add(new Paciente(nome, idade, cpf, convenio));
        System.out.println("Paciente cadastrado com sucesso!");
    }
    private void agendarConsulta(){
        if (medicos.isEmpty()|| pacientes.isEmpty()){
            System.out.println("Cadastrar médicos e pacientes antes.");
            return;
        }
        System.out.println("Selecione o paciente:");
        for (int i = 0; i < pacientes.size();i++){
            System.out.println(i + " - " + pacientes.get(i).getNome());
        }
        int p = sc.nextInt();
        
        System.out.println("Selecione o médico: ");
        for (int i = 0;i < medicos.size(); i++){
            System.out.println(i +" - " + medicos.get(i).getNome());
        }
        int m = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Data da consulta: ");
        String data = sc.nextLine();
        
        System.out.println("Horário: ");
        String hora = sc.nextLine();
        
        consultas.add(new Consulta(medicos.get(m), pacientes.get(p), data, hora));
        System.out.println("Consulta agendada com sucesso!");  
    }
    private void  listarConsultas(){
        for (Consulta consulta : consultas){
            consulta.exibirConsulta();
            System.out.println("Fim");
        }
    }
}
