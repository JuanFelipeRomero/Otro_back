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
    EquipoRepositorio equipoRepositorio;

    public List<Equipo> obtenerTodosLosEquipos() {
        return equipoRepositorio.findAll();
    }

    public Equipo crear(Equipo equipo) {
        return equipoRepositorio.save(equipo);
    }

}