package com.marcospivetta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcospivetta.cursomc.domain.Pedido;
import com.marcospivetta.cursomc.repositories.PedidoRepository;
import com.marcospivetta.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) throws ObjectNotFoundException {
		   Optional<Pedido> obj = repo.findById(id);
		   return obj.orElseThrow(() -> new ObjectNotFoundException(
		      "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}
}