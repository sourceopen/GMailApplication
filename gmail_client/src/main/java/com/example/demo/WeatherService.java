package com.example.demo;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    public String getWeatherForecast() {
        RestTemplateBuilder builder = new RestTemplateBuilder();
        RestTemplate restTemplate = builder.build();


        String quote = restTemplate.getForObject(
                "https://api-pub.bitfinex.com/v2/tickers?symbols=tBTCUSD,tLTCUSD,fUSD", String.class);

        System.out.println("asdf");
        return quote;
    }
}