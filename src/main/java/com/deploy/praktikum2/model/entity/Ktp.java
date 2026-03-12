package com.deploy.praktikum2.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

@Entity
@Table(name = "ktp")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ktp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT")
    private Integer id;

    @Column(name = "nomorKtp", unique = true, nullable = false, columnDefinition = "VARCHAR(255)")
    private String nomorKtp;

    @Column(name = "namaLengkap", nullable = false, columnDefinition = "VARCHAR(255)")
    private String namaLengkap;

    @Column(name = "alamat", nullable = false, columnDefinition = "VARCHAR(255)")
    private String alamat;

    @Column(name = "tanggalLahir", nullable = false, columnDefinition = "DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate tanggalLahir;

    @Column(name = "jenisKelamin", nullable = false, columnDefinition = "VARCHAR(255)")
    private String jenisKelamin;
}
