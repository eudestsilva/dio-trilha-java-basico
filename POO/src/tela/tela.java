package tela;

import java.util.Scanner;

import equipamento.Equipamento;

public class tela {
    public static void main(String[] args) throws Exception {
        Equipamento equipamento = new Equipamento();
        System.out.println("Opções:");
        System.out.println("1. Abrir reprodutor");
        System.out.println("2. Abrir telefone");
        System.out.println("3. Abrir navegador");
        Scanner terminal = new Scanner(System.in);
        int option = terminal.nextInt();
        switch (option) {
            case 1:
                equipamento.selecionarMusica();
                equipamento.tocar();
                equipamento.pausar();
                break;
            case 2:
                equipamento.atender();
                equipamento.ligar();
                equipamento.iniciarCorreioVoz();
                break;
            case 3:
                equipamento.exibirPagina();
                equipamento.atualizarPagina();
                equipamento.adicionarNovaAba();
                break;
           
        }

    }
}

