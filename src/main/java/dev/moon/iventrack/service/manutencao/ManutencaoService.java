package dev.moon.iventrack.service;

import dev.moon.iventrack.model.Manutencao;

import java.util.List;
import java.util.Optional;

public interface ManutencaoService {
    Manutencao save(Manutencao manutencao);
    Manutencao update(Manutencao manutencao);
    void deleteById(Long id);
    Optional<Manutencao> findById(Long id);
    Optional<Manutencao> findByEquipamentoId(Long equipamentoId);
    Optional<List<Manutencao>> findByTecnicoNome(String tecnicoNome);
    List<Manutencao> findAll();
    List<Manutencao> saveAll(List<Manutencao> manutencoes);
}
