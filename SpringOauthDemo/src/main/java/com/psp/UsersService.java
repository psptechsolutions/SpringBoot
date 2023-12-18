package com.psp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements UserDetailsService {

	@Autowired
	UsersDBQuery usersDBQuery;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsersPojo usersPojo = null;
		UsersDetail userDetail=null;
		try {
			usersPojo = usersDBQuery.getUserDetails(username);
			userDetail = new UsersDetail(usersPojo);
			return userDetail;
		} catch (Exception e) {
			e.printStackTrace();
			throw new UsernameNotFoundException("User " + username + " was not found in the database");
		}
	}

}
