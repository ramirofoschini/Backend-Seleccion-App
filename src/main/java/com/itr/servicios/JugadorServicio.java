package servicios;

import model.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorio.JugadorRepositorio;

import java.util.List;

@Service
public class JugadorServicio {
    JugadorRepositorio jugadorRepositorio;
    @Autowired
    public JugadorServicio (JugadorRepositorio jugadorRepositorio){

        this.jugadorRepositorio = jugadorRepositorio;
    }

    public List<Jugador> listarJugadores (){
       return jugadorRepositorio.findAll();
    }
    public void crearJugador (Jugador jugador){
        jugadorRepositorio.save(jugador);
    }
}
