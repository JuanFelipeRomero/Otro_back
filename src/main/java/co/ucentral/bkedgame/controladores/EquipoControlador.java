package co.ucentral.bkedgame.controladores;

import co.ucentral.bkedgame.persistencia.entidades.Equipo;
import co.ucentral.bkedgame.servicios.EquipoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
@CrossOrigin(origins = "*")
public class EquipoControlador {

    @Autowired
    private EquipoServicio equipoServicio;

    @GetMapping("/")
    public List<Equipo> obtenerTodosLosEquipos() {
        return equipoServicio.obtenerTodosLosEquipos();
    }
}