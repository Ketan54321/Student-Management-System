package com.jsp.spring.student_db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring.student_db.entity.Student;
import com.jsp.spring.student_db.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;

	public ModelAndView addStudent(Student student) {
		repository.addStudent(student);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}

	public ModelAndView findStudent(int sId) {
		Student s=repository.findStudent(sId);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("UpdateStudent.jsp");
		mav.addObject("student",s);
		return mav;
	}

	public ModelAndView updateStudent(Student student) {
		repository.updateStudent(student);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}

	public ModelAndView deleteStudent(int sId) {
		repository.deleteStudent(sId);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}

	public ModelAndView displayAllStudent() {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("DisplayAllStudent.jsp");
		mav.addObject("list",repository.displayAllStudent());
		return mav;
	}

}
