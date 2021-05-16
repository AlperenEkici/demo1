package Camp.demo1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Camp.demo1.business.abstracts.JobPositionService;
import Camp.demo1.dataAcces.abstracts.JobPositionDao;
import Camp.demo1.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
 
	@Override
	public List<JobPosition> getAll() {
		return jobPositionDao.findAll();
	}
	
	
}
