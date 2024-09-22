package dev.moon.iventrack.service;

import dev.moon.iventrack.model.HistoricoStatus;

import java.util.List;
import java.util.Optional;

public interface HistoricoStatusService {
    HistoricoStatus save(HistoricoStatus historicoStatus);
    HistoricoStatus update(HistoricoStatus historicoStatus);
    void deleteById(Long id);
    Optional<HistoricoStatus> findById(Long id);
    List<HistoricoStatus> findAll();
    List<HistoricoStatus> saveAll(List<HistoricoStatus> historicoStatus);
}
