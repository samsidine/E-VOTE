package same.code.evote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import same.code.evote.entity.CandidatEntity;

public interface IcandidatRepository extends JpaRepository<CandidatEntity ,Long> {

    CandidatEntity findByEmail( String email);

}
