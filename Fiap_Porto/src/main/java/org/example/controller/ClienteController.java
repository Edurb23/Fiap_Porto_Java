package org.example.controller;

import org.example.Modal.Cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ClienteController {

        private Scanner scanner;

        public ClienteController(){
            this.scanner = new Scanner(System.in);
        }

        public void indetificacaoClinte(){
            System.out.println("======= Dados Pessoal do Cliente ======");

            // Scanner para adiconar os dados
            System.out.println("Insira o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.println("Insira o  CPF do cliente: ");
            String cpf = scanner.nextLine();
            System.out.println("Insira o CHN do cliente : ");
            String chn = scanner.nextLine();
            System.out.println("Insira o RG do cliente : ");
            String rg = scanner.nextLine();
            System.out.println("Data de nascimento cliente: ");
            String datanascimento = scanner.nextLine();
            System.out.println("Data de cadastro: ");
            String datacadastro = scanner.nextLine();










            Cliente dadosCliente = new Cliente();
            dadosCliente.setNome(nome);
            dadosCliente.setCPF(cpf);
            dadosCliente.setCHN(chn);
            dadosCliente.setRg(rg);
            dadosCliente.setDataNacimento(datanascimento);
            dadosCliente.setDataCadastro(datacadastro);


            System.out.println("Dados do cliente:" + " " +
                    "Nome:"  + " " + dadosCliente.getNome() + " " +
                    "CPF:"  + " " +   dadosCliente.getCPF() + " " +
                    "CNH:"  + " " +  dadosCliente.getCHN() + " " +
                    "RG:"  + " " +  dadosCliente.getRg() +  " " +
                    "DATA DE NASCIMENTO:"  + " " +  dadosCliente.getDataNacimento()
            );

            System.out.println("Data do cadastro: " + " " +  dadosCliente.getDataCadastro());


        }
}







