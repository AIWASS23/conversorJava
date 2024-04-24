package br.com.alura.oracle.one.marcelodearaujo.perifericos.entrada;

import java.math.BigDecimal;

public class Entrada {

    private Entrada(){}

    public static boolean contemApenasNumerosInteiros(String entrada) {
        try {
            Integer i = Integer.parseInt(entrada);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean contemApenasNumerosBigDecimais(String entrada) {
        try {
            BigDecimal b = new BigDecimal (entrada);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
