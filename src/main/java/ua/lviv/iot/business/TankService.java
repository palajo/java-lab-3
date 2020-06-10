package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Tank;
import ua.lviv.iot.repository.TankRepository;

import java.util.List;

@Service
public class TankService extends AbstractService<Tank> {

    @Autowired
    private TankRepository tankRepository;

    @Override
    protected JpaRepository<Tank, Integer> getRepository() {
        return tankRepository;
    }

    @Override
    public Tank update(Tank tank, Integer id) {
        if (tankRepository.existsById(id)) {
            this.deleteById(id);
            tank.setId(id);
            tankRepository.save(tank);
            return tank;
        } else {
            return null;
        }
    }
}