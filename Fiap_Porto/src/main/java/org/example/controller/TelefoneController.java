package org.example.controller;

import org.example.Modal.Telefone;

import java.util.Scanner;

public class TelefoneController {

    private Scanner scanner;

    public TelefoneController() {
        this.scanner = new Scanner(System.in);
    }

    public boolean validarTelefone(String telefone) {
        // Remove todos os caracteres que não sejam dígitos
        String numeros = telefone.replaceAll("[^0-9]", "");

        // Verifica se o número de telefone tem pelo menos 10 dígitos
        return numeros.length() >= 9;
    }

    public void inserirDadosTelefone(){
        System.out.println("===== Dados Telefone =====");

        int telefoneNumero;


        System.out.println("Digte o DDI do telefone: ");
        int ddi = Integer.parseInt(scanner.nextLine());
        System.out.println("Dite o DDD do telefone: ");
        int ddd = Integer.parseInt(scanner.nextLine());

        do {
            System.out.println("Digite seu numero de telefone: ");
            telefoneNumero = Integer.parseInt(scanner.nextLine());

            if (!validarTelefone(String.valueOf(telefoneNumero))) {
                System.out.println("Número de telefone inválido. Por favor, insira um número válido com pelo menos 9 dígitos.");
            }
        } while (!validarTelefone(String.valueOf(telefoneNumero)));

        System.out.println("Digite a operadora celular: ");
        String operadoraCel = scanner.nextLine();


        Telefone dadosTelefone = new Telefone();
        dadosTelefone.setNumeroTelefone(telefoneNumero);
        dadosTelefone.setDDI(ddi);
        dadosTelefone.setDDD(ddd);
        dadosTelefone.setOperadora(operadoraCel);



        System.out.println("Dados do telefone do cliente: " + " " + dadosTelefone.getDDI() + " " + dadosTelefone.getDDD() + " " + dadosTelefone.getNumeroTelefone());
        System.out.println("Operadora celular: " + " " + dadosTelefone.getOperadora());



}




}
