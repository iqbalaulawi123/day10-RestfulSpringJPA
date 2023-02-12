package com.iqbalaulawi.day10restfulspringjpa.services;

import com.iqbalaulawi.day10restfulspringjpa.entity.BarangEntity;
import com.iqbalaulawi.day10restfulspringjpa.repository.BarangRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BarangService {
    List<BarangEntity> getAll();

    Optional<BarangEntity> getById(Long id);

    BarangEntity create(BarangEntity barangEntity);

    BarangEntity update(BarangEntity barangEntity, Long id);

    void deleteById(Long id);
}
