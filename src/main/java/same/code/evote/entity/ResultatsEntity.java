package same.code.evote.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "resultat")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResultatsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")

    private Long id;

    @Column(name="NOMBRE_VOTE")
    private double nombreDeVote;

    @ManyToOne
    private CandidatEntity candidat;


}
