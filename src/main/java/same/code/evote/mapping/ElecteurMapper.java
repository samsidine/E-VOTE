package same.code.evote.mapping;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import same.code.evote.dto.ElecteurDto;
import same.code.evote.entity.ElecteurEntity;
@Service
public class ElecteurMapper {

    public ElecteurDto getDto(ElecteurEntity electeurEntity){
        ElecteurDto electeurDto = new ElecteurDto();
        BeanUtils.copyProperties(electeurEntity, electeurDto);
        return electeurDto;

    }

    public ElecteurEntity getEntity(ElecteurDto  electeurDto){
        ElecteurEntity electeurEntity = new ElecteurEntity();
        BeanUtils.copyProperties( electeurDto, electeurEntity);
        return  electeurEntity;

    }
}
