package com.example.bpms.repositories;

import com.example.bpms.entities.Process;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessRepository extends JpaRepository<Process, Long> {
}