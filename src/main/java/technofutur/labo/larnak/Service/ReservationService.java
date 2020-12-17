package technofutur.labo.larnak.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import technofutur.labo.larnak.Model.entities.Reservation;
import technofutur.labo.larnak.Model.repositories.ReservationRepository;

@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository repo;

    public Reservation create(Reservation reservation){
        return repo.save(reservation);
    }

    public Reservation read(int id){
        return repo.findById(id).orElse(null);
    }

    public Reservation update(int id,Reservation reservation){
        Reservation exist = repo.findById(id).orElse(null);

        exist.setDatearriver(reservation.getDatearriver());
        exist.setDatedepart(reservation.getDatedepart());
        exist.setPersonne(reservation.getPersonne());

        return repo.save(exist);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Reservation a bien été supprimer possedant l'id => " + id;
    }

    public List<Reservation> getList(){
        return repo.findAll();
    } 

    
}
