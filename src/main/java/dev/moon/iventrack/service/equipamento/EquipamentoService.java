package dev.moon.iventrack.service;

import dev.moon.iventrack.model.Equipamento;
import dev.moon.iventrack.model.dto.EquipamentoUpdateDTO;

import java.util.List;
import java.util.Optional;

public interface EquipamentoService {
    Equipamento save(Equipamento equipamento);
    Equipamento update(Equipamento equipamento);
    void deleteById(Long id);
    void deleteByNome(String nome);
    Optional<Equipamento> findById(Long id);
    Optional<Equipamento> findByNome(String nome);
    List<Equipamento> findAll();
    List<Equipamento> saveAll(List<Equipamento> equipamentos);
    List<Equipamento> findByNomeContainingIgnoreCase(String nome);
    Equipamento updateEquipamento(Long id, EquipamentoUpdateDTO equipamentoUpdateDTO);
}
