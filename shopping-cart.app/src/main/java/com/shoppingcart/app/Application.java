package com.shoppingcart.app;

import com.shoppingcart.app.httpClient.Currency.CurrencyGateway;
import com.shoppingcart.app.httpClient.Currency.CurrencyGatewayImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final CurrencyGateway currencyGateway;
	private final CurrencyGatewayImpl currencyGatewasy;

	public Application(CurrencyGateway currencyGateway, CurrencyGatewayImpl currencyGatewasy) {
		this.currencyGateway = currencyGateway;
		this.currencyGatewasy = currencyGatewasy;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(currencyGatewasy.getCurrency("BRL"));
	}
}
