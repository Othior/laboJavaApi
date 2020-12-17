package technofutur.labo.larnak.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import technofutur.labo.larnak.Model.entities.Reservation;
import technofutur.labo.larnak.Service.ReservationService;

@RequestMapping("/api/reservation")
@CrossOrigin(origins = "*")
@RestController
public class ReservationController {
    
    @Autowired
    private ReservationService service;

    
    @GetMapping("/list")
    public List<Reservation> getList() {
        return service.getList();
    }

    @GetMapping("/read/{id}")
    public Reservation read(@PathVariable int id) {
        return service.read(id);
    }

    @PostMapping("/create")
    public Reservation create(@RequestBody Reservation reservation) {
        return service.create(reservation);
    }

    @PutMapping("/update/{id}")
    public Reservation update(@PathVariable int id,@RequestBody Reservation reservation){
        return service.update(id,reservation);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return service.delete(id);
    }
}
