package co.ucentral.bkedgame.persistencia.repositorios;

import co.ucentral.bkedgame.persistencia.entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepositorio extends JpaRepository<Equipo, Long> {
}