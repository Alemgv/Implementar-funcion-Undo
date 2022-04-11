package com.kreitek.editor;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	private List<Memento> estadosYaGuardados = new ArrayList<Memento>();

	public void addMemento(Memento m) {
		estadosYaGuardados.add(m);
	}

	public Memento getMemento() {
		
		if (estadosYaGuardados.size() > 0)
		{
			Memento memento = estadosYaGuardados.get(estadosYaGuardados.size() -2);
			estadosYaGuardados.remove(estadosYaGuardados.size() -2);
			return memento;
		}
		return null;
		
	}
}
