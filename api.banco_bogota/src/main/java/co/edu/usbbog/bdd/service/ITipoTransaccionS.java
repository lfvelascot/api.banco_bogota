package co.edu.usbbog.bdd.service;

import antlr.collections.List;
import co.edu.usbbog.bdd.model.TipoTransaccion;

public interface ITipoTransaccionS {
	
	public void crearTipoTransaccion();
	public void eliminarTipoTransaccion();
	public void modificarTipoTransaccion();
	public TipoTransaccion encontrarTipoTransaccion();
	public List todasTipoTransacciones();
	public int contarTipoTransacciones();

}
