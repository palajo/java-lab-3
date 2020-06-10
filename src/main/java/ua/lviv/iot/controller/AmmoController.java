package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.business.AbstractService;
import ua.lviv.iot.business.AmmoService;
import ua.lviv.iot.model.Ammo;

@RestController
@RequestMapping(path = "ammo")
public class AmmoController extends AbstractController<Ammo> {

    @Autowired
    private AmmoService ammoService;

    @Override
    protected AbstractService<Ammo> getService() {
        return ammoService;
    }
}
