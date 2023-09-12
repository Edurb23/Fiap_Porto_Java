package org.example.controller;

import org.example.Modal.Endereco;

import java.util.Scanner;

public class EnderecoClienteController {

    private Scanner scanner;

    public EnderecoClienteController() {
        this.scanner = new Scanner(System.in);
    }

    public void inserirenderecoCliente(){

        System.out.println("======= Endereço Cliente ======");

        // Scanner para adiconar os dados
        System.out.println("Insira nome da rua do cliente: ");
        String enderecoRua = scanner.nextLine();
        System.out.println("Insira o numero da residencia do cliente: ");
        int numeroenderecoRua = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira o complemento : ");
        String endrecoComplemento = scanner.nextLine();
        System.out.println("Insira o nome do bairro:");
        String nomeBairro = scanner.nextLine();
        System.out.println("Insira a zona do bairro:");
        String zonaBairro = scanner.nextLine();
        System.out.println("Insira o Nome do cidade aonde o cliente reside : ");
        String cidadeNome = scanner.nextLine();
        System.out.println("DDD do estado: ");
        int cidadeDDD = Integer.parseInt(scanner.nextLine());
        System.out.println("codgio IBGE: ");
        int cidadeIbge = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira o Nome do estado aonde o cliente reside : ");
        String estadoNome = scanner.nextLine();
        System.out.println("Sigla do estado: ");
        String estadoSigla = scanner.nextLine();
        System.out.println("Nome do logradouro: ");
        String nomeLogradouro = scanner.nextLine();
        System.out.println("Numero do logradouro: ");
        int numeroLogradouro = Integer.parseInt(scanner.nextLine());


        Endereco dadosEndereco = new Endereco();
        dadosEndereco.setRua(enderecoRua);
        dadosEndereco.setNumeroResidencia(numeroenderecoRua);
        dadosEndereco.setComplemento(endrecoComplemento);
        dadosEndereco.setNomeBairro(nomeBairro);
        dadosEndereco.setNomeZonaBaiiro(zonaBairro);
        dadosEndereco.setNomeCidade(cidadeNome);
        dadosEndereco.setDDD(cidadeDDD);
        dadosEndereco.setCodigoIbg(cidadeIbge);
        dadosEndereco.setNomeEstado(estadoNome);
        dadosEndereco.setSiglaEstado(estadoSigla);
        dadosEndereco.setNomeLogradouro(nomeLogradouro);
        dadosEndereco.setNumeroLogradouro(numeroLogradouro);


        System.out.println("Dados do endereço:" + " " + dadosEndereco.getRua() + " " + "numero residencia:" + dadosEndereco.getNumeroResidencia() + " " +
                            "complemento" + dadosEndereco.getComplemento() + " " + "Bairro:" + dadosEndereco.getNomeBairro() + " " + dadosEndereco.getNomeZonaBaiiro()
                            + " " + "Cidade:" + dadosEndereco.getNomeCidade() + " " + "DDD:" + dadosEndereco.getDDD() + " " + "Codigo do IBGE:" + dadosEndereco.getCodigoIbg()
                            + " " + "Estado" + dadosEndereco.getNomeEstado() + " " + dadosEndereco.getSiglaEstado() + " " + "Logradouro:" + dadosEndereco.getNomeLogradouro() + " " + dadosEndereco.getNumeroLogradouro() );





    }
}
