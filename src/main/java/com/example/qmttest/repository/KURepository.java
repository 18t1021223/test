package com.example.qmttest.repository;

import com.example.qmttest.entity.KU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KURepository extends JpaRepository<KU, Long> {
}