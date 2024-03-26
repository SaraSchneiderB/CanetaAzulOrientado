package com.mycompany.canetaazulorientado;

import java.util.Scanner;

public class Caneta {

    String marca;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void estado() {
        System.out.println("Informações da caneta: \n");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ela está tampada? " + (this.tampada ? "Sim" : "Não"));
    }

    void escrever() {
        if (this.tampada == true) {
            System.out.println("Está tampada. Não pode escrever!\n");
        } else {
            System.out.println("\nEstá destampada. Agora pode escrever!");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    boolean perguntarTampada() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A caneta está tampada? (Sim/Não)");
        String resposta = teclado.nextLine().toLowerCase();

        if (resposta.equals("sim")) {
            return true;
        } else if (resposta.equals("não") || (resposta.equals("nao"))) {
            return false;
        } else {
            System.out.println("Resposta inválida! Por favor digite 'sim' ou 'não'.");
            return perguntarTampada();
        }

    }
}
