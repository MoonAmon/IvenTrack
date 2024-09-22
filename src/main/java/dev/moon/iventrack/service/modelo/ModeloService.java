package dev.moon.iventrack.service;

import dev.moon.iventrack.model.Modelo;

import java.util.List;
import java.util.Optional;

public interface ModeloService {
    Modelo save(Modelo modelo);
    Modelo update(Modelo modelo);
    void deleteById(Long id);
    Optional<Modelo> findById(Long id);
    Optional<Modelo> findByNome(String nome);
    List<Modelo> findAll();
    List<Modelo> saveAll(List<Modelo> modelos);
}
