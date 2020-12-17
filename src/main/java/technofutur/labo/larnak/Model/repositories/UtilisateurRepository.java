package technofutur.labo.larnak.Model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import technofutur.labo.larnak.Model.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
    
}
