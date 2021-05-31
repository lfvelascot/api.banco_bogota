package co.edu.usbbog.bdd.service;

import antlr.collections.List;
import co.edu.usbbog.bdd.model.Ciudad;

public interface ICiudadS {
	
	public void crearCiudad();
	public void eliminarCiudad();
	public void modificarCiudad();
	public Ciudad encontrarCiudad();
	public List todasCiudades();
	public int contarCiudades();
	
}
