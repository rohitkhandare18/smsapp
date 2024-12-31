package edu.cjc.main.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.main.ServiceI.StudentServiceI;
import edu.cjc.main.model.Student;

@Controller
public class StudentController {
	
@Autowired
StudentServiceI st;
  
	@RequestMapping("/")
	public String login() {
		return"Login";
	}
	
	@RequestMapping("/Login")
	public String onlogin(@RequestParam("username") String username,@RequestParam("password") String password,Model m) {
		if(username.equals("admin")&& password.equals("admin")) {
			m.addAttribute("data", st.getAlldata());
		return "adminscreen";
		
	}
	else {
		m.addAttribute("login_ fail","Enter valid login details");
		return"Login";
	}
}
	@RequestMapping("/enroll_student")
	public String savestudent(@ModelAttribute Student s ,Model m) {
	List<Student>list=	st.savestudent(s);
		m.addAttribute("data", list);
		return "adminscreen";
		
	}
	
	
	}
