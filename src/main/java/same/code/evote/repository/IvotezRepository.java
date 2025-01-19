package same.code.evote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import same.code.evote.entity.VotezEntity;

public interface IvotezRepository extends JpaRepository<VotezEntity , Long> {
VotezEntity findById (long id);
}
