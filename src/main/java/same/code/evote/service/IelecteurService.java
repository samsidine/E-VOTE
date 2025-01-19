package same.code.evote.service;

import same.code.evote.dto.ElecteurDto;

import java.util.List;

public interface IelecteurService {
    ElecteurDto save(ElecteurDto electeurDto);

    List<ElecteurDto> electeurs();

    ElecteurDto findById(long id);


    ElecteurDto findByNumElecteur(int numElecteur);

    void deleteById(long id);

    ElecteurDto update(ElecteurDto electeurDto);
}
