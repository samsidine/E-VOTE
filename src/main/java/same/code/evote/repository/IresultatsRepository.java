package same.code.evote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import same.code.evote.entity.ResultatsEntity;

public interface IresultatsRepository extends JpaRepository<ResultatsEntity , Long> {

    ResultatsEntity findById (long id);
}
