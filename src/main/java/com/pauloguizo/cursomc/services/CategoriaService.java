package com.pauloguizo.cursomc.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauloguizo.cursomc.domain.Categoria;
import com.pauloguizo.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) throws ObjectNotFoundException {
		
		Categoria obj = repo.findOne(id);
		
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo: " + Categoria.class.getName());
			  
		}
		
		return obj;			
		
	}
	
	

}
