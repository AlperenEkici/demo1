package Camp.demo1.business.abstracts;

import java.util.List;


import Camp.demo1.entities.concretes.JobPosition;


public interface JobPositionService {
	
	List<JobPosition> getAll();

}
