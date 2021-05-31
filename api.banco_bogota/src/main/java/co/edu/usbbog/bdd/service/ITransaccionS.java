package co.edu.usbbog.bdd.service;

import antlr.collections.List;
import co.edu.usbbog.bdd.model.Transaccion;

public interface ITransaccionS {
	
	public void crearTransaccion();
	public void eliminarTransaccion();
	public void modificarTransaccion();
	public Transaccion encontrarTransaccion();
	public List todasTransacciones();
	public int contarTransacciones();

}
