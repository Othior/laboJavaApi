package technofutur.labo.larnak.Model.entities;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="activiter")
public class Activiter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @Max(20)
    // @NotBlank
    private String nom;

    // @Max(255)
    private String description;
}
