package br.com.alura.oracle.one.marcelodearaujo.visual;

import br.com.alura.oracle.one.marcelodearaujo.perifericos.entrada.Teclado;

import java.math.BigDecimal;

public class Menus {

    private Menus () {}

    public static int obterOpcoesMenuPrincipal () {
        System.out.println("0 - Sair");
        System.out.println("1 - Converter Real para Dólar Americano");
        System.out.println("2 - Converter Real para Euro");
        System.out.println("3 - Converter Real para Iene Japonês");
        System.out.println("4 - Converter Dólar Americano para Real");
        System.out.println("5 - Converter Dólar Americano para Euro");
        System.out.println("6 - Converter Dólar Americano para Iene Japonês");
        System.out.println("7 - Converter Euro para Real");
        System.out.println("8 - Converter Euro para Dólar Americano");
        System.out.println("9 - Converter Euro para Iene Japonês");
        System.out.println("10 - Converter Iene Japonês para Real");
        System.out.println("11 - Converter Iene Japonês para Dólar Americano");
        System.out.println("12 - Converter Iene Japonês para Euro");
        return Teclado.capturaInteiroDigitado();

    }

    public static BigDecimal obterQuantidadeMoedaBase (){
        System.out.println("Insira o valor que deseja converter");
        return Teclado.capturaBigDecimalDigitado();
    }

}
