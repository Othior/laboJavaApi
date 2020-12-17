package technofutur.labo.larnak.Model.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="chambre")
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    
    // @Length(min = 10 ,max = 100)
    // @NotNull
    private String adresse;

    
    // @Length(min = 2 ,max = 50)
    // @NotNull
    private String ville;

    // @Min(1)
    // @NotNull
    private int place;

    private int iduser;

}
