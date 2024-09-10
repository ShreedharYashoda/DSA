import com.linkedin.pe.recruit.candidateevaluation.enums.CriteriaCategory;
import com.linkedin.pe.recruit.candidateevaluation.models.Employee;
import com.linkedin.pe.recruit.candidateevaluation.repository.EmployeeRepository;
import com.linkedin.pe.recruit.candidateevaluation.reviewCouncil.dto.response.HostManagerDetailsDto;
import com.linkedin.pe.recruit.candidateevaluation.reviewCouncil.dto.response.HostManagersDto;
import com.linkedin.pe.recruit.candidateevaluation.utils.AuthUtil;
import com.linkedin.pe.recruit.commons.nextgen.authorization.enums.action.Action;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.linkedin.pe.recruit.commons.nextgen.authorization.enums.object.PrimaryObject.*;


@Slf4j
@Service
public class HostManagerServiceImplementation implements HostManagerService {

  @Autowired
  private EmployeeRepository employeeRepository;

  @Autowired
  AuthUtil _authUtil;

  @Override
  public HostManagersDto getHostManagerByApplicationId(UUID applicationId) {

	_authUtil.hasPermission(APPLICATION, List.of(Action.SCHEDULE_REVIEW_SESSION), String.valueOf(applicationId));
	List<Employee> hostManagersByApplicationId =
		employeeRepository.getHostManagersByApplicationId(applicationId, CriteriaCategory.HOST_MANAGER, Boolean.TRUE);

	List<HostManagerDetailsDto> mappedHostManagersDetails = Optional.of(hostManagersByApplicationId)
		.filter(employee -> !employee.isEmpty())
		.map(emp -> emp.stream()
			.map(hostManager -> HostManagerDetailsDto.builder()
				.employeeId(hostManager.getId())
				.employeeName(String.join(" ", hostManager.getFirstName(), hostManager.getLastName()))
				.email(hostManager.getEmail())
				.build())
			.collect(Collectors.toList()))
		.orElse(Collections.emptyList());

	log.info("Number of host managers fetched: {} ", hostManagersByApplicationId.size());

	return HostManagersDto.builder().hostManagers(mappedHostManagersDetails).build();
  }
}