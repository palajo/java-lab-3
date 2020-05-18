package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Tank;
import ua.lviv.iot.repository.TankRepository;

import java.util.List;

@Service
public class TankService {

    @Autowired
    private TankRepository tanksRepository;

    public List getTanks() {
        return tanksRepository.findAll();
    }

    public final Tank getTankById(Integer tankId) {
        return tanksRepository.findById(tankId).get();
    }

    public Tank createTank(Tank tanks) {
        return tanksRepository.save(tanks);
    }

    public final void deleteTankById(Integer tankId) {
        tanksRepository.deleteById(tankId);
    }

    public final Tank updateTankById(Integer tankId, Tank newTank) {

        if (tanksRepository.existsById(tankId)) {

            Tank tank = tanksRepository.findById(tankId).orElseThrow(NullPointerException::new);

            tank.setOverviewInDegrees(newTank.getOverviewInDegrees());
            tank.setArmorType(newTank.getArmorType());
            tank.setEngineVolume(newTank.getEngineVolume());
            tank.setFireRange(newTank.getFireRange());
            tank.setFuelConsumption(newTank.getFuelConsumption());
            tank.setMaxSpeed(newTank.getMaxSpeed());
            tank.setPassengersCapacity(newTank.getPassengersCapacity());
            tank.setId(newTank.getId());

            tanksRepository.save(tank);
            return tank;

        } else {
            return null;
        }
    }

}