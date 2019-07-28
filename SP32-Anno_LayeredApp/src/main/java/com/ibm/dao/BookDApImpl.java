package com.ibm.dao;


import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Book;
import com.ibm.utility.HibernateUtils;

@Repository
public class BookDApImpl implements BookDAO {

	@Override
	public boolean saveBook(Book book) {
		Session ses=null;
		Transaction tx=null;
		int count=0;
		boolean flag=false;
		//get Session
		ses=HibernateUtils.getSession();
		try {
			tx=ses.beginTransaction();
			 count=(int) ses.save(book);
			 flag=true;
		}catch (Exception e) {
           e.printStackTrace();
           flag=false;
		}//catch
		
		finally {
			if(flag) {
				tx.commit();
				System.out.println("Records are Inserted...");
			}else {
				tx.rollback();
			}
			HibernateUtils.closeSession(ses);
		}//finally
		return flag;
	}
	
	

}
