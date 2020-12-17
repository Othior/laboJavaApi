package technofutur.labo.larnak.Model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import technofutur.labo.larnak.Model.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
    
}
