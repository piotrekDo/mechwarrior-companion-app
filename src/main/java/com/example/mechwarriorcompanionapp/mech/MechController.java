package com.example.mechwarriorcompanionapp.mech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mechs")
public class MechController {

    private final MechRepository mechRepository;

    public MechController(MechRepository mechRepository) {
        this.mechRepository = mechRepository;
    }

    @GetMapping
    List<BattleMechEntity> getMechs() {
        return mechRepository.findAll();
    }
}
