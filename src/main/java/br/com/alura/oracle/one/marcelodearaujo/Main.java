package br.com.alura.oracle.one.marcelodearaujo;

import br.com.alura.oracle.one.marcelodearaujo.calculo.Conversor;
import br.com.alura.oracle.one.marcelodearaujo.decodificador.Decodificador;
import br.com.alura.oracle.one.marcelodearaujo.perifericos.saida.Saida;
import br.com.alura.oracle.one.marcelodearaujo.visual.Menus;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        int opcao;

        do {
            opcao = Menus.obterOpcoesMenuPrincipal();
            String [] moedas = Decodificador.decodificaMoedasDasOpcaoesDoMenu(opcao);

            if (opcao == 0) {
                break;
            }
            BigDecimal quantidadeMoedaBase = Menus.obterQuantidadeMoedaBase();

            try {
                BigDecimal moedaConvertida = Conversor.converteMoeda(moedas[0], quantidadeMoedaBase, moedas[1]);
                System.out.println(moedas[0] + " " + Saida.numeroDuasCasasDecimais(quantidadeMoedaBase) + " é equivalente a " + moedas[1] + " " + Saida.numeroDuasCasasDecimais(moedaConvertida));
            } catch (Exception e){
                System.out.println("Deu ruim");
                System.out.println(e.getMessage());
            }
        } while (opcao != 0);
    }
}