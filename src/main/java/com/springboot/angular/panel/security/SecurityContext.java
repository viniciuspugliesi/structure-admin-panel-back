package com.springboot.angular.panel.security;

public final class SecurityContext {

	private static UserSecurity userSecurity;

	private SecurityContext() {
		
	}
	
	public static UserSecurity getUserSecurity() {
		return userSecurity;
	}

	public static void setUserSecurity(UserSecurity userSecurity) {
		SecurityContext.userSecurity = userSecurity;
	}
	
}
