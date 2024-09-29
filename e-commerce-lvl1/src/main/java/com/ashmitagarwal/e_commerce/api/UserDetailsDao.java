package com.ashmitagarwal.e_commerce.api;

import java.util.List;

import com.ashmitagarwal.e_commerce.models.UserDetails;
import com.ashmitagarwal.e_commerce.models.UserRegistrationDetails;

public interface UserDetailsDao {
	
	List<UserDetails> loadAllUserDetails();
	int saveUserDetails(UserRegistrationDetails userRegistrationDetail);
}
