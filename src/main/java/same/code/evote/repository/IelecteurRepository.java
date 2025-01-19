package same.code.evote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import same.code.evote.entity.ElecteurEntity;

public interface IelecteurRepository extends JpaRepository<ElecteurEntity ,Long> {

    ElecteurEntity findByEmail(String email);

    ElecteurEntity findByNumElecteur(int numElecteur);
}
