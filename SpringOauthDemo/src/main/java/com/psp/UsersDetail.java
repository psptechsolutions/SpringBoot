 package com.psp;


	public class UsersDetail extends UsersPojo {
		public UsersDetail(UsersPojo user) {
			super(user.getUsername(), user.getPassword(), user.getListOfgrantedAuthorities());
		}
	}
