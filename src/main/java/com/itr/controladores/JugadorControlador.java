package com.itr.controladores;
import com.itr.modelo.Jugador;
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


    @GetMapping()
    public List<Jugador> listarJugadores (){
    return jugadorServicio.listarJugadores();
}
    @GetMapping("/{id}")
    public Jugador obtenerPorId (@PathVariable Integer id){
        return jugadorServicio.obtenerPorId(id);
    }

    @PostMapping
    public void crearJugador(@RequestBody Jugador jugador) {
    jugadorServicio.crearJugador(jugador);

}
    @PutMapping
    public void actualizar(@RequestBody Jugador jugador){

    jugadorServicio.actualizar(jugador);
    }

    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable Integer id){
    jugadorServicio.eliminaJugador(id);

}


}
