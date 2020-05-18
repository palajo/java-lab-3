package ua.lviv.iot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.model.Tank;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/tanks")
@RestController
public class TankController {

    private static final Map<Integer, Tank> tanksHashMap = new HashMap<>();

    private static AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public final List<Tank> getTanks() {
        return new LinkedList<>(tanksHashMap.values());
    }

    @GetMapping(path = "/{id}")
    public final Tank getTankById(final @PathVariable("id") Integer tankId) {
        return tanksHashMap.get(tankId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final Tank createTanks(final @RequestBody Tank tanks) {
        tanks.setId(idCounter.incrementAndGet());
        tanksHashMap.put(tanks.getId(), tanks);
        return tanks;
    }

    @DeleteMapping(path = "/{id}")
    public final ResponseEntity<Object> deleteTanks(final @PathVariable("id") Integer tankId) {
        HttpStatus status = tanksHashMap.remove(tankId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public final Tank updateTanks(final @PathVariable("id") Integer tankId, final @RequestBody Tank tanks) {
        tanks.setId(tankId);
        return tanksHashMap.put(tankId, tanks);
    }

}