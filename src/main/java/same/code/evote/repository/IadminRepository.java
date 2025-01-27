package same.code.evote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import same.code.evote.entity.UserEntity;

public interface IadminRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail (String email);
}
