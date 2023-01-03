package com.itr.repositorio;

import com.itr.modelo.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepositorio extends JpaRepository<Jugador, Integer> {

}
