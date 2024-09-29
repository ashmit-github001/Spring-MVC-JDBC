package com.ashmitagarwal.e_commerce.api;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.ResultSetExtractor;

import com.ashmitagarwal.e_commerce.models.UserDetails;

public class ResultSetExtractorImpl implements ResultSetExtractor<List<UserDetails>> {
	
	@Override
	public List<UserDetails> extractData(ResultSet rs) {
		
		List<UserDetails> allUserDetailsList = new ArrayList<UserDetails>();
		UserDetails userDetails = new UserDetails();
		
		try {
			if (rs.next())
			{
				userDetails.setFirstname(rs.getString("first_name"));
				userDetails.setMiddlename(rs.getString("middle_name"));
				userDetails.setLastname(rs.getString("last_name"));
				userDetails.setEmail(rs.getString("email"));
				userDetails.setUsername(rs.getString("username"));
				userDetails.setPassword(rs.getString("password"));
				
				allUserDetailsList.add(userDetails);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return allUserDetailsList;
	}

}
