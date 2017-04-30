package com.pathologyerp.service;

import org.springframework.data.repository.CrudRepository;

import com.pathologyerp.entity.Patient;

public interface PatientService extends CrudRepository<Patient, Integer>{
	Patient findByFirstName(String name);
}
