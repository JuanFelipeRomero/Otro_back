package co.ucentral.bkedgame.servicios;

import co.ucentral.bkedgame.persistencia.entidades.Equipo;
import co.ucentral.bkedgame.persistencia.repositorios.EquipoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoServicio {

    @Autowired
    private EquipoRepositorio equipoRepositorio;

    public List<Equipo> obtenerTodosLosEquipos() {
        return equipoRepositorio.findAll();
    }

    public Optional<Equipo> obtenerEquipoPorId(Long id) {
        return equipoRepositorio.findById(id);
    }

    public Equipo guardarEquipo(Equipo equipo) {
        return equipoRepositorio.save(equipo);
    }

    public void eliminarEquipo(Long id) {
        equipoRepositorio.deleteById(id);
    }
}