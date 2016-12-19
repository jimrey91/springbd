package com.reyes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyes.beans.Jugador;
import com.reyes.dao.DAOJugador;

@Service
public class ServiceJugadorImpl implements ServiceJugador{
	
	@Autowired
	private DAOJugador daoJugador;
	
	public void registrar(Jugador jugador) throws Exception {
		try {
			daoJugador.registrar(jugador);
		} catch (Exception e) {
			throw e;
		}
		
	}

}
