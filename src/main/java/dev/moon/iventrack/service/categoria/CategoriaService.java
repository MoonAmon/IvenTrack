package dev.moon.iventrack.service;

import dev.moon.iventrack.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    Categoria save(Categoria categoria);
    Categoria update(Categoria categoria);
    void deleteById(Long id);
    Optional<Categoria> findById(Long id);
    Optional<Categoria> findByNome(String nome);
    List<Categoria> findAll();
    List<Categoria> saveAll(List<Categoria> categorias);
}
