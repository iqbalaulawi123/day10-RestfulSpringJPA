package com.iqbalaulawi.day10restfulspringjpa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BarangEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String nama_barang;
    private Integer harga_barang;


}
