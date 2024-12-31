package edu.cjc.main.ServiceI;

import java.util.List;

import edu.cjc.main.model.Student;

public interface StudentServiceI {
	
	public List<Student> savestudent(Student s);

	public List<Student> getAlldata();

}
