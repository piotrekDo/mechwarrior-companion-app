package com.example.mechwarriorcompanionapp.mech;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechRepository extends JpaRepository<BattleMechEntity, Long> {
}
