package com.iqbalaulawi.day10restfulspringjpa.services.implementation;

import com.iqbalaulawi.day10restfulspringjpa.entity.BarangEntity;
import com.iqbalaulawi.day10restfulspringjpa.repository.BarangRepository;
import com.iqbalaulawi.day10restfulspringjpa.services.BarangService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BarangServiceImpl implements BarangService {
    private final BarangRepository barangRepository;
    @Override
    public List<BarangEntity> getAll() {
        return barangRepository.findAll();
    }

    @Override
    public Optional<BarangEntity> getById(Long id) {
        return barangRepository.findById(id);
    }

    @Override
    public BarangEntity create(BarangEntity barangEntity) {
        return barangRepository.save(barangEntity);
    }

    @Override
    public BarangEntity update(BarangEntity barangEntity, Long id) {
        BarangEntity barangEntity_update= barangRepository.findById(id).get();
        barangEntity_update.setNama_barang(barangEntity.getNama_barang());
        barangEntity_update.setHarga_barang(barangEntity.getHarga_barang());
        return barangRepository.save(barangEntity_update);
    }

    @Override
    public void deleteById(Long id) {
        barangRepository.deleteById(id);
    }


}
