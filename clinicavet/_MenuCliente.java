package com.poo.projetoaplicado.clinicavet;

import java.util.Scanner;

public class _MenuCliente {
    public static void menuCliente(){

    int opcaoCliente;
    Scanner sc = new Scanner(System.in);

    // Ambiente virtual de clientes da clinica vet
    // boas vindas FULANO
    // Menu:
    // agendar consulta
    // histórico de prontuários dos seus pets

        do{
            System.out.println("\n============================");
            System.out.println("||       CLINICA VET      ||");
            System.out.println("============================");
            System.out.println("[1] VER AGENDAMENTO" + 
                               "[2] HISTÓRICO DE PRONTUÁRIOS DO SEU PET" + 
                               "[0] SAIR");
            System.out.println("");
            opcaoCliente = sc.nextInt();
            switch (opcaoCliente) {
                case 1:
                System.out.println("A sua consulta foi agendada para o dia :");
                Consulta.analisarStatusConsulta(null, null);
                    break;
                case 2:
                    //historico
                    break;
                default:
                    break;
            }   
        switch (opcaoCliente) {
            case 1:
               
                
                break;
            case 2:
                //historico

                break;
        


            default:
                break;
        }
        }while(opcaoCliente!=0);
    }
}