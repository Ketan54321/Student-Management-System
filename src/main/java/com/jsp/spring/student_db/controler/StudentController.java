package com.jsp.spring.student_db.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring.student_db.entity.Student;
import com.jsp.spring.student_db.service.StudentService;

@org.springframework.stereotype.Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
	@RequestMapping(value="/add-student",method=RequestMethod.POST)
	public ModelAndView addStudent(Student student) {
		return service.addStudent(student);
	}
	
	@RequestMapping("/find-student")
	public ModelAndView findStudent(@RequestParam int sId) {
		return service.findStudent(sId);
	}
	@RequestMapping("/update-student")
	public ModelAndView updateStudent(@RequestParam int sId,@RequestParam String sName,@RequestParam String sEmail,@RequestParam String sCity,@RequestParam String sCourse,@RequestParam byte sAge,@RequestParam long sPhonNo) {
		Student student=new Student();
		student.setsId(sId);
		student.setsName(sName);
		student.setsEmail(sEmail);
		student.setsCity(sCity);
		student.setsCourse(sCourse);
		student.setsAge(sAge);
		student.setsPhoneNo(sPhonNo);
		
		return service.updateStudent(student);
	}
	@RequestMapping("/delete-student")
	public ModelAndView deleteStudent(@RequestParam int sId) {
		return service.deleteStudent(sId);
	}
	
	@RequestMapping(value="/display-all-student" ,method=RequestMethod.GET)
	public ModelAndView displayAllStudent() {
		return service.displayAllStudent();
	}

}
