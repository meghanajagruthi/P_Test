package com.Plash.DAOImpl;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Plash.DAO.Dao;
import com.Plash.POJO.Pojo;

@Repository
public class DaoImpl implements Dao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public void insertData(Pojo pojo) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(pojo);
		
	}

	@Transactional
	public ArrayList<Pojo> getAllRecords() {
		// TODO Auto-generated method stub
		
		Session session =sessionFactory.getCurrentSession();
		Query query= session.createQuery("from Pojo");
		return  (ArrayList<Pojo>)query.list();
	}

}
