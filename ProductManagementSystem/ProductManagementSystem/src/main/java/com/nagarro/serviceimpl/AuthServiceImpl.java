package com.nagarro.serviceimpl;

import com.nagarro.dao.AuthDao;
import com.nagarro.daoimpl.AuthDaoImpl;
import com.nagarro.models.User;
import com.nagarro.service.AuthService;

/**
 *  Auth Service Implementation
 */
public class AuthServiceImpl implements AuthService {
	private final AuthDao authDao;
	
	/**
	 * AuthDao Initialisation
	 */
	public AuthServiceImpl() {
	this.authDao=new AuthDaoImpl();
	}
	
	/* (non-Javadoc)
	 * @see com.training.nagarro.web.service.AuthService#isAuthUser(com.training.nagarro.web.models.User)
	 */
	@Override
	public boolean isAuthUser(User user) {
		return authDao.isAuthUser(user);
	}

	
}
