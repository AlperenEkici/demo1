package Camp.demo1.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Camp.demo1.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
