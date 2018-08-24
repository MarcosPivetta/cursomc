package com.marcospivetta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcospivetta.cursomc.domain.Cliente;
import com.marcospivetta.cursomc.repositories.ClienteRepository;
import com.marcospivetta.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) throws ObjectNotFoundException {
		   Optional<Cliente> obj = repo.findById(id);
		   return obj.orElseThrow(() -> new ObjectNotFoundException(
		      "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}
}