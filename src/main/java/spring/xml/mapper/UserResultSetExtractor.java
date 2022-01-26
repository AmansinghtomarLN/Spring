package spring.xml.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import spring.xml.dto.SignupDto;

public class UserResultSetExtractor implements ResultSetExtractor<List<SignupDto>>{

	@Override
	public List<SignupDto> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<SignupDto> list = new ArrayList();
		
		while(rs.next()) {
			SignupDto dto = new SignupDto();
			
			dto.setName(rs.getString(1));
			dto.setEmail(rs.getString(2));
			dto.setMobile(rs.getString(3));
			dto.setPassword(rs.getString(4));
			
			list.add(dto);
		}
		
		System.out.println("ResultSet Extractor called");
		return list;
	}

}
