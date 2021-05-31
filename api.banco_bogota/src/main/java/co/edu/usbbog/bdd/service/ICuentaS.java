package co.edu.usbbog.bdd.service;

import antlr.collections.List;
import co.edu.usbbog.bdd.model.Cuenta;

public interface ICuentaS {
	
	public void crearCuenta();
	public void eliminarCuenta();
	public void modificarCuenta();
	public Cuenta encontrarCuenta();
	public List todasCuentas();
	public int contarCuentas();
	
}
