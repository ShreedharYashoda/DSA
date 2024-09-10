import com.linkedin.pe.recruit.candidateevaluation.reviewCouncil.dto.response.HostManagersDto;
import java.util.UUID;


public interface HostManagerService {

  HostManagersDto getHostManagerByApplicationId(UUID applicationId);
}