package technofutur.labo.larnak.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import technofutur.labo.larnak.Model.entities.Activiter;
import technofutur.labo.larnak.Model.entities.Reservation;
import technofutur.labo.larnak.Model.entities.Chambre;
import technofutur.labo.larnak.Model.repositories.ChambreRepository;
import technofutur.labo.larnak.Model.repositories.ReservationRepository;

@Service
public class ChambreService {
    
    @Autowired
    private ChambreRepository repo;
    @Autowired
    private ReservationRepository repoResv;

    public Chambre create(Chambre chambre){
        return repo.save(chambre);
    }

    public Chambre read(int id){
        return repo.findById(id).orElse(null);
    }

    public Chambre update(int id,Chambre chambre){
        Chambre exist = repo.findById(id).orElse(null);

        exist.setPlace(chambre.getPlace());
        exist.setAdresse(chambre.getAdresse());
        exist.setVille(chambre.getVille());

        return repo.save(exist);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Chambre a bien été supprimer possedant l'id => " + id;
    }

    public List<Chambre> getList(){
        return repo.findAll();
    }

    // public Chambre dejaPrit(int idChambre,int idReservation){

    //     Reservation existReservation = repoResv.findById(idReservation).orElse(null);

    //     if(idChambre == existReservation.getIdchambre()){
    //         System.out.println("vous possédez deja cette chambre");
    //     }
    //     return repo.dejaPrit(idChambre);
    // }

    // public Chambre changeGerant(int idUser,Chambre chambre){
    //     Chambre exist = repo.findById(idUser).orElse(null);

    //     exist.setIdUser(chambre.getIdUser());
    //     return repo.changeGerant(idUser, chambre);
    // }

    // public Chambre activiterProximiter(Activiter activiter){
    //     return null;
    // }

}
