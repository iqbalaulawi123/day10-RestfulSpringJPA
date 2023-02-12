package com.iqbalaulawi.day10restfulspringjpa.controller;

import com.iqbalaulawi.day10restfulspringjpa.entity.BarangEntity;
import com.iqbalaulawi.day10restfulspringjpa.services.BarangService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/barang")
public class BarangController {
    private BarangService barangServie;
    public BarangController(BarangService barangServie){
        this.barangServie = barangServie;
    }
    @GetMapping
    public List<BarangEntity> getAll(){
        return barangServie.getAll();
    }

    @GetMapping("/{id}")
    public  Optional<BarangEntity> getById(@PathVariable Long id){
        Optional<BarangEntity> barangbyid = barangServie.getById(id);
        return barangbyid;
    }
    @PostMapping
    public BarangEntity create(@RequestBody BarangEntity barangEntity) {
        return barangServie.create(barangEntity);
    }

    @PutMapping("/{id}")
    public BarangEntity update(@RequestBody BarangEntity barangEntity,@PathVariable Long id) {
        return barangServie.update(barangEntity,id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id){
        barangServie.deleteById(id);
        return "Berhasil menghapus data barang "+id;
    }
}
