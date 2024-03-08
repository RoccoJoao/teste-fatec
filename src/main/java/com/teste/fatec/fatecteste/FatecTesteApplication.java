package com.teste.fatec.fatecteste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.websocket.server.PathParam;

@RestController
@SpringBootApplication
public class FatecTesteApplication {
    @RequestMapping("/classificar/{idade}")
    String classificarIdade(@PathVariable int idade) {
        if (idade < 0) {
            return "Idade inválida";
        } else if (idade < 12) {
            return "Criança";
        } else if (idade >= 12 && idade <= 18) {
            return "Adolescente";
        } else if (idade >= 19 && idade <= 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
 
	public static void main(String[] args) {
		SpringApplication.run(FatecTesteApplication.class, args);
	}

}
