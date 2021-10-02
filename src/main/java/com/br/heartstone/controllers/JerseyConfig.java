package com.br.heartstone.controllers;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.br.heartsone.repositories.ICartaRepository;

@Configuration
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

	
	 @PostConstruct
	    private void init() {
	        registerClasses(CartaResource.class);
	        registerClasses(ICartaRepository.class);

	    }
}
