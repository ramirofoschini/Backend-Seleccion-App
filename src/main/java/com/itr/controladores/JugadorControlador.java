package controladores;

import model.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import servicios.JugadorServicio;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorControlador {
JugadorServicio jugadorServicio;

@Autowired
public JugadorControlador (JugadorServicio jugadorServicio){
this.jugadorServicio = jugadorServicio;
}
@GetMapping("/lista")
public List<Jugador> listarJugadores (){
    return jugadorServicio.listarJugadores();
}

@PostMapping
public void crearJugador(@RequestBody Jugador jugador) {
    jugadorServicio.crearJugador(jugador);

    }

}
