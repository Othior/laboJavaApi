package technofutur.labo.larnak.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import technofutur.labo.larnak.Model.entities.Utilisateur;
import technofutur.labo.larnak.Model.repositories.UtilisateurRepository;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository repo;

    public Utilisateur create(Utilisateur utilisateur){
        return repo.save(utilisateur);
    }

    public Utilisateur read(int id){
        return repo.findById(id).orElse(null);
    }

    public Utilisateur update(int id,Utilisateur utilisateur){
        Utilisateur exist = repo.findById(id).orElse(null);

        exist.setEmail(utilisateur.getEmail());
        exist.setFirstname(utilisateur.getFirstname());
        exist.setLastname(utilisateur.getLastname());
        exist.setPassword(utilisateur.getPassword());
        exist.setPseudo(utilisateur.getPseudo());

        return repo.save(exist);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "L'utilisateur a bien été supprimer possedant l'id => " + id;
    }

    public List<Utilisateur> getList(){
        return repo.findAll();
    }
}
