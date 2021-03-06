package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.ExperienceForCVService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.ExperienceForCVDao;
import kodlamaio.HRMS.entities.concretes.ExperienceForCV;

@Service
public class ExperienceForCVManager implements ExperienceForCVService{

	private ExperienceForCVDao experienceForCVDao;
	
	@Autowired
	public ExperienceForCVManager(ExperienceForCVDao experienceForCVDao) {
		super();
		this.experienceForCVDao = experienceForCVDao;
	}

	@Override
	public Result add(ExperienceForCV experienceForCV) {
		this.experienceForCVDao.save(experienceForCV);
		return new SuccessResult("Experience has been added.");
	}

	@Override
	public Result update(ExperienceForCV experienceForCV) {
		this.experienceForCVDao.save(experienceForCV);
		return new SuccessResult("Experience has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.experienceForCVDao.deleteById(id);
		return new SuccessResult("Experience has been deleted.");
	}

	@Override
	public DataResult<ExperienceForCV> getById(int id) {
		return new SuccessDataResult<ExperienceForCV>(this.experienceForCVDao.getById(id));
	}

	@Override
	public DataResult<List<ExperienceForCV>> getAll() {
		return new SuccessDataResult<List<ExperienceForCV>>(this.experienceForCVDao.findAll());
	}

	@Override
	public DataResult<List<ExperienceForCV>> getAllByJobseekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<ExperienceForCV>>(this.experienceForCVDao.getAllByJobseeker_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<ExperienceForCV>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<ExperienceForCV>>(this.experienceForCVDao.getAllByJobseeker_id(id));
	}
}