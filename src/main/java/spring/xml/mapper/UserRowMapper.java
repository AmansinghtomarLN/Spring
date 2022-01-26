package spring.xml.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import spring.xml.dto.SignupDto;

public class UserRowMapper implements RowMapper<SignupDto>{

	@Override
	public SignupDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		SignupDto dto = new SignupDto();
		dto.setName(rs.getString(1));
		dto.setEmail(rs.getString(2));
		dto.setMobile(rs.getString(3));
		dto.setPassword(rs.getString(4));
		
		System.out.println("Calling RowMapper");
		
		return dto;
	}

}
