package same.code.evote.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "votez")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VotezEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")

    private Long id;

    @Column(name="HEURE_VOTE")
    private LocalDate heureVote;

    @ManyToOne
    private ElecteurEntity electeur;

    @ManyToOne
    private CandidatEntity candidat;
}
