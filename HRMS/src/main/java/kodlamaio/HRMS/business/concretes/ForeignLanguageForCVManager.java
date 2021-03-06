package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.ForeignLanguageForCVService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.ForeignLanguageForCvDao;
import kodlamaio.HRMS.entities.concretes.ForeignLanguageForCV;

@Service
public class ForeignLanguageForCVManager implements ForeignLanguageForCVService{

	private ForeignLanguageForCvDao foreignLanguageForCvDao;
	
	@Autowired
	public ForeignLanguageForCVManager(ForeignLanguageForCvDao foreignLanguageForCvDao) {
		super();
		this.foreignLanguageForCvDao = foreignLanguageForCvDao;
	}

	@Override
	public Result add(ForeignLanguageForCV foreignLanguageForCV) {
		this.foreignLanguageForCvDao.save(foreignLanguageForCV);
		return new SuccessResult("Foreign language has been added.");
	}

	@Override
	public Result update(ForeignLanguageForCV foreignLanguageForCV) {
		this.foreignLanguageForCvDao.save(foreignLanguageForCV);
		return new SuccessResult("Foreign language has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.foreignLanguageForCvDao.deleteById(id);;
		return new SuccessResult("Foreign language has been deleted.");
	}

	@Override
	public DataResult<ForeignLanguageForCV> getById(int id) {
		return new SuccessDataResult<ForeignLanguageForCV>(this.foreignLanguageForCvDao.getById(id));
	}

	@Override
	public DataResult<List<ForeignLanguageForCV>> getAll() {
		return new SuccessDataResult<List<ForeignLanguageForCV>>(this.foreignLanguageForCvDao.findAll());
	}

	@Override
	public DataResult<List<ForeignLanguageForCV>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<ForeignLanguageForCV>>(this.foreignLanguageForCvDao.getAllByJobseeker_id(id));
	}

}