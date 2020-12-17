package technofutur.labo.larnak.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import technofutur.labo.larnak.Model.entities.*;
import technofutur.labo.larnak.Service.ChambreService;

@RequestMapping("/api/chambre")
@CrossOrigin(origins = "*")
@RestController
public class ChambreController {

    @Autowired
    private ChambreService service;

    @GetMapping("/list")
    public List<Chambre> getList(){
        return service.getList();
    }

    @GetMapping("/read/{id}")
    public Chambre read(@PathVariable int id){
        return service.read(id);
    }

    @PostMapping("/create")
    public Chambre create(@RequestBody Chambre chambre){
        return service.create(chambre);
    }

    @PutMapping("/update/{id}")
    public Chambre update(@PathVariable int id,@RequestBody Chambre chambre){
        return service.update(id, chambre);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return service.delete(id);
    }

    // @PutMapping("/changeGerant/{id}")
    // public Chambre changeGerant(int idUser,Chambre chambre){
    //     return service.changeGerant(idUser,chambre);
    // }

    // @GetMapping("/isValid/{id}/{id}")
    // public Chambre dejaPrit(@PathVariable int idChambre , @PathVariable int idReservation){
    //     return service.dejaPrit(idChambre,idReservation);
    // }

    // @PutMapping("/activiterProx")
    // public Chambre activiterProximiter(Activiter activiter){
    //     return service.activiterProximiter(activiter);
    // }

}
