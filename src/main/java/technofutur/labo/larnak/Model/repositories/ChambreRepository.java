package technofutur.labo.larnak.Model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

// import technofutur.labo.larnak.Model.entities.Activiter;
import technofutur.labo.larnak.Model.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Integer>{

     // Chambre dejaPrit(int idChambre,int idReservation);

     // Chambre changeGerant(int idUser ,int idChambre);

     // Chambre activiterProximiter(Activiter activiter);
}
