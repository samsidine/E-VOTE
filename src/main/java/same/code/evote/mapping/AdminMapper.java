package same.code.evote.mapping;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import same.code.evote.dto.AdminDto;
import same.code.evote.entity.AdminEntity;
@Service
public class AdminMapper {
    public AdminDto getDto(AdminEntity adminEntity){
        AdminDto adminDto = new AdminDto();
        BeanUtils.copyProperties(adminEntity, adminDto);
        return adminDto;

    }
    public AdminEntity getEntity(AdminDto  adminDto){
        AdminEntity adminEntity = new AdminEntity();
        BeanUtils.copyProperties( adminDto, adminEntity);
        return  adminEntity;

    }
}
