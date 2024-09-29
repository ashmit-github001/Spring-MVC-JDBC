package com.ashmitagarwal.e_commerce.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ashmitagarwal.e_commerce.models.UserDetails;
import com.ashmitagarwal.e_commerce.models.UserRegistrationDetails;

@Repository
public class UserDetailsDaoImpl implements UserDetailsDao {

	@Override
	public List<UserDetails> loadAllUserDetails() {
		
		// Read details of all users
		String query = "SELECT * FROM user_details;";
		List<UserDetails> allUserDetails = jdbcTemplate.query(query, new ResultSetExtractorImpl());
		System.out.println("allUserDetails : " + allUserDetails);
		return allUserDetails;
	}
	
	@Override
	public int saveUserDetails(final UserRegistrationDetails userRegistrationDetails) {
		
		// Read details of all users
		String query = "INSERT INTO user_details(first_name,middle_name,last_name,email,username,password) VALUES ('%s','%s','%s','%s','%s','%s');";
		String preparedStatement = String.format(query, userRegistrationDetails.getFirstname(), userRegistrationDetails.getMiddlename(),
				userRegistrationDetails.getLastname(), userRegistrationDetails.getEmail(), userRegistrationDetails.getUsername(), userRegistrationDetails.getPassword());
		System.out.println(preparedStatement);
		return jdbcTemplate.execute(preparedStatement, new PreparedStatementCallbackImpl());
	}

	@Autowired
	JdbcTemplate jdbcTemplate;
}
