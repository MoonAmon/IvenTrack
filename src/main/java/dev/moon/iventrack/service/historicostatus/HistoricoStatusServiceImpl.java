package dev.moon.iventrack.service;

import dev.moon.iventrack.model.HistoricoStatus;
import dev.moon.iventrack.repository.HistoricoStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoricoStatusServiceImpl implements HistoricoStatusService{
    @Autowired
    private HistoricoStatusRepository historicoStatusRepository;

    @Override
    public HistoricoStatus save(HistoricoStatus historicoStatus) {
        return historicoStatusRepository.save(historicoStatus);
    }

    @Override
    public HistoricoStatus update(HistoricoStatus historicoStatus) {
        return historicoStatusRepository.save(historicoStatus);
    }

    @Override
    public void deleteById(Long id) {
        historicoStatusRepository.deleteById(id);
    }

    @Override
    public Optional<HistoricoStatus> findById(Long id) {
        return historicoStatusRepository.findById(id);
    }

    @Override
    public List<HistoricoStatus> findAll() {
        return historicoStatusRepository.findAll();
    }

    @Override
    public List<HistoricoStatus> saveAll(List<HistoricoStatus> historicoStatus) {
        return historicoStatusRepository.saveAll(historicoStatus);
    }
}
