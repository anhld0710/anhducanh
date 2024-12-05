package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sinh_vien")
public class SinhVien {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ten_sinh_vien")
    private String ten_sinh_vien;
    @Column(name = "ngay_sinh")
    private LocalDate ngay_sinh;
    @Column(name = "gioi_tinh")
    private Integer gioi_tinh;
    @Column(name = "diem_trung_binh")
    private Float diem_trung_binh;
@ManyToOne
    @JoinColumn(name = "id_lop_hoc",referencedColumnName = "id")
    private LopHoc lopHoc;

}
// id int IDENTITY(1,1) PRIMARY KEY,
//         ten_sinh_vien varchar(50),
//         ngay_sinh date,
//         gioi_tinh bit,
//         diem_trung_binh float,
//         id_lop_hoc int,
//         FOREIGN KEY(id_lop_hoc) REFERENCES lop_hoc(id)