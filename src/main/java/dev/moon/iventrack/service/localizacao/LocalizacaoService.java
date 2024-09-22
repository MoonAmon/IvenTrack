package dev.moon.iventrack.service;

import dev.moon.iventrack.model.Localizacao;

import java.util.List;
import java.util.Optional;

public interface LocalizacaoService {
    Localizacao save(Localizacao localizacao);
    Localizacao update(Localizacao localizacao);
    void deleteById(Long id);
    Optional<Localizacao> findById(Long id);
    Optional<Localizacao> findByNome(String nome);
    List<Localizacao> findAll();
    List<Localizacao> saveAll(List<Localizacao> localizacoes);
}
