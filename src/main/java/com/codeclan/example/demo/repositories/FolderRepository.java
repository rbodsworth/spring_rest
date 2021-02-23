package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
