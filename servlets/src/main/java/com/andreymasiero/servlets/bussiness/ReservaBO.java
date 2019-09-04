package com.andreymasiero.servlets.bussiness;

import java.util.Date;

import com.andreymasiero.servlets.model.entities.Reserva;

public class ReservaBO {

	public boolean validarCheckout(Reserva r) {
		// Checkout maior que data atual
		return r.getCheckout().after(new Date());
	}
	
	public boolean validarCheckinCheckout(Reserva r) {
		return r.getCheckin().before(r.getCheckout());
	}
}
