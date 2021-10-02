package com.br.heartstone.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.br.heartsone.repositories.ICartaRepository;
import com.br.heartstone.entities.Carta;


@Path("/carta")
public class CartaResource {
	
	@Inject
    ICartaRepository cartarepo;
	
	  @GET
	    @Produces(MediaType.APPLICATION_JSON)
	  public ResponseEntity<List<Carta>> get() {

			try {
				
				//declarando uma lista da classe FornecedorGetDTO.java
				List<Carta> result = new ArrayList<Carta>();
				
				//consultar e percorrer os fornecedores obtidos no banco de dados..
				for(Carta carta : cartarepo.findAll()) {
					
					Carta dto = new Carta();
					
					dto.setAtaque(carta.getAtaque());
					dto.setClasse(carta.getClasse());
					dto.setDefesa(carta.getDefesa());
					dto.setDescricao(carta.getDescricao());
					dto.setId(carta.getId());
					dto.setNome(carta.getNome());
					dto.setTipo(carta.getTipo());
					
					
					result.add(dto); //adicionar na lista
				}
				
				return ResponseEntity
						.status(HttpStatus.OK) //HTTP 200
						.body(result);
			}
			catch(Exception e) {
				return ResponseEntity
						.status(HttpStatus.INTERNAL_SERVER_ERROR) //HTTP 500
						.body(null);
			}
		}
	

}

