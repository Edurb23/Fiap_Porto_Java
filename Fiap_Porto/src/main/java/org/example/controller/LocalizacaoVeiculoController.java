package org.example.controller;

import org.example.Modal.LocalizacaoVeiculo;

import java.util.Scanner;

public class LocalizacaoVeiculoController {

    private Scanner scanner;

    public LocalizacaoVeiculoController(){
        this.scanner = new Scanner(System.in);
    }

    public void IncidenteDados(){
        System.out.println("======= Dados do Incidente ======");

        // Scanner para adiconar os dados
        System.out.println("Nome da Rua aonde aconteceu o incedente: ");
        String nomeRua = scanner.nextLine();
        System.out.println("numero da rua aonde aconteceu o incedente: ");
        int numerRua = Integer.parseInt(scanner.nextLine());
        System.out.println("numero do cep aonde aconteceu o incedente: ");
        int cepRua = Integer.parseInt(scanner.nextLine());
        System.out.println("numero do bairro aonde aconteceu o incedente: ");
        String nomeBairro = scanner.nextLine();
        System.out.println("Ponto de referencia aonde aconteceu o incedente:");
        String pontoRefrencia = scanner.nextLine();




        LocalizacaoVeiculo dadosIncidente = new LocalizacaoVeiculo();
        dadosIncidente.setNomeRuaVeiculo(nomeRua);
        dadosIncidente.setNomeBairoVeiculo(nomeBairro);
        dadosIncidente.setNumeroCepVeiculo(numerRua);
        dadosIncidente.setNumeroRuaVeiculo(cepRua);
        dadosIncidente.setPontoRefencia(pontoRefrencia);


        System.out.println("Dados do incidente:" + " " + "Nome da rua:" + dadosIncidente.getNomeRuaVeiculo() + " " + dadosIncidente.getNumeroRuaVeiculo() +  " " + "Bairro:" + dadosIncidente.getNomeBairoVeiculo()
                               + " " + "Cep:" + dadosIncidente.getNumeroCepVeiculo() + "" + "Ponto de referencia" + dadosIncidente.getPontoRefencia() );






    }
}
