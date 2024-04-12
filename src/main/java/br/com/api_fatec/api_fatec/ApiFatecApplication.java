package br.com.api_fatec.api_fatec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import br.com.api_fatec.api_fatec.domain.cliente.ClienteRepository;
import br.com.api_fatec.api_fatec.domain.produto.ProdutoRepository;
import br.com.api_fatec.api_fatec.entities.Cliente;
import br.com.api_fatec.api_fatec.entities.Produto;

@RestController
@SpringBootApplication
public class ApiFatecApplication {
	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository clienteRepository) {
		return args -> {
			Cliente cliente = new Cliente();
			cliente.setNome("Danilo");
			cliente.setEmail("h2danilofatec@hotmail.com");
			cliente.setEndereco("Rua xxx, 126");
			cliente.setRazaoSocial("Danilo");
			
			clienteRepository.save(cliente);
			
//			Produto produto = new Produto();
//			produto.setNome("nomeproduto");
//			produto.setDescricao("desc produto");
//			
//			
//			produtorepository.save(produto);
		};
	}



    public static void main(String[] args) {
        SpringApplication.run(ApiFatecApplication.class, args);
    }
}
