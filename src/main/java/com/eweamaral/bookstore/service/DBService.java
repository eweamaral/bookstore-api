package com.eweamaral.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eweamaral.bookstore.domain.Categoria;
import com.eweamaral.bookstore.domain.Livro;
import com.eweamaral.bookstore.repositories.CategoriaRepository;
import com.eweamaral.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
	
		Categoria cat1 = new Categoria(null, "Informática", "Livros de Tecnologia");

		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsum", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		categoriaRepository.saveAll(Arrays.asList(cat1));
		livroRepository.saveAll(Arrays.asList(l1));		
	}
}
