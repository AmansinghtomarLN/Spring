package spring.xml.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import spring.xml.dto.SignupDto;
import spring.xml.mapper.UserResultSetExtractor;
import spring.xml.mapper.UserRowMapper;

public class UserDao implements UserDaoMethods {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public void insert(SignupDto user) {
		String sql = "insert into user values(?,?,?,?)";
		Object[] args = { user.getName(), user.getEmail(), user.getMobile(), user.getPassword() };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public void delete() {
		String sql = "truncate table user";
		jdbcTemplate.execute(sql);
	}

	@Override
	public List<SignupDto> findAllUsers() {
		String sql = "Select * from user";
//	List<SignupDto> signupDtoList = 	jdbcTemplate.query(sql, new UserRowMapper());
		List<SignupDto> signupDtoList = jdbcTemplate.query(sql, new UserResultSetExtractor());
		return signupDtoList;
	}

	@Override
	public void displayList(List<SignupDto> list) {
		for (SignupDto signupDto : list) {
			System.out.println(signupDto);
		}
	}

	@Override
	public List<SignupDto> findbyEmail(String email) {
		String sql = "select * from user where email=?";
		List<SignupDto> dto = jdbcTemplate.query(sql, new UserRowMapper(), email);
		return dto;
	}

}
