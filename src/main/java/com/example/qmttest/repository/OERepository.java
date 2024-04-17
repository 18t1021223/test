package com.example.qmttest.repository;

import com.example.qmttest.entity.OE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OERepository extends JpaRepository<OE, String> {
}