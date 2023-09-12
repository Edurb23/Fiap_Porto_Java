package org.example.controller;

import org.example.Modal.Email;

import java.util.Scanner;

public class EmailController {

    private Scanner scanner;

    public EmailController(){
        this.scanner = new Scanner(System.in);
    }


    public boolean validarEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public void inserirdadaosEmail() {
        System.out.println("==== Dados Email ====");

        String email;

        // Solicitar um endereço de e-mail válido
        while (true) {
            System.out.println("Insira o endereço de email: ");
            email = scanner.nextLine();

            // Validação do endereço de e-mail
            if (validarEmail(email)) {
                break; // Sai do loop se o e-mail for válido
            } else {
                System.out.println("O endereço de email inserido não é válido. Tente novamente.");
            }
        }


        System.out.println("Insira o tipo de email EX(pessoal,trabalho, outros): ");
        String tipoEmail = scanner.nextLine();
        System.out.println("Status email : ");
        String statusEmail = scanner.nextLine();


        Email dadosEmail = new Email();
        dadosEmail.setEmail(email);
        dadosEmail.setTipoEmail(tipoEmail);
        dadosEmail.setStatusEmail(statusEmail);

        System.out.println("Email do cliente:" + " " + dadosEmail.getEmail() + " " + "Tipo do email: " + dadosEmail.getStatusEmail() + " " + "Status email:" + dadosEmail.getStatusEmail());


    }
}
