package br.com.alura.oracle.one.marcelodearaujo.decodificador;

import br.com.alura.oracle.one.marcelodearaujo.perifericos.entrada.Teclado;

public class Decodificador {

    private Decodificador(){}

    public static String [] decodificaMoedasDasOpcaoesDoMenu(int opcao){
        String [] keyValue = new String[2];

        switch (opcao){
            case 0:
                System.out.println("Obrigado por usar o conversor de moedas!");
                Teclado.pressioneQualquerTecla();
                break;
            case 1:
                keyValue[0] = "BRL";
                keyValue[1] = "USD";
                break;
            case 2:
                keyValue[0] = "BRL";
                keyValue[1] = "EUR";
                break;
            case 3:
                keyValue[0] = "BRL";
                keyValue[1] = "JPY";
                break;
            case 4:
                keyValue[0] = "USD";
                keyValue[1] = "BRL";
                break;
            case 5:
                keyValue[0] = "USD";
                keyValue[1] = "EUR";
                break;
            case 6:
                keyValue[0] = "USD";
                keyValue[1] = "JPY";
                break;
            case 7:
                keyValue[0] = "EUR";
                keyValue[1] = "BRL";
                break;
            case 8:
                keyValue[0] = "EUR";
                keyValue[1] = "USD";
                break;
            case 9:
                keyValue[0] = "EUR";
                keyValue[1] = "JPY";
                break;
            case 10:
                keyValue[0] = "JPY";
                keyValue[1] = "BRL";
                break;
            case 11:
                keyValue[0] = "JPY";
                keyValue[1] = "USD";
                break;
            case 12:
                keyValue[0] = "JPY";
                keyValue[1] = "EUR";
                break;
            default:
                System.out.println("Opção inválida!");
                System.out.println("Digite apenas opções do menu abaixo!");
                break;
        }
        return keyValue;
    }

}
