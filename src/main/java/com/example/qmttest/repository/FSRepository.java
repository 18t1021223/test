package com.example.qmttest.repository;

import com.example.qmttest.entity.FS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FSRepository extends JpaRepository<FS, String> {
}