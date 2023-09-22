package com.example.parallel.repository;

import com.example.parallel.entity.KitchenTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitchenTaskRepository extends JpaRepository<KitchenTask, Long> {}
