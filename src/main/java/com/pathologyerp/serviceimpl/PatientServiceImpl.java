/*package com.pathologyerp.serviceimpl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.pathologyerp.entity.Patient;
import com.pathologyerp.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@PersistenceContext(unitName = "ApplicationPersistenceUnit")
	EntityManager entityManager;
	
	String querySTr ="select Id from Patients";
	
	@Override
	public void savePatientDetails() {
		Query query = entityManager.createNativeQuery(querySTr);
		List<Patient> patientList = (List<Patient>)query.getResultList();
		for(Patient patient : patientList){
			System.out.println(patient.getFirstName());
		}
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Patient arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Patient> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Patient> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Patient> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Patient> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Patient> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<QuoteEntity> getQuoteListByRFCustomerKey(String customerKey,
			String brandCode) {
		Query query = entityManager.createNativeQuery(
				GET_QUOTES_BY_RFCUSTOMERKEY, "QuoteResultSetEntity");
		query.setParameter("brandCode", brandCode);
		query.setParameter("customerKey", customerKey);
		return QuoteResultSetEntity.toQuoteEntities((List<Object>) query
				.getResultList());
	}

	

}
*/