package com.ifpi.ted2019;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ifpi.ted2019.domain.Categoria;
import com.ifpi.ted2019.repositories.CategoriaRepository;

@SpringBootApplication
public class ModelagemApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ModelagemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria categoria = new Categoria(null, "Informática");
		Categoria categoria2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(categoria, categoria2));
		
	}

}
