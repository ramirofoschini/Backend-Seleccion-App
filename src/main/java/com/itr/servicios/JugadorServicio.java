package com.itr.servicios;

import com.itr.modelo.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itr.repositorio.JugadorRepositorio;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class JugadorServicio {
    JugadorRepositorio jugadorRepositorio;
    @Autowired
    public JugadorServicio (JugadorRepositorio jugadorRepositorio){

        this.jugadorRepositorio = jugadorRepositorio;
    }
    public Jugador obtenerPorId(Integer id) {
        return jugadorRepositorio.findById(id).get();
    }
   public List<Jugador> listarJugadores (){
       return jugadorRepositorio.findAll();
   }
    public void crearJugador (Jugador jugador){
        jugadorRepositorio.save(jugador);
    }
    public void actualizar (Jugador jugador){

        jugadorRepositorio.save(jugador);
}

    public void eliminaJugador(Integer id) {

        jugadorRepositorio.deleteById(id);
    }


}
