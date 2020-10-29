package com.danilson.appspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.danilson.appspringboot.model.Book;
import com.danilson.appspringboot.repositories.BookRepository;

@EnableJpaRepositories("com.danilson.appspringboot.repositories")
@EntityScan("com.danilson.appspringboot.model")
@SpringBootApplication
public class AppspringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppspringbootApplication.class, args);
	}
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		this.bookRepository.save(new Book("Cronicas de Riddick", "José Saramago"));
		this.bookRepository.save(new Book("Senhor dos Aneis - Trilogia", "Sófia Ramos"));
		this.bookRepository.save(new Book("Jogos Mortais", "Ana Bela"));
		this.bookRepository.save(new Book("Harry Potter - Livro 1", "Tiago Alcantará"));
	}
}
