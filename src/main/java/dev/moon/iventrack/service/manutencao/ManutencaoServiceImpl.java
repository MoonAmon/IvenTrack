package dev.moon.iventrack.service;

import dev.moon.iventrack.model.Manutencao;
import dev.moon.iventrack.repository.ManutencaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManutencaoServiceImpl implements ManutencaoService {
    @Autowired
    private ManutencaoRepository manutencaoRepository;

    @Override
    public Manutencao save(Manutencao manutencao) {
        return manutencaoRepository.save(manutencao);
    }

    @Override
    public Manutencao update(Manutencao manutencao) {
        return manutencaoRepository.save(manutencao);
    }

    @Override
    public void deleteById(Long id) {
        manutencaoRepository.deleteById(id);
    }

    @Override
    public Optional<Manutencao> findById(Long id) {
        return manutencaoRepository.findById(id);
    }

    @Override
    public Optional<Manutencao> findByEquipamentoId(Long equipamentoId) {
        return manutencaoRepository.findByEquipamentoId(equipamentoId);
    }

    @Override
    public Optional<List<Manutencao>> findByTecnicoNome(String tecnicoNome) {
        return manutencaoRepository.findByTecnicoResponsavel(tecnicoNome);
    }

    @Override
    public List<Manutencao> findAll() {
        return manutencaoRepository.findAll();
    }

    @Override
    public List<Manutencao> saveAll(List<Manutencao> manutencoes) {
        return manutencaoRepository.saveAll(manutencoes);
    }
}
