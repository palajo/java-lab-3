package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Warehouse;
import ua.lviv.iot.repository.WarehouseRepository;

@Service
public class WarehouseService extends AbstractService<Warehouse> {

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Override
    protected JpaRepository<Warehouse, Integer> getRepository() {
        return warehouseRepository;
    }

    @Override
    public Warehouse update(Warehouse warehouse, Integer id) {
        if (warehouseRepository.existsById(id)) {
            this.deleteById(id);
            warehouse.setId(id);
            warehouseRepository.save(warehouse);
            return warehouse;
        } else {
            return null;
        }
    }
}
