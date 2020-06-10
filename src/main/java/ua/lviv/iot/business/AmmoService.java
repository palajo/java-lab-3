package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Ammo;
import ua.lviv.iot.repository.AmmoRepository;

@Service
public class AmmoService extends AbstractService<Ammo> {

    @Autowired
    private AmmoRepository ammoRepository;

    @Override
    protected JpaRepository<Ammo, Integer> getRepository() {
        return ammoRepository;
    }

    @Override
    public Ammo update(Ammo ammo, Integer id) {
        if (ammoRepository.existsById(id)) {
            this.deleteById(id);
            ammo.setId(id);
            ammoRepository.save(ammo);
            return ammo;
        } else {
            return null;
        }
    }
}
