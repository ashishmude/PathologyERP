package com.pathologyerp.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pathologyerp.entity.Patient;

public interface PatientService extends CrudRepository<Patient, Integer>{
	List<Patient> findByFirstName(String firstName);
	List<Patient> findByLastName(String lastName);
}
