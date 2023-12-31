package me.dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	Correcao do erro de CORS
	@OpenAPIDefinition(servers = {@Server(url = "/",description = "Default Server URL")})

*/
@OpenAPIDefinition(servers = {@Server(url = "/",description = "Default Server URL")})
@SpringBootApplication
public class Application {

	/*
	* Dados para Testes
		{
		  "name": "Fernando",
		  "account": {
			"number": "00000000-0",
			"agency": "0000",
			"balance": 1324.64,
			"limit": 1000.00
		  },
		  "card": {
			"number": "xxxx xxxx xxxx 0000",
			"limit": 1000.00
		  },
		  "features": [
			{
			  "icon": "URL",
			  "description": "Descrição da feature"
			}
		  ],
		  "news": [
			{
			  "icon": "URL",
			  "description": "Descrição da Novidade"
			}
		  ]
		}
	* */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
