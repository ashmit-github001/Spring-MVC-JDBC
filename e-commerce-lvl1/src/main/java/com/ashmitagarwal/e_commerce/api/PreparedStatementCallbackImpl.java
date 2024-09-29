package com.ashmitagarwal.e_commerce.api;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class PreparedStatementCallbackImpl implements PreparedStatementCallback<Integer> {
	
	@Override
	public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		System.out.println("In doInPreparedStatement");
		int rowsAffected = ps.executeUpdate();
		System.out.println(rowsAffected);
		return rowsAffected;
	}

}
