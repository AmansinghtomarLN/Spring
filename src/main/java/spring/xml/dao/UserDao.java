package spring.xml.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import spring.xml.dto.SignupDto;

public class UserDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public void insert(SignupDto user) {
		String sql = "insert into user values(?,?,?,?)";
		Object[] args = {user.getName(), user.getEmail(), user.getMobile(), user.getPassword()};
		jdbcTemplate.update(sql, args);
		
	}
	
}
