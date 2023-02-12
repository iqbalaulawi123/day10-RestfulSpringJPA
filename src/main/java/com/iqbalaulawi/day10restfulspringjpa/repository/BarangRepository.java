package com.iqbalaulawi.day10restfulspringjpa.repository;

import com.iqbalaulawi.day10restfulspringjpa.entity.BarangEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarangRepository extends JpaRepository<BarangEntity,Long> {
}
