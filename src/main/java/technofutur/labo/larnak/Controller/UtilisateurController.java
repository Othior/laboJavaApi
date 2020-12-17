package technofutur.labo.larnak.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import technofutur.labo.larnak.Model.entities.Utilisateur;
import technofutur.labo.larnak.Service.UtilisateurService;

@RequestMapping("/api/utilisateur")
@CrossOrigin(origins = "*")
@RestController
public class UtilisateurController {
    
    @Autowired
    private UtilisateurService service;

    @GetMapping("/list")
    public List<Utilisateur> getList() {
        return service.getList();
    }

    @GetMapping("/read/{id}")
    public Utilisateur read(@PathVariable int id) {
        return service.read(id);
    }

    @PostMapping("/create")
    public Utilisateur create(@RequestBody Utilisateur utilisateur) {
        System.out.println(
        " email => " + utilisateur.getEmail() + " | " 
        + " pseudo => " +utilisateur.getPseudo() + " | " 
        + " firstname => " + utilisateur.getFirstname() + " | " 
        + " lastname => " + utilisateur.getLastname() + " | " 
        + " password => " + utilisateur.getPassword() + " | " 
        );
        return service.create(utilisateur);
    }

    @PutMapping("/update/{id}")
    public Utilisateur update(@PathVariable int id, @RequestBody Utilisateur utilisateur){
        return service.update(id,utilisateur);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return service.delete(id);
    }
}
