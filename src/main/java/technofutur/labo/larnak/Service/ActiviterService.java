package technofutur.labo.larnak.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import technofutur.labo.larnak.Model.entities.Activiter;
import technofutur.labo.larnak.Model.repositories.ActiviterRepository;

@Service
public class ActiviterService {
    @Autowired
    private ActiviterRepository repo;

    public Activiter create(Activiter activiter){
        return repo.save(activiter);
    }

    public String delete( int id) {
        repo.deleteById(id);
        return "l'activiter a été supprimer possedant l'id => " + id;
    }
    
    public List<Activiter> getList(){
        return repo.findAll();
    }

}
