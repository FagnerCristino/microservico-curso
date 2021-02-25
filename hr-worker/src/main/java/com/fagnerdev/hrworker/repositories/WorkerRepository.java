package com.fagnerdev.hrworker.repositories;

import com.fagnerdev.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
