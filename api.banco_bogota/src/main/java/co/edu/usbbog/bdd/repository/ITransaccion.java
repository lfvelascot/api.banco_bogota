package co.edu.usbbog.bdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.usbbog.bdd.model.Transaccion;

public interface ITransaccion extends JpaRepository<Transaccion, Long>{

}
