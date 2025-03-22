package co.ucentral.bkedgame.persistencia.entidades;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nombre_corto") // Asegura que coincida con la columna en la BD
    private String nombre_corto;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;

    //Getters and setters
    // ✅ Getters y Setters obligatorios para la serialización JSON
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCorto() {
        return nombre_corto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombre_corto = nombreCorto;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
