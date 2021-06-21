package io.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.springboot.model.Doctor;

@RestController
public class DocController {
	
	List<Doctor> doctorList=new ArrayList<Doctor>();
	
	@RequestMapping("/create")
	public String add() {
		Doctor doc=new Doctor("Dr.Mishra",25,40);
		Doctor doc1=new Doctor("Dr.Satish",25,40);
		
		doctorList.add(doc);
		doctorList.add(doc1);
		return "Added successfully...";
	}
	@RequestMapping("/read")
	public List<Doctor> getAllRecord() {
		return doctorList;
	}
	@RequestMapping("/update")
	public String updateList() {
		 doctorList.get(0).setName("Dr.Choudhary");
		 return "Updated information";
	}
	@RequestMapping("/delete")
	public String removeElement() {
		doctorList.remove(0);
		return "Element deleted";
	}
}
