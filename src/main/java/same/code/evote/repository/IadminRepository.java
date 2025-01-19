package same.code.evote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import same.code.evote.entity.AdminEntity;

public interface IadminRepository extends JpaRepository<AdminEntity , Long> {
    AdminEntity findByEmail (String email);
}
