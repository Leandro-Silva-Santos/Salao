/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author leand
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Servico servico = new Servico(1, "corte", 20);
        System.out.println(servico);
        
        Cliente cliente = new Cliente(1, "leandro", "rua turim 20", "06512"); 
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "jorge", "1234");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 20, "24/08/2021 09:15");
        System.out.println(agendamento.getCliente().getNome());
    }
         
}
