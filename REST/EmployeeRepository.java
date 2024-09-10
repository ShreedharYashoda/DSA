import com.linkedin.pe.recruit.candidateevaluation.enums.CriteriaCategory;
import com.linkedin.pe.recruit.candidateevaluation.models.Employee;
import com.linkedin.pe.recruit.candidateevaluation.schedule.dto.EmployeeInterviewDetailsDto;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import static com.linkedin.pe.recruit.candidateevaluation.repository.EmployeeAvailabilityQueryConstant.*;


//@formatter:off
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
  Optional<Employee> findByEmail(String email);

  Optional<Employee> findByWorkerId(String workerId);

  List<Employee> findAllByIdIn(@Param("ids") List<UUID> ids);

  @Query(value = "SELECT e FROM Employee e "
	  + "WHERE e.isActive = true "
	  + "AND e.workerType = 'Employee'")
  List<Employee> findAllActiveFullTime();

  @Query(nativeQuery = true, name = "Employee.orderedInterviewers")
  List<EmployeeInterviewDetailsDto> orderedListOfInterviewers(List<String> empIds, Long criteriaId, String startWeekDay, String endWeekDay,
	  Integer limit, LocalDateTime presentDateTime);

  @Query(value = AVAILABLE_INTERVIEWERS_QUERY, nativeQuery = true)
  List<Map<String, String>> availableInterviewerListByCriteria(Long criteriaId,
	  String startTime, String endTime, Boolean isApprentice, String searchTerm, List<String> includeList,
	  List<String> excludeList);

  @Query(value = ELIGIBLE_INTERVIEWERS_QUERY, nativeQuery = true)
  List<Map<String, String>> eligibleInterviewerListByCriteria(Long criteriaId, Boolean isApprentice, List<String> includeList,List<String> excludeList, String searchTerm);

  @Query(value = "select e.id, e.work_email, e.first_name, e.last_name, e.user_name from sr.hiring_team t "
	  + "inner join sr.job j on j.sr_id = t.sr_job_id "
	  + "inner join sr.application a on a.job_sr_id = j.sr_id "
	  + "inner join wd.employee e on e.worker_id = t.wd_worker_id "
	  + "where a.id = :applicationId and t.sr_role = :role", nativeQuery = true)
  List<Employee> getEmployeeByApplicationHiringTeamRole(String applicationId, String role);


  Optional<Employee> findByUserNameAndIsActive(String userName , Boolean isActive);

  @Query("SELECT emp from Employee emp "
	  + "INNER JOIN Interviewer interviewer ON  interviewer.employee.id = emp.id "
	  + "INNER JOIN Interview i ON i.id = interviewer.interview.id "
	  +" INNER JOIN Criteria c ON c.id = i.criteria.id "
	  + "INNER JOIN Schedule s ON s.id  = i.schedule.id "
	  + "INNER JOIN Step st ON st.id = s.step.id  "
	  + "INNER JOIN Evaluation e ON e.id = st.evaluation.id "
	  + "where e.application.id = ?1 and c.category = ?2 and emp.isActive = ?3 ")
  List<Employee> getHostManagersByApplicationId(UUID applicationId, CriteriaCategory category, Boolean isActive);


  Optional<Employee> findEmployeeById(UUID uuid);
}
