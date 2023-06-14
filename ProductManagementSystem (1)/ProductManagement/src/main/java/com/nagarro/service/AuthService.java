package com.nagarro.service;

import com.nagarro.models.User;

/**
 * Authorisation service interface
 */
public interface AuthService{
	/**
	 * @param user
	 * @return true if authenticated
	 */
	boolean isAuthUser(User user);
}