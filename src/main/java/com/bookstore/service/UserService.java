package com.bookstore.service;

<<<<<<< HEAD
import com.bookstore.domain.User;
import com.bookstore.domain.security.PasswordResetToken;
=======
import java.util.Set;

import com.bookstore.domain.User;
import com.bookstore.domain.security.PasswordResetToken;
import com.bookstore.domain.security.UserRole;
>>>>>>> d776f0c

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
<<<<<<< HEAD
	
=======
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
>>>>>>> d776f0c
}
