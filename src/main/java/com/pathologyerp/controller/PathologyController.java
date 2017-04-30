package com.pathologyerp.controller;

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
		System.out.println("On patients page");
		System.out.println(patientService.findByFirstName("Ashish").getFirstName());
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/savePatientDetails", method=RequestMethod.POST, consumes= {"application/json"})
	public ResponseEntity<?> savePatientDetails(@RequestBody Patient patient){
		patientService.save(patient);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping("/tests")
	public ResponseEntity<?> getAllTests(){
		System.out.println("On Tests page");
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
}
