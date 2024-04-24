package br.com.alura.oracle.one.marcelodearaujo.api.extracao;

import br.com.alura.oracle.one.marcelodearaujo.api.requisicao.Request;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.math.BigDecimal;
import java.net.URI;

public class Cotacao {

    private Cotacao(){}

    public static BigDecimal extraiCotacaoMoedaJsonBody(String moedaBase, String moedaConvertida){

        String url = "https://v6.exchangerate-api.com/v6/911c84579c27a7987273be00/latest/" + moedaBase;
        URI uri = URI.create(url);
        Gson gson = new Gson();

        try {
            String response =  Request.disparaRequisicaoget(uri).body();
            JsonObject jsonObjectBody = gson.fromJson(response, JsonObject.class);
            JsonObject jsonObjectConversionRatesKey = jsonObjectBody.getAsJsonObject("conversion_rates");
            return jsonObjectConversionRatesKey.get(moedaConvertida).getAsBigDecimal();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return BigDecimal.valueOf(0);
    }

}
