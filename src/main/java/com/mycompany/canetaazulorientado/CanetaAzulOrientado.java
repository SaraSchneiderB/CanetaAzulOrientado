package com.mycompany.canetaazulorientado;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aluno
 *
 * Classe: CanetaAzul
 *
 * ATRIBUTOS Marca: caracter - String - bic Cor: caracter - string = Double -
 * azul ponta - numero real - Double - 2.0 Carga: número inteiro - Int - 50
 * Tampa: atributo lógico = boolean (true/false) - false
 *
 *
 *
 * METODO escrever rabiscar pintar tampar destampar
 *
 * metodo rabiscar(); MÉTODO SEMPRE VAI TER O () se (tampada) entao escrever
 * (ERRO) senão escrever (RABISCAR) fimSE{} fimMetodo {}
 *
 *
 * metodo tampar()
 *
 * ESTADO tampada 50
 *
 * tampada = verdadeiro (true) fimMetodo {} fimClasse {}
 *
 * OBJETO - UMA CANETA CLASSE - FORMA/MOLDE
 *
 * instanciamento = gerar um objeto a partir de uma classe: c1 = new caneta; (o
 * que vem antes do new é o objeto que vai existir na classe; depois do new é a
 * classe que vou utilizar)
 *
 * c1.cor = azul (o atributo cor do objeto c1, está recebendo "azul"
 *
 * c1.ponta = 0.5; (o atributo ponta c1, está recebendo "0.5"
 *
 * c1.tampada = false (então está destampada)
 *
 *
 * para poder rabiscar com a caneta, precisamos chamar um MÉTODO, que é o
 * comportamento da caneta
 *
 * c1.escrever();
 *
 * c2 = new.caneta (para "fazer" outra caneta) que pode ter novos atributos:
 * c2.cor = preto; c2.ponta = 1.0; c2.tampada = true;
 *
 * método para escrever com a caneta: c2.destampar();
 *
 *
 */
public class CanetaAzulOrientado {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        System.out.print("Digite a marca da caneta: ");
        String marcaC1 = teclado.nextLine();
        System.out.print("Digite a cor da caneta: ");
        String corC1 = teclado.nextLine();
        System.out.print("Digite a espessura da ponta da caneta: ");
        double pontaC1 = teclado2.nextDouble();
        System.out.print("Digite a quantidade de carga da caneta: ");
        int cargaC1 = teclado2.nextInt();

        Caneta c1 = new Caneta();
        c1.cor = corC1;
        c1.ponta = pontaC1;
        c1.carga = cargaC1;
        c1.marca = marcaC1;

        boolean respostaTampada = c1.perguntarTampada();
        c1.tampada = respostaTampada;

        c1.estado();
        c1.escrever();

        /*Caneta c2 = new Caneta();
        c2.marca = "Pentel";
        c2.cor = "Preta";
        c2.ponta = 0.7;
        c2.carga = 75;
        c2.destampar();
        c2.estado();
        c2.escrever();*/
    }
}
