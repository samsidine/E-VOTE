package same.code.evote.mapping;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import same.code.evote.dto.AdminDto;
import same.code.evote.entity.UserEntity;
@Service
public class AdminMapper {
    public AdminDto getDto(UserEntity adminEntity){
        AdminDto adminDto = new AdminDto();
        BeanUtils.copyProperties(adminEntity, adminDto);
        return adminDto;

    }
    public UserEntity getEntity(AdminDto  adminDto){
        UserEntity adminEntity = new UserEntity();
        BeanUtils.copyProperties( adminDto, adminEntity);
        return  adminEntity;

    }
}
