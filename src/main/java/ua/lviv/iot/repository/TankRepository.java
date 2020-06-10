package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Tank;

@Repository
public interface TankRepository extends JpaRepository<Tank, Integer> {
}
