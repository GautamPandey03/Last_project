package com.nagarro.dao;

import com.nagarro.models.User;

/**
 * AuthDao Interface
 */
public interface AuthDao {
	/**
	 * @param user
	 * @return is User Authenticated
	 */
	boolean isAuthUser(User user);
}
