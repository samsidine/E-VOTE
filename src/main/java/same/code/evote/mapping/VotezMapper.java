package same.code.evote.mapping;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import same.code.evote.dto.VotezDto;
import same.code.evote.entity.VotezEntity;
@Service
public class VotezMapper {
    public VotezDto getDto(VotezEntity votez){
        VotezDto votezDto = new VotezDto();
        BeanUtils.copyProperties(votez, votezDto);
        return votezDto;

    }
    public VotezEntity getEntity(VotezDto  votezDto){
        VotezEntity votez = new VotezEntity();
        BeanUtils.copyProperties( votezDto, votez);
        return  votez;

    }
}
