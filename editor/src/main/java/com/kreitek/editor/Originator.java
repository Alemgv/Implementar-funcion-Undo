package com.kreitek.editor;

import java.util.ArrayList;

public class Originator {

	private String estado;

	public void setEstado(String estado) {
		System.out.println("Originator: Modificando el estado " + estado);
		this.estado = estado;
	}

	public Memento guardarMemento() {
		System.out.println("Originator: Guardando el memento.");
		return new Memento(estado);
	}

	public void restaurarMemento(Memento m) {
		this.estado = m.getEstadoGuardado();
		System.out.println("Originator: Estado después de restaurar memento: " + estado);
	}
}
