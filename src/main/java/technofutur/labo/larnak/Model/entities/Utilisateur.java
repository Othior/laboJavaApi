package technofutur.labo.larnak.Model.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    
    // @Min(4)
    // @Max(20)
    private String pseudo;

    
    // @Min(6)
    private String password;

    
    // @Max(50)
    private String lastname;

    
    // @Max(50)
    private String firstname;

    
    // @Email
    // @Max(255)
    private String email;

}
