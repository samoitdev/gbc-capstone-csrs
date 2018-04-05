package com.groupthink.csr.dao;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.groupthink.csr.entity.admin.User;
import com.groupthink.csr.entity.admin.UserRole;

@Repository
public class UserDAOImpl implements UserDAO {
/*
	@Autowired
	private SessionFactory securitySessionFactory;
*/	
	@Autowired
	private SessionFactory securitySessionFactory;
	
	@Override
	public List<User> getUsers() {
		
		// get the current hibernate session
		Session currentSession = securitySessionFactory.getCurrentSession();
						
		// create a query  ... sort by last name
		Query<User> usersQuery = 
				currentSession.createQuery("from users",
											User.class);
				
		// execute query and get result list
		List<User> users = usersQuery.getResultList();
						
		// return the results		
		return users;
	}

}
