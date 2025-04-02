	package com.jsp.spring.student_db.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.jsp.spring.student_db.entity.Student;

@Repository
public class StudentRepository {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql-config");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void addStudent(Student student) {
		EntityManager entityManager = this.entityManager;
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(student);

		entityTransaction.commit();
	}

	public Student findStudent(int sId) {
		EntityManager entityManager = this.entityManager;
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student s = entityManager.getReference(Student.class, sId);
		entityTransaction.commit();
		return s;
	}

	public void updateStudent(Student student) {
		EntityManager entityManager = this.entityManager;
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.merge(student);

		entityTransaction.commit();
	}

	public void deleteStudent(int sId) {
		EntityManager entityManager = this.entityManager;
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student s = entityManager.getReference(Student.class, sId);
		entityManager.remove(s);
		entityTransaction.commit();
	}

	public List<Student> displayAllStudent() {
		EntityManager entityManager = this.entityManager;
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Query<Student> q=(Query<Student>) entityManager.createQuery("from Student");
		
		List<Student> l =q.getResultList();
		entityTransaction.commit();
		return l;
	}

}
