package technofutur.labo.larnak.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import technofutur.labo.larnak.Model.entities.Activiter;
import technofutur.labo.larnak.Service.ActiviterService;

@RequestMapping("/api/activiter")
@CrossOrigin(origins = "*")
@RestController
public class ActiviterController {
    
    @Autowired
    private ActiviterService service;

    @PostMapping("/create")
    public Activiter create(@RequestBody Activiter activiter) {
        return service.create(activiter);
    }

    @GetMapping("/list")
    public List<Activiter> getList() {
        return service.getList();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return service.delete(id);
    }
}
