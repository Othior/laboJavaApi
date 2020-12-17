package technofutur.labo.larnak.Model.entities;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reservation")
public class Reservation{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @Max(12)
    // @Min(1)
    // @PositiveOrZero // @Positive // @Negative // @NegativeOrZero
    // @NotNull
    private int personne;
    
    // @NotNull
    private LocalDate datearriver;

    // @NotNull
    private LocalDate datedepart;

    // @NotNull
    private Integer iduser;
    
    // @NotNull
    private Integer idchambre;

}
