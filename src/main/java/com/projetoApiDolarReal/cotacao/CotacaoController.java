package com.projetoApiDolarReal.cotacao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CotacaoController {
    @GetMapping("/cotacao")
    public String cotacao(){
        RestTemplate  restTemplate = new RestTemplate();
        String url = "https://economia.awesomeapi.com.br/json/daily/USD-BRL/10";
        String resposta = restTemplate.getForObject(url,String.class);
        return resposta;
    }
}
