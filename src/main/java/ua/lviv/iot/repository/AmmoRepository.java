package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Ammo;

@Repository
public interface AmmoRepository extends JpaRepository<Ammo, Integer> {
}
