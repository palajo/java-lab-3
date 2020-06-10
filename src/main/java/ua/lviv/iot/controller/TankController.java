package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.business.AbstractService;
import ua.lviv.iot.business.TankService;
import ua.lviv.iot.model.Tank;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/tanks")
@RestController
public class TankController extends AbstractController<Tank> {

    @Autowired
    private TankService tankService;


    @Override
    protected AbstractService<Tank> getService() {
        return tankService;
    }
}