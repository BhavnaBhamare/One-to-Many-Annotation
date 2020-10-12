package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Depart;
import com.pojo.Student;

public class BLManager {

	SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
	public void saveDepart(Depart d) {
		// TODO Auto-generated method stub
		Session se= sf.openSession();
		Transaction t=se.beginTransaction();
		se.save(d);
		t.commit();
		se.close();
	}

	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		Session se= sf.openSession();
		Transaction t=se.beginTransaction();
		se.save(s);
		t.commit();
		se.close();		
	}

	public Depart searchby(String dname) {
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Depart.class);
		cr.add(Restrictions.eq("dname", dname));
		Depart d=(Depart)cr.uniqueResult();
		return d;
	}

	public List<Depart> serachlist()
	{
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Depart.class);
		List<Depart> dl=cr.list();
		return dl;
	}

}
