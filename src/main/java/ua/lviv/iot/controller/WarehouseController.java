package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.business.AbstractService;
import ua.lviv.iot.business.WarehouseService;
import ua.lviv.iot.model.Warehouse;
@RequestMapping(path = "/warehouses")
@RestController
public class WarehouseController extends AbstractController<Warehouse> {

    @Autowired
    private WarehouseService warehouseService;

    @Override
    protected AbstractService<Warehouse> getService() {
        return warehouseService;
    }
}
