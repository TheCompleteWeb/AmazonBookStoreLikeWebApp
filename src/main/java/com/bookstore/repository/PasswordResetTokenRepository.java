package com.bookstore.repository;

import java.util.Date;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.bookstore.domain.User;
import com.bookstore.domain.security.PasswordResetToken;

<<<<<<< HEAD
public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long>{
=======
public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
>>>>>>> d776f0c
	
	PasswordResetToken findByToken(String token);
	
	PasswordResetToken findByUser(User user);
	
	Stream<PasswordResetToken> findAllByExpiryDateLessThan(Date now);
	
	@Modifying
<<<<<<< HEAD
	@Query("delete from PasswordResetToken t where t.expirydate <= ?1")
	void deleteAllExpiredSince(Date now);
=======
	@Query("delete from PasswordResetToken t where t.expiryDate <= ?1")
	void deleteAllExpiredSince(Date now);

>>>>>>> d776f0c
}
