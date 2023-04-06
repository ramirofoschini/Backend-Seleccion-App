package com.itr.controladores;
import com.itr.modelo.Jugador;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.itr.servicios.JugadorServicio;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/jugadores")

public class JugadorControlador {
JugadorServicio jugadorServicio;

@Autowired
public JugadorControlador (JugadorServicio jugadorServicio){
this.jugadorServicio = jugadorServicio;

}


    @GetMapping
    @Operation(summary = "Devuelve la lista de jugadores")
    public List<Jugador> listarJugadores (){

    return jugadorServicio.listarJugadores();
}
    @GetMapping("/{id}")
    @Operation(summary = "Devuelve un jugador por su ID")
    public Jugador obtenerPorId (@PathVariable Integer id){
        return jugadorServicio.obtenerPorId(id);
    }

    @PostMapping
    @Operation(summary = "Crea un jugador")
    public void crearJugador(@RequestBody Jugador jugador) {
    jugadorServicio.crearJugador(jugador);

}
    @PutMapping
    @Operation(summary = "Actualiza un jugador")
    public void actualizar(@RequestBody Jugador jugador){

    jugadorServicio.actualizar(jugador);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Elimina un jugador por su ID")
    public void eliminar (@PathVariable Integer id){
    jugadorServicio.eliminaJugador(id);

}


}
