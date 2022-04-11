package com.kreitek.editor;

import java.util.ArrayList;

public class Memento {

	private String estado;

	public Memento(String estadoGuardado) {
		estado = estadoGuardado;
	}

	public String getEstadoGuardado() {
		return estado;
	}

}
