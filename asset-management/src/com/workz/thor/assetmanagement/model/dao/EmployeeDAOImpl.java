package com.workz.thor.assetmanagement.model.dao;

import java.io.Serializable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.workz.thor.assetmanagement.dto.EmployeeDTO;
import com.workz.thor.assetmanagement.entity.EmployeeEntity;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public EmployeeEntity verifyEmailAndPassword(EmployeeDTO dto) {
		System.out.println("inside verifyEmailAndPassword().....");

		Session session = null;

		try {
			session = factory.openSession();
			System.out.println("session is open");
			Transaction tx = session.beginTransaction();

			Query query = session.getNamedQuery("findByEmailAndPassword");
			System.out.println("email:" + dto.getEmplEmail());
			System.out.println("paswd: " + dto.getEmpPassword());
			query.setParameter("eMail", dto.getEmplEmail());
			query.setParameter("pwd", dto.getEmpPassword());
			System.out.println(query);
			EmployeeEntity entity = (EmployeeEntity) query.uniqueResult();
			System.out.println("entity after getting from db....." + entity);
			System.out.println("Transction commited...");

			return entity;

		} catch (Exception e) {
			System.err.println(e);
			session.getTransaction().rollback();
		} finally {
			session.close();
		}

		return null;
	}

}
