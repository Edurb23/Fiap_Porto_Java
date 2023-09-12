package org.example.controller;

import org.example.Modal.Veiculos;

import java.util.Scanner;

public class VeiculoController {

    private Scanner scanner;

    public VeiculoController(){
        this.scanner = new Scanner(System.in);
    }

    public void inserirdadosVeiculos(){
        boolean continuar = true;
        while (continuar){
            System.out.println("======= Dados Veiculo ======");
            System.out.println("1- Veiculo da chamada");
            System.out.println("2- Cadastra novo veiculo");

            int opcao = scanner.nextInt();
                scanner.nextLine();


              switch (opcao) {

                  case 1:
                      System.out.println("Qual o tipe de chassi:");
                      System.out.println("1- Chassis de motorhome");
                      System.out.println("2- Chassis de caminhão:");
                      System.out.println("3- Chassis de ônibus");

                      int chassi = scanner.nextInt();

                      switch (chassi){
                          case 1:
                              System.out.println("O modal para motorhome selecionado");
                              continuar = false;
                              break;
                          case 2:
                              System.out.println("O modal para caminhão selecionado");
                              continuar = false;
                              break;
                          case 3:
                              System.out.println("O modal para ônibus selecionado");
                              continuar = false;
                              break;
                      }
                      continuar = false;
                      break;
                  case 2:
                      System.out.println("====== Cadastro de veiculo =====");

                      System.out.println("Insira o tipo de chassi: ");
                      String chassiCarro = scanner.nextLine();
                      System.out.println("Insira a Ultilidade do Veiculo: ");
                      String ultilidadeVeiculo = scanner.nextLine();
                      System.out.println("Insira o peso do veiculo: ");
                      int pesoVeiculo = Integer.parseInt(scanner.nextLine());
                      System.out.println("Insira o tamnho do veiculo: ");
                      int tamanhoVeiculo = Integer.parseInt(scanner.nextLine());
                      System.out.println("Insira a Placa do veiculo: ");
                      String placaVeiculo = scanner.nextLine();

                      if(pesoVeiculo == 0 || pesoVeiculo > 50000 ){
                          System.out.println("Peso do veiculo inserido foi invaldio :");

                      }


                      Veiculos veiculosCliente = new Veiculos();
                      veiculosCliente.setChassi(chassiCarro);
                      veiculosCliente.setUltilidadeVeiculo(ultilidadeVeiculo);
                      veiculosCliente.setPesoVeiculo(pesoVeiculo);
                      veiculosCliente.setTamanhoVeiculo(tamanhoVeiculo);
                      veiculosCliente.setPlacaVeiculo(placaVeiculo);
                      continuar = false;
                        System.out.println("Cadastro do novo veiculo: " + " " + "Chassi:"  +" "+ veiculosCliente.getChassi() + " " + "Ultilidade do Veiculo:" + veiculosCliente.getUltilidadeVeiculo()
                                               + " " + "Tamanho e peso do veiculo:" + veiculosCliente.getTamanhoVeiculo() + "metros" + " " + veiculosCliente.getPesoVeiculo() + "toneldas"
                                                + " " + "Placa do veiculo" + " " + veiculosCliente.getPlacaVeiculo() );
                      break;

                        default:
                      System.out.println("digite um numero valido!!!");

              }


        }


    }

}
