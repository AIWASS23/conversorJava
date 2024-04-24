package br.com.alura.oracle.one.marcelodearaujo.perifericos.saida;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Saida {

    private static DecimalFormat formatoNumeroDuasCasasDecimais = new DecimalFormat("0.00");

    private Saida() {}

    public static String numeroDuasCasasDecimais(BigDecimal d){
        return formatoNumeroDuasCasasDecimais.format(d);
    }
}
