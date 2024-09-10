import com.linkedin.pe.recruit.candidateevaluation.reviewCouncil.dto.response.HostManagersDto;
import com.linkedin.pe.recruit.candidateevaluation.reviewCouncil.service.HostManagerService;
import io.swagger.v3.oas.annotations.Operation;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
@Slf4j
public class HostManagerController {

  @Autowired
  private HostManagerService hostManagerService;

  @Operation(summary = "API to fetch host managers based on applicationId ")
  @GetMapping(value ="/application/{application_id}/host_managers", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<HostManagersDto> getHostManagersByApplicationId(@PathVariable("application_id") UUID applicationId){

	log.info("Fetching host managers for application id : {} ",applicationId);

	return ResponseEntity.ok(hostManagerService.getHostManagerByApplicationId(applicationId));
  }
}
