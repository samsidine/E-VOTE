package same.code.evote.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "electeur")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ElecteurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")

    private Long id;

    @Column(name="NOM")
    private String nom;
    @Column(name="PRENOM")
    private String prenom;
    @Column(name="AGE_NAISSANCE")
    private LocalDate dateNaissance;
    @Column(name="EMAIL")
    private String email;
    @Column(name="NUM_CNI")
    private int cni;
    @Column(name="NUM_ELECTEUR")
    private int numElecteur;
    @Column(name="TELLEPHONE")
    private String tel;
    @Column(name="MOTS_PASSE")
    private String motDePasse;
}
