package org.example.controller;

import org.example.Modal.Modal;

import java.util.Scanner;

public class ModalController {

    private Scanner scanner;


    public ModalController() {
        this.scanner = new Scanner(System.in);
    }

    public void cadastroModal(){
        System.out.println("======= Dados Modal ====");

        // Scanner para adiconar os dados
        System.out.println("Insira o tipo de Modal: ");
        String tipoModal = scanner.nextLine();
        System.out.println("Insira o combustível do modal: ");
        String combustivelModal = scanner.nextLine();
        System.out.println("Insira o tamanho do modal (em metros): ");
        int tamanhoModal = Integer.parseInt(scanner.nextLine());

        int pesoModal;
        do {
            System.out.println("Insira o peso do modal (em toneladas): ");
            pesoModal = Integer.parseInt(scanner.nextLine());

        } while (pesoModal <= 0 || pesoModal > 300);




        System.out.println("Insira a placa do modal: ");
        String placaModal = scanner.nextLine();

        Modal dadosModal = new Modal();
        dadosModal.setTipoModal(tipoModal);
        dadosModal.setCombustivel(combustivelModal);
        dadosModal.setTamanhoVeiculo(tamanhoModal);
        dadosModal.setPesoVeiculo(pesoModal);
        dadosModal.setPlacaVeiculo(placaModal);

        System.out.println("Dados modal: " + " " + " Tipo: " +  dadosModal.getTipoModal() + " " + " Combustivel: " + dadosModal.getCombustivel() + " " + " Tamanho: " + dadosModal.getTamanhoVeiculo() + "metros" + " " + " Peso: " +  dadosModal.getPesoVeiculo() + "toneladas " + " " + " placa: " + dadosModal.getPlacaVeiculo());
    }
}
