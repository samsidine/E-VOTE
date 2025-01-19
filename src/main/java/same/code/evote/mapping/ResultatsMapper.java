package same.code.evote.mapping;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import same.code.evote.dto.ResultatsDto;
import same.code.evote.entity.ResultatsEntity;
@Service
public class ResultatsMapper {
    public ResultatsDto getDto(ResultatsEntity resultatsEntity){
        ResultatsDto resultatsDto = new ResultatsDto();
        BeanUtils.copyProperties(resultatsEntity, resultatsDto);
        return resultatsDto;

    }
    public ResultatsEntity getEntity(ResultatsDto resultatsDto){
       ResultatsEntity resultatsEntity = new ResultatsEntity();
        BeanUtils.copyProperties( resultatsDto, resultatsEntity);
        return resultatsEntity;

    }
}
