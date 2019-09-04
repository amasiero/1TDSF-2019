package com.andreymasiero.servlets.dao;

import java.util.ArrayList;

import com.andreymasiero.servlets.model.entities.Reserva;

public class ReservaDAO {
	private static ArrayList<Reserva> reservas = new ArrayList<>();
	
	public void adicionar(Reserva r) {
		if(r != null) reservas.add(r);
	}
	
	public ArrayList<Reserva> consultarTodasReservas() {
		return reservas;
	}
	
	public Reserva consultarReservaQuarto(long nroQuarto) {
		for(Reserva r : reservas) {
			if(r.getNroQuarto() == nroQuarto) {
				return r;
			}
		}
		return null;
	}

}
