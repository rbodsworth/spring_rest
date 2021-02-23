package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
