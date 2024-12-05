package com.example.demo.Repository;

import com.example.demo.Entity.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LopHocRepository extends JpaRepository<LopHoc,Integer> {
}
