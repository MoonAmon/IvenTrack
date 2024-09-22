package dev.moon.iventrack.service;

import dev.moon.iventrack.model.Equipamento;
import dev.moon.iventrack.model.dto.EquipamentoUpdateDTO;
import dev.moon.iventrack.repository.EquipamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipamentoServiceImpl implements EquipamentoService{
    @Autowired
    private EquipamentoRepository equipamentoRepository;
    
    @Override
    public Equipamento save(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    @Override
    public Equipamento update(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    @Override
    public void deleteById(Long id) {
        equipamentoRepository.deleteById(id);
    }

    @Override
    public void deleteByNome(String nome) {
        equipamentoRepository.deleteByNome(nome);
    }

    @Override
    public Optional<Equipamento> findById(Long id) {
        return equipamentoRepository.findById(id);
    }

    @Override
    public Optional<Equipamento> findByNome(String nome) {
        return equipamentoRepository.findByNome(nome);
    }

    @Override
    public List<Equipamento> findAll() {
        return equipamentoRepository.findAll();
    }

    @Override
    public List<Equipamento> saveAll(List<Equipamento> equipamentos) {
        return equipamentoRepository.saveAll(equipamentos);
    }

    @Override
    public List<Equipamento> findByNomeContainingIgnoreCase(String nome) {
        return equipamentoRepository.findByNomeContainingIgnoreCase(nome);
    }

    @Override
    public Equipamento updateEquipamento(Long id, EquipamentoUpdateDTO equipamentoUpdateDTO) {
        Optional<Equipamento> equipamentoOptional = equipamentoRepository.findById(id);
        if (equipamentoOptional.isPresent()) {
            Equipamento equipamento = equipamentoOptional.get();
            Equipamento equipamentoAtualizado = new Equipamento();
            equipamentoAtualizado.setNome(equipamentoUpdateDTO.getNome());
            equipamentoAtualizado.setCategoria(equipamentoUpdateDTO.getCategoria());
            equipamentoAtualizado.setLocalizacao(equipamentoUpdateDTO.getLocalizacao());
            equipamentoAtualizado.setStatus(equipamentoUpdateDTO.getStatus());
            equipamentoAtualizado.setModelo(equipamentoUpdateDTO.getModelo());
            equipamentoAtualizado.setNumeroSerie(equipamentoUpdateDTO.getNumeroSerie());
            return equipamentoRepository.updateEquipamento(equipamento, equipamentoAtualizado);
        } else {
            throw new RuntimeException("Equipamento não encontrado");
        }
    }
}
