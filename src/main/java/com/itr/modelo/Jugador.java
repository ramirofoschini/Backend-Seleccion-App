package com.itr.modelo;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table

public class Jugador implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String equipo;
    private enum Pos {ARQUERO, DEFENSOR, MEDIOCAMPISTA, DELANTERO}

    @Column(columnDefinition = "ENUM('ARQUERO', 'DEFENSOR', 'MEDIOCAMPISTA', 'DELANTERO')")
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Pos> posicion;

}
