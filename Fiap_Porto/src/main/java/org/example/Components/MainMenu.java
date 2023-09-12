package org.example.Components;


import org.example.controller.*;

import java.util.Scanner;



public class MainMenu {
        private ClienteController clietnteController;

        private  Scanner scanner;

        private  EmailController emailController;
        private TelefoneController telefoneController;

        private EnderecoClienteController enderecoClienteController;

        private  ModalController modalController;

        private VeiculoController veiculoController;

       private LocalizacaoVeiculoController localizacaoVeiculoController;

     public MainMenu(){
         this.clietnteController = new ClienteController();
         this.localizacaoVeiculoController = new LocalizacaoVeiculoController();
         this.telefoneController = new TelefoneController();
         this.enderecoClienteController = new EnderecoClienteController();
         this.modalController = new ModalController();
         this.veiculoController = new VeiculoController();
         this.emailController = new EmailController();
         this.scanner = new Scanner(System.in);

     }

    public void exibirMenu(){
        boolean continuar = true;
        while (continuar){
            System.out.println("==== Porto Seguro AUTO-CAR ====");
            System.out.println("1- Inciar uma nova chamada");
            System.out.println("2- Cadastra Modal");
            System.out.println("3- Area veiculo");
            System.out.println("selecione uma das opções: ");


            int opcao = scanner.nextInt();
                    scanner.nextLine();


;           switch (opcao){

                    case 1:
                    clietnteController.indetificacaoClinte();
                    telefoneController.inserirDadosTelefone();
                    emailController.inserirdadaosEmail();
                    enderecoClienteController.inserirenderecoCliente();
                    localizacaoVeiculoController.IncidenteDados();
                    veiculoController.inserirdadosVeiculos();



                        System.out.println("Dados confirmado, modal a caminho " );
                    continuar = false;
                    break;

                    case 2:
                        modalController.cadastroModal();
                        System.out.println("Modal cadastrado");
                        System.out.println("Encerrando...");
                    continuar = false;
                    break;
                    case 3:
                        veiculoController.inserirdadosVeiculos();
                        System.out.println("Veiclo cadastrado");
                        System.out.println("Encerrando...");

                        continuar = false;
                        break;

                    default:
                    System.out.println("digite um numero valido!!!");
            }
        }
    }
}









