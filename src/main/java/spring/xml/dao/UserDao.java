package spring.xml.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import spring.xml.dto.SignupDto;

public class UserDao implements UserDaoMethods {

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(SignupDto user) {
		String sql = "insert into user values(?,?,?,?)";
		Object[] args = {user.getName(), user.getEmail(), user.getMobile(), user.getPassword()};
		jdbcTemplate.update(sql, args);
		
	}
	
	@Override
	public void delete() {
		String sql = "truncate table user";
		jdbcTemplate.execute(sql);
	}
}
