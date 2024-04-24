package br.com.alura.oracle.one.marcelodearaujo.calculo;

import br.com.alura.oracle.one.marcelodearaujo.api.extracao.Cotacao;

import java.math.BigDecimal;

public class Conversor {

    private Conversor() {}

    public static BigDecimal converteMoeda (String moedaBase, BigDecimal quantiadeMoedaBase, String moedaConvertida) {
        return Cotacao.extraiCotacaoMoedaJsonBody(moedaBase, moedaConvertida).multiply(quantiadeMoedaBase);
    }

}
