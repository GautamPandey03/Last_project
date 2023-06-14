package com.nagarro.daoimpl;

import com.nagarro.dao.AuthDao;
import com.nagarro.models.User;
import com.nagarro.utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *  AuthDaoImplementation
 */
public class AuthDaoImpl implements AuthDao {
	private static final String USERNAMEQUERY="from User where username='";
	private static final String PASSWORDQUERY="' and password='";
	
	/* (non-Javadoc)
	 * @see com.training.nagarro.web.dao.AuthDao#isAuthUser(com.training.nagarro.web.models.User)
	 */
	@Override
	public boolean isAuthUser(User user) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction t=session.beginTransaction();
			StringBuilder query=new  StringBuilder();
			query.append(USERNAMEQUERY+user.getUsername());
			query.append(PASSWORDQUERY+user.getPassword()+"'");
			User isUser=session.createQuery(query.toString(),User.class).uniqueResult();
			t.commit();
			return isUser!=null && isUser.getUsername().equals(user.getUsername());
		}
	}

}
