package com.pathologyerp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pathologyerp.entity.Patient;
import com.pathologyerp.service.PatientService;

@RestController
@RequestMapping("pathology")
public class PathologyController {

	@Autowired
	PatientService patientService;
	
	@RequestMapping("/patients")
	public ResponseEntity<?> getAllPatients(){
		List<Patient> patientList = (List<Patient>) patientService.findAll();
		return new ResponseEntity<List>(patientList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getPatientDetailsById" , method=RequestMethod.POST, consumes= {"application/json"})
	public ResponseEntity<?> getPatientDetailsById(@RequestBody int patientId){
		Patient patient = patientService.findOne(patientId);
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getPatientDetailsByFirstName" , method=RequestMethod.POST, consumes= {"application/json"})
	public ResponseEntity<?> getPatientDetailsByFirstName(@RequestBody String firstName){
		List<Patient> patientList = (List<Patient>) patientService.findByFirstName(firstName);
		return new ResponseEntity<List>(patientList, HttpStatus.OK);
	}

	@RequestMapping(value="/getPatientDetailsByLastName" , method=RequestMethod.POST, consumes= {"application/json"})
	public ResponseEntity<?> getPatientDetailsByLastName(@RequestBody String lastName){
		List<Patient> patientList = (List<Patient>) patientService.findByLastName(lastName);
		return new ResponseEntity<List>(patientList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/savePatientDetails", method=RequestMethod.POST, consumes= {"application/json"})
	public ResponseEntity<?> savePatientDetails(@RequestBody Patient patient){
		patientService.save(patient);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/deletePatient", method=RequestMethod.POST, consumes= {"application/json"})
	public ResponseEntity<?> deletePatient(@RequestBody int patientId){
		patientService.delete(patientId);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
}
