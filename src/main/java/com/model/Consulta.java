/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;
 // @author Luan Silva Bento
public class Consulta {
    private final Medico medico;
    private final Paciente paciente;
    private final String data;
    private final String hora;
    
    public Consulta(Medico medico, Paciente paciente, String data, String hora){
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.hora = hora;
    }
    public void exibirConsulta(){
        System.out.println("Consulta Agendada:");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Especialidade: " + medico.getEspecialidade());
        System.out.println("Data: " + data);
        System.out.println("Horario: " + hora);
    }
}
