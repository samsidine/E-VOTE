package same.code.evote.mapping;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import same.code.evote.dto.CandidatDto;
import same.code.evote.entity.CandidatEntity;
@Service
public class CandidatMapper {

    public CandidatDto getDto(CandidatEntity candidatEntity){
        CandidatDto candidatDto = new CandidatDto();
        BeanUtils.copyProperties(candidatEntity, candidatDto);
        return candidatDto;

    }

    public CandidatEntity getEntity(CandidatDto  candidatDto){
        CandidatEntity candidatEntity = new CandidatEntity();
        BeanUtils.copyProperties( candidatDto, candidatEntity);
        return  candidatEntity;

    }
}
