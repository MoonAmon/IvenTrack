package dev.moon.iventrack.service;

import dev.moon.iventrack.model.Modelo;
import dev.moon.iventrack.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloServiceImpl implements ModeloService {

    @Autowired
    private ModeloRepository modeloRepository;

    @Override
    public Modelo save(Modelo modelo) {
        return modeloRepository.save(modelo);
    }

    @Override
    public Modelo update(Modelo modelo) {
        return modeloRepository.save(modelo);
    }

    @Override
    public void deleteById(Long id) {
        modeloRepository.deleteById(id);
    }

    @Override
    public Optional<Modelo> findById(Long id) {
        return modeloRepository.findById(id);
    }

    @Override
    public Optional<Modelo> findByNome(String nome) {
        return modeloRepository.findByNome(nome);
    }

    @Override
    public List<Modelo> findAll() {
        return modeloRepository.findAll();
    }

    @Override
    public List<Modelo> saveAll(List<Modelo> modelos) {
        return modeloRepository.saveAll(modelos);
    }
}
