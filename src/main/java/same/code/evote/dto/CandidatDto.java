package same.code.evote.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CandidatDto {

    private Long id;

    private String nom;

    private String prenom;

    private LocalDate dateNaissance;

    private String email;

    private int cni;

    private int numElecteur;

    private String tel;
}
