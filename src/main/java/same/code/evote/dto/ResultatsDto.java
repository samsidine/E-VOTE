package same.code.evote.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import same.code.evote.entity.CandidatEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResultatsDto {

    private Long id;

    private double nombreDeVote;

    private CandidatEntity candidat;

}
