package co.ucentral.bkedgame.controladores;

import co.ucentral.bkedgame.persistencia.entidades.Equipo;
import co.ucentral.bkedgame.servicios.EquipoServicio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/equipos")
@CrossOrigin(origins = "*")
public class EquipoControlador {

    @Autowired
    EquipoServicio equipoServicio;

    @GetMapping("/equipo")
    public List<Equipo> obtenerTodosLosEquipos() {
        return equipoServicio.obtenerTodosLosEquipos();
    }

    @PostMapping("/")
    public Equipo crear (@RequestBody Equipo equipo) {
        return equipoServicio.crear(equipo);
    }

}