package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.business.TankService;
import ua.lviv.iot.model.Tank;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/tanks")
@RestController
public class TankController {

    @Autowired
    private TankService tankService;

    @GetMapping
    public final List getTanks() { return tankService.getTanks();
    }

    @GetMapping(path = "/{id}")
    public final Tank getTankById(final @PathVariable("id") Integer tankId) {
        return tankService.getTankById(tankId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final Tank createTank(final @RequestBody Tank tank) {
        return tankService.createTank(tank);
    }

    @DeleteMapping(path = "/{id}")
    public final void deleteTankById(final @PathVariable("id") Integer tankId) {
        tankService.deleteTankById(tankId);
    }

    @PutMapping(path = "/{id}")
    public final ResponseEntity<Object> updateTankById(final @PathVariable("id") Integer tankId,
                                                         final @RequestBody Tank tank) {

        Tank tankBeforeUpdate = tankService.getTankById(tankId);
        if (tankBeforeUpdate == null) {
            return ResponseEntity.notFound().build();
        }

        tankService.updateTankById(tankId, tank);
        return ResponseEntity.ok(tankBeforeUpdate);
    }

}