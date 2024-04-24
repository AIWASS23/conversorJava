package br.com.alura.oracle.one.marcelodearaujo.perifericos.entrada;

import java.math.BigDecimal;
import java.util.Scanner;

public class Teclado {

    private static final Scanner scanner = new Scanner(System.in);

    private Teclado(){}

    public static void pressioneQualquerTecla () {
        System.out.print("Pressione qualquer tecla para sair ...");
        String s = scanner.nextLine();
    }

    public static int capturaInteiroDigitado() {
        String entrada;
        int quantidadeTentativas = 0;

        do {
            quantidadeTentativas++;

            if (quantidadeTentativas > 1) {
                System.out.println("Insira apenas números inteiros!");
            }

            System.out.print("Digite aqui >>> ");
            entrada = scanner.nextLine();
            System.out.println(" ");
        } while (!Entrada.contemApenasNumerosInteiros(entrada));

        return Integer.parseInt(entrada);
    }

    public static BigDecimal capturaBigDecimalDigitado() {
        String entrada;
        int quantidadeTentativas = 0;

        do {
            quantidadeTentativas++;

            if (quantidadeTentativas > 1) {
                System.out.println("Insira apenas números decimais!");
            }

            System.out.print("Digite aqui >>> ");
            entrada = scanner.nextLine();
            System.out.println(" ");
        } while (!Entrada.contemApenasNumerosBigDecimais(entrada));

        return new BigDecimal (entrada);
    }

}
