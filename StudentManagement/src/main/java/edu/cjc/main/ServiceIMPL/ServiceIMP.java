package edu.cjc.main.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.main.Repo.StudentRepository;
import edu.cjc.main.ServiceI.StudentServiceI;
import edu.cjc.main.model.Student;


@Service
public class ServiceIMP implements StudentServiceI{

	@Autowired
	StudentRepository sr;

	@Override
	public List<Student> savestudent(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		return sr.findAll();
	}

	@Override
	public List<Student> getAlldata() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}
	
	
}
