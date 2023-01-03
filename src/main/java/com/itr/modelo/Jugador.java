package com.itr.modelo;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table
public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String equipo;

    @ElementCollection
    private List<String> pos;

    public Jugador(Integer id, String nombre, String apellido, Integer edad, String equipo, List<String> pos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.equipo = equipo;
        this.pos = pos;
    }

    public Jugador() {
        
    }
}
