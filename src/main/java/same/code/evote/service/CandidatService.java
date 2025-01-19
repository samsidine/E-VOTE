package same.code.evote.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional(rollbackOn = {Throwable.class})
public class CandidatService implements IcandidatService{
}
