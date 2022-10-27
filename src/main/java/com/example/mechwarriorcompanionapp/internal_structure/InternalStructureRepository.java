package com.example.mechwarriorcompanionapp.internal_structure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalStructureRepository extends JpaRepository<InternalStructureEntity, Long> {
}
