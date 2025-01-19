package same.code.evote.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import same.code.evote.dto.ElecteurDto;
import same.code.evote.entity.ElecteurEntity;
import same.code.evote.mapping.ElecteurMapper;
import same.code.evote.repository.IelecteurRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackOn = {Throwable.class})
public class ElecteurService implements IelecteurService{

    @Autowired
    IelecteurRepository ielecteurRepository;

    @Autowired
    ElecteurMapper electeurMapper;

    @Override
    public ElecteurDto save(ElecteurDto electeurDto) {
        ElecteurEntity existeElecteur = ielecteurRepository.findByNumElecteur(electeurDto.getNumElecteur());
        if(existeElecteur!=null) {
            throw new RuntimeException("electeur existe deja ");
        }

        ElecteurEntity electeurEntity = electeurMapper.getEntity(electeurDto);
        ElecteurEntity electeur = ielecteurRepository.save(electeurEntity);
        ElecteurDto dto = electeurMapper.getDto(electeur);
        return null;

    }

    @Override
    public List<ElecteurDto> electeurs() {
        List<ElecteurEntity> electeurEntities  = ielecteurRepository.findAll();
        List<ElecteurDto> electeurDtos = electeurEntities.stream().map(electeurEntity -> electeurMapper.getDto(electeurEntity)).collect(Collectors.toList());

        return electeurDtos;

    }

    @Override
    public ElecteurDto findById(long id) {
        ElecteurEntity electeurEntity = ielecteurRepository.getReferenceById(id);
        ElecteurDto electeurDto = electeurMapper.getDto(electeurEntity);
        return electeurDto ;
    }

    @Override
    public ElecteurDto findByNumElecteur(int numElecteur) {
        ElecteurEntity electeurEntity = ielecteurRepository.findByNumElecteur(numElecteur);
        return electeurMapper.getDto(electeurEntity);
    }

    @Override
    public void deleteById(long id) {
        ielecteurRepository.deleteById(id);
    }

    @Override
    public ElecteurDto update(ElecteurDto electeurDto) {
        ElecteurEntity electeurSave =null;
        if (electeurDto!=null){
            ElecteurEntity electeurEntity = electeurMapper.getEntity(electeurDto);
            electeurSave= ielecteurRepository.save(electeurEntity);
        }
        return electeurMapper.getDto(electeurSave);

    }
}
