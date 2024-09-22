package dev.moon.iventrack.service;

import dev.moon.iventrack.model.Localizacao;
import dev.moon.iventrack.repository.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalizacaoServiceImpl implements LocalizacaoService {
    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    @Override
    public Localizacao save(Localizacao localizacao) {
        return localizacaoRepository.save(localizacao);
    }

    @Override
    public Localizacao update(Localizacao localizacao) {
        return localizacaoRepository.save(localizacao);
    }

    @Override
    public void deleteById(Long id) {
        localizacaoRepository.deleteById(id);
    }

    @Override
    public Optional<Localizacao> findById(Long id) {
        return localizacaoRepository.findById(id);
    }

    @Override
    public Optional<Localizacao> findByNome(String nome) {
        return localizacaoRepository.findByNome(nome);
    }

    @Override
    public List<Localizacao> findAll() {
        return localizacaoRepository.findAll();
    }

    @Override
    public List<Localizacao> saveAll(List<Localizacao> localizacoes) {
        return localizacaoRepository.saveAll(localizacoes);
    }
}
